package Laba_4;

import java.io.Serializable;


public class Computer implements Serializable{
    
    private int core_freq;
    private byte ram;
    private String video;

    public Computer(int core_freq, byte ram, String video) {
        this.core_freq = core_freq;
        this.ram = ram;
        this.video = video;
    }
    
    public int getPerfomanceRating() {
        return 10000 + 10*(core_freq*ram);
    }

    @Override
    public String toString() {
        return "PC-INFO64: core frequency: " + core_freq + ", RAM amount: " + ram + ", video adapter: " + video + ", perfomance score: " + getPerfomanceRating();
    }
    
}
