package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.n0;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OcProtocolActivity f29913a;

    public a(OcProtocolActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f29913a = activity;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        Intrinsics.checkNotNullParameter(locationAvailability, "locationAvailability");
        super.onLocationAvailability(locationAvailability);
        F6.d.h(OcProtocolActivity.f29647H.getClass().getSimpleName(), 3, d0.q("onLocationAvailability: ", locationAvailability.isLocationAvailable()));
        n0.g().o("PalmpayLocationInfoEvent", "", TextUtils.join(":", new String[]{G.k(), String.valueOf(locationAvailability.isLocationAvailable()), String.valueOf(androidx.core.content.d.a(BaseApplication.getContext(), com.transsnet.palmpay.core.config.d.j()) == 0 && androidx.core.content.d.a(BaseApplication.getContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0)}));
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        super.onLocationResult(locationResult);
        if (locationResult.getLastLocation() != null) {
            OcProtocolActivity ocProtocolActivity = this.f29913a;
            ocProtocolActivity.f29648A.removeCallbacks(ocProtocolActivity.f29650C);
            p367ya.a aVarD = p367ya.a.d();
            Location lastLocation = locationResult.getLastLocation();
            Intrinsics.e(lastLocation);
            double latitude = lastLocation.getLatitude();
            Location lastLocation2 = locationResult.getLastLocation();
            Intrinsics.e(lastLocation2);
            double longitude = lastLocation2.getLongitude();
            Location lastLocation3 = locationResult.getLastLocation();
            Intrinsics.e(lastLocation3);
            PalmPayLatLng palmPayLatLng = new PalmPayLatLng(latitude, longitude, lastLocation3.getTime());
            aVarD.getClass();
            aVarD.f44149a.i("key_last_known_location", new LocationRecord(palmPayLatLng).toString());
            ocProtocolActivity.p();
            ocProtocolActivity.r(false, true);
        }
    }
}
