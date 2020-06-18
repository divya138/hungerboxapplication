package com.example.hungerbox.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hungerbox.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	List<Item> findItemByNameLike(String string);
	
}
