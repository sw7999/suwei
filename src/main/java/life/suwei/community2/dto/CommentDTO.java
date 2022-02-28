package life.suwei.community2.dto;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/28-21:51
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;

}
