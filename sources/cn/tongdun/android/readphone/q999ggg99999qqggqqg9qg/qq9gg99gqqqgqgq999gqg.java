package cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class qq9gg99gqqqgqgq999gqg implements q999ggg99999qqggqqg9qg.InterfaceC0014q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ TelephonyManager f19262q999ggg99999qqggqqg9qg;

    public qq9gg99gqqqgqgq999gqg(TelephonyManager telephonyManager) {
        this.f19262q999ggg99999qqggqqg9qg = telephonyManager;
    }

    @Override // cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.InterfaceC0014q999ggg99999qqggqqg9qg
    public final Object q999ggg99999qqggqqg9qg() {
        int networkType;
        try {
            networkType = this.f19262q999ggg99999qqggqqg9qg.getNetworkType();
        } catch (Throwable unused) {
            networkType = 0;
        }
        return Integer.valueOf(networkType);
    }
}
