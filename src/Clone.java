class Clonetest implements Cloneable {
    int roll;
    String name;


    Clonetest(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Clonetest s1 = new Clonetest(101, "amit");
            Clonetest s2 = (Clonetest) s1.clone();

            System.out.println(s1.roll + " " + s1.name);
            System.out.println(s2.roll + " " + s2.name);
        } catch (CloneNotSupportedException c) {}
    }
}
