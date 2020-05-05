package com.maxiaobo.java;

import com.sun.org.apache.bcel.internal.generic.IFEQ;
import com.sun.xml.internal.ws.spi.db.FieldSetter;
import sun.jvm.hotspot.tools.SysPropsDumper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

public class helloword {
    public helloword() {
    }

    public static void main(String[] args) {
        System.out.println("你好世界！");
        ArrayList<String> list = new ArrayList<String>();
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        list.add(0, "ddd");
        ArrayList b = new ArrayList();
        if (b == null) {

        }
        try {
            FileInputStream in = new FileInputStream("hhaha.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Date date = new Date();
       /* for (int x = 0; x < 10; x++) {


        }*/
        Date d = new Date();
        boolean a = true;
        if (true) {

        }



    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
