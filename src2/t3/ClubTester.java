package t3;

public class ClubTester {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("John");
        m1.setMemberId(101);
        m1.setType(Member.MemberType.GOLD); // Using new feature

        Member m2 = new Member();
        m2.setName("Sarah");
        m2.setMemberId(102);
        m2.setType(Member.MemberType.SILVER); // Using new feature

        CMS cms = new CMS();
        cms.addMember(m1);
        cms.addMember(m2);
        
        System.out.println("Gold members:");
        for (Member m : cms.getMembersByType(Member.MemberType.GOLD)) {
            System.out.println(m);
        }
    }
}