package cn.tongdun.android.qgq9qg99;

import cn.tongdun.android.shell.common.HelperJNI;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class q9q999qgg99gq9qq9qqq9g implements Runnable {
    private /* synthetic */ q999ggg99999qqggqqg9qg gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ String f19096q999ggg99999qqggqqg9qg;
    private /* synthetic */ int qgq9qg99;
    private /* synthetic */ String qqggggg9g9q99q9gq;

    public q9q999qgg99gq9qq9qqq9g(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, String str, int i7, String str2) {
        this.gqgg9q99qg9 = q999ggg99999qqggqqg9qgVar;
        this.f19096q999ggg99999qqggqqg9qg = str;
        this.qgq9qg99 = i7;
        this.qqggggg9g9q99q9gq = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HelperJNI.q999ggg99999qqggqqg9qg(67, new Object[]{this.f19096q999ggg99999qqggqqg9qg, Integer.valueOf(this.qgq9qg99), this.qqggggg9g9q99q9gq});
    }
}
