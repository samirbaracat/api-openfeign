package com.samdevweb.apiopenfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.samdevweb.apiopenfeign.dto.CovidDTO;

@FeignClient(name = "covid-api", url = "https://covid19-brazil-api.vercel.app/api/report/v1/brazil/uf")
public interface CovidAPI {
    
    @GetMapping("/{uf}")
    CovidDTO getInfoByUF(@PathVariable String uf);

}
