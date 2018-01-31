package com.rdh.boss.order.service.impl;
import com.rdh.boss.order.service.RdhOrderServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.rdh.boss.order.entity.RdhOrderEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("rdhOrderService")
@Transactional
public class RdhOrderServiceImpl extends CommonServiceImpl implements RdhOrderServiceI {

	
 	public void delete(RdhOrderEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(RdhOrderEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(RdhOrderEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(RdhOrderEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(RdhOrderEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(RdhOrderEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(RdhOrderEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("order_num", t.getOrderNum());
		map.put("order_name", t.getOrderName());
		map.put("hospital_name", t.getHospitalName());
		map.put("product_name", t.getProductName());
		map.put("ower_name", t.getOwerName());
		map.put("availability_date", t.getAvailabilityDate());
		map.put("delivery_date", t.getDeliveryDate());
		map.put("delivery_instruction", t.getDeliveryInstruction());
		map.put("maintenance_instruction", t.getMaintenanceInstruction());
		map.put("payment_instruction", t.getPaymentInstruction());
		map.put("remark", t.getRemark());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,RdhOrderEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{order_num}",String.valueOf(t.getOrderNum()));
 		sql  = sql.replace("#{order_name}",String.valueOf(t.getOrderName()));
 		sql  = sql.replace("#{hospital_name}",String.valueOf(t.getHospitalName()));
 		sql  = sql.replace("#{product_name}",String.valueOf(t.getProductName()));
 		sql  = sql.replace("#{ower_name}",String.valueOf(t.getOwerName()));
 		sql  = sql.replace("#{availability_date}",String.valueOf(t.getAvailabilityDate()));
 		sql  = sql.replace("#{delivery_date}",String.valueOf(t.getDeliveryDate()));
 		sql  = sql.replace("#{delivery_instruction}",String.valueOf(t.getDeliveryInstruction()));
 		sql  = sql.replace("#{maintenance_instruction}",String.valueOf(t.getMaintenanceInstruction()));
 		sql  = sql.replace("#{payment_instruction}",String.valueOf(t.getPaymentInstruction()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("rdh_order",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}