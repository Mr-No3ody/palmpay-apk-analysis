package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    @Nullable
    public static KeyguardManager a(@NonNull Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(@NonNull KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
