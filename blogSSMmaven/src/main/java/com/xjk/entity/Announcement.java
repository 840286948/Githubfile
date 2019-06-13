package com.xjk.entity;

import java.util.Date;

/**
 * 公告
 * @author Administrator
 *
 */
public class Announcement {
	private Integer id;
	private String announcement_title;//公告标题
	private String announcement_content;//公告内容
	private String announcement_keyword;//关键字
	private String announcement_describe;//描述
	private Integer status;//状态
	private User user;
	private Date createTime;//时间
	public Announcement(){}
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
	 * @return the announcement_title
	 */
	public String getAnnouncement_title() {
		return announcement_title;
	}
	/**
	 * @param announcement_title the announcement_title to set
	 */
	public void setAnnouncement_title(String announcement_title) {
		this.announcement_title = announcement_title;
	}
	/**
	 * @return the announcement_content
	 */
	public String getAnnouncement_content() {
		return announcement_content;
	}
	/**
	 * @param announcement_content the announcement_content to set
	 */
	public void setAnnouncement_content(String announcement_content) {
		this.announcement_content = announcement_content;
	}
	/**
	 * @return the announcement_keyword
	 */
	public String getAnnouncement_keyword() {
		return announcement_keyword;
	}
	/**
	 * @param announcement_keyword the announcement_keyword to set
	 */
	public void setAnnouncement_keyword(String announcement_keyword) {
		this.announcement_keyword = announcement_keyword;
	}
	/**
	 * @return the announcement_describe
	 */
	public String getAnnouncement_describe() {
		return announcement_describe;
	}
	/**
	 * @param announcement_describe the announcement_describe to set
	 */
	public void setAnnouncement_describe(String announcement_describe) {
		this.announcement_describe = announcement_describe;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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
