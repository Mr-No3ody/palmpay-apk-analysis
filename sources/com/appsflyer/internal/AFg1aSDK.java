package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1aSDK extends AFg1gSDK {

    @NotNull
    private final AFd1zSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;

    public AFg1aSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
        this.getMonetizationNetwork = true;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z3) {
            this.getMediationNetwork.copy().getRevenue("D", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z3, boolean z8, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z11) {
            this.getMediationNetwork.copy().getRevenue("E", getMonetizationNetwork(str, aFg1cSDK));
        }
        if (z11) {
            this.getMediationNetwork.copy().getCurrencyIso4217Code(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork.copy().getRevenue("F", getMonetizationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z3) {
            this.getMediationNetwork.copy().getRevenue("I", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z3) {
            this.getMediationNetwork.copy().getRevenue("V", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z3) {
            this.getMediationNetwork.copy().getRevenue("W", getMonetizationNetwork(str, aFg1cSDK));
        }
    }
}
