package cn.edu.hbuas.admin.gatewayimpl.database.dataobject;

/**
 * BaseDO
 */
public class BaseDO {
    private String createTime;
    private String delFlag;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
