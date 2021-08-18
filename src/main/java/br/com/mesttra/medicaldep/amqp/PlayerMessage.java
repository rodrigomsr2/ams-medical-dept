package br.com.mesttra.medicaldep.amqp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PlayerMessage implements Serializable {

	private static final long serialVersionUID = -309157449254839576L;

	public PlayerMessage(Long id) {
        this.id = id;
    }

    @JsonProperty("id")
    private Long id;

}
