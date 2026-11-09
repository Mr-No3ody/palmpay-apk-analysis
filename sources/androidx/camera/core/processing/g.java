package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Consumer f14399a;

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Intrinsics.f(this.f14399a, "Listener is not set.");
        this.f14399a.accept(obj);
    }
}
