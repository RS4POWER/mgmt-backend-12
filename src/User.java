class NameException extends Exception{
    public NameException(String message){
        super(message);
    }
}

public class User {
    String firstName, lastName, email, roles;

    public User(String firstName,String lastName, String email,String roles) throws NameException{
        this.firstName = firstName;
        this.lastName = lastName;
        if (email.contains("@"))
            this.email = email;
        else throw new NameException("Email invalid");
        this.roles = roles;

    }
}
