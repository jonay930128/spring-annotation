package wrx.xing.domain;

/**
 * 请填写类的描述
 *
 * @author wangruxing
 * @date 2018-09-02 14:30
 */
public class Person {
    private String name;
    private Integer age;
    private String hometown;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }

	public Person() {
		System.out.println("person construct ...");
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
