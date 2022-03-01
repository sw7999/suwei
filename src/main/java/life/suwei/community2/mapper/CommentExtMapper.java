package life.suwei.community2.mapper;

import life.suwei.community2.model.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shkstart
 * @date 2022/2/28-21:37
 */
@Mapper
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}