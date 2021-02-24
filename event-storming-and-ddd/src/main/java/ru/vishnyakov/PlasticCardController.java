package ru.vishnyakov;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.Id;

@RepositoryRestResource(path = "plastic-cards",
        collectionResourceRel = "plastic-cards",
        itemResourceRel = "plastic-cards")
interface PlasticCardController extends CrudRepository<PlasticCard, Long> {

}

@Entity
class PlasticCard {
    @Id
    private Long id;
    //..
}