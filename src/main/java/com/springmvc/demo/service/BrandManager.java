package com.springmvc.demo.service;

import com.springmvc.demo.model.Brand;

import java.util.LinkedList;
import java.util.List;

public class BrandManager {
 
	private List<Brand> brandList;
 
	public BrandManager() {
		/*Brand brand1 = new Brand();
		brand1.setId((long)1);
		brand1.setName("Mercedes");
		brand1.setCountry("Germany");		
 
		Brand brand2 = new Brand();
		brand2.setId((long)2);
		brand2.setName("Peugeot");
		brand2.setCountry("France");		
 
		brandList = new LinkedList<Brand>();
		brandList.add(brand1);
		brandList.add(brand2);
		*/
	}

	/**
	 * 		just need to add a setter method for CarManager and BrandManager's lists
	 * 		and remove the now useless initialization code.
	 * @param brandList
	 */
	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}
	public List<Brand> getBrandList() {
		return brandList;
	}	
 
	public Brand getBrandById(Long id) {
		for (Brand brand : brandList) {
			if (brand.getId().equals(id))
				return brand;
		}
		return null;
	}
}