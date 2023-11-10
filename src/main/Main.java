package main;

import entities.Engine;
import entities.MotorcyclePart;
import entities.MotorcyclePartsManager;
import entities.Tire;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<MotorcyclePart> partList = new ArrayList<>();
        Set<MotorcyclePart> partSet = new HashSet<>();
        Map<String, MotorcyclePart> partMap = new HashMap<>();

        MotorcyclePartsManager manager = new MotorcyclePartsManager(partList, partSet, partMap);

        manager.addPart(new Engine("Thuy Linh 1", 1200.0));
        manager.addPart(new Tire("Thuy Linh 2", 85.0));

        System.out.println("Danh sách các phụ tùng:");
        for (MotorcyclePart part : partList) {
            System.out.println(part.getName() + " - $" + part.getPrice());
        }

        System.out.println("Set các phụ tùng:");
        for (MotorcyclePart part : partSet) {
            System.out.println(part.getName() + " - $" + part.getPrice());
        }

        System.out.println("Map các phụ tùng:");
        for (Map.Entry<String, MotorcyclePart> entry : partMap.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue().getPrice());
        }
    }
}
