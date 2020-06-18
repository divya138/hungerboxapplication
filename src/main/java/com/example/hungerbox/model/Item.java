package com.example.hungerbox.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.FetchType;
>>>>>>> 8322256d1ba0f76580d58dc3dceaba3367847b17
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long itemId;
	private String name;
	private String itemType;
	private String itemDescription;
	private Double unitPrice;
	
<<<<<<< HEAD
    @JsonIgnore
=======

>>>>>>> 8322256d1ba0f76580d58dc3dceaba3367847b17
	@ManyToOne(cascade = CascadeType.MERGE)
	private Vendor vendor;


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public Double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public Vendor getVendor() {
		return vendor;
	}


	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}


	
}
