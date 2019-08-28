/**
 * 
 */
package com.hundsun.o2o.dao;

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
public class AreaDaoTest extends BaseTest {
	@Autowired
	private AreaDao areaDao;

	@Test
	public void testQueryArea() {
		List<Area> arealist = areaDao.queryArea();
		assertEquals(2, arealist.size());
	}
}
