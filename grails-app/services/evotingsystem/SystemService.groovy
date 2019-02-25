package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class SystemService {

    Campaign addCampaign() {
        return null
    }
    Campaign editCampaign(String id) {
        return null
    }
    bool removeCampaign(String id) {
        return null
    }
    User addUser() {
        return null
    }
    User editUser(String username) {
        return null
    }
    bool removeUser(String username) {
        return false
    }
    void selectLanguage(String language) {

    }
}
