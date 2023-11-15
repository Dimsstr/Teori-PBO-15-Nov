public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk("SSD", 512, "Western Digital");
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("Z390", "ASUS");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply("500W", "Corsair");
        CPU.VGACard myVGACard = myKomputer.new VGACard("RTX 3060", "NVIDIA");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        myHarddisk.getInfoHarddisk();
        myMotherboard.getInfoMotherboard();
        myPowerSupply.getInfoPowerSupply();
        myVGACard.getInfoVGACard();

        // bikin object harddisk, vga, motherboard, powersupply
    }
}