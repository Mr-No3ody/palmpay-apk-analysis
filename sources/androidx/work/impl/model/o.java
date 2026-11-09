package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18659b;

    public o(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f18658a = tag;
        this.f18659b = workSpecId;
    }
}
