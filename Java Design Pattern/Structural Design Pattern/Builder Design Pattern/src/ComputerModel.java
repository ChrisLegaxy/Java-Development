public class ComputerModel
{
    private String name;
    private String cpu;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    @Override
    public String toString()
    {
        return "Name: "+name+"\nCPU: "+cpu+"\nRam: "+ramSize+"GB\nHDD: "+hddSize+"GB\nHasGPU: "+hasGPU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }
}
