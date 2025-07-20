package com.Enotes.Entity;

import java.util.Date;

import jakarta.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	@Column(name = "Category_Name")
	@NotEmpty
	@Size(min=3, max = 20, message = "Category name cannot be empty")
	public String name;
	
	@Column(name = "Category_Desc")
	@NotEmpty
	@Size(min = 10, max = 200, message = "Category description cannot be empty")
	public String description;
	
	public Boolean isActive;
	
	
	public Boolean isDeleted;
	
	
	public Integer createdBy;

	public Date createdDate;
	
	
	public Integer updatedBy;
	
	
	public Date updatedDate;
}
