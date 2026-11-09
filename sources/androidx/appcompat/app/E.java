package androidx.appcompat.app;

import Me.AbstractC0456a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0456a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12088c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f12089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(I i7, top.zibin.luban.io.a aVar) {
        super(i7);
        this.f12089d = i7;
        this.f12090e = aVar;
    }

    @Override // Me.AbstractC0456a
    public final IntentFilter b() {
        switch (this.f12088c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    @Override // Me.AbstractC0456a
    public final int c() {
        Location lastKnownLocation;
        boolean z3;
        long j6;
        switch (this.f12088c) {
            case 0:
                return A.a((PowerManager) this.f12090e) ? 2 : 1;
            default:
                top.zibin.luban.io.a aVar = (top.zibin.luban.io.a) this.f12090e;
                U u6 = (U) aVar.f42647d;
                if (u6.f12177b > System.currentTimeMillis()) {
                    z3 = u6.f12176a;
                } else {
                    Context context = (Context) aVar.f42645b;
                    int iB = androidx.core.content.d.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) aVar.f42646c;
                    if (iB == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("network");
                            } else {
                                lastKnownLocation = null;
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    } else {
                        lastKnownLocation = null;
                    }
                    if (androidx.core.content.d.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
                        lastKnownLocation = lastKnownLocation2;
                    }
                    z3 = false;
                    if (lastKnownLocation != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (T.f12172d == null) {
                            T.f12172d = new T();
                        }
                        T t = T.f12172d;
                        t.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
                        t.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
                        z3 = t.f12175c == 1;
                        long j10 = t.f12174b;
                        long j11 = t.f12173a;
                        t.a(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j12 = t.f12174b;
                        if (j10 == -1 || j11 == -1) {
                            j6 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j6 = j10 + 60000;
                        }
                        u6.f12176a = z3;
                        u6.f12177b = j6;
                    } else {
                        int i7 = Calendar.getInstance().get(11);
                        if (i7 < 6 || i7 >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // Me.AbstractC0456a
    public final void i() throws IllegalAccessException {
        switch (this.f12088c) {
            case 0:
                this.f12089d.o(true, true);
                break;
            default:
                this.f12089d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(I i7, Context context) {
        super(i7);
        this.f12089d = i7;
        this.f12090e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
