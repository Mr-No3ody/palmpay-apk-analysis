package p101gd;

import C0.G;
import F6.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.transsnet.palmpay.task.PeriodNotificationWakeUpWorker;
import kotlin.jvm.internal.Intrinsics;
import p115ha.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        d.h("LocalNotification", 3, G.o("onReceive: ", intent.getAction()));
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1454123155) {
                if (iHashCode != 823795052) {
                    if (iHashCode != 833559602 || !action.equals("android.intent.action.USER_UNLOCKED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.USER_PRESENT")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            if (b.f37362a.f37363a > 0) {
                d.h("LocalNotification", 3, "onReceive: app in foreground, skip");
                return;
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            try {
                PeriodNotificationWakeUpWorker.f34131g.showPeriodLocalNotification(false);
            } finally {
                pendingResultGoAsync.finish();
            }
        }
    }
}
