package com.lab1.lab2.endpoint;

import com.lab1.lab2.service.PlayerService;
import com.lab1.lab2.request.PlayerUsernameRequest;
import com.lab1.lab2.request.PlayerLevelRequest;
import com.lab1.lab2.response.PlayerUsernameResponse;
import com.lab1.lab2.response.PlayerLevelResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PlayerEP {

    private static final String NAMESPACE_URI = "http://lab2/player";
    private final PlayerService playerService;

    public PlayerEP(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PlayerUsernameRequest")
    @ResponsePayload
    public PlayerUsernameResponse getPlayerUsername(@RequestPayload PlayerUsernameRequest request) {
        PlayerUsernameResponse response = new PlayerUsernameResponse();
        response.setUsername(playerService.getPlayerUsername(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PlayerLevelRequest")
    @ResponsePayload
    public PlayerLevelResponse getPlayerLevel(@RequestPayload PlayerLevelRequest request) {
        PlayerLevelResponse response = new PlayerLevelResponse();
        response.setLevel(playerService.getPlayerLevel(request.getId()));
        return response;
    }
}
