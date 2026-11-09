package V0;

import androidx.work.Operation;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f9904a = new T(null);

    public abstract p1.d a();

    public abstract p1.d b();

    public abstract Operation c(M m7);

    public final Operation d(String uniqueWorkName, G request) {
        r existingWorkPolicy = r.f9965b;
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return new androidx.work.impl.n((androidx.work.impl.s) this, uniqueWorkName, existingWorkPolicy, C1849p.c(request)).E();
    }

    public abstract androidx.concurrent.futures.m e(String str);
}
