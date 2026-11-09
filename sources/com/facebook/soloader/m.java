package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f21898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21899f;

    public m(Context context, String str, File file) {
        super(context, str, true);
        this.f21898e = file;
        this.f21899f = "^lib/([^/]+)/([^/]+\\.so)$";
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final String b() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.D
    public final C h() {
        return new l(this, this);
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.x
    public final String toString() {
        File file = this.f21898e;
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getName();
        }
    }
}
