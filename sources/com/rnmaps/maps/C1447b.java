package com.rnmaps.maps;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.LocationSource;
import java.util.Iterator;

/* JADX INFO: renamed from: com.rnmaps.maps.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447b extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationSource.OnLocationChangedListener f24912a;

    public C1447b(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.f24912a = onLocationChangedListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Iterator<Location> it = locationResult.getLocations().iterator();
        while (it.hasNext()) {
            this.f24912a.onLocationChanged(it.next());
        }
    }
}
