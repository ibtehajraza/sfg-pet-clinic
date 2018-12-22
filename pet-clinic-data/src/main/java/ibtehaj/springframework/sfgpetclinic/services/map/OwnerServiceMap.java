package ibtehaj.springframework.sfgpetclinic.services.map;

import ibtehaj.springframework.sfgpetclinic.model.Owner;
import ibtehaj.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Making it spring bean so when spring see this notation i.e @Service.
 * It'll make this available in application context as a bean.
 */

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
