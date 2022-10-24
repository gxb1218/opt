/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月27日 12:11
 */
package mengyan.springsecurity.modular.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
