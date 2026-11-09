package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p262r2.c {
    @Override // p262r2.c
    public final Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
