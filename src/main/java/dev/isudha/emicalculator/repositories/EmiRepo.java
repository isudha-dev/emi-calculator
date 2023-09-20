package dev.isudha.emicalculator.repositories;

import java.util.HashMap;
import java.util.Map;
import dev.isudha.emicalculator.models.Emi;

public class EmiRepo {

    private Map<Long, Emi> emis = new HashMap<>();

    private long count = 0l;

    public Emi save(Emi emi){
        count++;
        emi.setId(count);
        emis.put(count, emi);
        return emi;
    }

    public Emi get(Long id){
        return emis.get(id);
    }

}
