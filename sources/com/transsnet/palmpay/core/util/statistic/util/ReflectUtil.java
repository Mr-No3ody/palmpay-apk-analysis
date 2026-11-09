package com.transsnet.palmpay.core.util.statistic.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectUtil {
    public static Object getFieldValue(Object obj, String field) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(field);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
            return null;
        } catch (SecurityException e13) {
            e13.printStackTrace();
            return null;
        }
    }

    public static Object getMethodValue(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName, new Class[0]);
            if (method != null) {
                return method.invoke(obj, new Object[0]);
            }
            return null;
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return null;
        } catch (NoSuchMethodException e11) {
            e11.printStackTrace();
            return null;
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
            return null;
        }
    }
}
