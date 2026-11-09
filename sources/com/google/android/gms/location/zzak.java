package com.google.android.gms.location;

import F.a;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.identity.zzeo;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzd;

    static {
        Locale locale = Locale.ROOT;
        zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb2) {
        boolean zH;
        float fE;
        boolean zI;
        float f10;
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 ? a.d(location) : location.isFromMockProvider()) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = zzb;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(zzc.format(location.getAccuracy()));
            sb2.append("m");
        }
        boolean zG = false;
        float fB = 0.0f;
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = zzc;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (i7 >= 26) {
                zI = Z.a.i(location);
            } else {
                Bundle extras = location.getExtras();
                zI = extras != null && extras.containsKey(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
            }
            if (zI) {
                sb2.append("±");
                if (i7 >= 26) {
                    f10 = Z.a.f(location);
                } else {
                    Bundle extras2 = location.getExtras();
                    f10 = extras2 == null ? 0.0f : extras2.getFloat(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, 0.0f);
                }
                sb2.append(decimalFormat2.format(f10));
            }
            sb2.append("m");
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = zzc;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (i7 >= 26) {
                zH = Z.a.h(location);
            } else {
                Bundle extras3 = location.getExtras();
                zH = extras3 != null && extras3.containsKey("speedAccuracy");
            }
            if (zH) {
                sb2.append("±");
                if (i7 >= 26) {
                    fE = Z.a.e(location);
                } else {
                    Bundle extras4 = location.getExtras();
                    fE = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                }
                sb2.append(decimalFormat3.format(fE));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = zzc;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (i7 >= 26) {
                zG = Z.a.g(location);
            } else {
                Bundle extras5 = location.getExtras();
                if (extras5 != null && extras5.containsKey("bearingAccuracy")) {
                    zG = true;
                }
            }
            if (zG) {
                sb2.append("±");
                if (i7 >= 26) {
                    fB = Z.a.b(location);
                } else {
                    Bundle extras6 = location.getExtras();
                    if (extras6 != null) {
                        fB = extras6.getFloat("bearingAccuracy", 0.0f);
                    }
                }
                sb2.append(decimalFormat4.format(fB));
            }
            sb2.append("°");
        }
        Bundle extras7 = location.getExtras();
        String string = extras7 != null ? extras7.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras8 = location.getExtras();
        String string2 = extras8 != null ? extras8.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(zzeo.zza(TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis));
        sb2.append('}');
        return sb2;
    }
}
