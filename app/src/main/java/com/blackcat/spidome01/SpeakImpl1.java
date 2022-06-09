package com.blackcat.spidome01;

import com.google.auto.service.AutoService;

@AutoService(ISpeak.class)
public class SpeakImpl1 implements ISpeak{

    @Override
    public String speak() {
        return "ISpeakImpl1 speak";
    }
}
