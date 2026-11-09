package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, String str2, int i7) {
        super(str, str2, 2);
        this.f18307e = i7;
    }

    @Override // androidx.webkit.internal.c
    public final boolean b() {
        PackageInfo packageInfoA;
        switch (this.f18307e) {
            case 0:
                if (super.b() && (packageInfoA = androidx.webkit.j.a()) != null) {
                    return (Build.VERSION.SDK_INT >= 28 ? X.a.d(packageInfoA) : (long) packageInfoA.versionCode) >= 636700000;
                }
                return false;
            case 1:
                if (!super.b() || !androidx.webkit.k.a("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap = androidx.webkit.j.f18330a;
                if (o.f18310c.b()) {
                    return q.f18327a.getStatics().isMultiProcessEnabled();
                }
                throw o.a();
            default:
                if (androidx.webkit.k.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
