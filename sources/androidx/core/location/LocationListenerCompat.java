package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LocationListenerCompat extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i7) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@NonNull List<Location> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            onLocationChanged(list.get(i7));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@NonNull String str, int i7, @Nullable Bundle bundle) {
    }
}
