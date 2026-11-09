package androidx.activity;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f12015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f12016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f12017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f12018d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(I i7, AbstractC1205o lifecycle, z onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f12018d = i7;
        this.f12015a = lifecycle;
        this.f12016b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.activity.Cancellable
    public final void cancel() {
        this.f12015a.b(this);
        this.f12016b.removeCancellable(this);
        G g7 = this.f12017c;
        if (g7 != null) {
            g7.cancel();
        }
        this.f12017c = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC1203m.ON_START) {
            this.f12017c = this.f12018d.b(this.f12016b);
            return;
        }
        if (event != EnumC1203m.ON_STOP) {
            if (event == EnumC1203m.ON_DESTROY) {
                cancel();
            }
        } else {
            G g7 = this.f12017c;
            if (g7 != null) {
                g7.cancel();
            }
        }
    }
}
