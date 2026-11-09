package Zf;

import Yf.EnumC0789a;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: renamed from: Zf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0806b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0808d[] f11732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f11735d;

    public final AbstractC0808d a() {
        AbstractC0808d abstractC0808dB;
        D d2;
        synchronized (this) {
            try {
                AbstractC0808d[] abstractC0808dArrC = this.f11732a;
                if (abstractC0808dArrC == null) {
                    abstractC0808dArrC = c();
                    this.f11732a = abstractC0808dArrC;
                } else if (this.f11733b >= abstractC0808dArrC.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC0808dArrC, abstractC0808dArrC.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f11732a = (AbstractC0808d[]) objArrCopyOf;
                    abstractC0808dArrC = (AbstractC0808d[]) objArrCopyOf;
                }
                int i7 = this.f11734c;
                do {
                    abstractC0808dB = abstractC0808dArrC[i7];
                    if (abstractC0808dB == null) {
                        abstractC0808dB = b();
                        abstractC0808dArrC[i7] = abstractC0808dB;
                    }
                    i7++;
                    if (i7 >= abstractC0808dArrC.length) {
                        i7 = 0;
                    }
                } while (!abstractC0808dB.a(this));
                this.f11734c = i7;
                this.f11733b++;
                d2 = this.f11735d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d2 != null) {
            d2.r(1);
        }
        return abstractC0808dB;
    }

    public abstract AbstractC0808d b();

    public abstract AbstractC0808d[] c();

    public final void d(AbstractC0808d abstractC0808d) {
        D d2;
        int i7;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i10 = this.f11733b - 1;
                this.f11733b = i10;
                d2 = this.f11735d;
                if (i10 == 0) {
                    this.f11734c = 0;
                }
                Intrinsics.f(abstractC0808d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = abstractC0808d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                p355xf.o oVar = p355xf.q.f43977a;
                continuation.resumeWith(Unit.f38893a);
            }
        }
        if (d2 != null) {
            d2.r(-1);
        }
    }

    public final StateFlow getSubscriptionCount() {
        D d2;
        synchronized (this) {
            d2 = this.f11735d;
            if (d2 == null) {
                int i7 = this.f11733b;
                d2 = new D(Integer.MAX_VALUE, EnumC0789a.f11391b);
                d2.tryEmit(Integer.valueOf(i7));
                this.f11735d = d2;
            }
        }
        return d2;
    }
}
