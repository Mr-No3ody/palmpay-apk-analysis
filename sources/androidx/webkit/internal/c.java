package androidx.webkit.internal;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ConditionallySupportedFeature {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f18293c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18295b;

    public c(String str, String str2) {
        this.f18294a = str;
        this.f18295b = str2;
        f18293c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f18291a;
        String str = this.f18295b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String getPublicFeatureName() {
        return this.f18294a;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean isSupported() {
        return a() || b();
    }
}
