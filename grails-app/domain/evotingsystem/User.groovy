package evotingsystem

class User {

    static constraints = {
    }

    String username
    String name
    String email
    String password
    Roles roles
    int authenticationAttempts

}
