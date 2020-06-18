package com.example.hungerbox.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hungerbox.model.Item;
import com.example.hungerbox.model.Vendor;

public interface ItemRepositroy extends JpaRepository<Item, Long>{

	List<Item> findItemByVendor(Vendor vendor1);
	
	

}
 
=======
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hungerbox.model.Item;

public interface ItemRepositroy extends JpaRepository<Item, Long> {

}
>>>>>>> 8322256d1ba0f76580d58dc3dceaba3367847b17
