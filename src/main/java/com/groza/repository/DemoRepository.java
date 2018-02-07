package com.groza.repository;

import com.groza.model.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DemoRepository
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
