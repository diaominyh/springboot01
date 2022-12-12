package com.diaomin.springboot01.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 入库记录类
 * @author project.cvs.team
 */
public class StorageRecord {
	private Integer id;   				//id
	private String srCode; 			//入库记录编码
	private String supName; 			//供货商名称，不映射数据库
	private String goodsDesc; 			//商品备注
	private String goodsUnit; 			//商品单位
	private BigDecimal goodsCount; 	//入库数量
	private BigDecimal totalAmount; 	//总金额
	private Integer payStatus;			//支付状态
	private Integer supplierId; 		//供货商ID
	private Integer createdUserId; 	//创建者
	private Date createdTime; 		//创建时间
	private Integer updatedUserId; 	//更新者
	private Date updatedTime;			//更新时间
	
	private String goodsName;			//商品名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSrCode() {
		return srCode;
	}

	public void setSrCode(String srCode) {
		this.srCode = srCode;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsUnit() {
		return goodsUnit;
	}

	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public BigDecimal getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(BigDecimal goodsCount) {
		this.goodsCount = goodsCount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(Integer updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
}
