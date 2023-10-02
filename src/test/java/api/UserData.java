package api;

public class UserData {

    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public UserData(Integer id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public UserData setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirst_name() {
        return first_name;
    }

    public UserData setFirst_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public String getLast_name() {
        return last_name;
    }

    public UserData setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserData setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
