package mfsi.learnmvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mfsi.learnmvc.domain.Asset;

@Repository
public interface AssetRepositoy extends CrudRepository<Asset, Integer> {

}
