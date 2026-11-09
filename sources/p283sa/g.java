package p283sa;

import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;
import ta.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f42106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f42107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f42110e;

    public g(LocationManager locationManager, b locationListener) {
        Intrinsics.checkNotNullParameter(locationListener, "locationListener");
        this.f42106a = locationManager;
        this.f42107b = locationListener;
    }
}
