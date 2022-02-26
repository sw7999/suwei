package life.suwei.community2.model;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/26-15:50
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
}
