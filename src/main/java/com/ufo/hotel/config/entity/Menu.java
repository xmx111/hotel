package com.ufo.hotel.config.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
 * 类名称：Menu 
 * 类描述： 菜单实体
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:35:28 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_sys_menu")
public class Menu extends UnDeleteEntity implements java.io.Serializable {

    /** 
     *serialVersionUID 
     */
    private static final long serialVersionUID = 1647226429941463041L;

    /** 
     *model 所属模块,1--系统配置,2--客户管理
     */
    private Integer model;
    /** 
     *name 菜单名称
     */
    private String name;
    /** 
     *text 显示文字 
     */
    private String text;
    /** 
     *url 链接
     */
    private String url;
    /** 
     *icon 图标
     */
    private String icon;
    /** 
     *href 
     */
    private String href;
    /** 
     *parent 父菜单
     */
    private Menu parent;

    /** 
     *children 子菜单
     */
    private List<Menu> children;

    /** 
     *sequence 排序
     */
    private Integer sequence = Integer.valueOf(0);

    @Column
    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    @Column(length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 128)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Column
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Column
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @ForeignKey(name = "fk_parent_menu")
    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("id")
    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
