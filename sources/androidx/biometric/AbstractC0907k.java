package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.biometric.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0907k {
    @Nullable
    public static Intent a(@NonNull KeyguardManager keyguardManager, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
