package com.berry.cmd.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "world")
public class World implements Serializable {
    /**
     * 关键字
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer keyid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 宽度
     */
    private Integer width;

    /**
     * 是否可达
     */
    private Integer can_arrive;

    private static final long serialVersionUID = 1L;

    /**
     * 获取关键字
     *
     * @return keyid - 关键字
     */
    public Integer getKeyid() {
        return keyid;
    }

    /**
     * 设置关键字
     *
     * @param keyid 关键字
     */
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取宽度
     *
     * @return width - 宽度
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 设置宽度
     *
     * @param width 宽度
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 获取是否可达
     *
     * @return can_arrive - 是否可达
     */
    public Integer getCan_arrive() {
        return can_arrive;
    }

    /**
     * 设置是否可达
     *
     * @param can_arrive 是否可达
     */
    public void setCan_arrive(Integer can_arrive) {
        this.can_arrive = can_arrive;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        World other = (World) that;
        return (this.getKeyid() == null ? other.getKeyid() == null : this.getKeyid().equals(other.getKeyid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
            && (this.getCan_arrive() == null ? other.getCan_arrive() == null : this.getCan_arrive().equals(other.getCan_arrive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeyid() == null) ? 0 : getKeyid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getCan_arrive() == null) ? 0 : getCan_arrive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keyid=").append(keyid);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append(", width=").append(width);
        sb.append(", can_arrive=").append(can_arrive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}