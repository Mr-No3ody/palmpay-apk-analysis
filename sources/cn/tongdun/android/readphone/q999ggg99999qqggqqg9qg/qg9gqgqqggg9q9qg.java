package cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class qg9gqgqqggg9q9qg implements q999ggg99999qqggqqg9qg.InterfaceC0014q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19258q999ggg99999qqggqqg9qg;

    public qg9gqgqqggg9q9qg(TelephonyManager telephonyManager) {
        this.f19258q999ggg99999qqggqqg9qg = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.InterfaceC0014q999ggg99999qqggqqg9qg
    /* JADX INFO: renamed from: qgq9qg99, reason: merged with bridge method [inline-methods] */
    public Integer q999ggg99999qqggqqg9qg() {
        int networkType;
        try {
            networkType = this.f19258q999ggg99999qqggqqg9qg.getNetworkType();
        } catch (Throwable unused) {
            networkType = 0;
        }
        return Integer.valueOf(networkType);
    }
}
