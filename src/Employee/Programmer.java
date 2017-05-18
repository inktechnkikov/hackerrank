package Employee;


public class Programmer extends Employee{

    private String codingSkills;
    public Programmer(double salary,String codingSkills) {
        super(salary);
        this.codingSkills = codingSkills;
    }

    private String getCodingSkills(){
        return this.codingSkills;
    }
    public void printSkills(){
        System.out.println("Skills = " + this.getCodingSkills());
    }
}
