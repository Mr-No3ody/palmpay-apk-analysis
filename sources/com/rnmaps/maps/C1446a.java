package com.rnmaps.maps;

import android.location.Location;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.rnmaps.maps.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1446a implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationSource.OnLocationChangedListener f24911a;

    public C1446a(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.f24911a = onLocationChangedListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f24911a.onLocationChanged(location);
        }
    }
}
