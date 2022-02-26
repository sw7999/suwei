package life.suwei.community2.dto;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/24-22:21
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
