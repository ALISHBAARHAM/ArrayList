public class Department {
    private String dName;
    private String dHead;
    private PcLab[] pcLabs;
    private int counter = 0;

    public Department(String dName, String dHead, int labsCount) {
        this.dName = dName;
        this.dHead = dHead;
        this.pcLabs = new PcLab[labsCount];
    }

    public void addNewLab(PcLab lab) {
        if (counter == pcLabs.length) {
            PcLab[] newPcLabs = new PcLab[pcLabs.length * 2];
            System.arraycopy(pcLabs, 0, newPcLabs, 0, pcLabs.length);
            pcLabs = newPcLabs;
        }
        pcLabs[counter++] = lab;
    }

    public PcLab[] getLabs() {
        PcLab[] result = new PcLab[counter];
        System.arraycopy(pcLabs, 0, result, 0, counter);
        return result;
    }

    @Override
    public String toString() {
        return "Department Name: " + dName + "\nDepartment Head: " + dHead;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department department = (Department) obj;
        if (counter != department.counter) return false;
        for (int i = 0; i < counter; i++) {
            if (!pcLabs[i].equals(department.pcLabs[i])) {
                return false;
            }
        }
        return dName.equals(department.dName) && dHead.equals(department.dHead);
    }


}
