package com.samdevweb.apiopenfeign.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.samdevweb.apiopenfeign.api.CovidAPI;
import com.samdevweb.apiopenfeign.api.EnderecoAPI;
import com.samdevweb.apiopenfeign.dto.EnderecoDTO;
import com.samdevweb.apiopenfeign.dto.UsuarioResponseDTO;
import com.samdevweb.apiopenfeign.dto.mapper.UsuarioMapper;
import com.samdevweb.apiopenfeign.entity.Usuario;
import com.samdevweb.apiopenfeign.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final CovidAPI covidAPI;
    private final EnderecoAPI enderecoAPI;
    private final UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> findAllWithCovidInfo() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuario -> {
                    UsuarioResponseDTO dto = UsuarioMapper.toUsuarioResponseDTO(usuario);
                    dto.setCovidInfo(covidAPI.getInfoByUF(usuario.getEstado()));
                    return dto;
                }).collect(Collectors.toList());
    }

    public UsuarioResponseDTO findByIdWithCovidInfo(String id) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    UsuarioResponseDTO dto = UsuarioMapper.toUsuarioResponseDTO(usuario);
                    dto.setCovidInfo(covidAPI.getInfoByUF(usuario.getEstado()));
                    return dto;
                }).orElseThrow();
    }

    public Usuario create(Usuario usuario) {
        usuario.setId(UUID.randomUUID().toString());
        usuario.setDataRegistro(LocalDateTime.now());
        EnderecoDTO enderecoDTO = enderecoAPI.findByCep(usuario.getCep());
        BeanUtils.copyProperties(enderecoDTO, usuario);
        return usuarioRepository.save(usuario);
    }
    
}
