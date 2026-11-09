package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends AbstractC1354t implements RepeatedPostprocessorRunner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CloseableReference f21548d;

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void c() {
        if (i()) {
            this.f21631b.onCancellation();
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1354t, com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable th) {
        if (i()) {
            this.f21631b.onFailure(th);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        CloseableReference closeableReference = (CloseableReference) obj;
        if (AbstractC1338c.b(i7)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f21547c) {
                    CloseableReference closeableReference2 = this.f21548d;
                    this.f21548d = CloseableReference.c(closeableReference);
                    CloseableReference.d(closeableReference2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j();
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (this.f21547c) {
                    return false;
                }
                CloseableReference closeableReference = this.f21548d;
                this.f21548d = null;
                this.f21547c = true;
                CloseableReference.d(closeableReference);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this) {
            try {
                if (this.f21547c) {
                    return;
                }
                CloseableReference closeableReferenceC = CloseableReference.c(this.f21548d);
                try {
                    this.f21631b.onNewResult(closeableReferenceC, 0);
                } finally {
                    CloseableReference.d(closeableReferenceC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.imagepipeline.request.RepeatedPostprocessorRunner
    public final synchronized void update() {
        j();
    }
}
