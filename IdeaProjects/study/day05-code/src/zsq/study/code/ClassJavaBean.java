package zsq.study.code;

public class ClassJavaBean {
    private static String Teacher;
    private String name;
    private int age;
    private String sex;


    public ClassJavaBean() {
    }

    public ClassJavaBean(String Teacher, String name, int age, String sex) {
        ClassJavaBean.Teacher = Teacher;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return Teacher
     */
    public static String getTeacher() {
        return Teacher;
    }

    /**
     * 设置
     *
     * @param Teacher
     */
    public static void setTeacher(String Teacher) {
        ClassJavaBean.Teacher = Teacher;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "ClassJavaBean{Teacher = " + Teacher + ", name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
