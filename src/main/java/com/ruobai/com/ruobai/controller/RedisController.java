package com.ruobai.com.ruobai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Value("{server.port}")
    private String serverPort;
}
