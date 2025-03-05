package gn.com.digitalis.twoconnection.entity.secondary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @création 04/03/2025 - 14:41
 * @projet twoconnection
 * @auteur mlamarana.balde
 * @package gn.com.digitalis.twoconnection.entity.primary.secondary
 */
@Entity
@Table(name = "td_test")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
}
