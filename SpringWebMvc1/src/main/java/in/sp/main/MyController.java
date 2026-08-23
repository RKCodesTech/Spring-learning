package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/helloPage")
    public String openHelloPage() {
        return "hello";
    }
}