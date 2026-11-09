package androidx.biometric;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13097a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13098b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13099c = null;

    public v a() {
        if (TextUtils.isEmpty(this.f13097a)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (!com.palmpay.lib.apm.launchcounter.util.d.B(0)) {
            throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + String.valueOf(0));
        }
        if (TextUtils.isEmpty(this.f13099c)) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        TextUtils.isEmpty(this.f13099c);
        String str = this.f13097a;
        String str2 = this.f13098b;
        String str3 = this.f13099c;
        v vVar = new v();
        vVar.f13097a = str;
        vVar.f13098b = str2;
        vVar.f13099c = str3;
        return vVar;
    }
}
