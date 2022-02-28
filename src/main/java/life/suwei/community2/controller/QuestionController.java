package life.suwei.community2.controller;

import life.suwei.community2.dto.QuestionDTO;
import life.suwei.community2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shkstart
 * @date 2022/2/27-15:04
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")String id,
                           Model model){
        Long questionId = null;
        try {
            questionId = Long.parseLong(id);
        } catch (NumberFormatException e) {
        }
        QuestionDTO questionDTO = questionService.getById(questionId);
        model.addAttribute("question",questionDTO);
        return "question";

    }


}
