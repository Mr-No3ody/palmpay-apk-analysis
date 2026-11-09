package Y5;

import V5.e;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V5.a f11300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V5.a f11301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V5.a f11302d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f11299a = z3;
        if (!z3) {
            f11300b = null;
            f11301c = null;
            f11302d = null;
        } else {
            new e(Date.class);
            new e(Timestamp.class);
            f11300b = a.f11294c;
            f11301c = a.f11295d;
            f11302d = a.f11296e;
        }
    }
}
