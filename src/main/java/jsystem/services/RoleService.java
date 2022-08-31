package jsystem.services;

import jsystem.models.service.RoleServiceModel;

public interface RoleService {

    RoleServiceModel findByName(String name);

}
