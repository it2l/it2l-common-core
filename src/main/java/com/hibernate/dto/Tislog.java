package com.hibernate.dto;

// Generated 14-May-2015 21:03:33 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tislog generated by hbm2java
 */
@Entity
@Table(name = "tislog", catalog = "italk2learn")
public class Tislog implements java.io.Serializable {

	private Integer idTislog;
	private User user;
	private String key;
	private String value;
	private Date date;

	public Tislog() {
	}

	public Tislog(User user, Date date) {
		this.user = user;
		this.date = date;
	}

	public Tislog(User user, String key, String value, Date date) {
		this.user = user;
		this.key = key;
		this.value = value;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tislog", unique = true, nullable = false)
	public Integer getIdTislog() {
		return this.idTislog;
	}

	public void setIdTislog(Integer idTislog) {
		this.idTislog = idTislog;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "key", length = 50)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "value", length = 1000)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
