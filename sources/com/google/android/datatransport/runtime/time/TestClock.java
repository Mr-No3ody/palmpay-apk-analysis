package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long j6) {
        this.timestamp = new AtomicLong(j6);
    }

    public void advance(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.timestamp.addAndGet(j6);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1L);
    }
}
