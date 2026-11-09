package p115ha;

import C0.G;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.core.content.d;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.location.listeners.LocationListener;
import com.transsnet.palmpay.util.ActivityUtils;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p283sa.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks, LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f37358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f37361d;

    public final boolean a(Context context) {
        if (d.a(context, com.transsnet.palmpay.core.config.d.j()) != 0 && d.a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            F6.d.c("a", "requestLocationUpdate: no permission");
            return false;
        }
        LocationRecord locationRecordF = p367ya.a.d().f();
        if (locationRecordF != null) {
            try {
                if (!locationRecordF.isExpired()) {
                    return true;
                }
            } catch (Exception e10) {
                F6.d.c("a", "requestLocationUpdate: ", e10);
                return false;
            }
        }
        f fVar = this.f37361d;
        if (fVar == null) {
            return true;
        }
        fVar.a();
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i7 = this.f37359b - 1;
        this.f37359b = i7;
        int iMax = Math.max(i7, 0);
        this.f37359b = iMax;
        if (iMax == 0 && this.f37360c) {
            try {
                this.f37360c = false;
            } catch (Exception e10) {
                F6.d.c("a", "onActivityStopped: ", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!this.f37360c) {
            F6.d.h("a", 3, "onActivityResumed------------执行location 更新");
            this.f37360c = a(this.f37358a);
        }
        this.f37359b++;
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onLocationChanged(Location location) {
        F6.d.h("a", 3, "onLocationResult: " + location.toString());
        p367ya.a aVarD = p367ya.a.d();
        PalmPayLatLng palmPayLatLng = new PalmPayLatLng(location.getLatitude(), location.getLongitude(), location.getTime());
        aVarD.getClass();
        aVarD.f44149a.i("key_last_known_location", new LocationRecord(palmPayLatLng).toString());
        G.u(MessageEvent.EVENT_LOCATION_CHANGE, c.b());
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onLocationFailed(int i7) {
        switch (i7) {
            case -1:
                F6.d.c("a", "Ops! Something went wrong!");
                return;
            case 0:
            case 5:
            default:
                throw new IllegalStateException(G.m(i7, "Unexpected value: "));
            case 1:
                F6.d.c("a", "Couldn't get location, and timeout!");
                return;
            case 2:
                F6.d.c("a", "Couldn't get location, because user didn't give permission!");
                return;
            case 3:
                F6.d.c("a", "Couldn't get location, because network is not accessible!");
                return;
            case 4:
                F6.d.c("a", "Couldn't get location, because Google Play Services not available!");
                return;
            case 6:
                F6.d.c("a", "Couldn't display settingsApi dialog!");
                return;
            case 7:
                F6.d.c("a", "Couldn't get location, because user didn't activate providers via settingsApi!");
                return;
            case 8:
                F6.d.c("a", "Couldn't get location, because in the process view was detached!");
                return;
            case 9:
                F6.d.c("a", "Couldn't get location, because view wasn't sufficient enough to fulfill given configuration!");
                return;
            case 10:
                F6.d.c("a", "Couldn't get location, because user didn't give permission and never ask again!");
                return;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        if (event.getEventType() == 577) {
            a(ActivityUtils.getTopActivity());
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onPermissionGranted(boolean z3) {
        F6.d.h("a", 3, d0.q("onPermissionGranted: ", z3));
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onProcessTypeChanged(int i7) {
        F6.d.h("a", 3, G.m(i7, "onProcessTypeChanged: "));
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onProviderDisabled(String str) {
        F6.d.h("a", 3, G.o("onProviderDisabled: ", str));
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onProviderEnabled(String str) {
        F6.d.h("a", 3, G.o("onProviderEnabled: ", str));
    }

    @Override // com.transsnet.palmpay.core.location.listeners.LocationListener
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
        F6.d.h("a", 3, "onStatusChanged: " + str + " " + i7);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
