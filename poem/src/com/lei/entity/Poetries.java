package com.lei.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Poetries")
public class Poetries{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="poet_id")
    private Poets poets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Poets getPoets() {
		return poets;
	}
	public void setPoets(Poets poets) {
		this.poets = poets;
	}
}