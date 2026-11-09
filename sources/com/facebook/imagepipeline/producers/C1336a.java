package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1336a extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1336a(Consumer consumer, int i7) {
        super(consumer);
        this.f21529c = i7;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        switch (this.f21529c) {
            case 0:
                p109h3.e eVar = (p109h3.e) obj;
                Consumer consumer = this.f21631b;
                if (eVar == null) {
                    consumer.onNewResult(null, i7);
                    return;
                }
                if (!p109h3.e.h(eVar)) {
                    eVar.g();
                }
                consumer.onNewResult(eVar, i7);
                return;
            case 1:
                CloseableReference closeableReference = (CloseableReference) obj;
                if (AbstractC1338c.b(i7)) {
                    return;
                }
                this.f21631b.onNewResult(closeableReference, i7);
                return;
            case 2:
                p109h3.e eVar2 = (p109h3.e) obj;
                CloseableReference closeableReferenceC = null;
                try {
                    if (p109h3.e.j(eVar2) && eVar2 != null) {
                        closeableReferenceC = CloseableReference.c(eVar2.f37274a);
                    }
                    this.f21631b.onNewResult(closeableReferenceC, i7);
                    return;
                } finally {
                    CloseableReference.d(closeableReferenceC);
                }
            default:
                if (AbstractC1338c.a(i7)) {
                    this.f21631b.onNewResult(null, i7);
                    return;
                }
                return;
        }
    }
}
