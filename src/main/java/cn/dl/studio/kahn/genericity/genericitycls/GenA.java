package cn.dl.studio.kahn.genericity.genericitycls;

import cn.dl.studio.kahn.genericity.cls.Animal;

import java.util.List;

public class GenA {
    public int countLegs(List<? extends Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs();
        }
        return retVal;
    }

    private <Src extends Animal, Dest extends Animal> Dest IsSame(Src arg1, Dest arg2) {
        Dest result = arg2;
        if (arg2.compareTo(arg1)) {
            return result;
        }

        return null;
    }
}
