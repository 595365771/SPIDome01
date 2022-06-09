package com.blackcat.spidome01;

import com.google.auto.service.AutoService;

@AutoService({IFly.class,ISpeak.class})
public class FlyImpl2 implements IFly,ISpeak {
    @Override
    public String fly() {
        return "FlyImpl2 fly ";
    }

    @Override
    public String speak() {
         return "FlyImpl2 speak";
    }
}
