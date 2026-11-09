package com.dylanvann.fastimage;

import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements FastImageOkHttpProgressGlideModule.ResponseProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f21162a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f21163b = new HashMap();

    @Override // com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule.ResponseProgressListener
    public final void update(String str, long j6, long j10) {
        WeakHashMap weakHashMap = this.f21162a;
        FastImageProgressListener fastImageProgressListener = (FastImageProgressListener) weakHashMap.get(str);
        if (fastImageProgressListener == null) {
            return;
        }
        HashMap map = this.f21163b;
        if (j10 <= j6) {
            weakHashMap.remove(str);
            map.remove(str);
        }
        float granularityPercentage = fastImageProgressListener.getGranularityPercentage();
        if (granularityPercentage != 0.0f && j6 != 0 && j10 != j6) {
            long j11 = (long) (((j6 * 100.0f) / j10) / granularityPercentage);
            Long l5 = (Long) map.get(str);
            if (l5 != null && j11 == l5.longValue()) {
                return;
            } else {
                map.put(str, Long.valueOf(j11));
            }
        }
        fastImageProgressListener.onProgress(str, j6, j10);
    }
}
