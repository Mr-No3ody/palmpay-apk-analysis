package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
public interface WorkScheduler {
    void schedule(TransportContext transportContext, int i7);

    void schedule(TransportContext transportContext, int i7, boolean z3);
}
