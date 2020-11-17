import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String name;
    private final String email;
    private String username;
    private String password;
    private final String dateStarted;
    private HashMap<HashMap<String, String>, String> schedule;

    public User(String name, String email, String username, String password, String dateStarted) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.dateStarted = dateStarted;
        this.schedule = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String getDateStarted(){
        return this.getDateStarted();
    }



}
