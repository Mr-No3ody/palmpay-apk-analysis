package Dd;

import B6.ViewOnClickListenerC0087i;
import C0.AbstractC0130w;
import C0.K;
import C0.U;
import Pa.n0;
import android.content.Context;
import androidx.navigation.fragment.NavHostFragment;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.AuthErrorDTO;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeConfigRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.PassengerAuthRsp;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarOnboardingFragment;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p223od.t;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KkCarOnboardingFragment f1845b;

    public /* synthetic */ c(KkCarOnboardingFragment kkCarOnboardingFragment, int i7) {
        this.f1844a = i7;
        this.f1845b = kkCarOnboardingFragment;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t tVar;
        String string;
        String string2;
        String string3;
        String string4;
        KkCarOnboardingFragment kkCarOnboardingFragment = this.f1845b;
        String string5 = null;
        switch (this.f1844a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            KkCarQrCodeConfigRsp kkCarQrCodeConfigRsp = (KkCarQrCodeConfigRsp) commonBeanResult.data;
                            String promotionActivateText = kkCarQrCodeConfigRsp != null ? kkCarQrCodeConfigRsp.getPromotionActivateText() : null;
                            int i7 = KkCarOnboardingFragment.t;
                            if (promotionActivateText != null && (string = StringsKt.V(promotionActivateText).toString()) != null && string.length() > 0) {
                                string5 = string;
                            }
                            t tVar2 = (t) kkCarOnboardingFragment.f27335j;
                            if (tVar2 != null) {
                                p220oa.h.s(tVar2.f40505c, string5 != null);
                            }
                            if (string5 != null && (tVar = (t) kkCarOnboardingFragment.f27335j) != null) {
                                tVar.f40509g.setText(string5);
                            }
                        }
                        if (!kkCarOnboardingFragment.f33727o) {
                            kkCarOnboardingFragment.f33727o = true;
                            t tVar3 = (t) kkCarOnboardingFragment.f27335j;
                            n0.g().u(new ViewEvent("keke_auth_page_show").add("app", "native").add("auth_status", String.valueOf(KkCarPassengerAuthStore.INSTANCE.readAuthStatus())).add("offer_show", String.valueOf(tVar3 != null && tVar3.f40505c.getVisibility() == 0)));
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        PassengerAuthRsp passengerAuthRsp = (PassengerAuthRsp) commonBeanResult2.data;
                        AuthErrorDTO error = passengerAuthRsp != null ? passengerAuthRsp.getError() : null;
                        if (error != null) {
                            int i10 = KkCarOnboardingFragment.t;
                            n0.g().u(new ViewEvent("keke_auth_accounttopup_show").add("app", "native"));
                            B b7 = new B();
                            O6.c cVar = new O6.c(kkCarOnboardingFragment.requireContext());
                            Context contextRequireContext = kkCarOnboardingFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            cVar.f6608n = G8.a.x(contextRequireContext, S6.a.pay_WarningOutline, null, Integer.valueOf(L6.b.ppColorPrimary), 36.0f, 114);
                            String title = error.getTitle();
                            if (title != null && (string4 = StringsKt.V(title).toString()) != null) {
                                if (string4.length() <= 0) {
                                    string4 = null;
                                }
                                if (string4 != null) {
                                    cVar.f(string4);
                                }
                            }
                            String desc = error.getDesc();
                            if (desc != null && (string3 = StringsKt.V(desc).toString()) != null) {
                                if (string3.length() <= 0) {
                                    string3 = null;
                                }
                                if (string3 != null) {
                                    cVar.f6598d = string3;
                                }
                            }
                            String button = error.getButton();
                            if (button == null || (string2 = StringsKt.V(button).toString()) == null) {
                                string2 = kkCarOnboardingFragment.getString(k.core_confirm);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            } else {
                                if (string2.length() <= 0) {
                                    string2 = null;
                                }
                                if (string2 == null) {
                                    string2 = kkCarOnboardingFragment.getString(k.core_confirm);
                                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                }
                            }
                            String jumpUrl = error.getJumpUrl();
                            string5 = jumpUrl != null ? StringsKt.V(jumpUrl).toString() : null;
                            if (string5 == null) {
                                string5 = "";
                            }
                            ViewOnClickListenerC0087i viewOnClickListenerC0087i = new ViewOnClickListenerC0087i(b7, 1 == true ? 1 : 0, string5, kkCarOnboardingFragment);
                            cVar.f6600f = string2;
                            cVar.f6602h = viewOnClickListenerC0087i;
                            O6.d dVarA = cVar.a();
                            dVarA.setOnDismissListener(new b(b7, 0));
                            dVarA.show();
                        } else if (commonBeanResult2.isSuccess()) {
                            KkCarPassengerAuthStore kkCarPassengerAuthStore = KkCarPassengerAuthStore.INSTANCE;
                            kkCarPassengerAuthStore.saveAuthStatus(1);
                            kkCarPassengerAuthStore.clearQrSnapshotCache();
                            int i11 = KkCarOnboardingFragment.t;
                            Intrinsics.checkNotNullParameter(kkCarOnboardingFragment, "<this>");
                            AbstractC0130w abstractC0130wFindNavController = NavHostFragment.f17502e.findNavController(kkCarOnboardingFragment);
                            K kE = abstractC0130wFindNavController.e();
                            if (kE == null || kE.f961i != p159kd.e.kkCarPassengerFragment) {
                                abstractC0130wFindNavController.h(p159kd.e.kkCarPassengerFragment, null, new U(false, false, p159kd.e.kkCarOnboardingFragment, true, false, -1, -1, -1, -1));
                            }
                        } else {
                            ToastUtils.showShort(commonBeanResult2.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
