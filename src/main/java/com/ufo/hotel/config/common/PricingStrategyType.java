package com.ufo.hotel.config.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 类名称：PricingStrategyType 
 * 类描述：商品 定价策略 ,1--不可变,2--都可变,3--名称可变,4--价格可变
 * 
 * 
 * 创建人：khe 创建时间：2014-5-28 下午11:21:41
 * 
 * @version 1.0
 * 
 */
public enum PricingStrategyType {

	NO_CHANGE, // 不可变 (名称、价格不可变)
	ALL_CHANGE, // 都可变 (名称、价格都可变)
	GOODS_NAME_CHANGE, // 名称可变
	GOODS_PRICE_CHANGE, // 价格可变
	;

	private static Map<PricingStrategyType, Integer> typeMap = new HashMap<PricingStrategyType, Integer>();
	private static Map<Integer, PricingStrategyType> valueMap = new HashMap<Integer, PricingStrategyType>();
	private static Map<PricingStrategyType, String> nameMap = new HashMap<PricingStrategyType, String>();

	static {
		typeMap.put(PricingStrategyType.NO_CHANGE, 1);
		typeMap.put(PricingStrategyType.ALL_CHANGE, 2);
		typeMap.put(PricingStrategyType.GOODS_NAME_CHANGE, 3);
		typeMap.put(PricingStrategyType.GOODS_PRICE_CHANGE, 4);

		nameMap.put(PricingStrategyType.NO_CHANGE, "不可变");
		nameMap.put(PricingStrategyType.ALL_CHANGE, "都可变");
		nameMap.put(PricingStrategyType.GOODS_NAME_CHANGE, "名称可变");
		nameMap.put(PricingStrategyType.GOODS_PRICE_CHANGE, "价格可变");
		for (PricingStrategyType state : typeMap.keySet()) {
			valueMap.put(typeMap.get(state), state);
		}
	}

	public Integer value() {
		return typeMap.get(this);
	}

	public static PricingStrategyType parse(int value) {
		if (!valueMap.containsKey(value)) {
			throw new IllegalArgumentException(value
					+ " is not a valid CardStatus");
		}
		return valueMap.get(value);
	}

	public String toName() {
		return nameMap.get(this);
	}

	public Integer getValue() {
		return value();
	}

	public String getName() {
		return toName();
	}

	public static List<PricingStrategyType> list() {
		final ArrayList<PricingStrategyType> list = new ArrayList<PricingStrategyType>(
				typeMap.keySet());
		Collections.sort(list, new java.util.Comparator<PricingStrategyType>() {
			@Override
			public int compare(PricingStrategyType o1, PricingStrategyType o2) {
				return o1.value().compareTo(o2.value());
			}
		});
		return list;
	}
}
