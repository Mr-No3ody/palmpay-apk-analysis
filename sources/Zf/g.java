package Zf;

import Wf.AbstractC0773q;
import Wf.AbstractC0777v;
import Wf.EnumC0778w;
import Yf.EnumC0789a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements FusibleFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0789a f11749c;

    public g(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        this.f11747a = coroutineContext;
        this.f11748b = i7;
        this.f11749c = enumC0789a;
    }

    public String a() {
        return null;
    }

    public abstract Object b(ProducerScope producerScope, Continuation continuation);

    public abstract g c(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a);

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        Object objD = AbstractC0777v.d(new C0809e(flowCollector, this, null), continuation);
        return objD == Ef.a.f2423a ? objD : Unit.f38893a;
    }

    public Flow d() {
        return null;
    }

    public ReceiveChannel e(CoroutineScope coroutineScope) {
        int i7 = this.f11748b;
        if (i7 == -3) {
            i7 = -2;
        }
        EnumC0778w enumC0778w = EnumC0778w.f10902c;
        Function2 fVar = new f(this, null);
        Yf.D d2 = new Yf.D(AbstractC0773q.b(coroutineScope, this.f11747a), p059e1.a.a(i7, this.f11749c, 4));
        d2.L(enumC0778w, d2, fVar);
        return d2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        CoroutineContext coroutineContext2 = this.f11747a;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        EnumC0789a enumC0789a2 = EnumC0789a.f11390a;
        EnumC0789a enumC0789a3 = this.f11749c;
        int i10 = this.f11748b;
        if (enumC0789a == enumC0789a2) {
            if (i10 != -3) {
                if (i7 == -3) {
                    i7 = i10;
                } else if (i10 != -2) {
                    if (i7 == -2) {
                        i7 = i10;
                    } else {
                        i7 += i10;
                        if (i7 < 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC0789a = enumC0789a3;
        }
        return (Intrinsics.c(coroutineContextPlus, coroutineContext2) && i7 == i10 && enumC0789a == enumC0789a3) ? this : c(coroutineContextPlus, i7, enumC0789a);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        kotlin.coroutines.f fVar = kotlin.coroutines.f.f38943a;
        CoroutineContext coroutineContext = this.f11747a;
        if (coroutineContext != fVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i7 = this.f11748b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        EnumC0789a enumC0789a = EnumC0789a.f11390a;
        EnumC0789a enumC0789a2 = this.f11749c;
        if (enumC0789a2 != enumC0789a) {
            arrayList.add("onBufferOverflow=" + enumC0789a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return androidx.camera.video.u.p(sb2, CollectionsKt.J(arrayList, ", ", null, null, null, 62), ']');
    }
}
