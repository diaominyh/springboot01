package com.diaomin.springboot01.pojo;

//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * 便利店供货商类
 * @author project.cvs.team
 */
public class Supplier {
	
	private Integer id;   			//id
	//@NotEmpty(message = "供货商编码不能为空")
	private String supCode; 		//供货商编码
	//@NotEmpty(message = "供货商名称不能为空")
	private String supName; 		//供货商名称
	private String supDesc; 		//供货商备注
	//@NotEmpty(message = "联系人不能为空")
	private String supContact;		//供货商联系人
	//@Pattern(regexp = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$",message = "请输入正确格式的手机号")
	private String supPhone; 		//供货商电话
	private String supAddress; 	//供货商地址
	private String supFax; 		//供货商传真
	private Integer createdUserId;//创建者
	private Date createdTime; 	//创建时间
	private Integer updatedUserId;//更新者
	private Date updatedTime;		//更新时间
	private String companyLicPicPath;//企业营业执照的存储路径
	private String orgCodePicPath;//组织机构代码证的存储路径

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSupCode() {
		return supCode;
	}
	public void setSupCode(String supCode) {
		this.supCode = supCode;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupDesc() {
		return supDesc;
	}
	public void setSupDesc(String supDesc) {
		this.supDesc = supDesc;
	}
	public String getSupContact() {
		return supContact;
	}
	public void setSupContact(String supContact) {
		this.supContact = supContact;
	}
	public String getSupPhone() {
		return supPhone;
	}
	public void setSupPhone(String supPhone) {
		this.supPhone = supPhone;
	}
	public String getSupAddress() {
		return supAddress;
	}
	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}
	public String getSupFax() {
		return supFax;
	}
	public void setSupFax(String supFax) {
		this.supFax = supFax;
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

	public String getCompanyLicPicPath() {
		return companyLicPicPath;
	}

	public void setCompanyLicPicPath(String companyLicPicPath) {
		this.companyLicPicPath = companyLicPicPath;
	}

	public String getOrgCodePicPath() {
		return orgCodePicPath;
	}

	public void setOrgCodePicPath(String orgCodePicPath) {
		this.orgCodePicPath = orgCodePicPath;
	}
}
