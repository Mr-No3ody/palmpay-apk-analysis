package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class ggg9g9qg99 implements g999q9gg.q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19138q999ggg99999qqggqqg9qg;

    public ggg9g9qg99(TelephonyManager telephonyManager) {
        this.f19138q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.g999q9gg.q999ggg99999qqggqqg9qg
    public final /* synthetic */ Object q999ggg99999qqggqqg9qg() {
        return this.f19138q999ggg99999qqggqqg9qg.getNetworkOperatorName();
    }
}
