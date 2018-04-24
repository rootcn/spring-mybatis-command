package com.berry.cmd.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   世界
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table world
 *
 * @mbg.generated do_not_delete_during_merge Tue Apr 24 18:41:50 CST 2018
 */
public class World implements Serializable {
    /**
     * Database Column Remarks:
     *   关键字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column world.keyid
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private Integer keyid;

    /**
     * Database Column Remarks:
     *   姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column world.name
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private String name;

    /**
     * Database Column Remarks:
     *   生日
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column world.birthday
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private Date birthday;

    /**
     * Database Column Remarks:
     *   宽度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column world.width
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private Integer width;

    /**
     * Database Column Remarks:
     *   是否可达
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column world.can_arrive
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private Integer can_arrive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column world.keyid
     *
     * @return the value of world.keyid
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public Integer getKeyid() {
        return keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column world.keyid
     *
     * @param keyid the value for world.keyid
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column world.name
     *
     * @return the value of world.name
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column world.name
     *
     * @param name the value for world.name
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column world.birthday
     *
     * @return the value of world.birthday
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column world.birthday
     *
     * @param birthday the value for world.birthday
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column world.width
     *
     * @return the value of world.width
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column world.width
     *
     * @param width the value for world.width
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column world.can_arrive
     *
     * @return the value of world.can_arrive
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public Integer getCan_arrive() {
        return can_arrive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column world.can_arrive
     *
     * @param can_arrive the value for world.can_arrive
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
    public void setCan_arrive(Integer can_arrive) {
        this.can_arrive = can_arrive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table world
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table world
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table world
     *
     * @mbg.generated Tue Apr 24 18:41:50 CST 2018
     */
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