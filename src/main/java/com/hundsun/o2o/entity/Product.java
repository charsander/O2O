/**
 * 
 */
package com.hundsun.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Product {
private Long productid;
private String productName;
private String productDesc;
//商品缩略图
private String productImgAddr;
private String normalPrice;
private String promotionPrice;
private Integer priority;
private Date createTime;
private Date lastEditTime;
//0：下架  1:在前端展示系统展示
private Integer enableStatus;
private List<ProductImg> productImgList;
private ProductCategory productcategory;
private Shop shop;
public Long getProductid() {
	return productid;
}
public void setProductid(Long productid) {
	this.productid = productid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public String getProductImgAddr() {
	return productImgAddr;
}
public void setProductImgAddr(String productImgAddr) {
	this.productImgAddr = productImgAddr;
}
public String getNormalPrice() {
	return normalPrice;
}
public void setNormalPrice(String normalPrice) {
	this.normalPrice = normalPrice;
}
public String getPromotionPrice() {
	return promotionPrice;
}
public void setPromotionPrice(String promotionPrice) {
	this.promotionPrice = promotionPrice;
}
public Integer getPriority() {
	return priority;
}
public void setPriority(Integer priority) {
	this.priority = priority;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public Date getLastEditTime() {
	return lastEditTime;
}
public void setLastEditTime(Date lastEditTime) {
	this.lastEditTime = lastEditTime;
}
public Integer getEnableStatus() {
	return enableStatus;
}
public void setEnableStatus(Integer enableStatus) {
	this.enableStatus = enableStatus;
}
public List<ProductImg> getProductImgList() {
	return productImgList;
}
public void setProductImgList(List<ProductImg> productImgList) {
	this.productImgList = productImgList;
}
public ProductCategory getProductcategory() {
	return productcategory;
}
public void setProductcategory(ProductCategory productcategory) {
	this.productcategory = productcategory;
}
public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}





}
