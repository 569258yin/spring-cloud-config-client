package com.yh.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinhao
 * @date 2019-04-08 08:30
 */
@RestController
@RequestMapping("/")
@RefreshScope
public class Hello {


    @Value("${key}")
    private String key;

    @GetMapping("/key")
    public String profile() {
        return this.key;
    }
}
