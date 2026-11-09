package com.bumptech.glide.manager;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile n f21059d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f21060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f21061b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21062c;

    public n(Context context) {
        this.f21060a = new m(new J1.h(new p183m6.j(context, 14)), new k(this));
    }

    public static n a(Context context) {
        if (f21059d == null) {
            synchronized (n.class) {
                try {
                    if (f21059d == null) {
                        f21059d = new n(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21059d;
    }
}
