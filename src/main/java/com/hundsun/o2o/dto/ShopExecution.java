/**
 * 
 */
package com.hundsun.o2o.dto;

import java.util.List;

import com.hundsun.o2o.dao.shopDaoTest;
import com.hundsun.o2o.entity.Shop;
import com.hundsun.o2o.enums.ShopStateEnum;

/**
 * @author Administrator
 *
 */
public class ShopExecution {
	//结果状态
private int state;
//状态标识
private String stateInfo;
//店铺数量
private int count;
//操作的shop
private Shop shop;
//shop 列表
private List<Shop> shopList;
	/**
	 * 
	 */
	public ShopExecution() {
		// TODO Auto-generated constructor stub
	}
//店铺操作失败时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		
	}
	//店铺操作成功时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum,Shop shop) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		this.shop=shop;
		
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Shop> getShopList() {
		return shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	//店铺操作成功的时候使用的构造器
	public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList) {
		this.state=stateEnum.getState();
		this.stateInfo=stateEnum.getStateInfo();
		this.shopList=shopList;
		
	}
}
