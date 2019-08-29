/**
 * 
 */
package com.hundsun.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hundsun.o2o.dao.AreaDao;
import com.hundsun.o2o.entity.Area;
import com.hundsun.o2o.service.AreaService;

/**
 * @author Administrator
 *
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hundsun.o2o.service.AreaService#getAreaList()
	 */
	@Override
	public List<Area> getAreaList() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}

}
