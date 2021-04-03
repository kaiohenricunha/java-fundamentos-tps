
package com.tbp.repository;

import com.tbp.modelo.MagnusOpus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagnusOpusRepository extends CrudRepository<MagnusOpus, Integer>{
    
}
