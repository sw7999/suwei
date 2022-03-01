package life.suwei.community2.dto;

import life.suwei.community2.model.User;
import lombok.Data;

/**
 * @author shkstart
 * @date 2022/3/1-13:42
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
