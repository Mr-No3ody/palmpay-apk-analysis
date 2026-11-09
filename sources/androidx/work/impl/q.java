package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f18669a;

    static {
        Intrinsics.checkNotNullExpressionValue(V0.C.d("WrkDbPathHelper"), "tagWithPrefix(\"WrkDbPathHelper\")");
        f18669a = new String[]{"-journal", "-shm", "-wal"};
    }
}
