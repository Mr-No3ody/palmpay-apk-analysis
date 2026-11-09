package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1eSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1ySDK {

    @NotNull
    public static final AFa1ySDK INSTANCE = new AFa1ySDK();

    private AFa1ySDK() {
    }

    @Nullable
    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    @JvmStatic
    public static final void getMonetizationNetwork(@NotNull AFc1eSDK p3, @NotNull AFc1pSDK p10) {
        int i7;
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p10, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1gSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i7 = 23;
        } else {
            i7 = 18;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < i7 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i10 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i10 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p3.getRevenue);
        if (aFKeystoreWrapper.getCurrencyIso4217Code()) {
            String monetizationNetwork = aFKeystoreWrapper.getMonetizationNetwork();
            synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                aFKeystoreWrapper.getMediationNetwork++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(monetizationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.AFAdRevenueData) {
                        aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(monetizationNetwork);
                    }
                } catch (KeyStoreException e10) {
                    StringBuilder sb2 = new StringBuilder("Exception ");
                    sb2.append(e10.getMessage());
                    sb2.append(" occurred");
                    AFLogger.afErrorLog(sb2.toString(), e10);
                }
            }
            aFKeystoreWrapper.getMediationNetwork(aFKeystoreWrapper.getMonetizationNetwork());
        } else {
            aFKeystoreWrapper.getRevenue = AFb1mSDK.getMonetizationNetwork(p10.AFAdRevenueData);
            aFKeystoreWrapper.getMediationNetwork = 0;
            aFKeystoreWrapper.getMediationNetwork(aFKeystoreWrapper.getMonetizationNetwork());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMediationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getRevenue()));
    }

    @Nullable
    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
