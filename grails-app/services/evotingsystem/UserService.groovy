package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    bool validateEmail(String email) {
        return false
    }
    bool validatePassword(String password) {
        return false
    }
    String hash(String password) {
        return null
    }
    void addAuthenticationAttempt() {

    }
    void resetAuthenticationAttempts() {

    }
}
