package androidx.core.app;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: androidx.core.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1038g {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z3) {
        builder.setAllowSystemGeneratedContextualActions(z3);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
