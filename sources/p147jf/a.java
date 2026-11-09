package p147jf;

import p262r2.c;
import retrofit2.adapter.rxjava2.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z4.a f38597a = new Z4.a(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L7.a f38598b = new L7.a(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f38599c = new c(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f38600d = new d(9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.growingio.android.circler.a f38601e = new com.growingio.android.circler.a(10);

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void b(int i7, String str) {
        if (i7 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i7);
    }
}
