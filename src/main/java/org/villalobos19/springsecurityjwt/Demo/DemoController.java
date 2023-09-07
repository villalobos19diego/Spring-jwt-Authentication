package org.villalobos19.springsecurityjwt.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pi/v1")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping(value = "demo")
    public  String welcome(){
        return  "Welcome from Secure EndPoint";
    }
}
