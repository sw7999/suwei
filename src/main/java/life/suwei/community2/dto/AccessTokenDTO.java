package life.suwei.community2.dto;

import lombok.Data;

/**
 * @author shkstart
 * @date 2022/2/24-21:49
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
