package life.suwei.community2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shkstart
 * @date 2022/2/24-14:48
 */
@Controller
public class IndexContoller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
