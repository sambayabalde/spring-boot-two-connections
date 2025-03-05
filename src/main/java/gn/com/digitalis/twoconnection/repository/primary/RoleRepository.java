package gn.com.digitalis.twoconnection.repository.primary;

import gn.com.digitalis.twoconnection.entity.primary.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @création 04/03/2025 - 14:42
 * @projet twoconnection
 * @auteur mlamarana.balde
 * @package gn.com.digitalis.twoconnection.repository.primary
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {}
