package evotingsystem

class Roles {

    static constraints = {
    }

    String roleName
    Map<String> permissions // should be Map<Permission>
}
