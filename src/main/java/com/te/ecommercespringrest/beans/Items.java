package com.te.ecommercespringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@XmlRootElement(name="items-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("items")
public class Items implements Serializable {
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private int quntity;
	@Column
	private Double price;

}
