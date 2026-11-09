package com.appsflyer.internal;

import N8.q0;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1aSDK {

    @JvmField
    public final long AFAdRevenueData;

    @JvmField
    public final boolean getCurrencyIso4217Code;

    @JvmField
    @NotNull
    public final String getRevenue;

    public AFf1aSDK(@NotNull String str, long j6, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.AFAdRevenueData = j6;
        this.getCurrencyIso4217Code = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.c(this.getRevenue, aFf1aSDK.getRevenue) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getCurrencyIso4217Code == aFf1aSDK.getCurrencyIso4217Code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iB = q0.b(this.getRevenue.hashCode() * 31, 31, this.AFAdRevenueData);
        boolean z3 = this.getCurrencyIso4217Code;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        return iB + r3;
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.AFAdRevenueData + ", isQueued=" + this.getCurrencyIso4217Code + ")";
    }
}
