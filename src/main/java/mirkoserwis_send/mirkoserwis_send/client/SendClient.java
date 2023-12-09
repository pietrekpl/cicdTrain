package mirkoserwis_send.mirkoserwis_send.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "mirkoserwis-get", url = "http://localhost:8081")
public interface SendClient {

    @PostMapping("/get-data")
    String getData(@RequestBody String data);



}
