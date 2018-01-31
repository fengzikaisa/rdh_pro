<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="rdhOrderList" checkbox="true" pagination="true" fitColumns="false" title="rdh_order" actionUrl="rdhOrderController.do?datagrid" idField="id" fit="true" queryMode="group">
    <t:dgCol title="id"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="订单编号"  field="orderNum"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="订单名称"  field="orderName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="医院名称"  field="hospitalName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="产品名称"  field="productName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="负责人姓名"  field="owerName"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="合同生效日期"  field="availabilityDate" formatter="yyyy-MM-dd"   queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="交货日期"  field="deliveryDate" formatter="yyyy-MM-dd"   queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="交货件说明"  field="deliveryInstruction"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="维保说明"  field="maintenanceInstruction"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="支付说明"  field="paymentInstruction"    queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="备注"  field="remark"    queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="rdhOrderController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="rdhOrderController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="rdhOrderController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="rdhOrderController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="rdhOrderController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/rdh/boss/order/rdhOrderList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'rdhOrderController.do?upload', "rdhOrderList");
}

//导出
function ExportXls() {
	JeecgExcelExport("rdhOrderController.do?exportXls","rdhOrderList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("rdhOrderController.do?exportXlsByT","rdhOrderList");
}

 </script>