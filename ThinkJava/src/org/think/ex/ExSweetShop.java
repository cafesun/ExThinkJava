package org.think.ex;

class Candy {
    static {
        // 类加载时执行
        System.out.println("Loading Candy!");
    }
}

class Gum {
    static {
        // 类加载时执行
        System.out.println("Loading Gun!");
    }
}

class Cookie {
    static {
        // 类加载时执行
        System.out.println("Loading Cookie!");
    }
}



public class ExSweetShop {

    public static void main(String[] args) {
        System.out.println("Enter main");
        new Candy();
        System.out.println("Created Candy!");
        try {
            Class clsVar = Class.forName("org.think.ex.Gum");// 必须带完整的包名，即使在包内如果不带完整包名也不行
            System.out.println("Created Gunm!");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Could not find Gunm!");
        }
        new Cookie();
        System.out.println("Created Cookie!");
    }
}
