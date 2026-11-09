package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.net.wifi.WifiManager;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class qgqgq9qq9ggggg9g implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ WifiManager f19199q999ggg99999qqggqqg9qg;

    public qgqgq9qq9ggggg9g(WifiManager wifiManager) {
        this.f19199q999ggg99999qqggqqg9qg = wifiManager;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return this.f19199q999ggg99999qqggqqg9qg.getDhcpInfo();
    }
}
