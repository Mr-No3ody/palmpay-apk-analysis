package com.appsflyer.internal;

import N8.q0;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1oSDK {

    @Nullable
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1oSDK(long j6, long j10, @Nullable String str, @Nullable String str2) {
        this.getRevenue = j6;
        this.getCurrencyIso4217Code = j10;
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1oSDK)) {
            return false;
        }
        AFi1oSDK aFi1oSDK = (AFi1oSDK) obj;
        return this.getRevenue == aFi1oSDK.getRevenue && this.getCurrencyIso4217Code == aFi1oSDK.getCurrencyIso4217Code && Intrinsics.c(this.AFAdRevenueData, aFi1oSDK.AFAdRevenueData) && Intrinsics.c(this.getMonetizationNetwork, aFi1oSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        int iB = q0.b(Long.hashCode(this.getRevenue) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.AFAdRevenueData;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMonetizationNetwork;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j6 = this.getRevenue;
        long j10 = this.getCurrencyIso4217Code;
        String str = this.AFAdRevenueData;
        String str2 = this.getMonetizationNetwork;
        StringBuilder sbR = u.r(j6, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        sbR.append(j10);
        sbR.append(", piaToken=");
        sbR.append(str);
        return F.d(sbR, ", errorCode=", str2, ")");
    }
}
