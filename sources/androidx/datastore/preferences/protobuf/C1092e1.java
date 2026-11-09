package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1092e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C1092e1 f16603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1092e1 f16604c = new C1092e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16605a = Collections.EMPTY_MAP;

    public static C1092e1 b() {
        C1092e1 c1092e1;
        C1077a2 c1077a2 = C1077a2.f16579c;
        C1092e1 c1092e2 = f16603b;
        if (c1092e2 != null) {
            return c1092e2;
        }
        synchronized (C1092e1.class) {
            try {
                c1092e1 = f16603b;
                if (c1092e1 == null) {
                    Class cls = AbstractC1084c1.f16591a;
                    C1092e1 c1092e3 = null;
                    if (cls != null) {
                        try {
                            c1092e3 = (C1092e1) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c1092e1 = c1092e3 != null ? c1092e3 : f16604c;
                    f16603b = c1092e1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1092e1;
    }

    public final void a(int i7, MessageLite messageLite) {
        if (this.f16605a.get(new C1088d1(i7, messageLite)) != null) {
            throw new ClassCastException();
        }
    }
}
