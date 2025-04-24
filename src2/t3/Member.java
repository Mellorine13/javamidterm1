package t3;

public class Member {
    private String name;
    private int memberId;
    private String email;
    private MemberType type; // New feature: membership tier

    public enum MemberType { BASIC, SILVER, GOLD } // New feature
    
    // Getters and setters
    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return name + " (ID: " + memberId + ", Type: " + type + ")";
    }
}