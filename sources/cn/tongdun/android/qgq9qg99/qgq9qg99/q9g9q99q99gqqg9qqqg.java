package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class q9g9q99q99gqqg9qqqg implements g999q9gg.q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19173q999ggg99999qqggqqg9qg;

    public q9g9q99q99gqqg9qqqg(TelephonyManager telephonyManager) {
        this.f19173q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.g999q9gg.q999ggg99999qqggqqg9qg
    public final /* synthetic */ Object q999ggg99999qqggqqg9qg() {
        return Integer.valueOf(this.f19173q999ggg99999qqggqqg9qg.getPhoneType());
    }
}
