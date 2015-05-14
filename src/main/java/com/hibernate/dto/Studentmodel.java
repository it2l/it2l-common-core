package com.hibernate.dto;

// Generated 14-May-2015 17:48:38 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Studentmodel generated by hbm2java
 */
@Entity
@Table(name = "studentmodel", catalog = "italk2learn")
public class Studentmodel implements java.io.Serializable {

	private Integer idStudentmodel;
	private User user;
	private byte isExploratoryExercise;
	private int studentChallenge;
	private String currentExercise;
	private int unstructuredCounter;
	private int structuredCounter;

	public Studentmodel() {
	}

	public Studentmodel(User user, byte isExploratoryExercise,
			int studentChallenge, String currentExercise,
			int unstructuredCounter, int structuredCounter) {
		this.user = user;
		this.isExploratoryExercise = isExploratoryExercise;
		this.studentChallenge = studentChallenge;
		this.currentExercise = currentExercise;
		this.unstructuredCounter = unstructuredCounter;
		this.structuredCounter = structuredCounter;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_studentmodel", unique = true, nullable = false)
	public Integer getIdStudentmodel() {
		return this.idStudentmodel;
	}

	public void setIdStudentmodel(Integer idStudentmodel) {
		this.idStudentmodel = idStudentmodel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "isExploratoryExercise", nullable = false)
	public byte getIsExploratoryExercise() {
		return this.isExploratoryExercise;
	}

	public void setIsExploratoryExercise(byte isExploratoryExercise) {
		this.isExploratoryExercise = isExploratoryExercise;
	}

	@Column(name = "studentChallenge", nullable = false)
	public int getStudentChallenge() {
		return this.studentChallenge;
	}

	public void setStudentChallenge(int studentChallenge) {
		this.studentChallenge = studentChallenge;
	}

	@Column(name = "currentExercise", nullable = false, length = 100)
	public String getCurrentExercise() {
		return this.currentExercise;
	}

	public void setCurrentExercise(String currentExercise) {
		this.currentExercise = currentExercise;
	}

	@Column(name = "unstructuredCounter", nullable = false)
	public int getUnstructuredCounter() {
		return this.unstructuredCounter;
	}

	public void setUnstructuredCounter(int unstructuredCounter) {
		this.unstructuredCounter = unstructuredCounter;
	}

	@Column(name = "structuredCounter", nullable = false)
	public int getStructuredCounter() {
		return this.structuredCounter;
	}

	public void setStructuredCounter(int structuredCounter) {
		this.structuredCounter = structuredCounter;
	}

}
