package one.digitalinnovation.experts.shoppingcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.experts.shoppingcard.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
