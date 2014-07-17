package com.ufo.hotel.checkin.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.ufo.framework.core.entity.Admin;
import com.ufo.framework.core.entity.UnDeleteEntity;
import com.ufo.hotel.checkout.entity.Checkout;
import com.ufo.hotel.custom.entity.Custom;
import com.ufo.hotel.room.entity.Room;

/**
 * 
 * 类名称：Checkin 
 * 类描述：登记类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-5-28 下午22:10:31 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_checkin")
public class Checkin extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3426220014327183897L;

	/**
	 * name 客户姓名
	 */
    private String name;
	
	/**
	 * passportName 客户证件类型
	 */
	private String passportName;
	
	/**
	 * passportNo 客户证件号
	 */
	private String passportNo;
	
	/**
	 * phone 客户证手机
	 */
	private String phone;
	
	/**
	 * custom 注册客户
	 */
	private Custom custom;
	
	/** 
     * startDate 开始日期
     */
	private Date checkinDate;

    /** 
     * endDate 截止日期
     */
    private Date leaveDate;
    
    /**
     * checkout 结账
     */
    private Checkout checkout;

    /** 
     * creator 创建人
     */
    private Admin creator;
    
    /** 
     * createTime 创建时间 
     */
    private Timestamp createTime;
    
    /**
     * room 当前入住房间
     */
    private Room room;

    /** 
     * oper 操作员
     */
    private Admin oper;
    
    /** 
     * operTime 操作时间 
     */
    private Timestamp operTime;

    /** 
     * state 状态,-1取消；1 有效  ;2登记,3出发,4-结账
     */
    private Integer state;
    
    /** 
     * remarks 备注信息
     */
    private String remark;

	@Column(name = "name", length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "passport_name", length = 64)
	public String getPassportName() {
		return passportName;
	}

	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}

	@Column(name = "passport_no", length = 32)
	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	@Column(name = "phone", length = 16)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custom_id")
    @ForeignKey(name = "fk_custom_checkin")
	public Custom getCustom() {
		return custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	@Column(name = "checkin_date")
	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	@Column(name = "leave_date")
	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "checkout_id")
    @ForeignKey(name = "fk_checkout_checkin")
	public Checkout getCheckout() {
		return checkout;
	}

	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "oper_id")
    @ForeignKey(name = "fk_admin_creator_checkin")
	public Admin getCreator() {
		return creator;
	}

	public void setCreator(Admin creator) {
		this.creator = creator;
	}

	@Column(name = "create_time")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    @ForeignKey(name = "fk_room_checkin")
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "oper_id")
    @ForeignKey(name = "fk_admin_oper_checkin")
	public Admin getOper() {
		return oper;
	}

	public void setOper(Admin oper) {
		this.oper = oper;
	}

	@Column(name = "oper_time")
	public Timestamp getOperTime() {
		return operTime;
	}

	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	@Column
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Column
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
