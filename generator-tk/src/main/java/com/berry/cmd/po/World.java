package com.berry.cmd.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "world")
public class World {
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
}