package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.net.wifi.WifiManager;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class ggq9qqq implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ WifiManager f19146q999ggg99999qqggqqg9qg;

    public ggq9qqq(WifiManager wifiManager) {
        this.f19146q999ggg99999qqggqqg9qg = wifiManager;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return this.f19146q999ggg99999qqggqqg9qg.getConnectionInfo();
    }
}
