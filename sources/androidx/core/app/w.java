package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    @RequiresApi(23)
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigLargeIcon(icon);
    }
}
