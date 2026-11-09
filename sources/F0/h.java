package F0;

import G0.k;
import G0.l;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0.d f2512b;

    public h(G0.d mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f2512b = mMeasurementManager;
    }

    @Override // F0.j
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Integer> a() {
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new b(this, null), 3));
    }

    @Override // F0.j
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Unit> b(@NotNull Uri trigger) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new e(this, trigger, null), 3));
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Unit> c(@NotNull G0.a deletionRequest) {
        Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new a(this, null), 3));
    }

    @NotNull
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public ListenableFuture<Unit> d(@NotNull G0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new d(this, null), 3));
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Unit> e(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new c(this, attributionSource, inputEvent, null), 3));
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Unit> f(@NotNull k request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new f(this, null), 3));
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @NotNull
    public ListenableFuture<Unit> g(@NotNull l request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return androidx.camera.core.impl.utils.executor.g.b(AbstractC0780y.d(AbstractC0777v.a(I.f10809a), null, new g(this, null), 3));
    }
}
