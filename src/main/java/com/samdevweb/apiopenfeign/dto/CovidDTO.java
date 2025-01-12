package com.samdevweb.apiopenfeign.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CovidDTO {
   
    private Integer uid;
    private String uf;
    private String state;
    private Integer cases;
    private Integer deaths;
    private Integer suspects;
    private Integer refuses;
    private LocalDateTime datetime;

}