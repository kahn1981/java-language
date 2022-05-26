package cn.dl.studio.kahn.genericity.cls;

import lombok.Data;

import javax.swing.plaf.PanelUI;

@Data
public abstract class Animal {
    private static final int LEG_COUNT = 2;
    protected String type;
    protected String name;

    public int countLegs() {
        return LEG_COUNT;
    }

    public boolean compareTo(Animal otherAnimal) {
        if (this.type.equals(otherAnimal.type) && this.name.equals(otherAnimal.name)) {
            return true;
        } else {
            return false;
        }
    }
}
