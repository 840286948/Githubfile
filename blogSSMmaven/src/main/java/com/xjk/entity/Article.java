package com.xjk.entity;

import java.util.Date;
import java.util.List;

/**
 * 文章表
 * @author Administrator
 *
 */
public class Article {
	private Integer id;//文章id
	private String article_title;//文章标题
	private String article_content;//文章内容
	private String article_keywords;//关键字
	private String article_describe;//描述
	private User user;
	private Column column;
	private Integer article_clicks;
	private Integer column_id;
	private Integer user_id;
	private String article_label;//标签
	private String title_image;//标题图片
	private Integer status;//状态
	private Integer comment_status;
	private Integer zding_status;
	private Date zding_Time;
	private Date createTime;//时间
	private List<Comment> comment;
	private long comment_tota;//评论总数
	public Article(){}
	/**
	 * @return the comment_tota
	 */
	public long getComment_tota() {
		return comment_tota;
	}

	/**
	 * @return the article_clicks
	 */
	public Integer getArticle_clicks() {
		return article_clicks;
	}

	/**
	 * @param article_clicks the article_clicks to set
	 */
	public void setArticle_clicks(Integer article_clicks) {
		this.article_clicks = article_clicks;
	}

	/**
	 * @param comment_tota the comment_tota to set
	 */
	public void setComment_tota(long comment_tota) {
		this.comment_tota = comment_tota;
	}

	/**
	 * @return the comment
	 */
	public List<Comment> getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	/**
	 * @return the column_id
	 */
	public Integer getColumn_id() {
		return column_id;
	}

	/**
	 * @param column_id the column_id to set
	 */
	public void setColumn_id(Integer column_id) {
		this.column_id = column_id;
	}
	
	/**
	 * @return the comment_status
	 */
	public Integer getComment_status() {
		return comment_status;
	}

	/**
	 * @param comment_status the comment_status to set
	 */
	public void setComment_status(Integer comment_status) {
		this.comment_status = comment_status;
	}

	/**
	 * @return the zding_status
	 */
	public Integer getZding_status() {
		return zding_status;
	}

	/**
	 * @param zding_status the zding_status to set
	 */
	public void setZding_status(Integer zding_status) {
		this.zding_status = zding_status;
	}

	/**
	 * @return the zding_Time
	 */
	public Date getZding_Time() {
		return zding_Time;
	}

	/**
	 * @param zding_Time the zding_Time to set
	 */
	public void setZding_Time(Date zding_Time) {
		this.zding_Time = zding_Time;
	}

	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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
	 * @return the article_title
	 */
	public String getArticle_title() {
		return article_title;
	}
	/**
	 * @param article_title the article_title to set
	 */
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	/**
	 * @return the article_content
	 */
	public String getArticle_content() {
		return article_content;
	}
	/**
	 * @param article_content the article_content to set
	 */
	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}
	/**
	 * @return the article_keywords
	 */
	public String getArticle_keywords() {
		return article_keywords;
	}
	/**
	 * @param article_keywords the article_keywords to set
	 */
	public void setArticle_keywords(String article_keywords) {
		this.article_keywords = article_keywords;
	}
	/**
	 * @return the article_describe
	 */
	public String getArticle_describe() {
		return article_describe;
	}
	/**
	 * @param article_describe the article_describe to set
	 */
	public void setArticle_describe(String article_describe) {
		this.article_describe = article_describe;
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
	 * @return the column
	 */
	public Column getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(Column column) {
		this.column = column;
	}
	/**
	 * @return the article_label
	 */
	public String getArticle_label() {
		return article_label;
	}
	/**
	 * @param article_label the article_label to set
	 */
	public void setArticle_label(String article_label) {
		this.article_label = article_label;
	}
	/**
	 * @return the title_image
	 */
	public String getTitle_image() {
		return title_image;
	}
	/**
	 * @param title_image the title_image to set
	 */
	public void setTitle_image(String title_image) {
		this.title_image = title_image;
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
