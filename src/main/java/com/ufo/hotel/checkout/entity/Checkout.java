package com.ufo.hotel.checkout.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ufo.framework.core.entity.UnDeleteEntity;

/**
 * 
 * 类名称：Checkout 
 * 类描述：结账类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-5-28 下午22:10:31 
 * @version 0.1
 *
 */
@Entity
@Table(name = "ufo_hotel_checkout")
public class Checkout extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5240747849042586647L;

}
