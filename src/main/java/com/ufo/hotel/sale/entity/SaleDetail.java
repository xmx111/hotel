package com.ufo.hotel.sale.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ufo.framework.core.entity.UnDeleteEntity;

/**
 * 
 * 类名称：Dictionary 
 * 类描述：销售订单明细类 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-5-28 下午11:22:11 
 * @version 1.0
 *
 */
@Entity
@Table(name = "ufo_hotel_sale_detail")
public class SaleDetail extends UnDeleteEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7962338932509869461L;

}
