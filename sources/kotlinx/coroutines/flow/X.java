package kotlinx.coroutines.flow;

import E.AbstractC0198c;
import Fe.C0264l;
import Wf.AbstractC0773q;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.EnumC0778w;
import Wf.o0;
import Wf.t0;
import Yf.EnumC0789a;
import Zf.AbstractC0807c;
import Zf.C0805a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pa.a0 f39123a = new Pa.a0("NO_VALUE", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pa.a0 f39124b = new Pa.a0("NONE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pa.a0 f39125c = new Pa.a0("PENDING", 1);

    public static final g0 a(Object obj) {
        if (obj == null) {
            obj = AbstractC0807c.f11737b;
        }
        return new g0(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(i0 i0Var, Function3 function3, Throwable th, Ff.c cVar) {
        C1885q c1885q;
        if (cVar instanceof C1885q) {
            c1885q = (C1885q) cVar;
            int i7 = c1885q.f39209c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1885q.f39209c = i7 - Integer.MIN_VALUE;
            } else {
                c1885q = new C1885q(cVar);
            }
        } else {
            c1885q = new C1885q(cVar);
        }
        Object obj = c1885q.f39208b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c1885q.f39209c;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                c1885q.f39207a = th;
                c1885q.f39209c = 1;
                if (function3.invoke(i0Var, th, c1885q) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c1885q.f39207a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            return Unit.f38893a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C2126e.a(th2, th);
            }
            throw th2;
        }
    }

    public static final void c(Object[] objArr, long j6, Object obj) {
        objArr[((int) j6) & (objArr.length - 1)] = obj;
    }

    public static final S d(g0 g0Var) {
        return new S(g0Var, null);
    }

    public static Flow e(Flow flow, int i7) {
        EnumC0789a enumC0789a = EnumC0789a.f11390a;
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(C0.G.m(i7, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i7 == -1) {
            enumC0789a = EnumC0789a.f11391b;
            i7 = 0;
        }
        int i10 = i7;
        EnumC0789a enumC0789a2 = enumC0789a;
        return flow instanceof FusibleFlow ? AbstractC0807c.a((FusibleFlow) flow, null, i10, enumC0789a2, 1) : new Zf.j(flow, null, i10, enumC0789a2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable f(Flow flow, FlowCollector flowCollector, Ff.c cVar) throws Throwable {
        C1890w c1890w;
        kotlin.jvm.internal.F f10;
        Job job;
        CancellationException cancellationException;
        if (cVar instanceof C1890w) {
            c1890w = (C1890w) cVar;
            int i7 = c1890w.f39233c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1890w.f39233c = i7 - Integer.MIN_VALUE;
            } else {
                c1890w = new C1890w(cVar);
            }
        } else {
            c1890w = new C1890w(cVar);
        }
        Object obj = c1890w.f39232b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c1890w.f39233c;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
            try {
                C1875g c1875g = new C1875g(flowCollector, f11);
                c1890w.f39231a = f11;
                c1890w.f39233c = 1;
                if (flow.collect(c1875g, c1890w) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                f10 = f11;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = c1890w.f39231a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) f10.f38951a;
        if ((th3 != null && th3.equals(th)) || ((job = (Job) c1890w.getContext().get(C0753a0.f10836a)) != null && job.isCancelled() && (cancellationException = job.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            C2126e.a(th3, th);
            throw th3;
        }
        C2126e.a(th, th3);
        throw th;
    }

    public static final Object g(Flow flow, Function2 function2, Continuation continuation) {
        int i7 = F.f39062a;
        Object objCollect = e(new Zf.o(new E(function2, null), flow, kotlin.coroutines.f.f38943a, -2, EnumC0789a.f11390a), 0).collect(Zf.x.f11801a, continuation);
        Ef.a aVar = Ef.a.f2423a;
        if (objCollect != aVar) {
            objCollect = Unit.f38893a;
        }
        return objCollect == aVar ? objCollect : Unit.f38893a;
    }

    public static final Flow h(S s3, long j6) {
        long jH;
        int i7 = 1;
        Tf.b bVar = Tf.c.f9078b;
        boolean z3 = j6 > 0;
        if (z3) {
            long jG = Tf.c.g(j6, AbstractC0198c.i0(999999L, Tf.e.NANOSECONDS));
            jH = ((((int) jG) & 1) != 1 || Tf.c.e(jG)) ? Tf.c.h(jG, Tf.e.MILLISECONDS) : jG >> 1;
        } else {
            if (z3) {
                throw new p355xf.l();
            }
            jH = 0;
        }
        if (jH >= 0) {
            return jH == 0 ? s3 : new X0.j(new C1884p(new C0264l(jH, i7), s3, null), i7);
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final Flow i(Flow flow) {
        if (flow instanceof StateFlow) {
            return flow;
        }
        if (!(flow instanceof C1876h)) {
            return new C1876h(flow);
        }
        ((C1876h) flow).getClass();
        return flow;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(kotlinx.coroutines.flow.FlowCollector r7, kotlinx.coroutines.channels.ReceiveChannel r8, boolean r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.C1877i
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.C1877i) r0
            int r1 = r0.f39179f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39179f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.i r0 = new kotlinx.coroutines.flow.i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f39178e
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f39179f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f39177d
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.f39176c
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.f39175b
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f39174a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f39177d
            kotlinx.coroutines.channels.ChannelIterator r7 = r0.f39176c
            kotlinx.coroutines.channels.ReceiveChannel r8 = r0.f39175b
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f39174a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            boolean r10 = r7 instanceof kotlinx.coroutines.flow.i0
            if (r10 != 0) goto Lab
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f39174a = r7     // Catch: java.lang.Throwable -> L35
            r0.f39175b = r8     // Catch: java.lang.Throwable -> L35
            r0.f39176c = r10     // Catch: java.lang.Throwable -> L35
            r0.f39177d = r9     // Catch: java.lang.Throwable -> L35
            r0.f39179f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L35
            r0.f39174a = r2     // Catch: java.lang.Throwable -> L35
            r0.f39175b = r8     // Catch: java.lang.Throwable -> L35
            r0.f39176c = r7     // Catch: java.lang.Throwable -> L35
            r0.f39177d = r9     // Catch: java.lang.Throwable -> L35
            r0.f39179f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.cancel(r3)
        L8d:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.cancel(r3)
        Laa:
            throw r10
        Lab:
            kotlinx.coroutines.flow.i0 r7 = (kotlinx.coroutines.flow.i0) r7
            java.lang.Throwable r7 = r7.f39180a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.X.j(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(Flow flow, Ff.c cVar) {
        I i7;
        kotlin.jvm.internal.F f10;
        C0805a e10;
        G g7;
        if (cVar instanceof I) {
            i7 = (I) cVar;
            int i10 = i7.f39073d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i7.f39073d = i10 - Integer.MIN_VALUE;
            } else {
                i7 = new I(cVar);
            }
        } else {
            i7 = new I(cVar);
        }
        Object obj = i7.f39072c;
        Object obj2 = Ef.a.f2423a;
        int i11 = i7.f39073d;
        Pa.a0 a0Var = AbstractC0807c.f11737b;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
            f11.f38951a = a0Var;
            G g10 = new G(f11, 0);
            try {
                i7.f39070a = f11;
                i7.f39071b = g10;
                i7.f39073d = 1;
                if (flow.collect(g10, i7) == obj2) {
                    return obj2;
                }
                f10 = f11;
            } catch (C0805a e11) {
                f10 = f11;
                e10 = e11;
                g7 = g10;
                if (e10.f11731a == g7) {
                    throw e10;
                }
                AbstractC0780y.g(i7.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g7 = i7.f39071b;
            f10 = i7.f39070a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } catch (C0805a e12) {
                e10 = e12;
                if (e10.f11731a == g7) {
                    throw e10;
                }
                AbstractC0780y.g(i7.getContext());
            }
        }
        Object obj3 = f10.f38951a;
        if (obj3 != a0Var) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(StateFlow stateFlow, L l5, Ff.c cVar) {
        J j6;
        kotlin.jvm.internal.F f10;
        C0805a e10;
        B6.W w3;
        if (cVar instanceof J) {
            j6 = (J) cVar;
            int i7 = j6.f39077d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                j6.f39077d = i7 - Integer.MIN_VALUE;
            } else {
                j6 = new J(cVar);
            }
        } else {
            j6 = new J(cVar);
        }
        Object obj = j6.f39076c;
        Object obj2 = Ef.a.f2423a;
        int i10 = j6.f39077d;
        Pa.a0 a0Var = AbstractC0807c.f11737b;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
            f11.f38951a = a0Var;
            B6.W w6 = new B6.W(5, l5, f11);
            try {
                j6.f39074a = f11;
                j6.f39075b = w6;
                j6.f39077d = 1;
                if (stateFlow.collect(w6, j6) == obj2) {
                    return obj2;
                }
                f10 = f11;
            } catch (C0805a e11) {
                f10 = f11;
                e10 = e11;
                w3 = w6;
                if (e10.f11731a == w3) {
                    throw e10;
                }
                AbstractC0780y.g(j6.getContext());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w3 = j6.f39075b;
            f10 = j6.f39074a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } catch (C0805a e12) {
                e10 = e12;
                if (e10.f11731a == w3) {
                    throw e10;
                }
                AbstractC0780y.g(j6.getContext());
            }
        }
        Object obj3 = f10.f38951a;
        if (obj3 != a0Var) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(Flow flow, Ff.c cVar) {
        K k2;
        kotlin.jvm.internal.F f10;
        C0805a e10;
        G g7;
        if (cVar instanceof K) {
            k2 = (K) cVar;
            int i7 = k2.f39081d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                k2.f39081d = i7 - Integer.MIN_VALUE;
            } else {
                k2 = new K(cVar);
            }
        } else {
            k2 = new K(cVar);
        }
        Object obj = k2.f39080c;
        Object obj2 = Ef.a.f2423a;
        int i10 = k2.f39081d;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
            G g10 = new G(f11, 1);
            try {
                k2.f39078a = f11;
                k2.f39079b = g10;
                k2.f39081d = 1;
                if (flow.collect(g10, k2) == obj2) {
                    return obj2;
                }
                f10 = f11;
            } catch (C0805a e11) {
                f10 = f11;
                e10 = e11;
                g7 = g10;
                if (e10.f11731a == g7) {
                    throw e10;
                }
                AbstractC0780y.g(k2.getContext());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g7 = k2.f39079b;
            f10 = k2.f39078a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } catch (C0805a e12) {
                e10 = e12;
                if (e10.f11731a == g7) {
                    throw e10;
                }
                AbstractC0780y.g(k2.getContext());
            }
        }
        return f10.f38951a;
    }

    public static final Flow n(Flow flow, CoroutineContext coroutineContext) {
        if (coroutineContext.get(C0753a0.f10836a) == null) {
            if (coroutineContext.equals(kotlin.coroutines.f.f38943a)) {
                return flow;
            }
            return flow instanceof FusibleFlow ? AbstractC0807c.a((FusibleFlow) flow, coroutineContext, 0, null, 6) : new Zf.j(flow, coroutineContext, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final Flow o(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return ((i7 == 0 || i7 == -3) && enumC0789a == EnumC0789a.f11390a) ? sharedFlow : new Zf.j(sharedFlow, coroutineContext, i7, enumC0789a);
    }

    public static final S p(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        p039cb.c cVar;
        Zf.g gVar;
        Flow flowD;
        int i7 = 11;
        Channel.f39041m0.getClass();
        Yf.q qVar = Yf.q.f11441a;
        if (!(flow instanceof Zf.g) || (flowD = (gVar = (Zf.g) flow).d()) == null) {
            EnumC0789a enumC0789a = EnumC0789a.f11390a;
            cVar = new p039cb.c(i7, flow, kotlin.coroutines.f.f38943a);
        } else {
            int i10 = gVar.f11748b;
            if (i10 == -3 || i10 == -2 || i10 == 0) {
                EnumC0789a enumC0789a2 = EnumC0789a.f11390a;
            }
            cVar = new p039cb.c(i7, flowD, gVar.f11747a);
        }
        g0 g0VarA = a(obj);
        EnumC0778w enumC0778w = Intrinsics.c(sharingStarted, SharingStarted.f39103n0.getEagerly()) ? EnumC0778w.f10900a : EnumC0778w.f10903d;
        Function2 n10 = new N(sharingStarted, (Flow) cVar.f18901b, g0VarA, obj, null);
        CoroutineContext coroutineContextB = AbstractC0773q.b(coroutineScope, (CoroutineContext) cVar.f18902c);
        t0 o0Var = enumC0778w == EnumC0778w.f10901b ? new o0(coroutineContextB, n10) : new t0(coroutineContextB, true);
        o0Var.L(enumC0778w, o0Var, n10);
        return new S(g0VarA, o0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object q(Flow flow, Collection collection, Ff.c cVar) {
        C1879k c1879k;
        if (cVar instanceof C1879k) {
            c1879k = (C1879k) cVar;
            int i7 = c1879k.f39185c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1879k.f39185c = i7 - Integer.MIN_VALUE;
            } else {
                c1879k = new C1879k(cVar);
            }
        } else {
            c1879k = new C1879k(cVar);
        }
        Object obj = c1879k.f39184b;
        Object obj2 = Ef.a.f2423a;
        int i10 = c1879k.f39185c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection2 = c1879k.f39183a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return collection2;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        B6.T t = new B6.T(collection, 3);
        c1879k.f39183a = collection;
        c1879k.f39185c = 1;
        return flow.collect(t, c1879k) == obj2 ? obj2 : collection;
    }

    public static Object r(Flow flow, Ff.c cVar) {
        return q(flow, new ArrayList(), cVar);
    }
}
