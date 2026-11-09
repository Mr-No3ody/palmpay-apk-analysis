package Ua;

import com.transsnet.palmpay.core.bean.req.QueryCouponStatisticsReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f9465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ QueryCouponStatisticsReq f9466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, kotlin.jvm.internal.F f10, Continuation continuation, QueryCouponStatisticsReq queryCouponStatisticsReq) {
        super(2, continuation);
        this.f9464c = str;
        this.f9465d = f10;
        this.f9466e = queryCouponStatisticsReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        QueryCouponStatisticsReq queryCouponStatisticsReq = this.f9466e;
        r rVar = new r(this.f9464c, this.f9465d, continuation, queryCouponStatisticsReq);
        rVar.f9463b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L33;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
