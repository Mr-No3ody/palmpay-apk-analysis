package Dd;

import C0.AbstractC0130w;
import C0.K;
import C0.U;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.AuthErrorDTO;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarAuthInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.KkCarQrCodeConfigRsp;
import com.transsnet.palmpay.send_money.bean.resp.kkcar.UpdateCodeStatusRsp;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.send_money.viewmodel.KkCarPassengerViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p223od.u;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KkCarPassengerFragment f1863b;

    public /* synthetic */ j(KkCarPassengerFragment kkCarPassengerFragment, int i7) {
        this.f1862a = i7;
        this.f1863b = kkCarPassengerFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextView rightTextView;
        String paymentRecipientTitle;
        KkCarPassengerFragment kkCarPassengerFragment = this.f1863b;
        switch (this.f1862a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        UpdateCodeStatusRsp updateCodeStatusRsp = (UpdateCodeStatusRsp) commonBeanResult.data;
                        AuthErrorDTO error = updateCodeStatusRsp != null ? updateCodeStatusRsp.getError() : null;
                        if (error != null) {
                            i iVar = i.f1859a;
                            int i7 = KkCarPassengerFragment.f33729B;
                            kkCarPassengerFragment.A(error, iVar);
                        } else if (commonBeanResult.isSuccess()) {
                            int i10 = KkCarPassengerFragment.f33729B;
                            KkCarPassengerViewModel kkCarPassengerViewModel = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i;
                            if (kkCarPassengerViewModel != null) {
                                kkCarPassengerViewModel.f(true);
                            }
                        } else {
                            ToastUtils.showShort(commonBeanResult.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                        ((n) it).getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            int i11 = KkCarPassengerFragment.f33729B;
                            u uVar = (u) kkCarPassengerFragment.f27335j;
                            if (uVar != null) {
                                KkCarQrView kkCarQrView = uVar.f40518i;
                                KkCarQrCodeConfigRsp kkCarQrCodeConfigRsp = (KkCarQrCodeConfigRsp) commonBeanResult2.data;
                                if (kkCarQrCodeConfigRsp == null || (paymentRecipientTitle = kkCarQrCodeConfigRsp.getPaymentRecipientTitle()) == null || paymentRecipientTitle.length() <= 0) {
                                    paymentRecipientTitle = null;
                                }
                                kkCarQrView.f33953e = paymentRecipientTitle;
                                Bc.j jVar = kkCarQrView.f33949a;
                                if (paymentRecipientTitle != null) {
                                    ((TextView) jVar.f732B).setText(paymentRecipientTitle);
                                } else if (kkCarQrView.f33952d != 2) {
                                    ((TextView) jVar.f732B).setText(p159kd.h.sm_kk_qr_title);
                                }
                                kkCarQrView.setPromotionText(kkCarQrCodeConfigRsp != null ? kkCarQrCodeConfigRsp.getPromotionBannerText() : null);
                                List<String> badgeList = kkCarQrCodeConfigRsp != null ? kkCarQrCodeConfigRsp.getBadgeList() : null;
                                if (badgeList == null) {
                                    badgeList = z.f38935a;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : badgeList) {
                                    if (((String) obj2).length() > 0) {
                                        arrayList.add(obj2);
                                    }
                                }
                                kkCarQrView.f33954f = arrayList;
                                LinearLayout llKkQrBadges = (LinearLayout) jVar.f736c;
                                Intrinsics.checkNotNullExpressionValue(llKkQrBadges, "llKkQrBadges");
                                llKkQrBadges.removeAllViews();
                                int i12 = 0;
                                for (Object obj3 : (Iterable) kkCarQrView.f33954f) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        C1850q.k();
                                        throw null;
                                    }
                                    View viewInflate = LayoutInflater.from(kkCarQrView.getContext()).inflate(p159kd.f.sm_kk_item_qr_badge, (ViewGroup) llKkQrBadges, false);
                                    ((TextView) viewInflate.findViewById(p159kd.e.tvKkBadgeText)).setText((String) obj3);
                                    if (i12 > 0) {
                                        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                                        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        ((LinearLayout.LayoutParams) layoutParams).setMarginStart(CommonViewExtKt.getDp(8));
                                    }
                                    llKkQrBadges.addView(viewInflate);
                                    i12 = i13;
                                }
                                kkCarQrView.c(kkCarQrView.f33952d);
                            }
                            KkCarQrCodeConfigRsp kkCarQrCodeConfigRsp2 = (KkCarQrCodeConfigRsp) commonBeanResult2.data;
                            kkCarPassengerFragment.f33732p = kkCarQrCodeConfigRsp2 != null ? Intrinsics.c(kkCarQrCodeConfigRsp2.getDriver(), Boolean.TRUE) : false;
                            u uVar2 = (u) kkCarPassengerFragment.f27335j;
                            if (uVar2 != null && (rightTextView = uVar2.f40517g.getRightTextView()) != null) {
                                p220oa.h.s(rightTextView, kkCarPassengerFragment.f33732p);
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        ((n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult3.isSuccess()) {
                            KkCarAuthInfoRsp kkCarAuthInfoRsp = (KkCarAuthInfoRsp) commonBeanResult3.data;
                            Integer authStatus = kkCarAuthInfoRsp != null ? kkCarAuthInfoRsp.getAuthStatus() : null;
                            int i14 = KkCarPassengerFragment.f33729B;
                            int iIntValue = authStatus != null ? authStatus.intValue() : 0;
                            KkCarPassengerAuthStore kkCarPassengerAuthStore = KkCarPassengerAuthStore.INSTANCE;
                            kkCarPassengerAuthStore.saveAuthStatus(Integer.valueOf(iIntValue));
                            if (iIntValue == 0) {
                                Intrinsics.checkNotNullParameter(kkCarPassengerFragment, "<this>");
                                AbstractC0130w abstractC0130wFindNavController = NavHostFragment.f17502e.findNavController(kkCarPassengerFragment);
                                K kE = abstractC0130wFindNavController.e();
                                if (kE == null || kE.f961i != p159kd.e.kkCarOnboardingFragment) {
                                    abstractC0130wFindNavController.h(p159kd.e.kkCarOnboardingFragment, null, new U(false, false, p159kd.e.kkCarPassengerFragment, true, false, -1, -1, -1, -1));
                                }
                            } else {
                                if (iIntValue == 1) {
                                    kkCarPassengerAuthStore.clearQrSnapshotCache();
                                }
                                if (iIntValue == 1 || iIntValue == 2) {
                                    kkCarPassengerFragment.v(iIntValue);
                                } else {
                                    kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                                }
                            }
                        } else {
                            ToastUtils.showShort(commonBeanResult3.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
