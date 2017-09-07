package org.saffih.tryartifactroy.main.tryartifactroy.main;

import java.util.ArrayList;

public class HelloAll {
    public static String getAll()    {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add(new org.saffih.tryartifactroy.main.tryartifactroy.part1.Hello().getMyName());
        lst.add(new org.saffih.tryartifactroy.main.tryartifactroy.part2.Hello().getMyName());
        lst.add(new org.saffih.tryartifactroy.main.tryartifactroy.part3.Hello().getMyName());

        return String.join(", ", lst);
//return "";
    }

    public static void main(String[] args) {
        System.out.println(getAll());
    }
}

