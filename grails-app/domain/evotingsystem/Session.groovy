package evotingsystem

class Session {

    static constraints = {
    }

    String publicUsername
    Date validThrough
    Set<String> permissions // should be Set<Permission>
    String signature
}
