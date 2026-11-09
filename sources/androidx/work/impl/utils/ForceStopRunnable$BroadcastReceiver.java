package androidx.work.impl.utils;

import V0.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        C.d("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        C.c().getClass();
        d.b(context);
    }
}
