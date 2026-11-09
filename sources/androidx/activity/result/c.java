package androidx.activity.result;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityResultCallback f12052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p177m.b f12053b;

    public c(p177m.b contract, ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f12052a = callback;
        this.f12053b = contract;
    }
}
