package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    static final long MAX_NANOSECONDS_THRESHOLD = 2147483647999999999L;

    private OverflowAvoidingLockSupport() {
    }

    public static void parkNanos(@CheckForNull Object obj, long j6) {
        LockSupport.parkNanos(obj, Math.min(j6, MAX_NANOSECONDS_THRESHOLD));
    }
}
