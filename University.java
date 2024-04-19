public class University {

    private String universityName;
    private Campus[] campus;
    private int count;

    public University(String universityName, int count) {
        this.universityName = universityName;
        this.campus = new Campus[count];
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addNewCampus(Campus C) {
        if (count < campus.length) {
            campus[count++] = C;
        } else {
            System.out.println("Cannot add more campuses. Array is full.");
        }
    }

    public Campus[] getCampuses() {
        return campus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University university = (University) o;
        return universityName.equals(university.universityName);
    }

    @Override
    public String toString() {
        StringBuilder campusInfo = new StringBuilder("\n\nCampus Details\n");
        for (int i = 0; i < count; i++) {
            campusInfo.append("\n").append(campus[i]);
        }
        return "University Name: " + universityName + campusInfo;
    }
}
