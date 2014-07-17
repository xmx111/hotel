package com.ufo.hotel.config.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ForeignKey;

import com.ufo.framework.core.entity.Department;
import com.ufo.framework.core.entity.UnDeleteEntity;
import com.ufo.hotel.config.common.PricingStrategyType;

/**
 * 
 * 类名称：Dictionary 
 * 类描述：商品类
 * 
 * 
 * 创建人：khe 创建时间：2014-5-28 下午11:21:41
 * 
 * @version 1.0
 * 
 */
@Entity
@Table(name = "ufo_sys_goods")
public class Goods extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1820854886379954562L;
	
	/**
	 * photo 图片,一般用于菜单商品
	 */
	private String photo;

	/**
	 * department 出品部门,如餐厅点菜,由厨房打印,出品部门为厨房
	 */
	private Department department;
	
	/**
	 * category 商品类别
	 */
	private Dictionary category;

	/**
	 * accountClass 财务科目
	 */
	private Dictionary accountClass;

	/**
	 * isDiscount 是否打折
	 */
	private Boolean isDiscount = Boolean.FALSE;
	
	/**
	 * isService 是否收服务费
	 */
	private Boolean isService = Boolean.FALSE;
	
	/**
	 * pricingStrategy 定价策略,1--不可变,2--都可变,3--名称可变,4--价格可变
	 */
	private Integer pricingStrategy = PricingStrategyType.NO_CHANGE.value();

	/**
	 * parent 自关联,上级编码
	 */
	private Goods parent;
	/**
	 * children 自关联,子级商品
	 */
	private Set<Goods> children;

	/**
	 * isSplit 是否为拆分类的商品
	 */
	private Boolean isSplit = Boolean.FALSE;

	/**
	 * sequence 添加排序功能
	 */
	private Integer sequence = Integer.valueOf(0);

	/**
	 * 是否库存商品
	 */
	private Boolean isStock = Boolean.FALSE;

	@Column
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    @ForeignKey(name = "fk_dept_goods")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @ForeignKey(name = "fk_cat_goods")
    public Dictionary getCategory() {
        return category;
    }

    public void setCategory(Dictionary category) {
        this.category = category;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_class_id")
    @ForeignKey(name = "fk_account_class_goods")
    public Dictionary getAccountClass() {
        return accountClass;
    }

    public void setAccountClass(Dictionary accountClass) {
        this.accountClass = accountClass;
    }

    @Column(name = "is_dist")
    public Boolean getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    @Column(name = "is_service")
    public Boolean getIsService() {
        return isService;
    }

    public void setIsService(Boolean isService) {
        this.isService = isService;
    }

    @Column(name = "pricing_strategy")
    public Integer getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(Integer pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @ForeignKey(name = "fk_parent_goods")
    public Goods getParent() {
        return parent;
    }

    public void setParent(Goods parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    @Fetch(FetchMode.SUBSELECT)
    public Set<Goods> getChildren() {
        return children;
    }

    public void setChildren(Set<Goods> children) {
        this.children = children;
    }

    @Column(name = "is_split")
    public Boolean getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Boolean isSplit) {
        this.isSplit = isSplit;
    }

    @Column
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Column(name = "is_stock")
    public Boolean getIsStock() {
        return isStock;
    }

    public void setIsStock(Boolean stock) {
        isStock = stock;
    }
    
}
