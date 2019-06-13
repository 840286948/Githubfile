package com.xjk.entity;

import java.util.Date;
/**
 * 角色表
 * @author Administrator
 *
 */
public class Role {
	private Integer id;
	private String role_name;
	private Integer status;
	private String role_describe;
	private Date createTime;
	public Role(){}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the role_name
	 */
	public String getRole_name() {
		return role_name;
	}
	/**
	 * @param role_name the role_name to set
	 */
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the role_describe
	 */
	public String getRole_describe() {
		return role_describe;
	}
	/**
	 * @param role_describe the role_describe to set
	 */
	public void setRole_describe(String role_describe) {
		this.role_describe = role_describe;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
