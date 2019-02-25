package evotingsystem

import grails.gorm.transactions.Transactional

@Transactional
class CampaignService {

    bool assignCandidateToConstituency(Candidate candidate, Constituency constituency) {
        return false
    }
}
