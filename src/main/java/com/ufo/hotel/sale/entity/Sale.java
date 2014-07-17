package com.ufo.hotel.sale.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ufo.framework.core.entity.UnDeleteEntity;

/**
 * 
 * 类名称：Dictionary 
 * 类描述：销售订单类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-5-28 下午11:21:41 
 * @version 1.0
 *
 */
@Entity
@Table(name = "ufo_hotel_sale")
public class Sale extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5869608427115459477L;

}
