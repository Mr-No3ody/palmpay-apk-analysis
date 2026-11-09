package cn.tongdun.android.qgq9qg99;

import cn.tongdun.android.shell.inter.FMCallback;

/* JADX INFO: loaded from: classes.dex */
final class gqgg9q99qg9 implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ FMCallback f19085q999ggg99999qqggqqg9qg;
    private /* synthetic */ String qgq9qg99;
    private /* synthetic */ q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public gqgg9q99qg9(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, FMCallback fMCallback, String str) {
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.f19085q999ggg99999qqggqqg9qg = fMCallback;
        this.qgq9qg99 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19085q999ggg99999qqggqqg9qg.onEvent(this.qgq9qg99);
    }
}
