package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class SessionService {

    bool checkSignature() {
        return false
    }
    bool isValid() {
        return false
    }
    void authorise(String uI, String operation) {

    }
}
