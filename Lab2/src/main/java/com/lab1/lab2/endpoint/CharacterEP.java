package com.lab1.lab2.endpoint;

import com.lab1.lab2.service.CharacterService;
import com.lab1.lab2.request.CharacterClassRequest;
import com.lab1.lab2.request.CharacterPowerRequest;
import com.lab1.lab2.response.CharacterClassResponse;
import com.lab1.lab2.response.CharacterPowerResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CharacterEP {

    private static final String NAMESPACE_URI = "http://lab2/character";
    private final CharacterService characterService;

    public CharacterEP(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CharacterClassRequest")
    @ResponsePayload
    public CharacterClassResponse getCharacterClass(@RequestPayload CharacterClassRequest request) {
        CharacterClassResponse response = new CharacterClassResponse();
        response.setCharClass(characterService.getCharacterClass(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CharacterPowerRequest")
    @ResponsePayload
    public CharacterPowerResponse getCharacterPower(@RequestPayload CharacterPowerRequest request) {
        CharacterPowerResponse response = new CharacterPowerResponse();
        response.setPower(characterService.getCharacterPower(request.getId()));
        return response;
    }
}
