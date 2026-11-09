package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class Storage {
    private static final Lock zaa = new ReentrantLock();

    @Nullable
    private static Storage zab;
    private final Lock zac = new ReentrantLock();
    private final SharedPreferences zad;

    @VisibleForTesting
    public Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        zaa.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            return zab;
        } finally {
            zaa.unlock();
        }
    }

    private static final String zae(String str, String str2) {
        return F.d(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strZab;
        String strZab2 = zab("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZab2) && (strZab = zab(zae("googleSignInAccount", strZab2))) != null) {
            try {
                return GoogleSignInAccount.zaa(strZab);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strZab;
        String strZab2 = zab("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strZab2) && (strZab = zab(zae("googleSignInOptions", strZab2))) != null) {
            try {
                return GoogleSignInOptions.zaa(strZab);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return zab("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zaa("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        zaa(zae("googleSignInAccount", strZac), googleSignInAccount.zad());
        zaa(zae("googleSignInOptions", strZac), googleSignInOptions.zab());
    }

    public final void zaa(@NonNull String str, @NonNull String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }

    @Nullable
    public final String zab(@NonNull String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String strZab = zab("defaultGoogleSignInAccount");
        zad("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strZab)) {
            return;
        }
        zad(zae("googleSignInAccount", strZab));
        zad(zae("googleSignInOptions", strZab));
    }

    public final void zad(@NonNull String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
