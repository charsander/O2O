/**
 * 
 */
package com.hundsun.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hundsun.o2o.BaseTest;
import com.hundsun.o2o.entity.Area;

/**
 * @author Administrator
 *
 */
public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	@Test
	public  void testAreaList() {
		List<Area>areaList=areaService.getAreaList();
		System.out.println(areaList.get(0).getAreaName());
		assertEquals("西苑", areaList.get(0).getAreaName());
	}
}
