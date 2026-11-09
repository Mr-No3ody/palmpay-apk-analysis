package Wd;

import Pa.i0;
import Pa.r0;
import com.transsnet.palmpay.teller.ui.activity.BillerRelayPageActivity;
import com.transsnet.palmpay.util.UrlCoderUtil;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0736j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f10763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerRelayPageActivity f10764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736j(BillerRelayPageActivity billerRelayPageActivity, Continuation continuation) {
        super(2, continuation);
        this.f10764b = billerRelayPageActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0736j c0736j = new C0736j(this.f10764b, continuation);
        c0736j.f10763a = ((Boolean) obj).booleanValue();
        return c0736j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0736j) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        if (!this.f10763a) {
            BillerRelayPageActivity billerRelayPageActivity = this.f10764b;
            String strDecode = UrlCoderUtil.hasEnCode(billerRelayPageActivity.f34171g) ? UrlCoderUtil.decode(billerRelayPageActivity.f34171g) : billerRelayPageActivity.f34171g;
            if (Intrinsics.c(billerRelayPageActivity.f34172i, "inside") && r0.Y0(strDecode)) {
                i0.c0(com.transsnet.palmpay.core.config.d.g(strDecode));
            } else {
                i0.c0(strDecode);
            }
            billerRelayPageActivity.finish();
        }
        return Unit.f38893a;
    }
}
