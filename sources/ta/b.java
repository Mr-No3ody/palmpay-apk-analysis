package ta;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner;
import com.transsnet.palmpay.core.location.listeners.DialogListener;
import com.transsnet.palmpay.util.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o implements ContinuousTask$ContinuousTaskRunner, LocationListener, DialogListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f42369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42370f;

    static {
        new a(null);
    }

    @Override // ta.o
    public final void a() {
        p283sa.g gVar = g().f42372b;
        if (gVar != null) {
            gVar.f42106a.removeUpdates(gVar.f42107b);
        }
        p283sa.b bVar = g().f42373c;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // ta.o
    public final void b() {
        p268ra.b bVar;
        p268ra.e eVar;
        p268ra.b bVar2;
        p pVar;
        this.f42386a = true;
        if (g().f42371a.isProviderEnabled("gps")) {
            F6.d.h("DefaultLocationProvider", 3, "GPS is already enabled, getting location...");
            e("gps");
            return;
        }
        p268ra.e eVar2 = this.f42387b;
        if (eVar2 == null || (bVar = eVar2.f41669c) == null || bVar.f41663e == null || c() == null) {
            F6.d.h("DefaultLocationProvider", 3, "GPS is not enabled, moving on with Network...");
            f();
            return;
        }
        F6.d.h("DefaultLocationProvider", 3, "GPS is not enabled, asking user to enable it...");
        Activity activityC = c();
        if (activityC == null || (eVar = this.f42387b) == null || (bVar2 = eVar.f41669c) == null || (pVar = bVar2.f41663e) == null || activityC.isFinishing() || activityC.isDestroyed()) {
            return;
        }
        pVar.f42390a = new WeakReference(this);
        pVar.a(activityC).show();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    public final void e(String str) {
        Location lastKnownLocation;
        p268ra.b bVar;
        p283sa.b bVar2;
        p268ra.b bVar3;
        long j6;
        p268ra.b bVar4;
        p268ra.b bVar5;
        p283sa.b bVar6 = g().f42373c;
        if (bVar6 != null) {
            bVar6.b();
        }
        this.f42370f = str;
        d dVarG = g();
        String str2 = this.f42370f;
        Long l5 = null;
        if (str2 != null) {
            try {
                lastKnownLocation = dVarG.f42371a.getLastKnownLocation(str2);
            } catch (Exception e10) {
                e10.printStackTrace();
                "gps".equals(str2);
                lastKnownLocation = null;
            }
        } else {
            lastKnownLocation = null;
        }
        g();
        p268ra.e eVar = this.f42387b;
        long j10 = (eVar == null || (bVar5 = eVar.f41669c) == null) ? 0L : bVar5.f41660b;
        float f10 = (eVar == null || eVar.f41669c == null) ? 0.0f : 5.0f;
        boolean z3 = false;
        if (lastKnownLocation != null) {
            float accuracy = lastKnownLocation.getAccuracy();
            if (new Date().getTime() - j10 > lastKnownLocation.getTime() || f10 < accuracy) {
                F6.d.h("DefaultLocationProvider", 3, "LastKnowLocation is not usable.");
            } else {
                F6.d.h("DefaultLocationProvider", 3, "LastKnowLocation is usable.");
                com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
                if (locationListenerD != null) {
                    locationListenerD.onLocationChanged(lastKnownLocation);
                }
                this.f42386a = false;
                z3 = true;
            }
        } else {
            F6.d.h("DefaultLocationProvider", 3, "LastKnowLocation is not usable.");
        }
        Intrinsics.e(this.f42387b);
        if (z3) {
            F6.d.h("DefaultLocationProvider", 3, "We got location, no need to ask for location updates.");
            return;
        }
        F6.d.h("DefaultLocationProvider", 3, "Ask for location update...");
        com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD2 = d();
        if (locationListenerD2 != null) {
            locationListenerD2.onProcessTypeChanged("gps".equals(this.f42370f) ? 3 : 4);
        }
        if (!z3 && (bVar2 = g().f42373c) != null) {
            if ("gps".equals(this.f42370f)) {
                p268ra.e eVar2 = this.f42387b;
                if (eVar2 == null || (bVar4 = eVar2.f41669c) == null) {
                    j6 = 0;
                } else {
                    j6 = bVar4.f41661c;
                }
            } else {
                p268ra.e eVar3 = this.f42387b;
                if (eVar3 == null || (bVar3 = eVar3.f41669c) == null) {
                    j6 = 0;
                } else {
                    j6 = bVar3.f41662d;
                }
            }
            bVar2.a(j6);
        }
        p268ra.e eVar4 = this.f42387b;
        Long lValueOf = (eVar4 == null || (bVar = eVar4.f41669c) == null) ? null : Long.valueOf(bVar.f41659a);
        p268ra.e eVar5 = this.f42387b;
        if (eVar5 != null && eVar5.f41669c != null) {
            l5 = 0L;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (l5 != null) {
                try {
                    long jLongValue2 = l5.longValue();
                    p283sa.g gVar = g().f42372b;
                    if (gVar != null) {
                        String str3 = this.f42370f;
                        gVar.f42108c = str3;
                        gVar.f42109d = jLongValue;
                        gVar.f42110e = jLongValue2;
                        try {
                            if (!StringUtils.isEmpty(str3)) {
                                LocationManager locationManager = gVar.f42106a;
                                String str4 = gVar.f42108c;
                                Intrinsics.e(str4);
                                locationManager.requestLocationUpdates(str4, gVar.f42109d, gVar.f42110e, gVar.f42107b);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        Unit unit = Unit.f38893a;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    String str5 = this.f42370f;
                    if (str5 == null || !str5.equals("gps")) {
                        F6.d.h("DefaultLocationProvider", 3, "fail !!!!  nothing to do");
                    } else {
                        F6.d.h("DefaultLocationProvider", 3, "no access_final_location, switching to Network provider...");
                        f();
                    }
                    Unit unit2 = Unit.f38893a;
                }
            }
        }
    }

    public final void f() {
        if (g().f42371a.isProviderEnabled("network")) {
            F6.d.h("DefaultLocationProvider", 3, "Network is enabled, getting location...");
            e("network");
        } else {
            F6.d.h("DefaultLocationProvider", 3, "Network is not enabled, calling fail...");
            com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
            if (locationListenerD != null) {
                locationListenerD.onLocationFailed(3);
            }
            this.f42386a = false;
        }
        Unit unit = Unit.f38893a;
    }

    public final d g() {
        if (this.f42369e == null) {
            p283sa.a aVar = this.f42388c;
            Intrinsics.e(aVar);
            this.f42369e = new d(aVar.f42095a, this, this);
        }
        d dVar = this.f42369e;
        Intrinsics.e(dVar);
        return dVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        p283sa.b bVar;
        Intrinsics.checkNotNullParameter(location, "location");
        if (g().f42372b == null) {
            return;
        }
        com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onLocationChanged(location);
        }
        this.f42386a = false;
        if (g().f42373c != null && (bVar = g().f42373c) != null) {
            bVar.b();
        }
        if (this.f42387b != null) {
            p283sa.g gVar = g().f42372b;
            if (gVar != null) {
                gVar.f42106a.removeUpdates(gVar.f42107b);
            }
            g().f42371a.removeUpdates(this);
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.DialogListener
    public final void onNegativeButtonClick() {
        F6.d.h("DefaultLocationProvider", 3, "User didn't want to enable GPS, so continue with Network Provider");
        f();
    }

    @Override // com.transsnet.palmpay.core.location.listeners.DialogListener
    public final void onPositiveButtonClick() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        p283sa.a aVar = this.f42388c;
        Intrinsics.e(aVar);
        if (((Fragment) aVar.f42097c.get()) != null) {
            p283sa.a aVar2 = this.f42388c;
            Intrinsics.e(aVar2);
            Fragment fragment = (Fragment) aVar2.f42097c.get();
            if (fragment != null) {
                fragment.startActivityForResult(intent, 25);
                return;
            }
            return;
        }
        if (c() != null) {
            Activity activityC = c();
            Intrinsics.e(activityC);
            activityC.startActivityForResult(intent, 25);
        } else {
            F6.d.h("LocationProvider", 3, "Cannot startActivityForResult because host is neither Activity nor Fragment.");
            com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
            if (locationListenerD != null) {
                locationListenerD.onLocationFailed(9);
            }
            this.f42386a = false;
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onProviderDisabled(provider);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onProviderEnabled(provider);
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String provider, int i7, Bundle extras) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(extras, "extras");
        com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
        if (locationListenerD != null) {
            locationListenerD.onStatusChanged(provider, i7, extras);
        }
    }

    @Override // com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner
    public final void runScheduledTask(String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        if (Intrinsics.c(taskId, "providerSwitchTask")) {
            p283sa.g gVar = g().f42372b;
            if (gVar != null) {
                gVar.f42106a.removeUpdates(gVar.f42107b);
            }
            if ("gps".equals(this.f42370f)) {
                F6.d.h("DefaultLocationProvider", 3, "We waited enough for GPS, switching to Network provider...");
                f();
                return;
            }
            F6.d.h("DefaultLocationProvider", 3, "Network Provider is not provide location in required period, calling fail...");
            com.transsnet.palmpay.core.location.listeners.LocationListener locationListenerD = d();
            if (locationListenerD != null) {
                locationListenerD.onLocationFailed(1);
            }
            this.f42386a = false;
        }
    }
}
