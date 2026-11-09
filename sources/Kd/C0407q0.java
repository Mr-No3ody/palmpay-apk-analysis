package Kd;

import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Kd.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0407q0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f5359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ QueryBankListReq f5360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407q0(String str, kotlin.jvm.internal.F f10, Continuation continuation, QueryBankListReq queryBankListReq) {
        super(2, continuation);
        this.f5358c = str;
        this.f5359d = f10;
        this.f5360e = queryBankListReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        QueryBankListReq queryBankListReq = this.f5360e;
        C0407q0 c0407q0 = new C0407q0(this.f5358c, this.f5359d, continuation, queryBankListReq);
        c0407q0.f5357b = obj;
        return c0407q0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0407q0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
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
        throw new UnsupportedOperationException("Method not decompiled: Kd.C0407q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
