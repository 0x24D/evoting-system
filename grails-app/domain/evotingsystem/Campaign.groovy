package evotingsystem

class Campaign {

    static constraints = {
    }

    String id
    String name
    int totalVotes
    String candidates // needs to be a set candidates class
    Map<String, integer> votes // the string will need to be of type candidate
    String type
    String active // will be a status enum
    String Constituencies // needs to be a set of constituency class
    Date startDate
    Date endDate

}
