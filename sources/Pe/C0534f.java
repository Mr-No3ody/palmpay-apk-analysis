package Pe;

import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Pe.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0534f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f7240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AccountFlowReq f7241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0534f(String str, kotlin.jvm.internal.F f10, Continuation continuation, AccountFlowReq accountFlowReq) {
        super(2, continuation);
        this.f7239c = str;
        this.f7240d = f10;
        this.f7241e = accountFlowReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        AccountFlowReq accountFlowReq = this.f7241e;
        C0534f c0534f = new C0534f(this.f7239c, this.f7240d, continuation, accountFlowReq);
        c0534f.f7238b = obj;
        return c0534f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0534f) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.C0534f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
