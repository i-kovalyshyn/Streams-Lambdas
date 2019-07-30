package main.java.goods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Box {
    private List<ArrayList<Thing>> boxes = new ArrayList<>();

    public Box() {

        ArrayList<Thing> box1 = new ArrayList<>(Arrays.asList(
                new Thing("Lens", true),
                new Thing("ND-Filter", true),
                new Thing("pen", false),
                new Thing("battery", false),
                new Thing("cup", true)));
        boxes.add(box1);
        ArrayList<Thing> box2 = new ArrayList<>(Arrays.asList(
                new Thing("camera", true),
                new Thing("clock", false),
                new Thing("DVD-box", true),
                new Thing("cellphone", false),
                new Thing("tablet", true)));
        boxes.add(box2);
    }

    public List<Protector> coverThingsToProtect() {
        return boxes.stream()
                .flatMap(box -> box.stream()
                        .filter(Thing::isFragile)
                        .map(Protector::new)).collect(Collectors.toList());
    }
}
