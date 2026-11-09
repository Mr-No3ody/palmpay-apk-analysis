package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18575b;

    public a(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f18574a = workSpecId;
        this.f18575b = prerequisiteId;
    }
}
