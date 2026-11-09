package ta;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationRequest f42382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f42383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FusedLocationProviderClient f42384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f42385d;

    public m(Context context, LocationRequest locationRequest, k kVar) {
        Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
        this.f42382a = locationRequest;
        this.f42383b = kVar;
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f42385d = applicationContext;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f42384c = fusedLocationProviderClient;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        k kVar = this.f42383b;
        if (kVar != null) {
            kVar.onLocationResult(locationResult);
        }
    }
}
