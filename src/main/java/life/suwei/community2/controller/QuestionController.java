package life.suwei.community2.controller;

import life.suwei.community2.dto.CommentDTO;
import life.suwei.community2.dto.QuestionDTO;
import life.suwei.community2.enums.CommentTypeEnum;
import life.suwei.community2.exception.CustomizeErrorCode;
import life.suwei.community2.exception.CustomizeException;
import life.suwei.community2.service.CommentService;
import life.suwei.community2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author shkstart
 * @date 2022/2/27-15:04
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")String id,
                           Model model){
        Long questionId = null;
        try {
            questionId = Long.parseLong(id);
        } catch (NumberFormatException e) {
            throw new CustomizeException(CustomizeErrorCode.INVALID_INPUT);
        }
        QuestionDTO questionDTO = questionService.getById(questionId);
        List<QuestionDTO> relateQuestions = questionService.selectRelated(questionDTO);
        List<CommentDTO> comments = commentService.listByQuestionId(questionId, CommentTypeEnum.QUESTION);
        //累加访问次数
        questionService.incView(questionId);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        model.addAttribute("relatedQuestions",relateQuestions);
        return "question";

    }


}
