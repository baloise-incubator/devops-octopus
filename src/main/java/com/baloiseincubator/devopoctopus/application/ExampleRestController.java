package com.baloiseincubator.devopoctopus.application;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleRestController {

    @GetMapping(value = "api/example")
    public String getExample() {
        return "Hello World";
    }
}
