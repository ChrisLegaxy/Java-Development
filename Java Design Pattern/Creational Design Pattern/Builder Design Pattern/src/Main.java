public class Main
{

    public static void main(String[] args)
    {
        ComputerModel computerModel = new ComputerBuilder()
                .hasName("Razer Blade 15")
                .hasCPU("i7-8750H")
                .hasRamSize(64)
                .hasHDDSize(512)
                .hasGPU(true)
                .build();

        System.out.println(computerModel);
    }

}
