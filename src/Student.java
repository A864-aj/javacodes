public class Student {
    String name;
    String colName;
    int rollNo;
    int age;
    public Student(String name,String colName,int rollNo,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.colName=colName;
        this.age=age;
    }
//    public void printInfo(){
//        System.out.println(this.name +" "+this.colName+" "+this.rollNo+" "+this.age);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", colName='" + colName + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}
