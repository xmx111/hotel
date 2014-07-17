package com.ufo.hotel.config.entity;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ForeignKey;

import com.ufo.framework.core.entity.UnDeleteEntity;

/**
 * 
 * 类名称：Dictionary 类描述：字典类
 * 
 * 
 * 创建人：khe 创建时间：2014-5-28 下午11:04:41
 * 
 * @version 1.0
 * 
 */
@Entity
@Table(name = "ufo_sys_dictionary")
public class Dictionary extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6699449646448027316L;

	/**
	 * code 编码
	 */
	private String code;

	/**
	 * name 名称
	 */
	private String name;

	/**
	 * value 值
	 */
	private String value;

	/**
	 * description 描述
	 */
	private String description;

	/**
	 * parent 父类别
	 */
	private Dictionary parent;

	/**
	 * valid 是否有效
	 */
	private Boolean valid = Boolean.TRUE;

	/**
	 * sequence 排序
	 */
	private Integer sequence;

	/**
	 * children 子类
	 */
	private Set<Dictionary> children;
	
	@Column(length = 32)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @ForeignKey(name = "fk_parent_dictionary")
    public Dictionary getParent() {
        return parent;
    }

    public void setParent(Dictionary parent) {
        this.parent = parent;
    }

    @Column
    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Column
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Column
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Lob
    @Column
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "parent")
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("code")
    public Set<Dictionary> getChildren() {
        return children;
    }

    public void setChildren(Set<Dictionary> children) {
        this.children = children;
    }
}
