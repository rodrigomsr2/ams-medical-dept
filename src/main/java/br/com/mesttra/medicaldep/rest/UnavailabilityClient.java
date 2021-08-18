package br.com.mesttra.medicaldep.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.mesttra.medicaldep.amqp.PlayerMessage;

@FeignClient(name = "players", url="http://localhost:8081/")
public interface UnavailabilityClient {

	@RequestMapping(method = RequestMethod.PUT, value = "/players/{id}/indisponibilizar")
	void sendMail(@PathVariable("id") Long playerId);
	
}
