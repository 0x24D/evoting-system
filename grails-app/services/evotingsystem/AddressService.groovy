package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class AddressService {

    def validateAddress(String name, String postcode) {
        return false
    }

    def validateAddress(String name, String postcode, Constituency constituency) {
        return false
    }
}
