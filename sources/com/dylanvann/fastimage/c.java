package com.dylanvann.fastimage;

import Pg.k;
import Pg.o;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f21165b = dVar;
        this.f21164a = 0L;
    }

    @Override // Pg.o, okio.Source
    public final long read(k kVar, long j6) {
        long j10 = super.read(kVar, j6);
        d dVar = this.f21165b;
        long jContentLength = dVar.f21167b.contentLength();
        if (j10 == -1) {
            this.f21164a = jContentLength;
        } else {
            this.f21164a += j10;
        }
        dVar.f21168c.update(dVar.f21166a, this.f21164a, jContentLength);
        return j10;
    }
}
