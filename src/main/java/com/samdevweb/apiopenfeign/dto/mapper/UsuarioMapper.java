package com.samdevweb.apiopenfeign.dto.mapper;

import com.samdevweb.apiopenfeign.dto.UsuarioResponseDTO;
import com.samdevweb.apiopenfeign.entity.Usuario;

public class UsuarioMapper {
    
    public static UsuarioResponseDTO toUsuarioResponseDTO(Usuario usuario) {
        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();
        usuarioResponseDTO.setId(usuario.getId());
        usuarioResponseDTO.setNome(usuario.getNome());
        usuarioResponseDTO.setEmail(usuario.getEmail());
        usuarioResponseDTO.setCep(usuario.getCep());
        usuarioResponseDTO.setLogradouro(usuario.getLogradouro());
        usuarioResponseDTO.setBairro(usuario.getBairro());
        usuarioResponseDTO.setCidade(usuario.getCidade());
        usuarioResponseDTO.setEstado(usuario.getEstado());
        usuarioResponseDTO.setUf(usuario.getUf());
        usuarioResponseDTO.setDataRegistro(usuario.getDataRegistro());
        return usuarioResponseDTO;
    }
    
}
