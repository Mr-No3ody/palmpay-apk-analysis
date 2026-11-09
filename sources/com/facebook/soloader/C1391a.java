package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1391a extends x implements RecoverableSoSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f21869b;

    public C1391a(Context context, int i7) {
        this.f21868a = i7;
        this.f21869b = new e(new File(context.getApplicationInfo().nativeLibraryDir), i7);
    }

    @Override // com.facebook.soloader.x
    public final String a(String str) {
        return this.f21869b.a(str);
    }

    @Override // com.facebook.soloader.x
    public final String b() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.x
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return this.f21869b.c(str, i7, threadPolicy);
    }

    @Override // com.facebook.soloader.x
    public final void d(int i7) {
        this.f21869b.getClass();
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public final x recover(Context context) {
        this.f21869b = new e(new File(context.getApplicationInfo().nativeLibraryDir), this.f21868a | 1);
        return this;
    }

    @Override // com.facebook.soloader.x
    public final String toString() {
        return "ApplicationSoSource[" + this.f21869b.toString() + "]";
    }
}
