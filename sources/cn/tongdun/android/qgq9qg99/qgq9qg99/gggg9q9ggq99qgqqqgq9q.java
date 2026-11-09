package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class gggg9q9ggq99qgqqqgq9q implements cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq {
    private final TelephonyManager gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final Context f19140q999ggg99999qqggqqg9qg;
    private final WifiManager qgq9qg99;
    private final ConnectivityManager qqggggg9g9q99q9gq;

    private gggg9q9ggq99qgqqqgq9q(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        this.f19140q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = wifiManager;
        this.qqggggg9g9q99q9gq = connectivityManager;
        this.gqgg9q99qg9 = telephonyManager;
    }

    public static gggg9q9ggq99qgqqqgq9q q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return new gggg9q9ggq99qgqqqgq9q(context, wifiManager, connectivityManager, telephonyManager);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() {
        return gq9qqgq9q9.q999ggg99999qqggqqg9qg(this.f19140q999ggg99999qqggqqg9qg, this.qgq9qg99, this.qqggggg9g9q99q9gq, this.gqgg9q99qg9);
    }
}
