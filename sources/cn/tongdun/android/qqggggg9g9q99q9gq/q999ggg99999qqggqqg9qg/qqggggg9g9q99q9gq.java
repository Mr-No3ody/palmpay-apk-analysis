package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class qqggggg9g9q99q9gq implements ServiceConnection {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    final /* synthetic */ qgq9qg99 f19246q999ggg99999qqggqqg9qg;

    public qqggggg9g9q99q9gq(qgq9qg99 qgq9qg99Var) {
        this.f19246q999ggg99999qqggqqg9qg = qgq9qg99Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qgq9qg99.q999ggg99999qqggqqg9qg(this.f19246q999ggg99999qqggqqg9qg, new gqgg9q99qg9(this, componentName, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
