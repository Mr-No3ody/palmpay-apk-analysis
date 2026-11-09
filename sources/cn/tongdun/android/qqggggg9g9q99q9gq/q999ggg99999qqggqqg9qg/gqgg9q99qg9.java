package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class gqgg9q99qg9 implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ ComponentName f19240q999ggg99999qqggqqg9qg;
    private /* synthetic */ IBinder qgq9qg99;
    private /* synthetic */ qqggggg9g9q99q9gq qqggggg9g9q99q9gq;

    public gqgg9q99qg9(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar, ComponentName componentName, IBinder iBinder) {
        this.qqggggg9g9q99q9gq = qqggggg9g9q99q9gqVar;
        this.f19240q999ggg99999qqggqqg9qg = componentName;
        this.qgq9qg99 = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.qqggggg9g9q99q9gq.f19246q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.qgq9qg99);
        } catch (Throwable unused) {
            qgq9qg99 qgq9qg99Var = this.qqggggg9g9q99q9gq.f19246q999ggg99999qqggqqg9qg;
            if (qgq9qg99Var.qgq9qg99 != null) {
                qgq9qg99Var.qggqgq99q999g();
            }
        }
    }
}
