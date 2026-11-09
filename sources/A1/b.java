package A1;

import android.app.NotificationChannel;
import com.luck.picture.lib.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("channel_1", "Message", 4);
    }

    public static /* synthetic */ NotificationChannel c(int i7, String str) {
        return new NotificationChannel(str, BuildConfig.LIBRARY_PACKAGE_NAME, i7);
    }

    public static /* synthetic */ void j() {
    }
}
