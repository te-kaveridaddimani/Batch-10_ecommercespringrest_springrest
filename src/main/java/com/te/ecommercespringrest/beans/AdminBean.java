package com.te.ecommercespringrest.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;


import lombok.Data;


@Data
@Entity

@XmlRootElement(name="admin-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("admin")
	
@Table(name = "admin")
public class AdminBean implements Serializable {
	@Id
	@Column
	private Integer id;
	@Column
	private String password;

}
