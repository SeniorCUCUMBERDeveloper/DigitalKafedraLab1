package student;


public class Student {
    private String name;
    private String group;
    private int course;
    private float score;


    public Student(String name, String group, int course, float score) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public float getScore() {
        return score;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse() {
        this.course++;
    }

    public void setScore(float score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student:" + "name='" + name  + ", group='" + group + ", course=" + course + ", score=" + score;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()){ 
            return false;
        }
        Student student = (Student) obj;
        return name.equals(student.name) && group.equals(student.group) && course == student.course && score == student.score;
    }
}




