package life.suwei.community2.dto;

import lombok.Data;

import java.util.List;

/**
 * @author shkstart
 * @date 2022/3/1-22:25
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
