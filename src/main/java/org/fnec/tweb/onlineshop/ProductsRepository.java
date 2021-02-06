package org.fnec.tweb.onlineshop;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Long> {
	Products findById(long id);
}
