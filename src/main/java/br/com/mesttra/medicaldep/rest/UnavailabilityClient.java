package br.com.mesttra.medicaldep.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "players", url="http://localhost:8081/")
public interface UnavailabilityClient {

	@RequestMapping(method = RequestMethod.PATCH, value = "/players/{id}/unavailable")
	void sendMail(@PathVariable("id") Long playerId);
	
}
