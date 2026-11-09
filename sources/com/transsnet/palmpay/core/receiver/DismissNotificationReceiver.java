package com.transsnet.palmpay.core.receiver;

import C0.G;
import F6.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/receiver/DismissNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DismissNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        d.h("DismissReceiver", 3, G.o("onReceive: ", intent.getAction()));
        int intExtra = intent.getIntExtra("extra_id", -1);
        if (!"com.transsnet.palmpay.action.notification.dismiss".equals(intent.getAction()) || intExtra <= 0) {
            return;
        }
        M m7 = new M(context.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
        m7.a(intExtra);
        a.V(System.currentTimeMillis(), "key_last_close_utility_notification");
    }
}
