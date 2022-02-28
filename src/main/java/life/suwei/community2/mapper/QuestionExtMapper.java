package life.suwei.community2.mapper;

import life.suwei.community2.model.Question;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author shkstart
 * @date 2022/2/26-15:47
 */

@Mapper
public interface QuestionExtMapper {

    int incView(Question record);
}