package mirkoserwis_send.mirkoserwis_send.controller;


import lombok.RequiredArgsConstructor;
import mirkoserwis_send.mirkoserwis_send.client.SendClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final SendClient sendClient;

    @PostMapping("/send-data")
    public String sendData(@RequestBody String data) {
        return sendClient.getData(data);
    }



}
