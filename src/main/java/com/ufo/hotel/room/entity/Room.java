package com.ufo.hotel.room.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.ufo.framework.core.entity.IdEntity;
import com.ufo.hotel.config.entity.Dictionary;

/**
 * 
 * 类名称：BookingRoom 
 * 类描述：房间类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-4-5 下午21:53:51 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_room")
public class Room extends IdEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5930860093253976521L;

	/**
	 * 房间号
	 */
	private String no;
	
	/**
	 * 房间类型
	 */
	private Dictionary roomType;
	
	/**
	 * 所在层数
	 */
	private Integer floor;
	
	/**
	 * 所属楼
	 */
	private Building building;
	
	/**
	 * 房间状态
	 */
	private Integer status;
	
	/**
	 * 房间价格
	 */
	private BigDecimal price;
	
	/**
	 * 折扣价格
	 */
	private BigDecimal discount;

	@Column(name = "no", length = 10)
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    @ForeignKey(name = "fk_room_type_room")
	public Dictionary getRoomType() {
		return roomType;
	}

	public void setRoomType(Dictionary roomType) {
		this.roomType = roomType;
	}
	
	@Column(name = "floor")
	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_id")
    @ForeignKey(name = "fk_building_room")
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "price")
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "discount")
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	
}
