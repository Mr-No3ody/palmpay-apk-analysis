package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
final class q99g9q99 implements cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final WifiManager f19168q999ggg99999qqggqqg9qg;
    private final Context qgq9qg99;

    private q99g9q99(Context context, WifiManager wifiManager) {
        this.f19168q999ggg99999qqggqqg9qg = wifiManager;
        this.qgq9qg99 = context;
    }

    public static q99g9q99 q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager) {
        return new q99g9q99(context, wifiManager);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() {
        return gq9qqgq9q9.qqggggg9g9q99q9gq(this.qgq9qg99, this.f19168q999ggg99999qqggqqg9qg);
    }
}
