package com.dylanvann.fastimage;

import Pg.AbstractC0555b;
import Pg.x;
import okhttp3.L;
import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f21167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FastImageOkHttpProgressGlideModule.ResponseProgressListener f21168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f21169d;

    public d(String str, h0 h0Var, FastImageOkHttpProgressGlideModule.ResponseProgressListener responseProgressListener) {
        this.f21166a = str;
        this.f21167b = h0Var;
        this.f21168c = responseProgressListener;
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        return this.f21167b.contentLength();
    }

    @Override // okhttp3.h0
    public final L contentType() {
        return this.f21167b.contentType();
    }

    @Override // okhttp3.h0
    public final BufferedSource source() {
        if (this.f21169d == null) {
            this.f21169d = AbstractC0555b.c(new c(this, this.f21167b.source()));
        }
        return this.f21169d;
    }
}
