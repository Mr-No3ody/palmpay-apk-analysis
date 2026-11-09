package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18573b;

    static {
        String strD = V0.C.d("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f18572a = strD;
        f18573b = TimeUnit.HOURS.toMillis(1L);
    }
}
