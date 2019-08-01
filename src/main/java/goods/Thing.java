package main.java.goods;

class Thing {
    private String name;
    private boolean fragile;

    Thing(String name, boolean fragile) {
        this.name = name;
        this.fragile = fragile;
    }


    boolean isFragile() {
        return fragile;
    }


    @Override
    public String toString() {
        return name;
    }
}
