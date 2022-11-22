abstract class abstractClass {

    //An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass
    public String name = "John";
    public Integer age = 23;

    public abstract void department();

}

class graduate extends abstractClass {
    String graduationYear = "2019";

    @Override
    public void department() {
        System.out.println("Art");
    }
}

class second {
    public static void main(String[] args) {
        graduate ga = new graduate();
        System.out.println(ga.name + " " + ga.age + " " + ga.graduationYear);
        ga.department();
    // output : John 23 2019
        //Art

    }

}


