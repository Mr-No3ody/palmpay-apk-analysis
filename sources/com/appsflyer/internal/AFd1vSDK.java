package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import com.google.firebase.perf.util.Constants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public final class AFd1vSDK implements AFd1wSDK {

    @NotNull
    private final AFc1cSDK getRevenue;

    public AFd1vSDK(@NotNull AFc1cSDK aFc1cSDK) {
        Intrinsics.checkNotNullParameter(aFc1cSDK, "");
        this.getRevenue = aFc1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void AFAdRevenueData(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1qSDK(bArr, map, Constants.MAX_URL_LENGTH).AFAdRevenueData()) {
            this.getRevenue.AFAdRevenueData();
        }
    }
}
