package br.com.mesttra.medicaldep.service;

import br.com.mesttra.medicaldep.entity.Admission;
import br.com.mesttra.medicaldep.repository.AdmissionRepository;
import br.com.mesttra.medicaldep.rest.UnavailabilityClient;

import org.springframework.stereotype.Service;

@Service
public class AdmissionService {

    AdmissionRepository admissionRepository;
//    RabbitTemplate rabbitTemplate;
    
    UnavailabilityClient unavailabilityClient;

    public AdmissionService(AdmissionRepository admissionRepository, UnavailabilityClient unavailabilityClient) {
        this.admissionRepository = admissionRepository;
        this.unavailabilityClient = unavailabilityClient;
//        this.rabbitTemplate = rabbitTemplate;
    }

    public Admission registerAdmission(Admission admission) {
    	this.unavailabilityClient.sendMail(admission.getPlayerId());
//        rabbitTemplate.convertAndSend(AMQPConfig.EXCHANGE_NAME, AMQPConfig.ROUTING_KEY, playerMessage);
        return  admissionRepository.save(admission);
    }
}
