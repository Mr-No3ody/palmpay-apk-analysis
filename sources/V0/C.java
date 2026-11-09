package V0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9860b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C f9861c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9862a;

    public C(int i7) {
        this.f9862a = i7;
    }

    public static C c() {
        C c6;
        synchronized (f9860b) {
            try {
                if (f9861c == null) {
                    f9861c = new C(3);
                }
                c6 = f9861c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6;
    }

    public static String d(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f9862a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (this.f9862a <= 6) {
            Log.e(str, str2, th);
        }
    }
}
