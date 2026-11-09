package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class qq9gg9g9 implements g999q9gg.q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19209q999ggg99999qqggqqg9qg;

    public qq9gg9g9(TelephonyManager telephonyManager) {
        this.f19209q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.g999q9gg.q999ggg99999qqggqqg9qg
    public final /* synthetic */ Object q999ggg99999qqggqqg9qg() {
        return this.f19209q999ggg99999qqggqqg9qg.getSimOperatorName();
    }
}
