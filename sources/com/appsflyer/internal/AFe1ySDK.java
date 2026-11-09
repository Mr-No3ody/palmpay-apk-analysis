package com.appsflyer.internal;

import C0.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1ySDK {

    @NotNull
    final String AFAdRevenueData;

    @NotNull
    final String getCurrencyIso4217Code;

    public AFe1ySDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1ySDK)) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
        return Intrinsics.c(this.AFAdRevenueData, aFe1ySDK.AFAdRevenueData) && Intrinsics.c(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.AFAdRevenueData.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return G.q("HostConfig(prefix=", this.AFAdRevenueData, ", host=", this.getCurrencyIso4217Code, ")");
    }
}
