package com.google.firebase.analytics;

import com.didiglobal.booster.instrument.NamedThreadFactory;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zza extends ThreadPoolExecutor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(FirebaseAnalytics firebaseAnalytics, int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, NamedThreadFactory.newInstance("\u200bcom.google.firebase.analytics.zza"));
        Objects.requireNonNull(firebaseAnalytics);
    }
}
