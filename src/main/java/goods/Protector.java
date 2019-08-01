package main.java.goods;

public class Protector {
    private Thing thing;

    Protector(Thing thing) {
        this.thing = thing;
    }


    @Override
    public String toString() {
        return "Protect -" + thing + "-";
    }
}
