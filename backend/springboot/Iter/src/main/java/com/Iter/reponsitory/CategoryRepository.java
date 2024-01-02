package com.Iter.reponsitory;

import com.Iter.model.Tech.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category,Long> {


}
