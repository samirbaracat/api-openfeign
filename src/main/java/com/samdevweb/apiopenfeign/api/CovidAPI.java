package com.samdevweb.apiopenfeign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.samdevweb.apiopenfeign.dto.CovidDTO;

@FeignClient(name = "covid-api", url = "https://covid19-brazil-api.now.sh/api/report/v1")
public interface CovidAPI {
    
    @GetMapping("/brazil/uf/{uf}")
    CovidDTO getInfoByUF(@PathVariable String uf);

}
