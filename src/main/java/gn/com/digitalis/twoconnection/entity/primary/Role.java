package gn.com.digitalis.twoconnection.entity.primary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @création 04/03/2025 - 14:40
 * @projet twoconnection
 * @auteur mlamarana.balde
 * @package gn.com.digitalis.twoconnection.entity.primary
 */
@Entity
@Table(name = "td_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
