package Fe;

import com.transsnet.palmpay.core.base.IBaseView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBaseView f2732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f2733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(IBaseView iBaseView, Continuation continuation, I i7) {
        super(2, continuation);
        this.f2732c = iBaseView;
        this.f2733d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new G(this.f2732c, continuation, this.f2733d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (Wf.AbstractC0780y.s(r2, r3, r9) == r1) goto L33;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_mePageMenuListV7_"
            Ef.a r1 = Ef.a.f2423a
            int r2 = r9.f2731b
            Fe.I r3 = r9.f2733d
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L27
            if (r2 == r6) goto L21
            if (r2 != r5) goto L19
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L16
            goto L9d
        L16:
            r10 = move-exception
            goto L9a
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.String r0 = r9.f2730a
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L16
            goto L67
        L27:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L16
            if (r10 == 0) goto L52
            java.lang.String r10 = "Pref_"
            ya.a r2 = p367ya.a.d()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.i()     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = com.transsnet.palmpay.core.base.BaseApplication.getCountryLocale()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L16
            r8.append(r2)     // Catch: java.lang.Throwable -> L16
            r8.append(r0)     // Catch: java.lang.Throwable -> L16
            r8.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L16
            r0 = r10
            goto L53
        L52:
            r0 = r4
        L53:
            cg.f r10 = Wf.I.f10809a     // Catch: java.lang.Throwable -> L16
            cg.e r10 = p042cg.e.f19009c     // Catch: java.lang.Throwable -> L16
            Fe.E r2 = new Fe.E     // Catch: java.lang.Throwable -> L16
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L16
            r9.f2730a = r0     // Catch: java.lang.Throwable -> L16
            r9.f2731b = r6     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = Wf.AbstractC0780y.s(r10, r2, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r1) goto L67
            goto L99
        L67:
            boolean r2 = r10 instanceof com.transsnet.palmpay.core.bean.CommonResult     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L9d
            r2 = r10
            com.transsnet.palmpay.core.bean.CommonResult r2 = (com.transsnet.palmpay.core.bean.CommonResult) r2     // Catch: java.lang.Throwable -> L16
            boolean r2 = r2.isSuccess()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L9d
            r2 = r10
            com.transsnet.palmpay.main.export.bean.rsp.HomeMePageMenuRsp r2 = (com.transsnet.palmpay.main.export.bean.rsp.HomeMePageMenuRsp) r2     // Catch: java.lang.Throwable -> L16
            boolean r6 = Fe.I.f2735f     // Catch: java.lang.Throwable -> L16
            com.transsnet.palmpay.core.base.IBaseView r3 = r3.f27351a     // Catch: java.lang.Throwable -> L16
            com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView r3 = (com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView) r3     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L84
            com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp r2 = r2.data     // Catch: java.lang.Throwable -> L16
            r3.showSlideMenuList(r2)     // Catch: java.lang.Throwable -> L16
        L84:
            cg.f r2 = Wf.I.f10809a     // Catch: java.lang.Throwable -> L16
            cg.e r2 = p042cg.e.f19009c     // Catch: java.lang.Throwable -> L16
            Fe.F r3 = new Fe.F     // Catch: java.lang.Throwable -> L16
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L16
            r3.<init>(r0, r10, r4)     // Catch: java.lang.Throwable -> L16
            r9.f2730a = r4     // Catch: java.lang.Throwable -> L16
            r9.f2731b = r5     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = Wf.AbstractC0780y.s(r2, r3, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r1) goto L9d
        L99:
            return r1
        L9a:
            org.chromium.support_lib_boundary.util.b.W(r10)
        L9d:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
