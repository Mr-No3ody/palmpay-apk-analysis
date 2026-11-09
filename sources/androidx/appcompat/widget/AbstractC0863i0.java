package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f12916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f12917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f12918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12919d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f12916a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f12917b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f12918c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f12919d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
