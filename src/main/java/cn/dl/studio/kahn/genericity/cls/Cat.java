package cn.dl.studio.kahn.genericity.cls;

import lombok.Data;

@Data
public class Cat extends Animal{
    @Override
    public int countLegs() {
        return 4;
    }
}
