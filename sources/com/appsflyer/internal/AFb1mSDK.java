package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/appsflyer/internal/AFb1mSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1qSDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;", "p1", "", "getMediationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1qSDK;)V", "AFAdRevenueData", "Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1mSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    private static String getRevenue;

    @NotNull
    public static final AFb1mSDK INSTANCE = new AFb1mSDK();

    private AFb1mSDK() {
    }

    @JvmStatic
    public static final synchronized void getMediationNetwork(@NotNull String p3, @NotNull AFc1qSDK p10) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p10, "");
        getRevenue = p3;
        p10.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
        p10.getMonetizationNetwork("AF_INSTALLATION", p3);
    }

    @JvmStatic
    @NotNull
    public static final synchronized String getMonetizationNetwork(@NotNull AFc1qSDK p3) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(p3, "");
            if (getRevenue == null) {
                String currencyIso4217Code = p3.getCurrencyIso4217Code("AF_INSTALLATION", (String) null);
                if (currencyIso4217Code == null) {
                    currencyIso4217Code = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    p3.getMonetizationNetwork("AF_INSTALLATION", currencyIso4217Code);
                }
                getRevenue = currencyIso4217Code;
            }
            str = getRevenue;
            Intrinsics.e(str);
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
