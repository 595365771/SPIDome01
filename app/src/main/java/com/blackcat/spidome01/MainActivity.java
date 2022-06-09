package com.blackcat.spidome01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.根绝传入的接口名称，构建一个ServiceLoader。
        ServiceLoader<IFly> load = ServiceLoader.load(IFly.class);
        // 2.获取该接口的所有子类。
        load.forEach(fly -> {
            String fly1 = fly.fly();
            System.out.println(fly1);
        });

    }

}