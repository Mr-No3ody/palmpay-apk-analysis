package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public abstract class qgq9qg99 extends q999ggg99999qqggqqg9qg {
    private ThreadPoolExecutor gqgg9q99qg9;
    private ServiceConnection qqggggg9g9q99q9gq;

    public qgq9qg99(Context context, qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVar) {
        super(context, qg9gqgqqggg9q9qgVar);
        this.gqgg9q99qg9 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qggqgq99q999g() {
        qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVar = this.qgq9qg99;
        if (qg9gqgqqggg9q9qgVar != null) {
            qg9gqgqqggg9q9qgVar.q999ggg99999qqggqqg9qg(this);
        }
    }

    public abstract void q999ggg99999qqggqqg9qg(IBinder iBinder);

    public abstract Intent qqggggg9g9q99q9gq();

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final void q999ggg99999qqggqqg9qg(ThreadPoolExecutor threadPoolExecutor) {
        this.gqgg9q99qg9 = threadPoolExecutor;
        try {
            Intent intentQqggggg9g9q99q9gq = qqggggg9g9q99q9gq();
            qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar = new qqggggg9g9q99q9gq(this);
            this.qqggggg9g9q99q9gq = qqggggg9g9q99q9gqVar;
            if (this.f19241q999ggg99999qqggqqg9qg.bindService(intentQqggggg9g9q99q9gq, qqggggg9g9q99q9gqVar, 1)) {
                return;
            }
            qggqgq99q999g();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(qgq9qg99 qgq9qg99Var, gqgg9q99qg9 gqgg9q99qg9Var) {
        if (qgq9qg99Var.gqgg9q99qg9 == null) {
            qgq9qg99Var.gqgg9q99qg9 = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors());
        }
        qgq9qg99Var.gqgg9q99qg9.submit(gqgg9q99qg9Var);
    }
}
