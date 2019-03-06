public class ComputerBuilder
{
    private String name;
    private String cpu;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    public ComputerBuilder hasName(String name)
    {
         this.name = name;
         return this;
    }

    public ComputerBuilder hasCPU(String cpu)
    {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder hasRamSize(int ramSize)
    {
        this.ramSize = ramSize;
        return this;
    }

    public ComputerBuilder hasHDDSize(int hddSize)
    {
        this.hddSize = hddSize;
        return this;
    }

    public ComputerBuilder hasGPU(boolean hasGPU)
    {
        this.hasGPU = hasGPU;
        return this;
    }

    public ComputerModel build()
    {
        ComputerModel computerModel = new ComputerModel();
        computerModel.setName(name);
        computerModel.setCpu(cpu);
        computerModel.setRamSize(ramSize);
        computerModel.setHddSize(hddSize);
        computerModel.setHasGPU(hasGPU);
        return computerModel;
    }

}
