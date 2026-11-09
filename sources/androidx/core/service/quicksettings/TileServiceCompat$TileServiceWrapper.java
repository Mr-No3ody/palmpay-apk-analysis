package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
interface TileServiceCompat$TileServiceWrapper {
    void startActivityAndCollapse(PendingIntent pendingIntent);

    void startActivityAndCollapse(Intent intent);
}
