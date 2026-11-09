package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1hSDK {
    public final int AFAdRevenueData;

    @NotNull
    public final String getMonetizationNetwork;

    public AFb1hSDK(int i7, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i7;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1hSDK)) {
            return false;
        }
        AFb1hSDK aFb1hSDK = (AFb1hSDK) obj;
        return this.AFAdRevenueData == aFb1hSDK.AFAdRevenueData && Intrinsics.c(this.getMonetizationNetwork, aFb1hSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + (Integer.hashCode(this.AFAdRevenueData) * 31);
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.AFAdRevenueData + ", id=" + this.getMonetizationNetwork + ")";
    }
}
