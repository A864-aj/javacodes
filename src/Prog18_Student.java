public class Prog18_Student {
    String name;
    int rollNo;
    String colName;

    public Prog18_Student(String name, int rollNo, String colName) {
        this.name = name;
        this.rollNo = rollNo;
        this.colName = colName;
    }

    @Override
    public String toString() {
        return "Prog18_Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", colName='" + colName + '\'' +
                '}';
    }
}
