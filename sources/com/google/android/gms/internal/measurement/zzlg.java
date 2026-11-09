package com.google.android.gms.internal.measurement;

import M.f;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.camera.camera2.internal.F;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlg {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy("PhenotypeConstants.class")
    private static final f zzb = new f(0);

    public static synchronized Uri zza(String str) {
        f fVar = zzb;
        Uri uri = (Uri) fVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        fVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String zzb(Context context, String str, boolean z3) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
        }
        String packageName = context.getPackageName();
        return F.d(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
