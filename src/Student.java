public class Student implements StudentAble {

    private String fullName;
    private int age;
    private String email;
    private Gender gender;

    public Student() {
    }

    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void studentS(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void studentMale(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)){
                System.out.println(student);
            }
        }
    }

    @Override
    public void studentFameli(Student[] students) {
        for (Student student : students) {

            if (student.getGender().equals(Gender.FAMELI)){
                System.out.println(student);
            }
        }

    }

    @Override
    public void studentNames(String name, Student[] students) {
        for (Student student : students) {
            String[]  array = student.fullName.split(" ") ;
            if (array[1].equals(name)){
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public int studentAge(Student students , Student students1) {
        if (this.age != students1.getAge()) {
            return this.age - students1.getAge();
        }
        return students1.age;
    }

    @Override
    public void studentSurName(String name,Student[] students) {
        for (Student student : students) {
            String[] array = student.fullName.split(" ");
            if (array[1].equals(name)){
                System.out.println(student.fullName);
            }
        }

    }

    public void studentAge() {
    }
}
