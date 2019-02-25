package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class ConstituencyService {

    bool validateConstituency(String postcode, Constituency constituency) {
        return false
    }
}
