package gn.com.digitalis.twoconnection.repository.secondary;

import gn.com.digitalis.twoconnection.entity.secondary.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @création 04/03/2025 - 14:43
 * @projet twoconnection
 * @auteur mlamarana.balde
 * @package gn.com.digitalis.twoconnection.repository.primary.secondary
 */
@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
