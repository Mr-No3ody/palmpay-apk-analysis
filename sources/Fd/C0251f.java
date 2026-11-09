package Fd;

import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Fd.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0251f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251f(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, Continuation continuation) {
        super(2, continuation);
        this.f2673d = transferToPalmPayContactAllFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0251f c0251f = new C0251f(this.f2673d, continuation);
        c0251f.f2672c = obj;
        return c0251f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0251f) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r2.emit(r9, r8) == r0) goto L20;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f2671b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L22
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L7b
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            int r1 = r8.f2670a
            java.lang.Object r2 = r8.f2672c
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L67
        L22:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f2672c
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment r1 = r8.f2673d
            ld.y r4 = r1.t()
            java.util.List r4 = r4.getData()
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L3a:
            if (r5 >= r4) goto L7b
            ld.y r6 = r1.t()
            java.util.List r6 = r6.getData()
            java.lang.Object r6 = r6.get(r5)
            com.transsnet.palmpay.send_money.bean.RecipientBeanV2 r6 = (com.transsnet.palmpay.send_money.bean.RecipientBeanV2) r6
            java.lang.String r6 = r6.getMemberId()
            java.lang.String r7 = r1.f33804w
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r7)
            if (r6 == 0) goto L78
            r8.f2672c = r9
            r8.f2670a = r5
            r8.f2671b = r2
            r1 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = Wf.D.b(r1, r8)
            if (r1 != r0) goto L65
            goto L77
        L65:
            r2 = r9
            r1 = r5
        L67:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r1)
            r1 = 0
            r8.f2672c = r1
            r8.f2671b = r3
            java.lang.Object r9 = r2.emit(r9, r8)
            if (r9 != r0) goto L7b
        L77:
            return r0
        L78:
            int r5 = r5 + 1
            goto L3a
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Fd.C0251f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
