public class IUStudent extends Student{

    public IUStudent(String name, String surname, String patronymic, String course, int lastExamMark){
        super(name, surname, patronymic, course, lastExamMark);
    }

    @Override
    public String toString() {
        return "IUStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", course='" + course + '\'' +
                ", lastExamMark=" + lastExamMark +
                '}';
    }
}
