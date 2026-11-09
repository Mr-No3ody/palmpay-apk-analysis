package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f18306d;

    public m() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f18306d = Pattern.compile("\\A\\d+");
    }

    @Override // androidx.webkit.internal.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // androidx.webkit.internal.c
    public final boolean b() {
        boolean zB = super.b();
        if (!zB || Build.VERSION.SDK_INT >= 29) {
            return zB;
        }
        PackageInfo packageInfoA = androidx.webkit.j.a();
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f18306d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
