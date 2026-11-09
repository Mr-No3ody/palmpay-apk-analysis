package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesClient {

    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j6) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        N n10 = new N(j6);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, n10, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                O o10 = new O(n10.a());
                GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(o10.a(), o10.b());
                context.unbindService(n10);
                return googlePlayServicesInfo;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th) {
            context.unbindService(n10);
            throw th;
        }
    }
}
