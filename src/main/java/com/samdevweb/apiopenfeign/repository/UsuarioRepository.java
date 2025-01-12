package com.samdevweb.apiopenfeign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samdevweb.apiopenfeign.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
}
