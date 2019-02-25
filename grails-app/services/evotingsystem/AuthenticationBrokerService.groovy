package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class AuthenticationBrokerService {

    Session authenticate(String username, String password) {
        return null
    }

    void signSession(Session session) {

    }
}
