public class Student {




    public Student(double cgpa, int id, String name){

        this.name=name;
        this.id=id;
        this.cgpa=cgpa;

    }
    private String name;

    private int id;
    private double cgpa;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }



}


