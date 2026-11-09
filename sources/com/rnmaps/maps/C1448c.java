package com.rnmaps.maps;

import android.os.Looper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.LocationSource;

/* JADX INFO: renamed from: com.rnmaps.maps.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1448c implements LocationSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FusedLocationProviderClient f24913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationRequest f24914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1447b f24915c;

    public C1448c(ThemedReactContext themedReactContext) {
        this.f24913a = LocationServices.getFusedLocationProviderClient(themedReactContext);
        LocationRequest locationRequestCreate = LocationRequest.create();
        this.f24914b = locationRequestCreate;
        locationRequestCreate.setPriority(100);
        locationRequestCreate.setInterval(5000L);
    }

    @Override // com.google.android.gms.maps.LocationSource
    public final void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        FusedLocationProviderClient fusedLocationProviderClient = this.f24913a;
        try {
            fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new C1446a(onLocationChangedListener));
            C1447b c1447b = new C1447b(onLocationChangedListener);
            this.f24915c = c1447b;
            fusedLocationProviderClient.requestLocationUpdates(this.f24914b, c1447b, Looper.myLooper());
        } catch (SecurityException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.google.android.gms.maps.LocationSource
    public final void deactivate() {
        this.f24913a.removeLocationUpdates(this.f24915c);
    }
}
