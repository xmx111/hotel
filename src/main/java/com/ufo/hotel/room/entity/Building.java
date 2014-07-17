package com.ufo.hotel.room.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.ufo.framework.core.entity.IdEntity;

/**
 * 
 * 类名称：Building 
 * 类描述：楼房类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-4-5 下午21:53:51 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_building")
public class Building extends IdEntity {

	/**
	 * 楼号
	 */
	private String no;
	
	/**
	 * 楼名字
	 */
	private String name;
	
	/**
	 * 层数
	 */
	private Integer floors;
	
	/**
	 * 楼类型
	 */
	private Integer buildingType;
	
	/**
	 * 楼状态
	 */
	private Integer status;
	
	/**
	 * 所有房间
	 */
	private Set<Room> Rooms;

	@Column(name = "no", length = 10)
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Column(name = "name", length = 64)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "floor")
	public Integer getFloors() {
		return floors;
	}

	public void setFloors(Integer floors) {
		this.floors = floors;
	}

	@Column(name = "building_type")
	public Integer getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(Integer buildingType) {
		this.buildingType = buildingType;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "building")
    @OrderBy(" id ")
	public Set<Room> getRooms() {
		return Rooms;
	}

	public void setRooms(Set<Room> rooms) {
		Rooms = rooms;
	}
	
}
