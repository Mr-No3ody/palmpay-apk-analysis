package com.palmpay.lib.apm.launchcounter.util;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static Application a() {
        e.f23795g.getClass();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(e.b(), new Object[0]);
            if (objInvoke == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return null;
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
            return null;
        } catch (NoSuchMethodException e12) {
            e12.printStackTrace();
            return null;
        } catch (InvocationTargetException e13) {
            e13.printStackTrace();
            return null;
        }
    }
}
