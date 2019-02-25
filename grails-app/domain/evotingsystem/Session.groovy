package evotingsystem

class Session {

    static constraints = {
    }

    String publicUsername
    Date validThrough
    Set<Permission> permissions
    String signature
}
