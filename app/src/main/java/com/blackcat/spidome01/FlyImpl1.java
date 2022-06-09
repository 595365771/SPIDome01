package com.blackcat.spidome01;

import com.google.auto.service.AutoService;

@AutoService(IFly.class)
public class FlyImpl1 implements IFly{
    @Override
    public String fly() {
        return "FlyImpl1 fly ";
    }
}
