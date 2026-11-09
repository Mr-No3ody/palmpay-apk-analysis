package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1211v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC1204n f17473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LifecycleEventObserver f17474b;

    public final void a(LifecycleOwner lifecycleOwner, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EnumC1204n enumC1204nA = event.a();
        this.f17473a = C1212w.f17475j.min$lifecycle_runtime_release(this.f17473a, enumC1204nA);
        this.f17474b.onStateChanged(lifecycleOwner, event);
        this.f17473a = enumC1204nA;
    }
}
