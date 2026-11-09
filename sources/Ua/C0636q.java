package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ua.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0636q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponItem f9454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0636q(Continuation continuation, ModelAvailableCouponItem modelAvailableCouponItem) {
        super(2, continuation);
        this.f9454f = modelAvailableCouponItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0636q c0636q = new C0636q(continuation, this.f9454f);
        c0636q.f9453e = obj;
        return c0636q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0636q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002c, B:43:0x009d, B:19:0x003c, B:41:0x0098, B:27:0x0059, B:31:0x0075, B:33:0x007c, B:35:0x0082, B:38:0x0089, B:22:0x0046, B:25:0x0051), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002c, B:43:0x009d, B:19:0x003c, B:41:0x0098, B:27:0x0059, B:31:0x0075, B:33:0x007c, B:35:0x0082, B:38:0x0089, B:22:0x0046, B:25:0x0051), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[Catch: all -> 0x0033, PHI: r1 r8 r10
      0x0098: PHI (r1v8 int) = (r1v5 int), (r1v12 int) binds: [B:39:0x0095, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r8v3 long) = (r8v1 long), (r8v5 long) binds: [B:39:0x0095, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r10v6 int) = (r10v0 int), (r10v8 int) binds: [B:39:0x0095, B:19:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002c, B:43:0x009d, B:19:0x003c, B:41:0x0098, B:27:0x0059, B:31:0x0075, B:33:0x007c, B:35:0x0082, B:38:0x0089, B:22:0x0046, B:25:0x0051), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0095 -> B:41:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.C0636q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
