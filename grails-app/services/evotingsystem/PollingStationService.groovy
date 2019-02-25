package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class PollingStationService {

    Set<User> findAuditors() {
        return null
    }
}
