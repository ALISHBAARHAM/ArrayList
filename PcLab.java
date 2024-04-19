public class PcLab {
    private String labName;
    private Pc[] pcList;
    private String labAssistant;
    private String labInCharge;
    private int pcCount = 0;

    public PcLab(String labName, int pcCount, String labAssistant, String labInCharge) {
        this.labName = labName;
        this.pcList = new Pc[pcCount];
        this.labAssistant = labAssistant;
        this.labInCharge = labInCharge;
    }

    public void addPc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        if (pcCount == pcList.length) {
            Pc[] newPcList = new Pc[pcList.length * 2];
            for (int i = 0; i < pcList.length; i++) {
                newPcList[i] = pcList[i];
            }
            pcList = newPcList;
        }
        pcList[pcCount++] = new Pc(id, cpu, ram, storage, lcdMaker, hasGpu);
    }

    @Override
    public String toString() {
        StringBuilder pcDetails = new StringBuilder("\n\nPC's Details\n");
        for (int i = 0; i < pcCount; i++) {
            pcDetails.append("\n").append(pcList[i]);
        }
        return String.format("Lab Name: %s\nLab InCharge: %s\nLab Assistant: %s", labName, labInCharge, labAssistant) + pcDetails;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PcLab pcLab = (PcLab) obj;
        if (pcCount != pcLab.pcCount) return false;
        for (int i = 0; i < pcCount; i++) {
            if (!pcList[i].equals(pcLab.pcList[i])) {
                return false;
            }
        }
        return labName.equals(pcLab.labName) && labAssistant.equals(pcLab.labAssistant) && labInCharge.equals(pcLab.labInCharge);
    }

}
