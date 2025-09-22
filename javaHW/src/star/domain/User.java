package star.domain;

import java.io.Serializable;
import java.util.Arrays;

/* 불변 객체의 형태로 관리
 * setter 제거 후 update 메소드만 사용
 */
public class User implements Serializable {
    private int no;
    private String id;
    private String pwd;
    private int age;
    private String[] hobbies;
    private ZodiacSign zodiacSign;

    public User(int no, String id, String pwd, int age, String[] hobbies, ZodiacSign zodiacSign) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobbies = hobbies;
        this.zodiacSign = zodiacSign;
    }

    public User update(String id, int age, String[] hobbies, ZodiacSign zodiacSign) {
        return new User(this.no, id, this.pwd, age, hobbies, zodiacSign);
    }

    public int getNo() { return no; }
    public String getId() { return id; }
    public String getPwd() { return pwd; }
    public int getAge() { return age; }
    public String[] getHobbies() { return hobbies; }
    public ZodiacSign getZodiacSign() { return zodiacSign; }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", zodiacSign=" + zodiacSign +
                '}';
    }
}
