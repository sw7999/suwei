package life.suwei.community2.dto;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/3/2-18:25
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String tag;
    private Integer page;
    private Integer size;
}
