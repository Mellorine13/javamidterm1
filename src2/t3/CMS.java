package t3;

import java.util.ArrayList;
import java.util.List;

public class CMS {
    private List<Member> members = new ArrayList<>();

    /* NEW FEATURE: Membership tier management
     * This section implements member classification system
     * allowing sorting and filtering by membership level */
    public List<Member> getMembersByType(Member.MemberType type) {
        List<Member> result = new ArrayList<>();
        for (Member m : members) {
            if (m.getType() == type) {
                result.add(m);
            }
        }
        return result;
    }

    // Basic methods
    public void addMember(Member member) {
        members.add(member);
    }

    public boolean removeMember(Member member) {
        return members.remove(member);
    }

    public void printMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in club");
        } else {
            for (Member m : members) {
                System.out.println(m);
            }
        }
    }
}