package ta;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner;
import com.transsnet.palmpay.core.location.listeners.FallbackListener;
import com.transsnet.palmpay.core.location.listeners.LocationListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends o implements ContinuousTask$ContinuousTaskRunner, FallbackListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Dialog f42375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f42376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f42377g;

    static {
        new g(null);
    }

    @Override // ta.o
    public final void a() {
        o oVar = this.f42376f;
        if (oVar != null) {
            oVar.a();
        }
        f().f42378a.b();
    }

    @Override // ta.o
    public final void b() {
        p268ra.d dVar;
        int i7 = 3;
        p268ra.e eVar = this.f42387b;
        if ((eVar != null ? eVar.f41668b : null) == null) {
            F6.d.h("LocationManager", 3, "Configuration requires not to use Google Play Services, so skipping that step to Default Location Providers");
            e();
            return;
        }
        f();
        p283sa.a aVar = this.f42388c;
        Intrinsics.e(aVar);
        Context context = aVar.f42095a;
        int iIsGooglePlayServicesAvailable = context == null ? -1 : GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (iIsGooglePlayServicesAvailable == 0) {
            F6.d.h("LocationManager", 3, "GooglePlayServices is available on device.");
            F6.d.h("LocationManager", 3, "Attempting to get location from Google Play Services providers...");
            f();
            k kVar = new k(this);
            this.f42376f = kVar;
            Intrinsics.checkNotNullParameter(this, "locationProvider");
            kVar.f42388c = this.f42388c;
            kVar.f42387b = this.f42387b;
            kVar.f42389d = this.f42389d;
            p268ra.e eVar2 = this.f42387b;
            if (eVar2 != null && (dVar = eVar2.f41668b) != null) {
                f().f42378a.a(dVar.f41666b);
            }
            o oVar = this.f42376f;
            Intrinsics.e(oVar);
            oVar.b();
            Unit unit = Unit.f38893a;
            return;
        }
        F6.d.h("LocationManager", 3, "GooglePlayServices is NOT available on device.");
        p268ra.e eVar3 = this.f42387b;
        Boolean bool = (eVar3 == null || eVar3.f41668b == null) ? null : Boolean.FALSE;
        Intrinsics.e(bool);
        if (bool.booleanValue()) {
            f();
            if (GoogleApiAvailability.getInstance().isUserResolvableError(iIsGooglePlayServicesAvailable)) {
                F6.d.h("LocationManager", 3, "Asking user to handle GooglePlayServices error...");
                f();
                Activity activityC = c();
                Dialog errorDialog = activityC != null ? GoogleApiAvailability.getInstance().getErrorDialog(activityC, iIsGooglePlayServicesAvailable, 24, new Da.j(this, i7)) : null;
                this.f42375e = errorDialog;
                if (errorDialog == null) {
                    F6.d.h("LocationManager", 3, "GooglePlayServices error could've been resolved, but since LocationManager is not running on an Activity, dialog cannot be displayed.");
                    e();
                    return;
                }
                if (iIsGooglePlayServicesAvailable == 9 || iIsGooglePlayServicesAvailable == 18) {
                    errorDialog.setOnDismissListener(new Dd.b(this, 28));
                }
                Dialog dialog = this.f42375e;
                Intrinsics.e(dialog);
                dialog.show();
                return;
            }
        }
        F6.d.h("LocationManager", 3, "Either GooglePlayServices error is not resolvable or the configuration doesn't wants us to bother user.");
        e();
    }

    public final void e() {
        p268ra.e eVar = this.f42387b;
        if ((eVar != null ? eVar.f41669c : null) == null) {
            F6.d.h("LocationManager", 3, "Configuration requires not to use default providers, abort!");
            LocationListener locationListenerD = d();
            if (locationListenerD != null) {
                locationListenerD.onLocationFailed(4);
                return;
            }
            return;
        }
        F6.d.h("LocationManager", 3, "Attempting to get location from default providers...");
        f();
        b bVar = new b();
        this.f42376f = bVar;
        Intrinsics.checkNotNullParameter(this, "locationProvider");
        bVar.f42388c = this.f42388c;
        bVar.f42387b = this.f42387b;
        bVar.f42389d = this.f42389d;
        o oVar = this.f42376f;
        Intrinsics.e(oVar);
        oVar.b();
    }

    public final j f() {
        if (this.f42377g == null) {
            this.f42377g = new j(this);
        }
        j jVar = this.f42377g;
        Intrinsics.e(jVar);
        return jVar;
    }

    @Override // com.transsnet.palmpay.core.location.listeners.FallbackListener
    public final void onFallback() {
        a();
        e();
    }

    @Override // com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner
    public final void runScheduledTask(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        if (Intrinsics.c(taskId, "googlePlayServiceSwitchTask")) {
            o oVar = this.f42376f;
            if (oVar instanceof k) {
                Intrinsics.f(oVar, "null cannot be cast to non-null type com.transsnet.palmpay.core.location.providers.GooglePlayServicesLocationProvider");
                if (((k) oVar).f42386a) {
                    F6.d.h("LocationManager", 3, "We couldn't receive location from GooglePlayServices, so switching default providers...");
                    a();
                    e();
                }
            }
        }
    }
}
