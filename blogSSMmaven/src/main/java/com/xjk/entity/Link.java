package com.xjk.entity;

import java.util.Date;

/**
 * 友情链接
 * @author Administrator
 *
 */
public class Link {
	private Integer id;
	private String link_name;
	private String link_url;
	private String link_image;
	private String link_describe;
	private Date createTime;
	public Link(){}
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
	 * @return the link
	 */
	public String getLink_url() {
		return link_url;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}
	/**
	 * @return the link_image
	 */
	public String getLink_image() {
		return link_image;
	}
	/**
	 * @param link_image the link_image to set
	 */
	public void setLink_image(String link_image) {
		this.link_image = link_image;
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
	/**
	 * @return the describe
	 */
	/**
	 * @return the link_name
	 */
	public String getLink_name() {
		return link_name;
	}
	/**
	 * @param link_name the link_name to set
	 */
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	/**
	 * @return the link_describe
	 */
	public String getLink_describe() {
		return link_describe;
	}
	/**
	 * @param link_describe the link_describe to set
	 */
	public void setLink_describe(String link_describe) {
		this.link_describe = link_describe;
	}
	
	
}
