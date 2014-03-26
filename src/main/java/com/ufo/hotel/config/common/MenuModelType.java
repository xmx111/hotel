package com.ufo.hotel.config.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 类名称：MenuModelType 
 * 类描述：菜单模块类型 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午4:54:17 
 * @version 0.1
 *
 */
public enum MenuModelType {

    CONFIG, //系统配置
    CUSTOM, //客户管理
    ;
    private static Map<MenuModelType, Integer> typeMap = new HashMap<MenuModelType, Integer>();
    private static Map<Integer, MenuModelType> valueMap = new HashMap<Integer, MenuModelType>();
    private static Map<MenuModelType, String> nameMap = new HashMap<MenuModelType, String>();
    private static Map<MenuModelType, String> iconMap = new HashMap<MenuModelType, String>();
    static {
        typeMap.put(MenuModelType.CONFIG, 1);
        typeMap.put(MenuModelType.CUSTOM, 2);

        nameMap.put(MenuModelType.CONFIG, "系统配置");
        nameMap.put(MenuModelType.CUSTOM, "客户管理");
        
        iconMap.put(MenuModelType.CONFIG, "");
        iconMap.put(MenuModelType.CUSTOM, "");

        for (MenuModelType state : typeMap.keySet()) {
            valueMap.put(typeMap.get(state), state);
        }
    }

    public Integer value() {
        return typeMap.get(this);
    }

    public static MenuModelType parse(int value) {
        if (!valueMap.containsKey(value)) {
            throw new IllegalArgumentException(value + " is not a valid MenuModel");
        }
        return valueMap.get(value);
    }

    public String toName() {
        return nameMap.get(this);
    }
    
    public String toIcon(){
        return iconMap.get(this);
    }

    public Integer getValue() {
        return value();
    }

    public String getName() {
        return toName();
    }
    
    public String getIcon() {
        return toIcon();
    }

    public static List<MenuModelType> list() {
        final ArrayList<MenuModelType> list = new ArrayList<MenuModelType>(typeMap.keySet());
        Collections.sort(list, new java.util.Comparator<MenuModelType>() {
            public int compare(MenuModelType o1, MenuModelType o2) {
                return o1.value().compareTo(o2.value());
            }

        });
        return list;
    }
}
