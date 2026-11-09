package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
final class g9qg9g9qg9g9gq999 implements cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final Context f19131q999ggg99999qqggqqg9qg;
    private final TelephonyManager qgq9qg99;

    private g9qg9g9qg9g9gq999(Context context, TelephonyManager telephonyManager) {
        this.f19131q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = telephonyManager;
    }

    public static g9qg9g9qg9g9gq999 q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        return new g9qg9g9qg9g9gq999(context, telephonyManager);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() {
        return gq9qqgq9q9.q999ggg99999qqggqqg9qg(this.f19131q999ggg99999qqggqqg9qg, this.qgq9qg99);
    }
}
