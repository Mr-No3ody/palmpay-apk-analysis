package com.google.android.gms.internal.measurement;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillManager;
import com.google.firebase.messaging.CommonNotificationBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean D(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }

    public static /* bridge */ /* synthetic */ AutofillManager e(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return AutofillManager.class;
    }
}
