package ro.ase.csie.flyweight.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Obj3DFactory {
    private Map<String, Object3D> objects = new HashMap<>();

    public Object3D getObject(String model, String color){
        Object3D obj = objects.get(model);
        if(obj == null){
            obj = new Object3D(model,color, new ArrayList<>(3000));
            objects.put(model,obj);
        }
        return obj;
    }
}
