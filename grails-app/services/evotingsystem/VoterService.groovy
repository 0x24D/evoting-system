package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class VoterService {

    bool castVote() {
        return false
    }
}
