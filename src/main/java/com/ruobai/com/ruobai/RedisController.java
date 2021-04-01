package com.ruobai.com.ruobai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Value("server.port")
    private int serverPort;
}
