package com.theironyard.Units;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {

    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    //getName() and setName() methods
    //getType() and setType() methods

    public void addWeapon (Weapon weapon) {
        if (weapons == null) {
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperty(String property, Object value) {
        if (properties == null) {
            properties = new HashMap();
        }
        properties.put(property, value);
    }

    public Object getProperty(String property) {
        if (properties == null) {
            return null;
        }
        return properties.get(property);
    }
}
