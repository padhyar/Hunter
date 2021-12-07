package com.sabih.hunta.Repository;

import com.sabih.hunta.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository <Application, Long> {
}
