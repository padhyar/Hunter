package com.sabih.hunta.Repository;

import com.sabih.hunta.Model.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, Long> {
}
