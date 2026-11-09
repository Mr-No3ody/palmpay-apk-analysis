package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.net.ConnectivityManager;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class q9g9qqqq9 implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ ConnectivityManager f19174q999ggg99999qqggqqg9qg;

    public q9g9qqqq9(ConnectivityManager connectivityManager) {
        this.f19174q999ggg99999qqggqqg9qg = connectivityManager;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return this.f19174q999ggg99999qqggqqg9qg.getActiveNetworkInfo();
    }
}
