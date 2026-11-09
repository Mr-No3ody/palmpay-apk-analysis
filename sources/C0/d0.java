package C0;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f1020b = new X(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f1021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f1022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W f1023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W f1024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W f1025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W f1026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W f1027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final W f1028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final W f1029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W f1030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W f1031m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1032a;

    static {
        boolean z3 = false;
        f1021c = new W(z3, 5);
        f1022d = new W(z3, 8);
        boolean z8 = true;
        f1023e = new W(z8, 4);
        f1024f = new W(z3, 7);
        f1025g = new W(z8, 6);
        f1026h = new W(z3, 3);
        f1027i = new W(z8, 2);
        f1028j = new W(z3, 1);
        f1029k = new W(z8, 0);
        f1030l = new W(z8, 10);
        f1031m = new W(z8, 9);
    }

    public d0(boolean z3) {
        this.f1032a = z3;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String value, Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        return c(value);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
