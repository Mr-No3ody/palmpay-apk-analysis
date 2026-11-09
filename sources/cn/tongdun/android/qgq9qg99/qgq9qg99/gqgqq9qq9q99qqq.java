package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class gqgqq9qq9q99qqq implements g999q9gg.q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19159q999ggg99999qqggqqg9qg;

    public gqgqq9qq9q99qqq(TelephonyManager telephonyManager) {
        this.f19159q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.g999q9gg.q999ggg99999qqggqqg9qg
    public final Object q999ggg99999qqggqqg9qg() {
        return Integer.valueOf(this.f19159q999ggg99999qqggqqg9qg.getPhoneType());
    }
}
