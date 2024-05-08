package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Autos;
import co.edu.eci.cvds.repository.AutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutosService {
    private final AutosRepository autosRepository;

    @Autowired
    public AutosService(AutosRepository autosRepository) {
        this.autosRepository = autosRepository;
    }

    public Autos addConfiguration(Autos auto) {
        return autosRepository.save(auto);
    }

    public Autos getConfiguration(int id) {
        return autosRepository.findByid(id).get(1);
    }

    public List<Autos> getAllAutos() {
        return autosRepository.findAll();
    }

    public Autos updateAutos(Autos auto) {
        if (autosRepository.findByid(auto.getId()).size() == 0) {
            return autosRepository.save(auto);
        }
        return null;
    }

    public void deleteAuto(int id) {
        autosRepository.deleteById(id);
    }

}