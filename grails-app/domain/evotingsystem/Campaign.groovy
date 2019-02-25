package evotingsystem

class Campaign {

    static constraints = {
    }

    String id
    String name
    int totalVotes
    Set<Candidate> candidates
    Map<Candidate, Integer> votes
    String type
    String active // will be a status enum
    Set<Constituency> constituencies
    Date startDate
    Date endDate

}
