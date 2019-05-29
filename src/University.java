import java.util.Comparator;

public class University implements Comparable<University> {
    private String country;
    private String city;
    private String name;
    private String faculty;
    private int specialization;

    /**
     * Constructor of the class University
     *
     * @param country        - county where institution is situated
     * @param city           - city where institution is situated
     * @param name           - full name of the institution
     * @param faculty        - name of the faculty
     * @param specialization - number
     */
    public University(String country, String city,
                      String name, String faculty,
                      int specialization) {
        this.country = country;
        this.city = city;
        this.name = name;
        this.faculty = faculty;
        this.specialization = specialization;
    }

    /**
     * @return country of the institution
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSpecialization() {
        return specialization;
    }

    public void setSpecialization(int specialization) {
        this.specialization = specialization;
    }

    public String toString() {
        return name + ";\n" + faculty
                + ", " + specialization + ";\n"
                + country + "; " + city;
    }

    @Override
    public int compareTo(University o) {
        int cityComparingResult = city.compareTo(o.city);

        // boolean ? if true : if false
        return cityComparingResult != 0
                ? cityComparingResult
                : o.country.compareTo(country);
    }

}

