package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import androidx.camera.video.u;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class zzsu {
    private static final AtomicLong zza = new AtomicLong();

    public static Uri zza(Uri uri) {
        int iMyPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = zza.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id2).length();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb2.append(".mobstore_tmp-");
        sb2.append(iMyPid);
        sb2.append("-");
        sb2.append(id2);
        u.v(sb2, "-", jCurrentTimeMillis, "-");
        sb2.append(andIncrement);
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
    }
}
