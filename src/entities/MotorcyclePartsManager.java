package entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MotorcyclePartsManager {
    private List<MotorcyclePart> partList;
    private Set<MotorcyclePart> partSet;
    private Map<String, MotorcyclePart> partMap;

    public MotorcyclePartsManager(List<MotorcyclePart> partList, Set<MotorcyclePart> partSet, Map<String, MotorcyclePart> partMap) {
        this.partList = partList;
        this.partSet = partSet;
        this.partMap = partMap;
    }

    public void addPart(MotorcyclePart part) {
        partList.add(part);
        partSet.add(part);
        partMap.put(part.getName(), part);
    }
}
