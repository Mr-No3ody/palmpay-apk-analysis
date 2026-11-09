package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class qgqq999g implements Runnable {
    private /* synthetic */ qqggggg9g9q99q9gq.InterfaceC0011qqggggg9g9q99q9gq gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ Context f19100q999ggg99999qqggqqg9qg;
    private /* synthetic */ String qgq9qg99;
    private /* synthetic */ gqgg9q99qg9 qgqq999g;
    private /* synthetic */ String qqggggg9g9q99q9gq;

    public qgqq999g(gqgg9q99qg9 gqgg9q99qg9Var, Context context, String str, String str2, qqggggg9g9q99q9gq.InterfaceC0011qqggggg9g9q99q9gq interfaceC0011qqggggg9g9q99q9gq) {
        this.qgqq999g = gqgg9q99qg9Var;
        this.f19100q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = str;
        this.qqggggg9g9q99q9gq = str2;
        this.gqgg9q99qg9 = interfaceC0011qqggggg9g9q99q9gq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.qgqq999g.q999ggg99999qqggqqg9qg(this.f19100q999ggg99999qqggqqg9qg, this.qgq9qg99, this.qqggggg9g9q99q9gq);
        } catch (Throwable unused) {
        }
    }
}
