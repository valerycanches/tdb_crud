package GTDB.MicroS.Segurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import GTDB.MicroS.Segurity.models.UsuarioModel;

@Repository
public interface microRepository  extends CrudRepository<UsuarioModel, Integer>{

    
} 