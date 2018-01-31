<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>rdh_order</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="rdhOrderController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${rdhOrderPage.id }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单编号:
							</label>
						</td>
						<td class="value">
						     	 <input id="orderNum" name="orderNum" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.orderNum}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								订单名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="orderName" name="orderName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.orderName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">订单名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								医院名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="hospitalName" name="hospitalName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.hospitalName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">医院名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								产品名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="productName" name="productName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.productName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">产品名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								负责人姓名:
							</label>
						</td>
						<td class="value">
						     	 <input id="owerName" name="owerName" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.owerName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">负责人姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								合同生效日期:
							</label>
						</td>
						<td class="value">
									  <input id="availabilityDate" name="availabilityDate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  
									  ignore="ignore"
									    value='<fmt:formatDate value='${rdhOrderPage.availabilityDate}' type="date" pattern="yyyy-MM-dd"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合同生效日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								交货日期:
							</label>
						</td>
						<td class="value">
									  <input id="deliveryDate" name="deliveryDate" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  
									  ignore="ignore"
									    value='<fmt:formatDate value='${rdhOrderPage.deliveryDate}' type="date" pattern="yyyy-MM-dd"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">交货日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								交货件说明:
							</label>
						</td>
						<td class="value">
						     	 <input id="deliveryInstruction" name="deliveryInstruction" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.deliveryInstruction}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">交货件说明</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								维保说明:
							</label>
						</td>
						<td class="value">
						     	 <input id="maintenanceInstruction" name="maintenanceInstruction" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.maintenanceInstruction}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">维保说明</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								支付说明:
							</label>
						</td>
						<td class="value">
						     	 <input id="paymentInstruction" name="paymentInstruction" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.paymentInstruction}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">支付说明</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						     	 <input id="remark" name="remark" type="text" style="width: 150px" class="inputxt"  
						     	 ignore="ignore" 
						     	 value='${rdhOrderPage.remark}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/rdh/boss/order/rdhOrder.js"></script>		
