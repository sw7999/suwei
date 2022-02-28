package life.suwei.community2.dto;

import life.suwei.community2.model.User;
import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/26-17:53
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
    private Integer sticky;
}
