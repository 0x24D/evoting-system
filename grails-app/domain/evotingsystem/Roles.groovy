package evotingsystem

class Roles {

    static constraints = {
    }

    String roleName
    Set<String> permissions // should be Set<Permission>
}
