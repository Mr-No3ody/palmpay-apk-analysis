package com.appsflyer.internal;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1cSDK {

    @NotNull
    final String AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFf1cSDK(int i7, int i10, int i11, int i12, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = i7;
        this.getMediationNetwork = i10;
        this.getCurrencyIso4217Code = i11;
        this.getMonetizationNetwork = i12;
        this.AFAdRevenueData = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1cSDK)) {
            return false;
        }
        AFf1cSDK aFf1cSDK = (AFf1cSDK) obj;
        return this.getRevenue == aFf1cSDK.getRevenue && this.getMediationNetwork == aFf1cSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFf1cSDK.getCurrencyIso4217Code && this.getMonetizationNetwork == aFf1cSDK.getMonetizationNetwork && Intrinsics.c(this.AFAdRevenueData, aFf1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode() + u.b(this.getMonetizationNetwork, u.b(this.getCurrencyIso4217Code, u.b(this.getMediationNetwork, Integer.hashCode(this.getRevenue) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.getRevenue;
        int i10 = this.getMediationNetwork;
        int i11 = this.getCurrencyIso4217Code;
        int i12 = this.getMonetizationNetwork;
        String str = this.AFAdRevenueData;
        StringBuilder sbP = q0.p(i7, "CmpTcfData(policyVersion=", i10, ", gdprApplies=", ", cmpSdkId=");
        u.u(sbP, i11, ", cmpSdkVersion=", i12, ", tcString=");
        return G.r(sbP, str, ")");
    }
}
