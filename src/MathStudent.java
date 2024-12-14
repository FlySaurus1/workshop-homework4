public class MathStudent extends Student{

    public MathStudent(String name, String surname, String patronymic, String course, int lastExamMark){
        super(name, surname, patronymic, course, lastExamMark);
    }

    @Override
    public String toString() {
        return "MathStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", course='" + course + '\'' +
                ", lastExamMark=" + lastExamMark +
                '}';
    }
}
