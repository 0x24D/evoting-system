package evotingsystem

import grails.gorm.services.Service

@Service(System)
interface SystemService {

    System get(Serializable id)

    List<System> list(Map args)

    Long count()

    void delete(Serializable id)

    System save(System system)

}