package com.kgisl.excel;

import java.lang.reflect.Method;

/**
 * calling
 */
public class M {
    public static void main(String[] args) throws Exception
    {
        Class c = A.class;
        Object obj = c.newInstance();

        Method m = c.getDeclaredMethod("cube", new Class[] { String.class });
        m.setAccessible(true);
        Object[] obj_array= (Object[]) m.invoke(obj,"D:\\Krishnan_Maven\\Excel_POI\\src\\main\\java\\com\\kgisl\\excel\\Trade.csv");
        for (Object var : obj_array)
        {
            System.out.println(var);

        }
    }

}
