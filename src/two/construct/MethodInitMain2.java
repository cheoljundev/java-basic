package two.construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 20, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 23, 80);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
