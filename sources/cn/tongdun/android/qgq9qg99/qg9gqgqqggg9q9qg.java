package cn.tongdun.android.qgq9qg99;

import android.content.Context;
import android.text.TextUtils;
import cn.tongdun.android.shell.inter.FMCallback;

/* JADX INFO: loaded from: classes.dex */
final class qg9gqgqqggg9q9qg implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ FMCallback f19101q999ggg99999qqggqqg9qg;
    private /* synthetic */ Context qgq9qg99;
    private /* synthetic */ q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public qg9gqgqqggg9q9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, FMCallback fMCallback, Context context) {
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.f19101q999ggg99999qqggqqg9qg = fMCallback;
        this.qgq9qg99 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(true);
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.f19101q999ggg99999qqggqqg9qg);
        if (!q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq || !this.qqggggg9g9q99q9gq.qggqgq99q999g || this.qgq9qg99 == null) {
            this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(this.qgq9qg99));
        } else {
            if (q999ggg99999qqggqqg9qg.gqgg9q99qg9) {
                q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.qqggggg9g9q99q9gq, this.qgq9qg99, this.f19101q999ggg99999qqggqqg9qg);
                return;
            }
            String strGqgg9q99qg9 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.gqgg9q99qg9(this.qgq9qg99);
            if (TextUtils.isEmpty(strGqgg9q99qg9)) {
                strGqgg9q99qg9 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(this.qgq9qg99);
            }
            this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(strGqgg9q99qg9);
        }
    }
}
