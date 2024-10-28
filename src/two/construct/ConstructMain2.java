package two.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 20);
        MemberConstruct member2 = new MemberConstruct("member2", 13);

        MemberConstruct[] memberConstructs = {member1, member2};

        for (MemberConstruct s : memberConstructs) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
