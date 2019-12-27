package edu.swjtuhc.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Advise {
	@Id
	private Integer id;
	private String content;
	@CreatedDate
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date feedback_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getFeedback_time() {
		return feedback_time;
	}
	public void setFeedback_time(Date feedback_time) {
		this.feedback_time = feedback_time;
	}
	@Override
	public String toString() {
		return "Advise [id=" + id + ", content=" + content + ", feedback_time=" + feedback_time + "]";
	}
	
	
}
