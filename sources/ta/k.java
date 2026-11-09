package ta;

import C0.G;
import android.app.Activity;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Task;
import com.transsnet.palmpay.core.location.listeners.FallbackListener;
import com.transsnet.palmpay.core.location.listeners.LocationListener;
import com.transsnet.palmpay.core.location.providers.GooglePlayServicesLocationSource$SourceListener;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends o implements GooglePlayServicesLocationSource$SourceListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f42379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f42380f;

    public k(h hVar) {
        this.f42379e = new WeakReference(hVar);
    }

    @Override // ta.o
    public final void a() {
        F6.d.h("LocationProvider", 3, "Canceling GooglePlayServiceLocationProvider...");
        if (this.f42380f != null) {
            f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    @Override // ta.o
    public final void b() {
        LocationListener locationListenerD;
        Unit unit;
        this.f42386a = true;
        p283sa.a aVar = this.f42388c;
        Intrinsics.e(aVar);
        if (aVar.f42095a != null) {
            F6.d.h("LocationProvider", 3, "Start request location updates.");
            p268ra.e eVar = this.f42387b;
            if (eVar == null || eVar.f41668b == null) {
                unit = null;
            } else {
                m mVarE = e();
                mVarE.f42384c.getLastLocation().addOnCompleteListener(new l(mVarE));
                unit = Unit.f38893a;
            }
            if (unit != null) {
                return;
            }
        }
        p268ra.e eVar2 = this.f42387b;
        if (eVar2 == null || eVar2.f41668b == null) {
            locationListenerD = d();
            if (locationListenerD != null) {
                locationListenerD.onLocationFailed(8);
            }
        } else {
            WeakReference weakReference = this.f42379e;
            if (weakReference.get() != null) {
                Object obj = weakReference.get();
                Intrinsics.e(obj);
                ((FallbackListener) obj).onFallback();
            } else {
                locationListenerD = d();
                if (locationListenerD != null) {
                    locationListenerD.onLocationFailed(8);
                }
            }
        }
        this.f42386a = false;
    }

    public final m e() {
        p268ra.d dVar;
        LocationRequest locationRequest;
        if (this.f42380f == null) {
            p268ra.e eVar = this.f42387b;
            m mVar = null;
            if (eVar != null && (dVar = eVar.f41668b) != null && (locationRequest = dVar.f41665a) != null) {
                p283sa.a aVar = this.f42388c;
                Intrinsics.e(aVar);
                mVar = new m(aVar.f42095a, locationRequest, this);
            }
            this.f42380f = mVar;
        }
        m mVar2 = this.f42380f;
        Intrinsics.e(mVar2);
        return mVar2;
    }

    public final void f() {
        F6.d.h("LocationProvider", 3, "Stop location updates...");
        m mVar = this.f42380f;
        if (mVar != null) {
            this.f42386a = false;
            Intrinsics.e(mVar);
            Intrinsics.checkNotNullExpressionValue(mVar.f42384c.removeLocationUpdates(mVar), "removeLocationUpdates(...)");
        }
    }

    public final void g() {
        LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onProcessTypeChanged(2);
        }
        F6.d.h("LocationProvider", 3, "Requesting location update...");
        m mVarE = e();
        mVarE.f42384c.requestLocationUpdates(mVarE.f42382a, mVarE, Looper.myLooper());
    }

    public final void h(int i7) {
        F6.d.h("LocationProvider", 3, "Even though settingsApi failed, configuration requires moving on. So requesting location update...");
        g();
    }

    @Override // com.transsnet.palmpay.core.location.providers.GooglePlayServicesLocationSource$SourceListener, com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!(exception instanceof ApiException)) {
            h(-1);
            return;
        }
        int statusCode = ((ApiException) exception).getStatusCode();
        if (statusCode != 6) {
            if (statusCode != 8502) {
                F6.d.h("LocationProvider", 3, G.o("LocationSettings failing, status: ", CommonStatusCodes.getStatusCodeString(statusCode)));
                h(7);
                return;
            } else {
                F6.d.h("LocationProvider", 3, "Settings change is not available, SettingsApi failing...");
                h(6);
                return;
            }
        }
        ResolvableApiException resolvable = exception instanceof ResolvableApiException ? (ResolvableApiException) exception : null;
        if (resolvable != null) {
            Intrinsics.checkNotNullParameter(resolvable, "resolvable");
            try {
                F6.d.h("LocationProvider", 3, "We need settingsApi dialog to switch required settings on.");
                if (c() != null) {
                    F6.d.h("LocationProvider", 3, "Displaying the dialog...");
                    e();
                    Activity activityC = c();
                    Intrinsics.checkNotNullParameter(resolvable, "resolvable");
                    Intrinsics.e(activityC);
                    resolvable.startResolutionForResult(activityC, 26);
                } else {
                    F6.d.h("LocationProvider", 3, "Settings Api cannot show dialog if LocationManager is not running on an activity!");
                    h(9);
                }
            } catch (IntentSender.SendIntentException unused) {
                F6.d.h("LocationProvider", 3, "Error on displaying SettingsApi dialog, SettingsApi failing...");
                h(6);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.location.providers.GooglePlayServicesLocationSource$SourceListener
    public final void onLastKnowLocationTaskReceived(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful() && task.getResult() != null) {
            Location location = (Location) task.getResult();
            F6.d.h("LocationProvider", 3, "LastKnowLocation is available.");
            if (location != null) {
                onLocationChanged(location);
                return;
            }
            return;
        }
        F6.d.h("LocationProvider", 3, "LastKnowLocation is not available.");
        F6.d.h("LocationProvider", 3, "Ask for location update...");
        p268ra.e eVar = this.f42387b;
        if (eVar == null || eVar.f41668b == null) {
            F6.d.h("LocationProvider", 3, "SettingsApi is not enabled, requesting for location update...");
            g();
        } else {
            F6.d.h("LocationProvider", 3, "Asking for SettingsApi...");
            m mVarE = e();
            LocationServices.getSettingsClient(mVarE.f42385d).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(mVarE.f42382a).build()).addOnSuccessListener(new l(mVarE)).addOnFailureListener(new l(mVarE));
        }
    }

    public final void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onLocationChanged(location);
        }
        this.f42386a = false;
        if (this.f42387b != null) {
            F6.d.h("LocationProvider", 3, "We got location and no need to keep tracking, so location update is removed.");
            f();
        }
    }

    @Override // com.transsnet.palmpay.core.location.providers.GooglePlayServicesLocationSource$SourceListener
    public final void onLocationResult(LocationResult locationResult) {
        if (locationResult == null) {
            return;
        }
        for (Location location : locationResult.getLocations()) {
            Intrinsics.e(location);
            onLocationChanged(location);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(LocationSettingsResponse locationSettingsResponse) {
        F6.d.h("LocationProvider", 3, "We got GPS, Wifi and/or Cell network providers enabled enough to receive location as we needed. Requesting location update...");
        g();
    }
}
