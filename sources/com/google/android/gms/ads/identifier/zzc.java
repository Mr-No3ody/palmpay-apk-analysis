package com.google.android.gms.ads.identifier;

import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    @WorkerThread
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    httpURLConnection.disconnect();
                    zzi.zza();
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                zzi.zza();
            } catch (IndexOutOfBoundsException e11) {
                new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e11.getMessage()).length());
                zzi.zza();
            } catch (RuntimeException e12) {
                e = e12;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                zzi.zza();
            }
        } catch (Throwable th2) {
            zzi.zza();
            throw th2;
        }
    }
}
