package com.samdevweb.apiopenfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.samdevweb.apiopenfeign.dto.EnderecoDTO;

@FeignClient(name = "endereco-api", url = "https://viacep.com.br/ws")
public interface EnderecoAPI {
    
    @GetMapping("/{cep}/json")
    EnderecoDTO findByCep(@PathVariable String cep);
}
