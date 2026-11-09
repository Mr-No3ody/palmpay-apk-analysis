package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi31.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi31.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi31\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class AFi1qSDK extends AFi1sSDK {

    @Nullable
    private Network AFAdRevenueData;

    @NotNull
    private String getMonetizationNetwork;

    public static final class AFa1vSDK extends ConnectivityManager.NetworkCallback {
        public AFa1vSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1qSDK.this.AFAdRevenueData = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1qSDK.this.AFAdRevenueData = network;
            AFi1qSDK.this.getMonetizationNetwork = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1qSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getMonetizationNetwork = "unknown";
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        try {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1vSDK);
            }
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    @NotNull
    public final String getCurrencyIso4217Code() {
        Network network = this.AFAdRevenueData;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    public final boolean getMediationNetwork() {
        Network network = this.AFAdRevenueData;
        if (network == null) {
            return false;
        }
        if (Intrinsics.c(this.getMonetizationNetwork, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return y_(networkCapabilities);
        }
        return false;
    }
}
