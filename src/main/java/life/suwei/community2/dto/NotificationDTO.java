package life.suwei.community2.dto;

import lombok.Data;
/**
 * @author shkstart
 * @date 2022/2/26-23:35
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
