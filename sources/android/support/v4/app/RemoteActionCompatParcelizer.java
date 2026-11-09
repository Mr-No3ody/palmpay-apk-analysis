package android.support.v4.app;

import S0.a;
import androidx.annotation.RestrictTo;
import androidx.core.app.RemoteActionCompat;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(aVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, aVar);
    }
}
