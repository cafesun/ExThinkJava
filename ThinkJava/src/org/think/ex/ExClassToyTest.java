package org.think.ex;

interface HasBatteries {

}

interface Waterproof {

}

interface Shoots {

}

interface Pencil {

}

class Toy {

    Toy() {
    }

    Toy (int i) {

    }
}

class FancyToy extends Toy
    implements HasBatteries, Waterproof, Shoots, Pencil {
    FancyToy() {
        super(1);
    }
}

public class ExClassToyTest {

    static void printClassInfo(Class clsInfo) {
        System.out.printf("ClassName = %s, IsInterface[%s], SimpleName = %s Cannonical Name = %s\n",
                clsInfo.getName(),
                clsInfo.isInterface(),
                clsInfo.getSimpleName(),
                clsInfo.getCanonicalName());
    }

    public static void main(String[] args) {
        Class clsTemp = null;
        try {
            clsTemp = Class.forName("org.think.ex.FancyToy");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Cannot find FancyToy");
            System.exit(1);
        }
        printClassInfo(clsTemp);
        for (Class clsIf : clsTemp.getInterfaces()) {
            printClassInfo(clsIf);
        }
        Class clsUp = clsTemp.getSuperclass();
        printClassInfo(clsUp);
        Object objVar = null;
        try {
            objVar = clsUp.newInstance();
        }
        catch (InstantiationException ex) {
            System.out.println("Cannot Instantiated!");
            System.exit(1);
        }
        catch (IllegalAccessException ex) {
            System.out.println("Cannot Acess!");
            System.exit(1);
        }
        printClassInfo(objVar.getClass());
    }

}
