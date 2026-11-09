package com.facebook.soloader;

import android.os.StrictMode;
import androidx.camera.camera2.internal.F;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

/* JADX INFO: renamed from: com.facebook.soloader.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1394d extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U9.c f21875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashSet f21876b;

    @Override // com.facebook.soloader.x
    public final String a(String str) {
        HashSet hashSet = this.f21876b;
        if (hashSet == null || this.f21875a == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!hashSet.contains(str)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SoLoader.f21856d.getApplicationInfo().sourceDir);
        sb2.append("!/lib/");
        return F.d(sb2, this.f21875a.f9292a, "/", str);
    }

    @Override // com.facebook.soloader.x
    public final String b() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.x
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        HashSet hashSet = this.f21876b;
        if (hashSet == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!hashSet.contains(str)) {
            return 0;
        }
        String strA = a(str);
        strA.getClass();
        System.load(strA);
        return 1;
    }

    @Override // com.facebook.soloader.x
    public final void d(int i7) throws IOException {
        InputStream inputStreamOpen = SoLoader.f21856d.getAssets().open("base.soloader-manifest");
        try {
            this.f21875a = U9.c.a(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f21876b = new HashSet(this.f21875a.f9293b);
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
