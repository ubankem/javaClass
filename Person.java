public class Person {
    private String name;
    private String address;
    private int age;

    //constructor //
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    // get method //
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    // set method //
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void increaseAge(){
        this.age++;
    }

     public void decreaseAge(){
        this.age--;
    }

    public String toString(){
        return "Name: " + name + " Address: " + address + " Age: " + age;
    }



}
