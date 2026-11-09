package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f16001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f16002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f16006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f16007g;

    public v(int i7, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = i7 != 0 ? IconCompat.b(null, "", i7) : null;
        Bundle bundle = new Bundle();
        this.f16004d = true;
        this.f16002b = iconCompatB;
        if (iconCompatB != null && iconCompatB.e() == 2) {
            this.f16005e = iconCompatB.c();
        }
        this.f16006f = B.b(str);
        this.f16007g = pendingIntent;
        this.f16001a = bundle;
        this.f16003c = true;
        this.f16004d = true;
    }

    public final IconCompat a() {
        int i7;
        if (this.f16002b == null && (i7 = this.f16005e) != 0) {
            this.f16002b = IconCompat.b(null, "", i7);
        }
        return this.f16002b;
    }
}
