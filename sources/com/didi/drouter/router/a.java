package com.didi.drouter.router;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f21130c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseArray f21131d = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21133b;

    public a(ActivityCompat2$Active activityCompat2$Active) {
        this.f21133b = activityCompat2$Active;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.didi.drouter.router.ActivityCompat2$Active, java.lang.Object] */
    public static void a(a aVar, Activity activity, int i7, Intent intent) {
        Object obj;
        SparseArray sparseArray = f21131d;
        Pair pair = (Pair) sparseArray.get(aVar.f21132a);
        if (pair != null) {
        }
        if (pair == null || (obj = pair.first) == null || ((WeakReference) obj).get() != activity) {
            Object[] objArr = new Object[0];
            if (p092g2.c.c()) {
                Log.e("DRouterCore", p092g2.c.a("HoldFragment onActivityResult warn, for host activity changed, but still callback last host", objArr));
            }
        }
        Object[] objArr2 = {Integer.valueOf(aVar.f21132a)};
        if (p092g2.c.c()) {
            p092g2.c.a("HoldFragment remove %s callback and page", objArr2);
        }
        sparseArray.remove(aVar.f21132a);
        aVar.f21133b.remove();
    }
}
