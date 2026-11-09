package com.rnmaps.maps;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1928h;
import okhttp3.C1929i;
import okhttp3.internal.cache.CacheRequest;
import okio.Sink;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements CacheRequest {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static M f24717f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24722e;

    public M() {
        this.f24720c = new LinkedList();
        this.f24718a = false;
        this.f24721d = new LinkedList();
        this.f24719b = new Handler(Looper.myLooper());
        this.f24722e = new androidx.customview.widget.e(this, 17);
    }

    public static M a() {
        if (f24717f == null) {
            synchronized (M.class) {
                f24717f = new M();
            }
        }
        return f24717f;
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public void abort() {
        synchronized (((C1929i) this.f24722e)) {
            if (this.f24718a) {
                return;
            }
            this.f24718a = true;
            Dg.c.c((Sink) this.f24720c);
            try {
                ((Eg.g) this.f24719b).a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public Sink body() {
        return (C1928h) this.f24721d;
    }

    public M(C1929i c1929i, Eg.g editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f24722e = c1929i;
        this.f24719b = editor;
        Sink sinkF = editor.f(1);
        this.f24720c = sinkF;
        this.f24721d = new C1928h(c1929i, this, sinkF);
    }
}
