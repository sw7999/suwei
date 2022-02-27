package life.suwei.community2.controller;

import life.suwei.community2.dto.PaginationDTO;
import life.suwei.community2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author shkstart
 * @date 2022/2/24-14:48
 */
@Controller
public class IndexContoller {


    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page",defaultValue = "1")Integer page,
                        @RequestParam(name = "size",defaultValue = "2")Integer size
    ){
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";

    }

}
