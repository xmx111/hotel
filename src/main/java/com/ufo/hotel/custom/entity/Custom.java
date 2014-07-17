package com.ufo.hotel.custom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ufo.framework.core.entity.UnDeleteEntity;

/**
 * 
 * 类名称：Custom 
 * 类描述：客户类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-4-5 下午14:00:41 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_custom")
public class Custom extends UnDeleteEntity implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5319794114275147837L;

	/**
	 * 客户名称
	 */
	private String name;
	
	/**
	 * 身份证号
	 */
	private String idCard;
	
	/**
	 * 性别
	 */
	private Integer sex;
	
	/**
	 * 手机
	 */
	private String phone;

	/**
	 * 联系电话
	 */
	private String tel;
	
	/**
	 * 详细地址
	 */
	private String addr;
	
	/**
	 * 证件号码
	 */
	private String passportNo;
	
	/**
	 * 证件名称
	 */
	private String passportName;
	
	/**
	 * 工作单位
	 */
	private String work;
	
	/**
	 * 级别
	 */
	private Integer level;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 名字首字母
	 */
	private String abbr;

	@Column(name = "name", length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "id_card", length = 32)
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "tel", length = 20)
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "addr", length = 200)
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Column(name = "passport_no", length = 32)
	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	@Column(name = "passport_name", length = 64)
	public String getPassportName() {
		return passportName;
	}

	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}

	@Column(name = "work", length = 200)
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Column(name = "sex", length = 1)
	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "level", length = 1)
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "remark", length = 280)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column
	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	
}
