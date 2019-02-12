package evotingsystem

class Session {

    static constraints = {
    }

    String publicUsername
    Date validThrough
    PermissionMap permissions
    String signature
}
