package life.suwei.community2.controller;

import life.suwei.community2.dto.QuestionDTO;
import life.suwei.community2.mapper.QuestionMapper;
import life.suwei.community2.mapper.UserMapper;
import life.suwei.community2.model.Question;
import life.suwei.community2.model.User;
import life.suwei.community2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author shkstart
 * @date 2022/2/24-14:48
 */
@Controller
public class IndexContoller {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model
    ){
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length!=0)
        for (Cookie cookie : cookies){
            if (cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }


        List<QuestionDTO> questionList = questionService.list();
        model.addAttribute("questions",questionList);
        return "index";
    }

}
