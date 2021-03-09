package com.id.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.id.compteType;
@Entity
public class Compte {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private double solde;
	@Enumerated(EnumType.ORDINAL)
	private compteType type;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public compteType getType() {
		return type;
	}
	public void setType(compteType type) {
		this.type = type;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Compte() {
		super();
	}
	public Compte(Long code, double solde, compteType type, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.type = type;
		this.dateCreation = dateCreation;
	}
	
}
