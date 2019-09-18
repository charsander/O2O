/**
 * 
 */
package com.hundsun.o2o.enums;

/**
 * @author Administrator
 *
 */
public enum ShopStateEnum {
CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),PASS(2,"通过认证"),INNERERROR(-1001,"内部错误"),NULL_SHOPID(-1002,"商品ID为空");
private int state;
private String stateInfo;
private ShopStateEnum(int state,String stateinfo) {
	this.state=state;
	this.stateInfo=stateinfo;
}
//依据传入的state返回响应的enum值
public int getState() {
	return state;
}

public String getStateInfo() {
	return stateInfo;
}

private static ShopStateEnum stateOf(int state) {
	for (ShopStateEnum stateEnum:values()) {
		if(stateEnum.getState()== state ) {
			return stateEnum;
		}
	}
	return null;
}
}
