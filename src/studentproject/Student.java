package studentproject;

public class Student {
 
    private String name;
    private int id;
    private String dob;
    private int x;
    private int maxHours;

    public int getMaxHours() {
        return maxHours;
    }

    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }
    public Student()
    {
           this.name = "Not Set";
           this.id =0;
    }
    public Student(String givenName, int givenId)
    {
        this.name = givenName;
        this.id = givenId;
    }
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    public String getName()
    {
           return this.name;
    }

    public void setId(int givenId)
    {
        this.id = givenId;
    }
    public int getId()
    {
           return this.id;
    }

    /
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }


}
