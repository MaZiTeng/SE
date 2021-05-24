package GROUP.RP_AF;
// class Role is a pattern for all users in the system
public class Role {
    //    show the attributes
private int UID;
    private int Authority;
    private String Name;

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void setAuthority(int Authority) {
        this.Authority = Authority;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAuthority() {
        return Authority;
    }

    public String getName() {
        return Name;
    }
}
