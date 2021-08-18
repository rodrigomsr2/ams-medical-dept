package br.com.mesttra.medicaldep.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ContratacaoDTO {
	
	

    private String name;

    private LocalDateTime dataContratacao;

    private Double salary;
	
}
