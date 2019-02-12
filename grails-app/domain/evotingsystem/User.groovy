package evotingsystem

class User {

    static constraints = {
    }

    String username
    String name
    String email
    String password
    String role // should be type role
    int authenticationAttempts

}
