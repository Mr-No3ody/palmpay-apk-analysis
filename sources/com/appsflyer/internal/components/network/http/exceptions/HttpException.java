package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1bSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1bSDK getRevenue;

    public HttpException(@NonNull Throwable th, @NonNull AFd1bSDK aFd1bSDK) {
        super(th.getMessage(), th);
        this.getRevenue = aFd1bSDK;
    }

    @NonNull
    public AFd1bSDK getMetrics() {
        return this.getRevenue;
    }
}
