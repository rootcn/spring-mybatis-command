package com.berry.cmd.po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "music")
public class Music {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer keyid;

    /**
     * 名称
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 发行时间
     */
    @Column(name = "pub_date")
    private Date pubDate;

    /**
     * 获取主键
     *
     * @return keyid - 主键
     */
    public Integer getKeyid() {
        return keyid;
    }

    /**
     * 设置主键
     *
     * @param keyid 主键
     */
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 获取发行时间
     *
     * @return pub_date - 发行时间
     */
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * 设置发行时间
     *
     * @param pubDate 发行时间
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }
}