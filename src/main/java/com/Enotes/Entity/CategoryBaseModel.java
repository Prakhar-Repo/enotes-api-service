package com.Enotes.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass //use krte ha jisse main class iske attributes bhi lele table banate hue jisne ise extend kara ha
public class CategoryBaseModel {
	
	
	public Boolean isActive;
	
	public Boolean isDeleted;
	
	
	public Integer createdBy;

	public Date createdOn;
	
	
	public Integer updatedBy;
	
	
	public Date updatedOn;

}
