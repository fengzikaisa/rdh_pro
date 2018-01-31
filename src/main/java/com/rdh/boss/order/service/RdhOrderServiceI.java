package com.rdh.boss.order.service;
import com.rdh.boss.order.entity.RdhOrderEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface RdhOrderServiceI extends CommonService{
	
 	public void delete(RdhOrderEntity entity) throws Exception;
 	
 	public Serializable save(RdhOrderEntity entity) throws Exception;
 	
 	public void saveOrUpdate(RdhOrderEntity entity) throws Exception;
 	
}
