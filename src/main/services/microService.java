


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class microService {
    public microService(){
        
    }

    @Autowired
    microRepository _microRepository;

    public List<UsuarioModel> getAll(){
        return (List<UsuarioModel>) _microRepository.findAll();
    }

    /*aqui se colocaran los demas methods */

}
