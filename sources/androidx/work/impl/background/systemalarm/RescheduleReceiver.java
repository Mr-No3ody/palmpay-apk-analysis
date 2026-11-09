package androidx.work.impl.background.systemalarm;

import V0.C;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.s;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18408a = C.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C c6 = C.c();
        Objects.toString(intent);
        c6.getClass();
        try {
            s sVarG = s.g(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            sVarG.getClass();
            synchronized (s.f18674n) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = sVarG.f18683j;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    sVarG.f18683j = pendingResultGoAsync;
                    if (sVarG.f18682i) {
                        pendingResultGoAsync.finish();
                        sVarG.f18683j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            C.c().b(f18408a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
