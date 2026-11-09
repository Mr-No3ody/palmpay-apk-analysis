package com.palmpay.lib.apm.launchcounter.util;

import android.app.Activity;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Activity a() {
        Activity activity;
        LinkedList<Activity> linkedList;
        LinkedList linkedList2 = e.f23795g.f23796a;
        if (linkedList2.isEmpty()) {
            LinkedList linkedList3 = new LinkedList();
            try {
                Object objB = e.b();
                Field declaredField = objB.getClass().getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objB);
                if (obj instanceof Map) {
                    activity = null;
                    for (Object obj2 : ((Map) obj).values()) {
                        try {
                            Class<?> cls = obj2.getClass();
                            Field declaredField2 = cls.getDeclaredField("activity");
                            declaredField2.setAccessible(true);
                            Activity activity2 = (Activity) declaredField2.get(obj2);
                            if (activity == null) {
                                Field declaredField3 = cls.getDeclaredField("paused");
                                declaredField3.setAccessible(true);
                                if (declaredField3.getBoolean(obj2)) {
                                    linkedList3.add(activity2);
                                } else {
                                    activity = activity2;
                                }
                            } else {
                                linkedList3.add(activity2);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e.getMessage());
                        }
                    }
                    if (activity != null) {
                        linkedList3.addFirst(activity);
                    }
                }
            } catch (Exception e11) {
                e = e11;
                activity = null;
            }
            linkedList2.addAll(linkedList3);
            linkedList = new LinkedList(linkedList2);
        } else {
            linkedList = new LinkedList(linkedList2);
        }
        for (Activity activity3 : linkedList) {
            if (activity3 != null && !activity3.isFinishing() && !activity3.isDestroyed()) {
                return activity3;
            }
        }
        return null;
    }
}
