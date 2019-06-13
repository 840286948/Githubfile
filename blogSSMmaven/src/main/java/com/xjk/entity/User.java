package com.xjk.entity;

import java.util.Date;
import java.util.List;
/**
 * 用户表
 * @author Administrator
 *
 */
public class User {
	private Integer id;
	private String realname;
	private String username;
	private String password;
	private String telephone;
	private Integer status;
	private Date createTime;
	private List<Article> article;
	private List<UserLog> userLog;
	public User(){}
	
	/**
	 * @return the userLog
	 */
	public List<UserLog> getUserLog() {
		return userLog;
	}

	/**
	 * @param userLog the userLog to set
	 */
	public void setUserLog(List<UserLog> userLog) {
		this.userLog = userLog;
	}

	/**
	 * @return the article
	 */
	public List<Article> getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(List<Article> article) {
		this.article = article;
	}

	/**
	 * @return the realname
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * @param realname the realname to set
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the telephoe
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephoe the telephoe to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
