package in.pokoman.www.pokoman.Model;

public class User {
    private String uid;
    private String name;
    private String emailid;
    private int totalpt;
    private int rank;

    public User() {
    }

    public User(String uid, String name, String emailid, int totalpt, int rank) {
        this.uid = uid;
        this.name = name;
        this.emailid = emailid;
        this.totalpt = totalpt;
        this.rank = rank;
    }

    public User( String name, String emailid, int totalpt, int rank) {
        this.name = name;
        this.emailid = emailid;
        this.totalpt = totalpt;
        this.rank = rank;
    }
    public User(String name, String emailid) {
        this.name = name;
        this.emailid = emailid;

    }

    public int getTotalpt() {
        return totalpt;
    }

    public int getRank() {
        return rank;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setTotalpt(int totalpt) {
        this.totalpt = totalpt;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
