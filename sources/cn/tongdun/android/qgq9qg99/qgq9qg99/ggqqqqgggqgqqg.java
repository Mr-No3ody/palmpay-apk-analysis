package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
final class ggqqqqgggqgqqg implements cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private Context f19148q999ggg99999qqggqqg9qg;
    private WifiManager qgq9qg99;
    private ConnectivityManager qqggggg9g9q99q9gq;

    private ggqqqqgggqgqqg(Context context, ConnectivityManager connectivityManager, WifiManager wifiManager) {
        this.f19148q999ggg99999qqggqqg9qg = context;
        this.qqggggg9g9q99q9gq = connectivityManager;
        this.qgq9qg99 = wifiManager;
    }

    public static ggqqqqgggqgqqg q999ggg99999qqggqqg9qg(Context context, ConnectivityManager connectivityManager, WifiManager wifiManager) {
        return new ggqqqqgggqgqqg(context, connectivityManager, wifiManager);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() {
        return gq9qqgq9q9.q999ggg99999qqggqqg9qg(this.f19148q999ggg99999qqggqqg9qg, this.qqggggg9g9q99q9gq, this.qgq9qg99);
    }
}
