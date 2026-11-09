package ta;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f42371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p283sa.g f42372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p283sa.b f42373c;

    static {
        new c(null);
    }

    public d(Context context, b bVar, b bVar2) {
        Object systemService = context != null ? context.getSystemService(FirebaseAnalytics.Param.LOCATION) : null;
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        this.f42371a = locationManager;
        this.f42372b = new p283sa.g(locationManager, bVar2);
        this.f42373c = new p283sa.b("providerSwitchTask", bVar);
    }
}
