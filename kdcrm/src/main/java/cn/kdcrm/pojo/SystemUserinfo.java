package cn.kdcrm.pojo;

import cn.kdcrm.utils.LoginGroup;
import cn.kdcrm.utils.UpdateGroup;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

public class SystemUserinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_UID
     *
     * @mbggenerated
     */
    private String userinfoUid;
    /**
     * 用户对应的角色集合
     */
    private Set<SystemRole> roles;
    public SystemUserinfo(){}
    public SystemUserinfo( String userinfoUid,String userinfoLoginid, String userinfoPassword,Set<SystemRole> roles) {
        this.userinfoUid=userinfoUid;
        this.roles = roles;
        this.userinfoLoginid = userinfoLoginid;
        this.userinfoPassword = userinfoPassword;

    }

    public Set<SystemRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SystemRole> roles) {
        this.roles = roles;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_LOGINID
     *
     * @mbggenerated
     */
    @NotEmpty(message = "用户名不能为空",groups = {LoginGroup.class, UpdateGroup.class})
    private String userinfoLoginid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_NAME
     *
     * @mbggenerated
     */
    @NotEmpty(message = "姓名不能为空",groups = {UpdateGroup.class})
    private String userinfoName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_PASSWORD
     *
     * @mbggenerated
     */
    @NotEmpty(message = "密码不能为空",groups = {LoginGroup.class, UpdateGroup.class})
    private String userinfoPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_SEX
     *
     * @mbggenerated
     */
    @NotEmpty(message = "性别不能为空",groups = {UpdateGroup.class})
    private String userinfoSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_EMAIL
     *
     * @mbggenerated
     */
    @NotEmpty(message = "邮箱不能为空",groups = {UpdateGroup.class})
    private String userinfoEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_MOBILE
     *
     * @mbggenerated
     */
    @NotEmpty(message = "电话不能为空",groups = {UpdateGroup.class})
    private String userinfoMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.USERINFO_STATUS
     *
     * @mbggenerated
     */
    private Short userinfoStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USERINFO.ROLE_ID
     *
     * @mbggenerated
     */
    @NotEmpty(message = "角色不能为空",groups = {UpdateGroup.class})
    private String roleId;

    private SystemRole systemRole;

    public SystemRole getSystemRole() {
        return systemRole;
    }

    public void setSystemRole(SystemRole systemRole) {
        this.systemRole = systemRole;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYSTEM_USERINFO
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_UID
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_UID
     *
     * @mbggenerated
     */
    public String getUserinfoUid() {
        return userinfoUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_UID
     *
     * @param userinfoUid the value for SYSTEM_USERINFO.USERINFO_UID
     *
     * @mbggenerated
     */
    public void setUserinfoUid(String userinfoUid) {
        this.userinfoUid = userinfoUid == null ? null : userinfoUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_LOGINID
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_LOGINID
     *
     * @mbggenerated
     */
    public String getUserinfoLoginid() {
        return userinfoLoginid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_LOGINID
     *
     * @param userinfoLoginid the value for SYSTEM_USERINFO.USERINFO_LOGINID
     *
     * @mbggenerated
     */
    public void setUserinfoLoginid(String userinfoLoginid) {
        this.userinfoLoginid = userinfoLoginid == null ? null : userinfoLoginid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_NAME
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_NAME
     *
     * @mbggenerated
     */
    public String getUserinfoName() {
        return userinfoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_NAME
     *
     * @param userinfoName the value for SYSTEM_USERINFO.USERINFO_NAME
     *
     * @mbggenerated
     */
    public void setUserinfoName(String userinfoName) {
        this.userinfoName = userinfoName == null ? null : userinfoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_PASSWORD
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_PASSWORD
     *
     * @mbggenerated
     */
    public String getUserinfoPassword() {
        return userinfoPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_PASSWORD
     *
     * @param userinfoPassword the value for SYSTEM_USERINFO.USERINFO_PASSWORD
     *
     * @mbggenerated
     */
    public void setUserinfoPassword(String userinfoPassword) {
        this.userinfoPassword = userinfoPassword == null ? null : userinfoPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_SEX
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_SEX
     *
     * @mbggenerated
     */
    public String getUserinfoSex() {
        return userinfoSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_SEX
     *
     * @param userinfoSex the value for SYSTEM_USERINFO.USERINFO_SEX
     *
     * @mbggenerated
     */
    public void setUserinfoSex(String userinfoSex) {
        this.userinfoSex = userinfoSex == null ? null : userinfoSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_EMAIL
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_EMAIL
     *
     * @mbggenerated
     */
    public String getUserinfoEmail() {
        return userinfoEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_EMAIL
     *
     * @param userinfoEmail the value for SYSTEM_USERINFO.USERINFO_EMAIL
     *
     * @mbggenerated
     */
    public void setUserinfoEmail(String userinfoEmail) {
        this.userinfoEmail = userinfoEmail == null ? null : userinfoEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_MOBILE
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_MOBILE
     *
     * @mbggenerated
     */
    public String getUserinfoMobile() {
        return userinfoMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_MOBILE
     *
     * @param userinfoMobile the value for SYSTEM_USERINFO.USERINFO_MOBILE
     *
     * @mbggenerated
     */
    public void setUserinfoMobile(String userinfoMobile) {
        this.userinfoMobile = userinfoMobile == null ? null : userinfoMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.USERINFO_STATUS
     *
     * @return the value of SYSTEM_USERINFO.USERINFO_STATUS
     *
     * @mbggenerated
     */
    public Short getUserinfoStatus() {
        return userinfoStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.USERINFO_STATUS
     *
     * @param userinfoStatus the value for SYSTEM_USERINFO.USERINFO_STATUS
     *
     * @mbggenerated
     */
    public void setUserinfoStatus(Short userinfoStatus) {
        this.userinfoStatus = userinfoStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USERINFO.ROLE_ID
     *
     * @return the value of SYSTEM_USERINFO.ROLE_ID
     *
     * @mbggenerated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USERINFO.ROLE_ID
     *
     * @param roleId the value for SYSTEM_USERINFO.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYSTEM_USERINFO
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfoUid=").append(userinfoUid);
        sb.append(", userinfoLoginid=").append(userinfoLoginid);
        sb.append(", userinfoName=").append(userinfoName);
        sb.append(", userinfoPassword=").append(userinfoPassword);
        sb.append(", userinfoSex=").append(userinfoSex);
        sb.append(", userinfoEmail=").append(userinfoEmail);
        sb.append(", userinfoMobile=").append(userinfoMobile);
        sb.append(", userinfoStatus=").append(userinfoStatus);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}