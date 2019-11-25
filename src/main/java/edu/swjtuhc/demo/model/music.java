package edu.swjtuhc.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="music")//对应了数据库的表名，必填
public class music {
	@Id//对应主键，必填
	private int id;
	
	@Column(name="music_name")
    private String music_name;
	
	@Column(name="music_url")
    private String music_url;
	
	@Column(name="master")
    private String master;
	
	@Column(name="create_time")
    private Date create_time;//引入Date时选择java.sql.Date，否则会引发许多问题
	
	@Column(name="update_time")
    private Date update_time;

	public music() {

    }
	public music(String music_name, String music_url, String master, Date create_time, Date update_time) {
		this.music_name = music_name;        
		this.music_url = music_url;       
		this.master = master;        
		this.create_time = create_time;        
		this.update_time = update_time;    
		}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMusic_name() {
		return music_name;
	}

	public void setMusic_name(String music_name) {
		this.music_name = music_name;
	}

	public String getMusic_url() {
		return music_url;
	}

	public void setMusic_url(String music_url) {
		this.music_url = music_url;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}
