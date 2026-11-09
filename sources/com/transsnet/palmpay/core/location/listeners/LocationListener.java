package com.transsnet.palmpay.core.location.listeners;

import android.location.Location;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J$\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/location/listeners/LocationListener;", "", "onProcessTypeChanged", "", "processType", "", "onLocationChanged", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "onLocationFailed", "type", "onPermissionGranted", "alreadyHadPermission", "", "onStatusChanged", "provider", "", "status", "extras", "Landroid/os/Bundle;", "onProviderEnabled", "onProviderDisabled", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface LocationListener {
    void onLocationChanged(@Nullable Location location);

    void onLocationFailed(int type);

    void onPermissionGranted(boolean alreadyHadPermission);

    void onProcessTypeChanged(int processType);

    void onProviderDisabled(@Nullable String provider);

    void onProviderEnabled(@Nullable String provider);

    void onStatusChanged(@Nullable String provider, int status, @Nullable Bundle extras);
}
