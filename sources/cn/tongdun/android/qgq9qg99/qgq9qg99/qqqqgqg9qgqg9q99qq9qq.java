package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.net.wifi.WifiManager;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qqqqgqg9qgqg9q99qq9qq implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ WifiManager f19224q999ggg99999qqggqqg9qg;

    public qqqqgqg9qgqg9q99qq9qq(WifiManager wifiManager) {
        this.f19224q999ggg99999qqggqqg9qg = wifiManager;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.f19224q999ggg99999qqggqqg9qg.isWifiEnabled());
    }
}
