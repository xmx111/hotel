package com.ufo.hotel.config.common;

/**
 * 
 * 类名称：Entry 
 * 类描述： 
 * 
 * 
 * 创建人：khe
 * 创建时间：2014-3-25 下午5:17:56 
 * @version 0.1
 *
 */
public class Entry<K, V> implements java.util.Map.Entry<K, V> {
    private K k;
    private V v;

    public Entry() {
    }

    public Entry(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K setKey(K k) {
        this.k = k;
        return this.k;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }

    public V setValue(V paramV) {
        this.v = paramV;
        return this.v;
    }

}