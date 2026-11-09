package p086fe;

import Ff.h;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.teller.bean.QueryRecommendReq;
import com.transsnet.palmpay.teller.bean.QueryRecommendRsp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: fe.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1660d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommonResult f36627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QueryRecommendRsp f36628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f36630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ QueryRecommendReq f36631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660d(QueryRecommendReq queryRecommendReq, Continuation continuation) {
        super(2, continuation);
        this.f36631e = queryRecommendReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1660d c1660d = new C1660d(this.f36631e, continuation);
        c1660d.f36630d = obj;
        return c1660d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1660d) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d A[PHI: r1 r3 r4 r12
      0x019d: PHI (r1v14 com.transsnet.palmpay.teller.bean.QueryRecommendRsp) = 
      (r1v11 com.transsnet.palmpay.teller.bean.QueryRecommendRsp)
      (r1v16 com.transsnet.palmpay.teller.bean.QueryRecommendRsp)
     binds: [B:63:0x0199, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r3v16 com.transsnet.palmpay.core.bean.CommonResult) = (r3v9 com.transsnet.palmpay.core.bean.CommonResult), (r3v20 com.transsnet.palmpay.core.bean.CommonResult) binds: [B:63:0x0199, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r4v8 kotlinx.coroutines.flow.FlowCollector) = (r4v7 kotlinx.coroutines.flow.FlowCollector), (r4v10 kotlinx.coroutines.flow.FlowCollector) binds: [B:63:0x0199, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r12v49 java.lang.Object) = (r12v39 java.lang.Object), (r12v0 java.lang.Object) binds: [B:63:0x0199, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0220  */
    /* JADX WARN: Code duplicated, block: B:90:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r12 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r12 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        if (r4.emit(r1, r11) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b8, code lost:
    
        if (r4.emit(r12, r11) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ee, code lost:
    
        if (r4.emit(r1, r11) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021d, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0235, code lost:
    
        if (r1.emit(r2, r11) == r0) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1660d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
