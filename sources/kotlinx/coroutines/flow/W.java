package kotlinx.coroutines.flow;

import Wf.AbstractC0780y;
import Wf.C0764h;
import Wf.C0765i;
import Yf.EnumC0789a;
import Zf.AbstractC0806b;
import Zf.AbstractC0807c;
import Zf.AbstractC0808d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: loaded from: classes4.dex */
public class W extends AbstractC0806b implements MutableSharedFlow, CancellableFlow, FusibleFlow {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC0789a f39117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f39118g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39120j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39122p;

    public W(int i7, EnumC0789a enumC0789a) {
        this.f39116e = i7;
        this.f39117f = enumC0789a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Zf.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlinx.coroutines.flow.W] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Zf.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlinx.coroutines.flow.Y] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [kotlinx.coroutines.flow.Y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void g(kotlinx.coroutines.flow.W r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.V
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.V r0 = (kotlinx.coroutines.flow.V) r0
            int r1 = r0.f39115g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39115g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.V r0 = new kotlinx.coroutines.flow.V
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f39113e
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f39115g
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            kotlinx.coroutines.Job r8 = r0.f39112d
            kotlinx.coroutines.flow.Y r9 = r0.f39111c
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f39110b
            kotlinx.coroutines.flow.W r5 = r0.f39109a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            kotlinx.coroutines.Job r8 = r0.f39112d
            kotlinx.coroutines.flow.Y r9 = r0.f39111c
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f39110b
            kotlinx.coroutines.flow.W r5 = r0.f39109a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            kotlinx.coroutines.flow.Y r9 = r0.f39111c
            kotlinx.coroutines.flow.FlowCollector r8 = r0.f39110b
            kotlinx.coroutines.flow.W r2 = r0.f39109a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            Zf.d r10 = r8.a()
            kotlinx.coroutines.flow.Y r10 = (kotlinx.coroutines.flow.Y) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            Wf.a0 r5 = Wf.C0753a0.f10836a     // Catch: java.lang.Throwable -> Lb1
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.o(r9)     // Catch: java.lang.Throwable -> L38
            Pa.a0 r6 = kotlinx.coroutines.flow.X.f39123a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f39109a = r5     // Catch: java.lang.Throwable -> L38
            r0.f39110b = r2     // Catch: java.lang.Throwable -> L38
            r0.f39111c = r9     // Catch: java.lang.Throwable -> L38
            r0.f39112d = r8     // Catch: java.lang.Throwable -> L38
            r0.f39115g = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.e(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f39109a = r5     // Catch: java.lang.Throwable -> L38
            r0.f39110b = r2     // Catch: java.lang.Throwable -> L38
            r0.f39111c = r9     // Catch: java.lang.Throwable -> L38
            r0.f39112d = r8     // Catch: java.lang.Throwable -> L38
            r0.f39115g = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.d(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.W.g(kotlinx.coroutines.flow.W, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):void");
    }

    @Override // Zf.AbstractC0806b
    public final AbstractC0808d b() {
        Y y8 = new Y();
        y8.f39126a = -1L;
        return y8;
    }

    @Override // Zf.AbstractC0806b
    public final AbstractC0808d[] c() {
        return new Y[2];
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        g(this, flowCollector, continuation);
        return Ef.a.f2423a;
    }

    public final Object e(Y y8, V frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        synchronized (this) {
            if (n(y8) < 0) {
                y8.f39127b = c0765i;
            } else {
                p355xf.o oVar = p355xf.q.f43977a;
                c0765i.resumeWith(Unit.f38893a);
            }
            Unit unit = Unit.f38893a;
        }
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation frame) throws Throwable {
        Throwable th;
        Continuation[] continuationArrJ;
        U u6;
        if (tryEmit(obj)) {
            return Unit.f38893a;
        }
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        Continuation[] continuationArrJ2 = AbstractC0807c.f11736a;
        synchronized (this) {
            try {
                if (m(obj)) {
                    try {
                        p355xf.o oVar = p355xf.q.f43977a;
                        c0765i.resumeWith(Unit.f38893a);
                        continuationArrJ = j(continuationArrJ2);
                        u6 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        u6 = new U(this, k() + ((long) (this.f39121o + this.f39122p)), obj, c0765i);
                        i(u6);
                        this.f39122p++;
                        if (this.f39116e == 0) {
                            continuationArrJ2 = j(continuationArrJ2);
                        }
                        continuationArrJ = continuationArrJ2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (u6 != null) {
                    AbstractC0780y.k(c0765i, new C0764h(u6, 2));
                }
                for (Continuation continuation : continuationArrJ) {
                    if (continuation != null) {
                        p355xf.o oVar2 = p355xf.q.f43977a;
                        continuation.resumeWith(Unit.f38893a);
                    }
                }
                Object objM = c0765i.m();
                Ef.a aVar = Ef.a.f2423a;
                if (objM == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objM != aVar) {
                    objM = Unit.f38893a;
                }
                return objM == aVar ? objM : Unit.f38893a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void f() {
        if (this.f39116e != 0 || this.f39122p > 1) {
            Object[] objArr = this.f39118g;
            Intrinsics.e(objArr);
            while (this.f39122p > 0) {
                long jK = k();
                int i7 = this.f39121o;
                int i10 = this.f39122p;
                if (objArr[((int) ((jK + ((long) (i7 + i10))) - 1)) & (objArr.length - 1)] != X.f39123a) {
                    return;
                }
                this.f39122p = i10 - 1;
                X.c(objArr, k() + ((long) (this.f39121o + this.f39122p)), null);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i7, EnumC0789a enumC0789a) {
        return X.o(this, coroutineContext, i7, enumC0789a);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        synchronized (this) {
            int iK = (int) ((k() + ((long) this.f39121o)) - this.f39119i);
            if (iK == 0) {
                return kotlin.collections.z.f38935a;
            }
            ArrayList arrayList = new ArrayList(iK);
            Object[] objArr = this.f39118g;
            Intrinsics.e(objArr);
            for (int i7 = 0; i7 < iK; i7++) {
                arrayList.add(objArr[((int) (this.f39119i + ((long) i7))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    public final void h() {
        AbstractC0808d[] abstractC0808dArr;
        Object[] objArr = this.f39118g;
        Intrinsics.e(objArr);
        X.c(objArr, k(), null);
        this.f39121o--;
        long jK = k() + 1;
        if (this.f39119i < jK) {
            this.f39119i = jK;
        }
        if (this.f39120j < jK) {
            if (this.f11733b != 0 && (abstractC0808dArr = this.f11732a) != null) {
                for (AbstractC0808d abstractC0808d : abstractC0808dArr) {
                    if (abstractC0808d != null) {
                        Y y8 = (Y) abstractC0808d;
                        long j6 = y8.f39126a;
                        if (j6 >= 0 && j6 < jK) {
                            y8.f39126a = jK;
                        }
                    }
                }
            }
            this.f39120j = jK;
        }
    }

    public final void i(Object obj) {
        int i7 = this.f39121o + this.f39122p;
        Object[] objArrL = this.f39118g;
        if (objArrL == null) {
            objArrL = l(0, 2, null);
        } else if (i7 >= objArrL.length) {
            objArrL = l(i7, objArrL.length * 2, objArrL);
        }
        X.c(objArrL, k() + ((long) i7), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] j(Continuation[] continuationArr) {
        AbstractC0808d[] abstractC0808dArr;
        Y y8;
        C0765i c0765i;
        int length = continuationArr.length;
        if (this.f11733b != 0 && (abstractC0808dArr = this.f11732a) != null) {
            int length2 = abstractC0808dArr.length;
            int i7 = 0;
            while (i7 < length2) {
                AbstractC0808d abstractC0808d = abstractC0808dArr[i7];
                if (abstractC0808d == null || (c0765i = (y8 = (Y) abstractC0808d).f39127b) == null || n(y8) < 0) {
                    continuationArr = continuationArr;
                } else {
                    if (length >= continuationArr.length) {
                        continuationArr = continuationArr;
                        continuationArr = continuationArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    continuationArr = continuationArr;
                    continuationArr = continuationArr;
                    ((Continuation[]) continuationArr)[length] = c0765i;
                    y8.f39127b = null;
                    length++;
                }
                i7++;
                continuationArr = continuationArr;
            }
            continuationArr = continuationArr;
        }
        return (Continuation[]) continuationArr;
    }

    public final long k() {
        return Math.min(this.f39120j, this.f39119i);
    }

    public final Object[] l(int i7, int i10, Object[] objArr) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f39118g = objArr2;
        if (objArr != null) {
            long jK = k();
            for (int i11 = 0; i11 < i7; i11++) {
                long j6 = ((long) i11) + jK;
                X.c(objArr2, j6, objArr[((int) j6) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    public final boolean m(Object obj) {
        int i7;
        long jK;
        long j6;
        if (this.f11733b == 0) {
            i(obj);
            int i10 = this.f39121o + 1;
            this.f39121o = i10;
            if (i10 > 1) {
                h();
            }
            this.f39120j = k() + ((long) this.f39121o);
            return true;
        }
        int i11 = this.f39121o;
        int i12 = this.f39116e;
        if (i11 < i12 || this.f39120j > this.f39119i) {
            i(obj);
            i7 = this.f39121o + 1;
            this.f39121o = i7;
            if (i7 > i12) {
                h();
            }
            jK = k() + ((long) this.f39121o);
            j6 = this.f39119i;
            if (((int) (jK - j6)) > 1) {
                p(1 + j6, this.f39120j, k() + ((long) this.f39121o), k() + ((long) this.f39121o) + ((long) this.f39122p));
            }
        } else {
            int iOrdinal = this.f39117f.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                i(obj);
                i7 = this.f39121o + 1;
                this.f39121o = i7;
                if (i7 > i12) {
                    h();
                }
                jK = k() + ((long) this.f39121o);
                j6 = this.f39119i;
                if (((int) (jK - j6)) > 1) {
                    p(1 + j6, this.f39120j, k() + ((long) this.f39121o), k() + ((long) this.f39121o) + ((long) this.f39122p));
                }
            } else if (iOrdinal != 2) {
                throw new p355xf.l();
            }
        }
        return true;
    }

    public final long n(Y y8) {
        long j6 = y8.f39126a;
        if (j6 < k() + ((long) this.f39121o)) {
            return j6;
        }
        if (this.f39116e <= 0 && j6 <= k() && this.f39122p != 0) {
            return j6;
        }
        return -1L;
    }

    public final Object o(Y y8) {
        Object obj;
        Continuation[] continuationArrQ = AbstractC0807c.f11736a;
        synchronized (this) {
            try {
                long jN = n(y8);
                if (jN < 0) {
                    obj = X.f39123a;
                } else {
                    long j6 = y8.f39126a;
                    Object[] objArr = this.f39118g;
                    Intrinsics.e(objArr);
                    Object obj2 = objArr[((int) jN) & (objArr.length - 1)];
                    if (obj2 instanceof U) {
                        obj2 = ((U) obj2).f39107c;
                    }
                    y8.f39126a = jN + 1;
                    Object obj3 = obj2;
                    continuationArrQ = q(j6);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrQ) {
            if (continuation != null) {
                p355xf.o oVar = p355xf.q.f43977a;
                continuation.resumeWith(Unit.f38893a);
            }
        }
        return obj;
    }

    public final void p(long j6, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j6);
        for (long jK = k(); jK < jMin; jK++) {
            Object[] objArr = this.f39118g;
            Intrinsics.e(objArr);
            X.c(objArr, jK, null);
        }
        this.f39119i = j6;
        this.f39120j = j10;
        this.f39121o = (int) (j11 - jMin);
        this.f39122p = (int) (j12 - j11);
    }

    public final Continuation[] q(long j6) {
        int i7;
        long j10;
        int i10;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        AbstractC0808d[] abstractC0808dArr;
        long j11 = this.f39120j;
        Continuation[] continuationArr3 = AbstractC0807c.f11736a;
        if (j6 <= j11) {
            long jK = k();
            long j12 = ((long) this.f39121o) + jK;
            int i11 = this.f39116e;
            if (i11 == 0 && this.f39122p > 0) {
                j12++;
            }
            int i12 = 0;
            if (this.f11733b != 0 && (abstractC0808dArr = this.f11732a) != null) {
                for (AbstractC0808d abstractC0808d : abstractC0808dArr) {
                    if (abstractC0808d != null) {
                        long j13 = ((Y) abstractC0808d).f39126a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f39120j) {
                long jK2 = k() + ((long) this.f39121o);
                int iMin = this.f11733b > 0 ? Math.min(this.f39122p, i11 - ((int) (jK2 - j12))) : this.f39122p;
                long j14 = ((long) this.f39122p) + jK2;
                Pa.a0 a0Var = X.f39123a;
                if (iMin > 0) {
                    Continuation[] continuationArr4 = new Continuation[iMin];
                    Object[] objArr = this.f39118g;
                    Intrinsics.e(objArr);
                    long j15 = jK2;
                    while (true) {
                        if (jK2 >= j14) {
                            i7 = i11;
                            continuationArr2 = continuationArr4;
                            j10 = jK;
                            i10 = 1;
                            jK2 = j15;
                            break;
                        }
                        i10 = 1;
                        i7 = i11;
                        Object obj = objArr[(objArr.length - 1) & ((int) jK2)];
                        if (obj != a0Var) {
                            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            U u6 = (U) obj;
                            int i13 = i12 + 1;
                            continuationArr2 = continuationArr4;
                            continuationArr2[i12] = u6.f39108d;
                            X.c(objArr, jK2, a0Var);
                            j10 = jK;
                            long j16 = j15;
                            X.c(objArr, j16, u6.f39107c);
                            long j17 = j16 + 1;
                            if (i13 >= iMin) {
                                jK2 = j17;
                                break;
                            }
                            j15 = j17;
                            i12 = i13;
                        } else {
                            continuationArr2 = continuationArr4;
                            j10 = jK;
                        }
                        jK2++;
                        i11 = i7;
                        continuationArr4 = continuationArr2;
                        jK = j10;
                    }
                    continuationArr = continuationArr2;
                } else {
                    i7 = i11;
                    j10 = jK;
                    i10 = 1;
                    continuationArr = continuationArr3;
                }
                int i14 = (int) (jK2 - j10);
                long j18 = this.f11733b == 0 ? jK2 : j12;
                long jMax = Math.max(this.f39119i, jK2 - ((long) Math.min(i10, i14)));
                if (i7 == 0 && jMax < j14) {
                    Object[] objArr2 = this.f39118g;
                    Intrinsics.e(objArr2);
                    if (Intrinsics.c(objArr2[((int) jMax) & (objArr2.length - 1)], a0Var)) {
                        jK2++;
                        jMax++;
                    }
                }
                p(jMax, j18, jK2, j14);
                f();
                return continuationArr.length == 0 ? continuationArr : j(continuationArr);
            }
        }
        return continuationArr3;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() throws Throwable {
        synchronized (this) {
            try {
                try {
                    p(k() + ((long) this.f39121o), this.f39120j, k() + ((long) this.f39121o), k() + ((long) this.f39121o) + ((long) this.f39122p));
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(Object obj) {
        int i7;
        boolean z3;
        Continuation[] continuationArrJ = AbstractC0807c.f11736a;
        synchronized (this) {
            if (m(obj)) {
                continuationArrJ = j(continuationArrJ);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (Continuation continuation : continuationArrJ) {
            if (continuation != null) {
                p355xf.o oVar = p355xf.q.f43977a;
                continuation.resumeWith(Unit.f38893a);
            }
        }
        return z3;
    }
}
