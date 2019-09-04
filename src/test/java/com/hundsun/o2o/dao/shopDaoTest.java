package com.hundsun.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hundsun.o2o.BaseTest;
import com.hundsun.o2o.entity.Area;
import com.hundsun.o2o.entity.PersonInfo;
import com.hundsun.o2o.entity.Shop;
import com.hundsun.o2o.entity.ShopCategory;

public class shopDaoTest extends BaseTest {
@Autowired
private ShopDao shopDao;
@Test
@Ignore
public void testInsertShop() {
	Shop shop=new Shop();
	PersonInfo owner =new PersonInfo();
	Area area =new Area();
	ShopCategory shopCategory=new ShopCategory();
	owner.setUserId(1L);
	area.setAreaId(2);
	shop.setOwner(owner);
	shop.setArea(area);
	shop.setShopCategory(shopCategory);
	shop.setShopName("测试的店铺");
	shop.setShopAddr("test");
	shop.setShopDesc("test");
	shop.setPhone("test");
	shop.setShopImg("test");
	shop.setCreateTime(new Date());
	shop.setEnableStatus(1);
	shop.setAdvice("审核中");
	int effectednums=shopDao.insertShop(shop);
	assertEquals(1, effectednums);
	
}


@Test
public void testUpdateShop() {
	Shop shop=new Shop();
	shop.setShopId(1L);
	shop.setShopAddr("测试地址");
	shop.setShopDesc("测试描述");
	shop.setLastEditTime(new Date());
	int effectednums=shopDao.updateShop(shop);
	assertEquals(1, effectednums);
	
}
}
