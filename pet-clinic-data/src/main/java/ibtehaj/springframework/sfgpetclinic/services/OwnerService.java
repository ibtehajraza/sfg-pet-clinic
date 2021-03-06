package ibtehaj.springframework.sfgpetclinic.services;

import ibtehaj.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
