package life.suwei.community2.enums;

/**
 * @author shkstart
 * @date 2022/3/2-13:07
 */
public enum  NotificationStatusEnum {
    UNREAD(0),READ(1);

    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
