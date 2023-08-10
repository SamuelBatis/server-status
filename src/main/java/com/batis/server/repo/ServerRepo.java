package com.batis.server.repo;

import com.batis.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
  Server findByIpAddress(String ipAddress);
}
