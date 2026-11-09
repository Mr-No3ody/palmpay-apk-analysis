package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class A implements DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f20564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f20565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f20566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f20567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile com.bumptech.glide.load.model.t f20568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile d f20569g;

    public A(f fVar, i iVar) {
        this.f20563a = fVar;
        this.f20564b = iVar;
    }

    public final boolean a(Object obj) throws Throwable {
        Throwable th;
        int i7 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        try {
            DataRewinder dataRewinderG = this.f20563a.f20647c.a().g(obj);
            Object objRewindAndGet = dataRewinderG.rewindAndGet();
            Encoder encoderD = this.f20563a.d(objRewindAndGet);
            e eVar = new e(encoderD, objRewindAndGet, this.f20563a.f20653i);
            Key key = this.f20568f.f20867a;
            f fVar = this.f20563a;
            d dVar = new d(key, fVar.f20658n);
            DiskCache diskCache = fVar.f20652h.getDiskCache();
            diskCache.put(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                dVar.toString();
                obj.toString();
                encoderD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (diskCache.get(dVar) != null) {
                this.f20569g = dVar;
                this.f20566d = new c(Collections.singletonList(this.f20568f.f20867a), this.f20563a, this);
                this.f20568f.f20869c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f20569g);
                obj.toString();
            }
            try {
                this.f20564b.onDataFetcherReady(this.f20568f.f20867a, dataRewinderG.rewindAndGet(), this.f20568f.f20869c, this.f20568f.f20869c.getDataSource(), this.f20568f.f20867a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z3 = true;
                if (z3) {
                    throw th;
                }
                this.f20568f.f20869c.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        com.bumptech.glide.load.model.t tVar = this.f20568f;
        if (tVar != null) {
            tVar.f20869c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, com.bumptech.glide.load.a aVar) {
        this.f20564b.onDataFetcherFailed(key, exc, dataFetcher, this.f20568f.f20869c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, com.bumptech.glide.load.a aVar, Key key2) {
        this.f20564b.onDataFetcherReady(key, obj, dataFetcher, this.f20568f.f20869c.getDataSource(), key);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void reschedule() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        boolean z3;
        if (this.f20567e == null) {
            if (this.f20566d != null) {
            }
            this.f20566d = null;
            this.f20568f = null;
            z3 = false;
            while (!z3) {
                ArrayList arrayListB = this.f20563a.b();
                int i7 = this.f20565c;
                this.f20565c = i7 + 1;
                this.f20568f = (com.bumptech.glide.load.model.t) arrayListB.get(i7);
                if (this.f20568f == null) {
                }
            }
            return z3;
        }
        Object obj = this.f20567e;
        this.f20567e = null;
        try {
            if (a(obj)) {
                if (this.f20566d != null || !this.f20566d.startNext()) {
                    this.f20566d = null;
                    this.f20568f = null;
                    z3 = false;
                    while (!z3 && this.f20565c < this.f20563a.b().size()) {
                        ArrayList arrayListB2 = this.f20563a.b();
                        int i10 = this.f20565c;
                        this.f20565c = i10 + 1;
                        this.f20568f = (com.bumptech.glide.load.model.t) arrayListB2.get(i10);
                        if (this.f20568f == null && (this.f20563a.f20660p.a(this.f20568f.f20869c.getDataSource()) || this.f20563a.c(this.f20568f.f20869c.getDataClass()) != null)) {
                            this.f20568f.f20869c.loadData(this.f20563a.f20659o, new z(this, this.f20568f));
                            z3 = true;
                        }
                    }
                    return z3;
                }
            }
        } catch (IOException unused) {
        }
        return true;
    }
}
