package Ng;

import Pg.AbstractC0555b;
import Pg.r;
import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pg.k f6394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Closeable f6396e;

    public a(boolean z3, int i7) {
        this.f6392a = i7;
        switch (i7) {
            case 1:
                this.f6393b = z3;
                Pg.k source = new Pg.k();
                this.f6394c = source;
                Inflater inflater = new Inflater(true);
                this.f6395d = inflater;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                this.f6396e = new r(AbstractC0555b.c(source), inflater);
                break;
            default:
                this.f6393b = z3;
                Pg.k kVar = new Pg.k();
                this.f6394c = kVar;
                Deflater deflater = new Deflater(-1, true);
                this.f6395d = deflater;
                this.f6396e = new Ig.h(kVar, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f6392a) {
            case 0:
                ((Ig.h) this.f6396e).close();
                break;
            default:
                ((r) this.f6396e).close();
                break;
        }
    }
}
