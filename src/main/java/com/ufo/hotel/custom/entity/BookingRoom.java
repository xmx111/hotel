package com.ufo.hotel.custom.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.ufo.framework.core.entity.Admin;
import com.ufo.framework.core.entity.IdEntity;
import com.ufo.hotel.config.entity.Dictionary;

/**
 * 
 * 类名称：BookingRoom 
 * 类描述：客户预定类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-4-5 下午21:50:42 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_booking_room")
public class BookingRoom extends IdEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1984257030377133087L;

	/**
	 * 预定客户姓名
	 */
	private String name;
	
	/**
	 * 预定客户证件类型
	 */
	private String passportName;
	
	/**
	 * 预定客户证件号
	 */
	private String passportNo;
	
	/**
	 * 预定手机
	 */
	private String phone;
	
	/**
	 * 预定电话
	 */
	private String tel;
	
	/**
	 * 预定客户工作单位
	 */
	private String work;
	
	/**
	 * 预定登记时间
	 */
	private Date checkDate;
	
	/**
	 * 预定离开时间
	 */
	private Date leaveDate;
	
	/**
	 * 预付款
	 */
	private BigDecimal bookingPrice;
	
	/**
	 * 操作时间
	 */
	private Date optDate;
	
	/**
	 * 预定时间
	 */
	private Date bookingDate;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 操作员
	 */
	private Admin oper;
	
	/**
	 * 预定的房间类型
	 */
	private Dictionary roomType;
	
	/**
	 * 预定房间数
	 */
	private Integer roomNum;

	@Column(name = "name", length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "work", length = 200)
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	@Column
	public BigDecimal getBookingPrice() {
		return bookingPrice;
	}

	public void setBookingPrice(BigDecimal bookingPrice) {
		this.bookingPrice = bookingPrice;
	}

	@Column
	public Date getOptDate() {
		return optDate;
	}

	public void setOptDate(Date optDate) {
		this.optDate = optDate;
	}

	@Column
	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "oper_id")
    @ForeignKey(name = "fk_admin_booking_room")
	public Admin getOper() {
		return oper;
	}

	public void setOper(Admin oper) {
		this.oper = oper;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    @ForeignKey(name = "fk_room_type_booking_room")
	public Dictionary getRoomType() {
		return roomType;
	}
	public void setRoomType(Dictionary roomType) {
		this.roomType = roomType;
	}
	
	@Column(name = "room_num")
	public Integer getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}
	
}
