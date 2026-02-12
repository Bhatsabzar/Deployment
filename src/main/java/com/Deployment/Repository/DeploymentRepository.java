package com.Deployment.Repository;

import com.Deployment.Entity.Deploy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeploymentRepository extends JpaRepository<Deploy,Long> {
}
