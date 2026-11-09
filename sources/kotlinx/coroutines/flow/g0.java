package kotlinx.coroutines.flow;

import Wf.C0765i;
import Yf.EnumC0789a;
import Zf.AbstractC0806b;
import Zf.AbstractC0807c;
import Zf.AbstractC0808d;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AbstractC0806b implements MutableStateFlow, CancellableFlow, FusibleFlow {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39170f = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39171e;

    public g0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // Zf.AbstractC0806b
    public final AbstractC0808d b() {
        return new h0();
    }

    @Override // Zf.AbstractC0806b
    public final AbstractC0808d[] c() {
        return new h0[2];
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0034, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0088, B:37:0x008b, B:47:0x00ac, B:50:0x00bc, B:39:0x0091, B:43:0x0098, B:22:0x004d, B:25:0x0057, B:28:0x0066), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0034, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0088, B:37:0x008b, B:47:0x00ac, B:50:0x00bc, B:39:0x0091, B:43:0x0098, B:22:0x004d, B:25:0x0057, B:28:0x0066), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0034, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0088, B:37:0x008b, B:47:0x00ac, B:50:0x00bc, B:39:0x0091, B:43:0x0098, B:22:0x004d, B:25:0x0057, B:28:0x0066), top: B:55:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00bb -> B:29:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00cc -> B:29:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean compareAndSet(Object obj, Object obj2) {
        Pa.a0 a0Var = AbstractC0807c.f11737b;
        if (obj == null) {
            obj = a0Var;
        }
        if (obj2 == null) {
            obj2 = a0Var;
        }
        return e(obj, obj2);
    }

    public final boolean e(Object obj, Object obj2) {
        int i7;
        AbstractC0808d[] abstractC0808dArr;
        Pa.a0 a0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39170f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.c(obj3, obj)) {
                return false;
            }
            if (Intrinsics.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f39171e;
            if ((i10 & 1) != 0) {
                this.f39171e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f39171e = i11;
            AbstractC0808d[] abstractC0808dArr2 = this.f11732a;
            Unit unit = Unit.f38893a;
            while (true) {
                h0[] h0VarArr = (h0[]) abstractC0808dArr2;
                if (h0VarArr != null) {
                    for (h0 h0Var : h0VarArr) {
                        if (h0Var != null) {
                            AtomicReference atomicReference = h0Var.f39173a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (a0Var = X.f39125c)) {
                                    break;
                                }
                                Pa.a0 a0Var2 = X.f39124b;
                                if (obj4 != a0Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a0Var2)) {
                                            p355xf.o oVar = p355xf.q.f43977a;
                                            ((C0765i) obj4).resumeWith(Unit.f38893a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, a0Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f39171e;
                    if (i7 == i11) {
                        this.f39171e = i11 + 1;
                        return true;
                    }
                    abstractC0808dArr = this.f11732a;
                    Unit unit2 = Unit.f38893a;
                }
                abstractC0808dArr2 = abstractC0808dArr;
                i11 = i7;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f38893a;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || enumC0789a != EnumC0789a.f11391b) ? X.o(this, coroutineContext, i7, enumC0789a) : this;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return C1849p.c(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Pa.a0 a0Var = AbstractC0807c.f11737b;
        Object obj = f39170f.get(this);
        if (obj == a0Var) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC0807c.f11737b;
        }
        e(null, obj);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(Object obj) {
        setValue(obj);
        return true;
    }
}
