package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f20948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f20949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f20950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile u f20951h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20954c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f20955d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20952a = 20000;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f20948e = i7 < 29;
        f20949f = i7 >= 28;
        f20950g = new File("/proc/self/fd");
    }

    public static u a() {
        if (f20951h == null) {
            synchronized (u.class) {
                try {
                    if (f20951h == null) {
                        f20951h = new u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20951h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f20952a;
    }

    public final boolean c(int i7, int i10, boolean z3, boolean z8) {
        boolean z10;
        if (z3 && f20949f && ((!f20948e || this.f20955d.get()) && !z8 && i7 >= 0 && i10 >= 0)) {
            synchronized (this) {
                try {
                    int i11 = this.f20953b + 1;
                    this.f20953b = i11;
                    if (i11 >= 50) {
                        this.f20953b = 0;
                        this.f20954c = ((long) f20950g.list().length) < ((long) b());
                    }
                    z10 = this.f20954c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
