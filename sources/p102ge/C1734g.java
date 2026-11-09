package p102ge;

import Ff.h;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ge.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1734g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f37213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AllFuncationActivityV2 f37215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1734g(AllFuncationActivityV2 allFuncationActivityV2, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f37215c = allFuncationActivityV2;
        this.f37216d = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1734g(this.f37215c, continuation, this.f37216d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1734g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: all -> 0x0020, Exception -> 0x002d, PHI: r7
      0x0066: PHI (r7v16 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:23:0x0062, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:15:0x0030, B:25:0x0066, B:27:0x006e, B:29:0x0072, B:31:0x0078, B:34:0x009b, B:16:0x0034, B:22:0x004f, B:19:0x003b), top: B:53:0x0009, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x0020, Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:15:0x0030, B:25:0x0066, B:27:0x006e, B:29:0x0072, B:31:0x0078, B:34:0x009b, B:16:0x0034, B:22:0x004f, B:19:0x003b), top: B:53:0x0009, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x0020, Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:15:0x0030, B:25:0x0066, B:27:0x006e, B:29:0x0072, B:31:0x0078, B:34:0x009b, B:16:0x0034, B:22:0x004f, B:19:0x003b), top: B:53:0x0009, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: all -> 0x0020, Exception -> 0x002d, TRY_LEAVE, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0028, B:15:0x0030, B:25:0x0066, B:27:0x006e, B:29:0x0072, B:31:0x0078, B:34:0x009b, B:16:0x0034, B:22:0x004f, B:19:0x003b), top: B:53:0x0009, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (Wf.AbstractC0780y.s(r7, r1, r6) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (Wf.AbstractC0780y.s(r7, r1, r6) == r0) goto L50;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102ge.C1734g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
