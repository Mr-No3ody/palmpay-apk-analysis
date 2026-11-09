package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f21599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Consumer consumer) {
        super(consumer);
        this.f21599c = n0Var;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void c() {
        this.f21631b.onCancellation();
        i();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable th) {
        this.f21631b.onFailure(th);
        i();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        this.f21631b.onNewResult(obj, i7);
        if (AbstractC1338c.a(i7)) {
            i();
        }
    }

    public final void i() {
        Pair pair;
        synchronized (this.f21599c) {
            try {
                pair = (Pair) this.f21599c.f21602c.poll();
                if (pair == null) {
                    this.f21599c.f21601b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.f21599c.f21603d.execute(new androidx.core.provider.m(this, 7, pair, false));
        }
    }
}
