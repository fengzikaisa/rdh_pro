package com.rdh.boss.order.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: rdh_order
 * @author onlineGenerator
 * @date 2018-01-30 14:10:22
 * @version V1.0   
 *
 */
@Entity
@Table(name = "rdh_order", schema = "")
@SuppressWarnings("serial")
public class RdhOrderEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**订单编号*/
	@Excel(name="订单编号")
	private java.lang.String orderNum;
	/**订单名称*/
	@Excel(name="订单名称")
	private java.lang.String orderName;
	/**医院名称*/
	@Excel(name="医院名称")
	private java.lang.String hospitalName;
	/**产品名称*/
	@Excel(name="产品名称")
	private java.lang.String productName;
	/**负责人姓名*/
	@Excel(name="负责人姓名")
	private java.lang.String owerName;
	/**合同生效日期*/
	@Excel(name="合同生效日期",format = "yyyy-MM-dd")
	private java.util.Date availabilityDate;
	/**交货日期*/
	@Excel(name="交货日期",format = "yyyy-MM-dd")
	private java.util.Date deliveryDate;
	/**交货件说明*/
	@Excel(name="交货件说明")
	private java.lang.String deliveryInstruction;
	/**维保说明*/
	@Excel(name="维保说明")
	private java.lang.String maintenanceInstruction;
	/**支付说明*/
	@Excel(name="支付说明")
	private java.lang.String paymentInstruction;
	/**备注*/
	@Excel(name="备注")
	private java.lang.String remark;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID",nullable=false,length=19)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单编号
	 */
	@Column(name ="ORDER_NUM",nullable=true,length=50)
	public java.lang.String getOrderNum(){
		return this.orderNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单编号
	 */
	public void setOrderNum(java.lang.String orderNum){
		this.orderNum = orderNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  订单名称
	 */
	@Column(name ="ORDER_NAME",nullable=true,length=50)
	public java.lang.String getOrderName(){
		return this.orderName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  订单名称
	 */
	public void setOrderName(java.lang.String orderName){
		this.orderName = orderName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  医院名称
	 */
	@Column(name ="HOSPITAL_NAME",nullable=true,length=50)
	public java.lang.String getHospitalName(){
		return this.hospitalName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  医院名称
	 */
	public void setHospitalName(java.lang.String hospitalName){
		this.hospitalName = hospitalName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品名称
	 */
	@Column(name ="PRODUCT_NAME",nullable=true,length=50)
	public java.lang.String getProductName(){
		return this.productName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品名称
	 */
	public void setProductName(java.lang.String productName){
		this.productName = productName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  负责人姓名
	 */
	@Column(name ="OWER_NAME",nullable=true,length=50)
	public java.lang.String getOwerName(){
		return this.owerName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  负责人姓名
	 */
	public void setOwerName(java.lang.String owerName){
		this.owerName = owerName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  合同生效日期
	 */
	@Column(name ="AVAILABILITY_DATE",nullable=true)
	public java.util.Date getAvailabilityDate(){
		return this.availabilityDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  合同生效日期
	 */
	public void setAvailabilityDate(java.util.Date availabilityDate){
		this.availabilityDate = availabilityDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  交货日期
	 */
	@Column(name ="DELIVERY_DATE",nullable=true)
	public java.util.Date getDeliveryDate(){
		return this.deliveryDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  交货日期
	 */
	public void setDeliveryDate(java.util.Date deliveryDate){
		this.deliveryDate = deliveryDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  交货件说明
	 */
	@Column(name ="DELIVERY_INSTRUCTION",nullable=true,length=100)
	public java.lang.String getDeliveryInstruction(){
		return this.deliveryInstruction;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  交货件说明
	 */
	public void setDeliveryInstruction(java.lang.String deliveryInstruction){
		this.deliveryInstruction = deliveryInstruction;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  维保说明
	 */
	@Column(name ="MAINTENANCE_INSTRUCTION",nullable=true,length=100)
	public java.lang.String getMaintenanceInstruction(){
		return this.maintenanceInstruction;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  维保说明
	 */
	public void setMaintenanceInstruction(java.lang.String maintenanceInstruction){
		this.maintenanceInstruction = maintenanceInstruction;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  支付说明
	 */
	@Column(name ="PAYMENT_INSTRUCTION",nullable=true,length=100)
	public java.lang.String getPaymentInstruction(){
		return this.paymentInstruction;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  支付说明
	 */
	public void setPaymentInstruction(java.lang.String paymentInstruction){
		this.paymentInstruction = paymentInstruction;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=200)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
}
