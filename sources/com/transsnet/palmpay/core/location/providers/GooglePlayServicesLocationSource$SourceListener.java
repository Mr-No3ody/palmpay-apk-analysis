package com.transsnet.palmpay.core.location.providers;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\bj\u0002`\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00052\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/transsnet/palmpay/core/location/providers/GooglePlayServicesLocationSource$SourceListener", "Lcom/google/android/gms/tasks/OnSuccessListener;", "Lcom/google/android/gms/location/LocationSettingsResponse;", "Lcom/google/android/gms/tasks/OnFailureListener;", "p0", "", "onSuccess", "(Lcom/google/android/gms/location/LocationSettingsResponse;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onFailure", "(Ljava/lang/Exception;)V", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "onLocationResult", "(Lcom/google/android/gms/location/LocationResult;)V", "Lcom/google/android/gms/tasks/Task;", "Landroid/location/Location;", "task", "onLastKnowLocationTaskReceived", "(Lcom/google/android/gms/tasks/Task;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GooglePlayServicesLocationSource$SourceListener extends OnSuccessListener<LocationSettingsResponse>, OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    void onFailure(@NotNull Exception exception);

    void onLastKnowLocationTaskReceived(@NotNull Task<Location> task);

    void onLocationResult(@Nullable LocationResult locationResult);

    void onSuccess(@Nullable LocationSettingsResponse p3);
}
