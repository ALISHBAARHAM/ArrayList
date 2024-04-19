public class Campus {
    private String cName;
    private String cDirector;
    private Department[] departments;
    private int counter = 0;

    public Campus(String cName, String cDirector, int departmentsCount) {
        this.cName = cName;
        this.cDirector = cDirector;
        this.departments = new Department[departmentsCount];
    }



    public Department[] getDepartments() {
        Department[] result = new Department[counter];
        System.arraycopy(departments, 0, result, 0, counter);
        return result;
    }

    @Override
    public String toString() {
        return "Campus Name: " + cName + "\nCampus Director: " + cDirector;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Campus campus = (Campus) obj;
        if (counter != campus.counter) return false;
        for (int i = 0; i < counter; i++) {
            if (!departments[i].equals(campus.departments[i])) {
                return false;
            }
        }
        return cName.equals(campus.cName) && cDirector.equals(campus.cDirector);
    }


}

