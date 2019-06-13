package com.xjk.entity;

import java.util.Date;
import java.util.List;

/**
 * 栏目表
 * @author Administrator
 *
 */
public class Column {
	private Integer id;
	private String column_name;//栏目名称
	private String column_alias;//栏目别名
	private String column_keywords;//关键字
	private String column_description;//描述
	private Date createTime;//时间
	private List<Article> article;
	public Column(){}
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
	 * @return the column_name
	 */
	public String getColumn_name() {
		return column_name;
	}
	/**
	 * @param column_name the column_name to set
	 */
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	/**
	 * @return the column_alias
	 */
	public String getColumn_alias() {
		return column_alias;
	}
	/**
	 * @param column_alias the column_alias to set
	 */
	public void setColumn_alias(String column_alias) {
		this.column_alias = column_alias;
	}
	/**
	 * @return the column_keywords
	 */
	public String getColumn_keywords() {
		return column_keywords;
	}
	/**
	 * @param column_keywords the column_keywords to set
	 */
	public void setColumn_keywords(String column_keywords) {
		this.column_keywords = column_keywords;
	}
	/**
	 * @return the column_description
	 */
	public String getColumn_description() {
		return column_description;
	}
	/**
	 * @param column_description the column_description to set
	 */
	public void setColumn_description(String column_description) {
		this.column_description = column_description;
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
	
}
