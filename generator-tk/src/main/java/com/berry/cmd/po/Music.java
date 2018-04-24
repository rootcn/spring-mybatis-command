package com.berry.cmd.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "music")
public class Music implements Serializable {
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

    private static final long serialVersionUID = 1L;

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
        Music other = (Music) that;
        return (this.getKeyid() == null ? other.getKeyid() == null : this.getKeyid().equals(other.getKeyid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPubDate() == null ? other.getPubDate() == null : this.getPubDate().equals(other.getPubDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeyid() == null) ? 0 : getKeyid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPubDate() == null) ? 0 : getPubDate().hashCode());
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
        sb.append(", author=").append(author);
        sb.append(", pubDate=").append(pubDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}