package TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBo {
    //把list当作是一个数据库

    List<StudentVO> students;

    public StudentBo(){
        students = new ArrayList<StudentVO>();
        StudentVO student1 = new StudentVO("a",0);
        StudentVO student2 = new StudentVO("b",1);
        students.add(student1);
        students.add(student2);
    }

    public List<StudentVO> getStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNum){
        return students.get(rollNum);
    }

    public void updateStudents(StudentVO studentVO){
        students.get(studentVO.getRollNum()).setName(studentVO.getName());
        System.out.println("Student: Roll No "
                + studentVO.getRollNum() +", updated in the database");
    }
}
