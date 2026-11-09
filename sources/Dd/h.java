package Dd;

import C0.G;
import Pa.n0;
import Pa.r0;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.send_money.viewmodel.KkCarHostViewModel;
import com.transsnet.palmpay.send_money.viewmodel.KkCarPassengerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p223od.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KkCarPassengerFragment f1858b;

    public /* synthetic */ h(KkCarPassengerFragment kkCarPassengerFragment, int i7) {
        this.f1857a = i7;
        this.f1858b = kkCarPassengerFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KkCarPassengerFragment kkCarPassengerFragment = this.f1858b;
        switch (this.f1857a) {
            case 0:
                int i7 = KkCarPassengerFragment.f33729B;
                E eRequireActivity = kkCarPassengerFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                return (KkCarHostViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(KkCarHostViewModel.class);
            case 1:
                if (kkCarPassengerFragment.f33731o == 1) {
                    u uVar = (u) kkCarPassengerFragment.f27335j;
                    if (uVar == null || !uVar.f40518i.e()) {
                        n0.g().k((ClickEvent) G.f("keke_qr_refresh_click", "app", "native"));
                    } else {
                        n0.g().k((ClickEvent) G.f("keke_qr_expired_click", "app", "native"));
                    }
                }
                KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                if (kkCarPassengerViewModel != null) {
                    kkCarPassengerViewModel.f(true);
                }
                return Unit.f38893a;
            default:
                int i10 = KkCarPassengerFragment.f33729B;
                n0.g().k((ClickEvent) G.f("keke_qr_closed_click", "app", "native"));
                kkCarPassengerFragment.getClass();
                Postcard postcardWithString = ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.FLOW_CODE_KK_CAR_AUTH);
                ARouter aRouter = ARouter.getInstance();
                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                Intrinsics.e(postcardWithString);
                r0.x(aRouter, kkCarPassengerFragment, postcardWithString, 1002);
                return Unit.f38893a;
        }
    }
}
