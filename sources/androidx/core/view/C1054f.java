package androidx.core.view;

import android.content.ClipData;

/* JADX INFO: renamed from: androidx.core.view.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1054f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentInfoCompat$Compat f16217a;

    public C1054f(ContentInfoCompat$Compat contentInfoCompat$Compat) {
        this.f16217a = contentInfoCompat$Compat;
    }

    public final ClipData a() {
        return this.f16217a.getClip();
    }

    public final int b() {
        return this.f16217a.getFlags();
    }

    public final int c() {
        return this.f16217a.getSource();
    }

    public final String toString() {
        return this.f16217a.toString();
    }
}
