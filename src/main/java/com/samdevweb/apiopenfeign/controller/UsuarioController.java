package com.samdevweb.apiopenfeign.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.samdevweb.apiopenfeign.dto.UsuarioResponseDTO;
import com.samdevweb.apiopenfeign.dto.mapper.UsuarioMapper;
import com.samdevweb.apiopenfeign.entity.Usuario;
import com.samdevweb.apiopenfeign.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioResponseDTO> getUsersWithCovidInfo() {
        return usuarioService.findAllWithCovidInfo();
    }

    @GetMapping("/{id}/covid")
    public UsuarioResponseDTO getUserWithCovidInfo(@PathVariable String id) {
        return usuarioService.findByIdWithCovidInfo(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponseDTO create(@RequestBody Usuario usuario) {
        return UsuarioMapper.toUsuarioResponseDTO(usuarioService.create(usuario));
    }
    
}
