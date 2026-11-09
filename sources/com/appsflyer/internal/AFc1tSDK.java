package com.appsflyer.internal;

import C0.G;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK {

    @NotNull
    final List<AFe1nSDK> getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NotNull
    final String getRevenue;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1tSDK(@NotNull String str, @NotNull List<? extends AFe1nSDK> list, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getRevenue = str;
        this.getCurrencyIso4217Code = list;
        this.getMediationNetwork = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1tSDK)) {
            return false;
        }
        AFc1tSDK aFc1tSDK = (AFc1tSDK) obj;
        return Intrinsics.c(this.getRevenue, aFc1tSDK.getRevenue) && Intrinsics.c(this.getCurrencyIso4217Code, aFc1tSDK.getCurrencyIso4217Code) && this.getMediationNetwork == aFc1tSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + ((this.getCurrencyIso4217Code.hashCode() + (this.getRevenue.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getRevenue;
        List<AFe1nSDK> list = this.getCurrencyIso4217Code;
        int i7 = this.getMediationNetwork;
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(str);
        sb2.append(", eventTypes=");
        sb2.append(list);
        sb2.append(", maxCapacity=");
        return G.n(i7, ")", sb2);
    }
}
