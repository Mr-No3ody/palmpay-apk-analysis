package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.telephony.TelephonyManager;
import cn.tongdun.android.shell.inter.InvokeHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class g9ggqqgggg9999q99qgqg9 implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19127q999ggg99999qqggqqg9qg;

    public g9ggqqgggg9999q99qgqg9(TelephonyManager telephonyManager) {
        this.f19127q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        return Integer.valueOf(this.f19127q999ggg99999qqggqqg9qg.getPhoneCount());
    }
}
