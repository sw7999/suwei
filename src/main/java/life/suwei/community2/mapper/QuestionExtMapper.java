package life.suwei.community2.mapper;

import life.suwei.community2.dto.QuestionQueryDTO;
import life.suwei.community2.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shkstart
 * @date 2022/2/26-15:47
 */

@Mapper
public interface QuestionExtMapper {

    int incView(Question record);
    int incCommentCount(Question record);
    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);
    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectSticky();
}