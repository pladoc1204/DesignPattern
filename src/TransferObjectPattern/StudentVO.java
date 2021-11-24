package TransferObjectPattern;

public class StudentVO {
    private String name;
    private int rollNum;

    StudentVO(String name,int rollNum){
        this.name = name;
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
