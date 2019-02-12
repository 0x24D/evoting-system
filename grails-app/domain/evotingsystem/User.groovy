package evotingsystem

class User {

    static constraints = {
    }

    String username
    String name
    String email
    String password
    Role role
    int authenticationAttempts

}
