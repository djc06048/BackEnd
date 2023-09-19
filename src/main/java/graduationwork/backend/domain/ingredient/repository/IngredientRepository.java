package graduationwork.backend.domain.ingredient.repository;

import graduationwork.backend.domain.food.domain.Food;
import graduationwork.backend.domain.ingredient.domain.Ingredient;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;
import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Long> {

    @Query("select i from Ingredient i where i.user.id=:userId and i.name_ko=:name")
    Optional<Ingredient> findIngredientByUserIdAndNameKo(@Param("userId") Long userId,@Param("name") String name);

    @Query("select i from Ingredient i where i.name_ko=:name and i.user.id=:id")
    Optional<Ingredient> findIngredientByNameKo(@Param("name") String name,@Param("id") Long userId);

    @Query("select i from Ingredient i where i.user.id=:id")
    List<Ingredient> findIngredientsByUser(@Param("id") Long userId);
}
