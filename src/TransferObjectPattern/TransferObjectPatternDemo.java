package TransferObjectPattern;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBo studentBusinessObject = new StudentBo();

        //输出所有学生
        for(StudentVO student: studentBusinessObject.getStudents()){
            System.out.println("Student: [RollNo : "
                    +student.getRollNum()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudents(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNum()+", Name : "+student.getName()+" ]");
    }
}
