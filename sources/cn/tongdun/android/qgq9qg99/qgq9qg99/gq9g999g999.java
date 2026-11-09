package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.net.wifi.WifiInfo;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: loaded from: classes.dex */
final class gq9g999g999 implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ WifiInfo f19149q999ggg99999qqggqqg9qg;

    public gq9g999g999(WifiInfo wifiInfo) {
        this.f19149q999ggg99999qqggqqg9qg = wifiInfo;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return this.f19149q999ggg99999qqggqqg9qg.getSSID();
    }
}
