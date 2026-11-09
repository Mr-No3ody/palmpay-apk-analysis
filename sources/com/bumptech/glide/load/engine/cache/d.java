package com.bumptech.glide.load.engine.cache;

import Ab.r;
import android.util.Log;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DiskCache {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f20623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20624c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p318v1.c f20626e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.model.b f20625d = new androidx.work.impl.model.b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p039cb.c f20622a = new p039cb.c(2);

    public d(File file, long j6) {
        this.f20623b = file;
        this.f20624c = j6;
    }

    public final synchronized p318v1.c a() {
        try {
            if (this.f20626e == null) {
                this.f20626e = p318v1.c.h(this.f20623b, this.f20624c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20626e;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final synchronized void clear() {
        try {
            p318v1.c cVarA = a();
            cVarA.close();
            p318v1.f.a(cVarA.f43045a);
            synchronized (this) {
                this.f20626e = null;
            }
        } catch (IOException unused) {
            synchronized (this) {
                this.f20626e = null;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f20626e = null;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final void delete(Key key) {
        try {
            a().m(this.f20622a.b(key));
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final File get(Key key) {
        String strB = this.f20622a.b(key);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(key);
        }
        try {
            r rVarF = a().f(strB);
            if (rVarF != null) {
                return ((File[]) rVarF.f139b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache
    public final void put(Key key, DiskCache.Writer writer) {
        b bVar;
        String strB = this.f20622a.b(key);
        androidx.work.impl.model.b bVar2 = this.f20625d;
        synchronized (bVar2) {
            bVar = (b) ((HashMap) bVar2.f18580b).get(strB);
            if (bVar == null) {
                h hVar = (h) bVar2.f18581c;
                synchronized (((ArrayDeque) hVar.f20634b)) {
                    bVar = (b) ((ArrayDeque) hVar.f20634b).poll();
                }
                if (bVar == null) {
                    bVar = new b();
                }
                ((HashMap) bVar2.f18580b).put(strB, bVar);
            }
            bVar.f20619b++;
        }
        bVar.f20618a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(key);
            }
            try {
                p318v1.c cVarA = a();
                if (cVarA.f(strB) != null) {
                    this.f20625d.i(strB);
                    return;
                }
                Eg.g gVarD = cVarA.d(strB);
                if (gVarD == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strB));
                }
                try {
                    if (writer.write(gVarD.e())) {
                        p318v1.c.a((p318v1.c) gVarD.f2444e, gVarD, true);
                        gVarD.f2441b = true;
                    }
                    if (!gVarD.f2441b) {
                        gVarD.a();
                    }
                    this.f20625d.i(strB);
                } catch (Throwable th) {
                    if (!gVarD.f2441b) {
                        try {
                            gVarD.a();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            this.f20625d.i(strB);
            throw th2;
        }
    }
}
