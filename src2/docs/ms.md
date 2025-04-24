===== Page 1 =====

OBJECT ORIENTED PROGRAMMING    NIKOLOZ JINTCHARADZE

Club Membership Management System

Masterclass in Java

Nikoloz Jintcharadze
Student
nikoloz.jintcharadze.2@iliauni.edu.ge

Description
Create Club Membership Management System (CMS) in Java. CMS is widely used software for managing club members. Our example includes these basic features:
1. Storage for members
2. Ability to add members to the club
3. Ability to remove members from the club
4. Ability to print member information

CMS structure
We will need these classes:
1. Member - represents a club member
2. CMS - membership management system
3. ClubTester - tester class

| Class Member | Class CMS |
|---|---|
| String name | List<Member> members |
| int memberId | void addMember(Member) |
| String email | boolean removeMember(Member) |
|  | void printMembers() |

Class Member
The class Member should have these fields:

package t3;
public class Member {
    private String name;
    private int memberId;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Similar getters/setters for memberId and email
    // Implement toString() method
}

APRIL 10, 2025    PAGE 1 (OF 3)

===== Page 2 =====

OBJECT ORIENTED PROGRAMMING    YOUR NAME

Class CMS
The management system should store members and handle operations:

package t3;

import java.util.ArrayList;
import java.util.List;

public class CMS {
    private List<Member> members = new ArrayList<>();

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

Class ClubTester
Test the management system:

package t3;

public class ClubTester {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.setName("John");
        m1.setMemberId(101);
        
        Member m2 = new Member();
        m2.setName("Sarah");
        m2.setMemberId(102);

        CMS cms = new CMS();
        cms.addMember(m1);
        cms.addMember(m2);
        
        cms.printMembers();
    }
}

APRIL 10, 2025    PAGE 2 (OF 3)

===== Page 3 =====

OBJECT ORIENTED PROGRAMMING    YOUR NAME

New Feature

We've added membership tier functionality to track member status:

1. Added MemberType enum (GOLD, SILVER, BASIC)
2. Modified Member class to include type
3. Added method to filter members by type
4. Added upgrade/downgrade functionality

Future Improvements

1. Add membership expiration dates
2. Implement payment tracking
3. Add event registration system
4. Create membership card generation

APRIL 10, 2025    PAGE 3 (OF 3)