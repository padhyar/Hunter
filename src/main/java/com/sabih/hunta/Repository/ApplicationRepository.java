package com.sabih.hunta.Repository;

import com.sabih.hunta.Model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository <Application, Long> {
}
