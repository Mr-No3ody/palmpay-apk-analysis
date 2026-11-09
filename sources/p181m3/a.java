package p181m3;

import com.facebook.imagepipeline.systrace.FrescoSystrace$Systrace;
import p121i2.e;
import p137j3.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f39473a = new u(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f39474b;

    public static FrescoSystrace$Systrace a() {
        e eVar;
        e eVar2 = f39474b;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (a.class) {
            eVar = new e(10);
            f39474b = eVar;
        }
        return eVar;
    }
}
