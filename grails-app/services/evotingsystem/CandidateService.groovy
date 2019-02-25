package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class CandidateService {

    Candidate addCandidate() {
        return null
    }
    bool removeCandidate(String id) {
        return false
    }
}
