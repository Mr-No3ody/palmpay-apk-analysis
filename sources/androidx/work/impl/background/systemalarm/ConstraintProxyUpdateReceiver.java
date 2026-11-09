package androidx.work.impl.background.systemalarm;

import Ce.H;
import V0.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.s;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18407a = 0;

    static {
        C.d("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            s.g(context).f18678e.executeOnTaskThread(new H(intent, 19, context, goAsync()));
        } else {
            C.c().getClass();
        }
    }
}
