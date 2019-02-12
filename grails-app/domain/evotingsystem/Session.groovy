package evotingsystem

class Session {

    static constraints = {
    }

    String publicUsername
    Date validThrough
    Map<String> permissions // should be Map<Permission>
    String signature
}
