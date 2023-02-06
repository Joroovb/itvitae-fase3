package com.oefening.halloprima.repository;

import com.oefening.halloprima.models.Kat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface KatRepository extends CrudRepository<Kat, Long>  {
}
