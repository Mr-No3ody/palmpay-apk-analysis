package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);

    @GuardedBy("this")
    private int attemptCount;

    @GuardedBy("this")
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }

    private synchronized long getBackoffDuration(int i7) {
        if (isRetryableError(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
    }

    private static boolean isRetryableError(int i7) {
        if (i7 != 429) {
            return i7 >= 500 && i7 < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    public synchronized boolean isRequestAllowed() {
        return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
    }

    public synchronized void setNextRequestTime(int i7) {
        if (isSuccessfulOrRequiresNewFidCreation(i7)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i7);
    }

    public RequestLimiter() {
        this.utils = Utils.getInstance();
    }
}
