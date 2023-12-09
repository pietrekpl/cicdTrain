package mirkoserwis_send.mirkoserwis_send.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/send")
@Slf4j
public class ClientController {

    @PostMapping
    public String send(@RequestParam String message) {
        log.info("Message = {}", message);
        return message;
    }




}
