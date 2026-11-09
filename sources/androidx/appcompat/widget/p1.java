package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f12995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f12996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f12997c;

    static {
        f12997c = Build.VERSION.SDK_INT >= 27;
    }
}
