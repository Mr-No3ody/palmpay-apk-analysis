package G0;

import Wf.AbstractC0777v;
import Wf.C0765i;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f2893b;

    public i(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f2893b = mMeasurementManager;
    }

    @DoNotInline
    public static Object h(i iVar, a aVar, Continuation<? super Unit> continuation) {
        new C0765i(1, Ef.f.b(continuation)).initCancellability();
        MeasurementManager measurementManager = iVar.f2893b;
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object i(i iVar, Continuation<? super Integer> frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        iVar.f2893b.getMeasurementApiStatus(new g(0), new androidx.core.os.e(c0765i));
        Object objM = c0765i.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object j(i iVar, j jVar, Continuation<? super Unit> continuation) throws Throwable {
        Object objD = AbstractC0777v.d(new h(iVar, null), continuation);
        return objD == Ef.a.f2423a ? objD : Unit.f38893a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object k(i iVar, Uri uri, InputEvent inputEvent, Continuation<? super Unit> frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        iVar.f2893b.registerSource(uri, inputEvent, new g(0), new androidx.core.os.e(c0765i));
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object l(i iVar, Uri uri, Continuation<? super Unit> frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        iVar.f2893b.registerTrigger(uri, new g(0), new androidx.core.os.e(c0765i));
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object m(i iVar, k kVar, Continuation<? super Unit> continuation) {
        new C0765i(1, Ef.f.b(continuation)).initCancellability();
        MeasurementManager measurementManager = iVar.f2893b;
        throw null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    public static Object n(i iVar, l lVar, Continuation<? super Unit> continuation) {
        new C0765i(1, Ef.f.b(continuation)).initCancellability();
        MeasurementManager measurementManager = iVar.f2893b;
        throw null;
    }

    @Override // G0.d
    @DoNotInline
    @Nullable
    public Object a(@NotNull a aVar, @NotNull Continuation<? super Unit> continuation) {
        return h(this, aVar, continuation);
    }

    @Override // G0.d
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object b(@NotNull Continuation<? super Integer> continuation) {
        return i(this, continuation);
    }

    @Override // G0.d
    @Nullable
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object c(@NotNull j jVar, @NotNull Continuation<? super Unit> continuation) {
        return j(this, jVar, continuation);
    }

    @Override // G0.d
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object d(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull Continuation<? super Unit> continuation) {
        return k(this, uri, inputEvent, continuation);
    }

    @Override // G0.d
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object e(@NotNull Uri uri, @NotNull Continuation<? super Unit> continuation) {
        return l(this, uri, continuation);
    }

    @Override // G0.d
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object f(@NotNull k kVar, @NotNull Continuation<? super Unit> continuation) {
        return m(this, kVar, continuation);
    }

    @Override // G0.d
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @DoNotInline
    @Nullable
    public Object g(@NotNull l lVar, @NotNull Continuation<? super Unit> continuation) {
        return n(this, lVar, continuation);
    }
}
