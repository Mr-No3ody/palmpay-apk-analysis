package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18590b;

    public f(String name, String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18589a = name;
        this.f18590b = workSpecId;
    }
}
