package androidx.activity;

import kotlin.Unit;
import kotlin.collections.C1843j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Cancellable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f11995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f11996b;

    public G(I i7, z onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f11996b = i7;
        this.f11995a = onBackPressedCallback;
    }

    @Override // androidx.activity.Cancellable
    public final void cancel() {
        I i7 = this.f11996b;
        C1843j c1843j = i7.f11999b;
        z zVar = this.f11995a;
        c1843j.remove(zVar);
        if (Intrinsics.c(i7.f12000c, zVar)) {
            zVar.handleOnBackCancelled();
            i7.f12000c = null;
        }
        zVar.removeCancellable(this);
        Function0<Unit> enabledChangedCallback$activity_release = zVar.getEnabledChangedCallback$activity_release();
        if (enabledChangedCallback$activity_release != null) {
            enabledChangedCallback$activity_release.invoke();
        }
        zVar.setEnabledChangedCallback$activity_release(null);
    }
}
