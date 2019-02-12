package evotingsystem

class Campaign {

    static constraints = {
    }

    String id
    String name
    int totalVotes
    String candidates // needs to be a set candidates class
    Map<String, Integer> votes // the string will need to be of type candidate
    String type
    String active // will be a status enum
    String constituencies // needs to be a set of constituency class
    Date startDate
    Date endDate

}
