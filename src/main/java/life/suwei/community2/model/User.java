package life.suwei.community2.model;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/25-22:15
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
