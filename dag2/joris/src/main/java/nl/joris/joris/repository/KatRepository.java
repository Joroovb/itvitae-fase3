package nl.joris.joris.repository;

import nl.joris.joris.model.Kat;
import org.springframework.data.repository.CrudRepository;

// Tussen de vishaakjes de klasse waarvoor de repository is
// en het type van het id van die klasse
public interface KatRepository extends CrudRepository<Kat, Long> {
}
