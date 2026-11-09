package Ab;

import Ad.DialogC0066m;
import C0.P;
import C9.C0158z;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import androidx.navigation.fragment.NavHostFragment;
import com.google.api.Service;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.ui.button.PpButton;
import com.skydoves.balloon.Balloon;
import com.swmansion.rnscreens.CustomSearchView;
import com.swmansion.rnscreens.SearchBarView;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.account.ui.activity.AccountActivateSuccessActivity;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianResultFragment;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.core.bean.verify.VerifyQuestionNodeBean;
import com.transsnet.palmpay.core.bean.verify.VerifyQuestionOptionBean;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAQuestionFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.QueryModuleRankResp;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105b;

    public /* synthetic */ C(Object obj, int i7) {
        this.f104a = i7;
        this.f105b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02b4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View childAt;
        View view;
        View viewH;
        ModelPremiumBenefits modelPremiumBenefits;
        ModelPalmPrizeBanner modelPalmPrizeBanner;
        View view2;
        View viewH2;
        Bc.i iVar;
        g0 g0Var;
        Object value;
        g0 g0Var2;
        Object value2;
        TextView textView;
        CustomAutoCompleteTextView customAutoCompleteTextView;
        CustomAutoCompleteTextView customAutoCompleteTextView2;
        IconicsCheckBox iconicsCheckBox;
        P pF;
        Z childFragmentManager;
        List listF;
        int i7 = 3;
        ?? r10 = 0;
        Object obj2 = null;
        int i10 = 0;
        Object obj3 = this.f105b;
        switch (this.f104a) {
            case 0:
                Long l5 = (Long) obj;
                CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                TextView textView2 = (TextView) ((CLInstallmentUpGradeSuccFragment) obj3).f30617v.getValue();
                if (textView2 != null) {
                    textView2.setText("Borrow Now(" + l5 + ")s");
                }
                return Unit.f38893a;
            case 1:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 20);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, ((DialogC0066m) obj3).getContext()));
                return Unit.f38893a;
            case 2:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                p118hf.a.I(apply2, 20);
                D3.a.F(apply2, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, ((ScheduleTransferHomeFragment) obj3).requireContext()));
                return Unit.f38893a;
            case 3:
                String it = (String) obj;
                int i11 = BankCardFragment.f35064B;
                Intrinsics.checkNotNullParameter(it, "it");
                p220oa.h.y((BankCardFragment) obj3, it);
                return Unit.f38893a;
            case 4:
                int i12 = HomeFinanceFragment.f35071H;
                ((HomeFinanceFragment) obj3).onRefresh();
                return Unit.f38893a;
            case 5:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                HomeMeFragment homeMeFragment = (HomeMeFragment) obj3;
                View view3 = homeMeFragment.f27318b;
                homeMeFragment.f35128X = view3 != null ? (MarqueeViewV2) view3.findViewById(Ac.e.topTextAd) : null;
                if (homeMeFragment.isDetached() || !homeMeFragment.isAdded() || homeMeFragment.isRemoving() || homeMeFragment.f27318b == null) {
                    MarqueeViewV2 marqueeViewV2 = homeMeFragment.f35128X;
                    if (marqueeViewV2 != null) {
                        marqueeViewV2.release();
                    }
                    homeMeFragment.f35128X = null;
                    return Unit.f38893a;
                }
                MarqueeViewV2 marqueeViewV3 = homeMeFragment.f35128X;
                if (marqueeViewV3 != null) {
                    marqueeViewV3.setSlotId("054F634179BB40F9AD38F4210B96537A");
                }
                MarqueeViewV2 marqueeViewV4 = homeMeFragment.f35128X;
                if (marqueeViewV4 != null) {
                    marqueeViewV4.setAdListener(new C0158z(homeMeFragment, i7));
                }
                return Unit.f38893a;
            case 6:
                List<QueryModuleRankResp> it2 = (List) obj;
                int i13 = HomePalmZoneTabV2.f35134Z;
                Intrinsics.checkNotNullParameter(it2, "it");
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) obj3;
                if (it2 != null && (!it2.isEmpty()) && (iVar = homePalmZoneTabV2.f35139L) != null) {
                    ((LinearLayout) iVar.f730i).removeAllViews();
                }
                if (it2 != null) {
                    for (QueryModuleRankResp queryModuleRankResp : it2) {
                        String str = queryModuleRankResp.moduleName;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -926120840:
                                    if (str.equals("referEarn")) {
                                        Boolean bool = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                                        if (zBooleanValue) {
                                            if (homePalmZoneTabV2.t == null) {
                                                Bc.i iVar2 = homePalmZoneTabV2.f35139L;
                                                homePalmZoneTabV2.t = new Je.n(iVar2 != null ? (LinearLayout) iVar2.f730i : null, homePalmZoneTabV2);
                                            }
                                            PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2.f27333i;
                                            if (palmZoneViewModel != null) {
                                                palmZoneViewModel.g();
                                            }
                                        }
                                        Je.n nVar = homePalmZoneTabV2.t;
                                        if (nVar != null) {
                                            View view4 = nVar.f4830e;
                                            if (view4 != null) {
                                                p220oa.h.s(view4, zBooleanValue);
                                            }
                                            nVar.k(nVar.f4830e, zBooleanValue);
                                        }
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 3552645:
                                    if (str.equals("task")) {
                                        Boolean bool2 = queryModuleRankResp.moduleEnable;
                                        homePalmZoneTabV2.v(bool2 != null ? bool2.booleanValue() : true, true);
                                    }
                                    break;
                                case 183432311:
                                    if (str.equals("bannerBottom")) {
                                        Boolean bool3 = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : true;
                                        if (zBooleanValue2 && homePalmZoneTabV2.f35135A == null) {
                                            Bc.i iVar3 = homePalmZoneTabV2.f35139L;
                                            LinearLayout linearLayout = iVar3 != null ? (LinearLayout) iVar3.f730i : null;
                                            Me.j jVar = new Me.j(0);
                                            int i14 = Ac.f.main_home_rewards_tab_middle_ad_stub;
                                            if (linearLayout != null) {
                                                viewH = jVar.h(linearLayout, i14, null);
                                                linearLayout.addView(viewH);
                                            } else {
                                                viewH = null;
                                            }
                                            jVar.f5976c = viewH;
                                            SingleAdView singleAdView = viewH != null ? (SingleAdView) viewH.findViewById(Ac.e.middleAdview) : null;
                                            if (singleAdView != null) {
                                                singleAdView.setAdListenerInternal(new C0158z(jVar, 9));
                                            }
                                            homePalmZoneTabV2.f35135A = jVar;
                                        }
                                        Me.j jVar2 = homePalmZoneTabV2.f35135A;
                                        if (jVar2 != null && (view = jVar2.f5976c) != null) {
                                            p220oa.h.s(view, zBooleanValue2);
                                        }
                                    }
                                    break;
                                case 579185385:
                                    if (str.equals("pointsCoupon")) {
                                        Boolean bool4 = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : true;
                                        if (zBooleanValue3) {
                                            if (homePalmZoneTabV2.f35148w == null) {
                                                Bc.i iVar4 = homePalmZoneTabV2.f35139L;
                                                homePalmZoneTabV2.f35148w = new Me.r(iVar4 != null ? (LinearLayout) iVar4.f730i : null, V.f(homePalmZoneTabV2), (PalmZoneViewModel) homePalmZoneTabV2.f27333i);
                                            }
                                            PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) homePalmZoneTabV2.f27333i;
                                            if (palmZoneViewModel2 != null) {
                                                palmZoneViewModel2.f();
                                            }
                                            PalmZoneViewModel palmZoneViewModel3 = (PalmZoneViewModel) homePalmZoneTabV2.f27333i;
                                            if (palmZoneViewModel3 != null) {
                                                palmZoneViewModel3.h();
                                            }
                                        }
                                        Me.r rVar = homePalmZoneTabV2.f35148w;
                                        if (rVar != null) {
                                            View view5 = rVar.f5998f;
                                            if (view5 != null) {
                                                p220oa.h.s(view5, zBooleanValue3);
                                            }
                                            rVar.k(rVar.f5998f, zBooleanValue3);
                                            if (!zBooleanValue3) {
                                                rVar.m();
                                            }
                                        }
                                    }
                                    break;
                                case 710140333:
                                    if (str.equals("permiumBenefits")) {
                                        Boolean bool5 = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : true;
                                        if (zBooleanValue4 && homePalmZoneTabV2.f35146p == null) {
                                            Bc.i iVar5 = homePalmZoneTabV2.f35139L;
                                            homePalmZoneTabV2.f35146p = new Me.m(iVar5 != null ? (LinearLayout) iVar5.f730i : null, homePalmZoneTabV2.m());
                                        }
                                        if (zBooleanValue4) {
                                            Me.m mVar = homePalmZoneTabV2.f35146p;
                                            if (mVar != null && (modelPremiumBenefits = mVar.f5985e) != null) {
                                                modelPremiumBenefits.f35307e = mVar.f5983c;
                                                modelPremiumBenefits.d();
                                            }
                                        } else {
                                            Me.m mVar2 = homePalmZoneTabV2.f35146p;
                                            if (mVar2 != null) {
                                                View view6 = mVar2.f5984d;
                                                if (view6 != null) {
                                                    p220oa.h.s(view6, false);
                                                }
                                                mVar2.k(view6, false);
                                            }
                                        }
                                    }
                                    break;
                                case 1241550848:
                                    if (str.equals("palmPrize")) {
                                        Boolean bool6 = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue5 = bool6 != null ? bool6.booleanValue() : true;
                                        if (zBooleanValue5 && homePalmZoneTabV2.f35145o == null) {
                                            Bc.i iVar6 = homePalmZoneTabV2.f35139L;
                                            homePalmZoneTabV2.f35145o = new Me.l(iVar6 != null ? (LinearLayout) iVar6.f730i : null, homePalmZoneTabV2.m());
                                        }
                                        if (zBooleanValue5) {
                                            Me.l lVar = homePalmZoneTabV2.f35145o;
                                            if (lVar != null && (modelPalmPrizeBanner = lVar.f5980d) != null) {
                                                modelPalmPrizeBanner.d();
                                            }
                                        } else {
                                            Me.l lVar2 = homePalmZoneTabV2.f35145o;
                                            if (lVar2 != null) {
                                                View view7 = lVar2.f5979c;
                                                if (view7 != null) {
                                                    p220oa.h.s(view7, false);
                                                }
                                                lVar2.k(view7, false);
                                            }
                                        }
                                    }
                                    break;
                                case 2087424303:
                                    if (str.equals("adBanner")) {
                                        Boolean bool7 = queryModuleRankResp.moduleEnable;
                                        boolean zBooleanValue6 = bool7 != null ? bool7.booleanValue() : true;
                                        if (zBooleanValue6 && homePalmZoneTabV2.f35136B == null) {
                                            Bc.i iVar7 = homePalmZoneTabV2.f35139L;
                                            LinearLayout linearLayout2 = iVar7 != null ? (LinearLayout) iVar7.f730i : null;
                                            Me.k kVar = new Me.k(0);
                                            int i15 = Ac.f.main_home_rewards_tab_banner_stub;
                                            if (linearLayout2 != null) {
                                                viewH2 = kVar.h(linearLayout2, i15, null);
                                                linearLayout2.addView(viewH2);
                                            } else {
                                                viewH2 = null;
                                            }
                                            kVar.f5978d = viewH2;
                                            BannerAdView bannerAdView = viewH2 != null ? (BannerAdView) viewH2.findViewById(Ac.e.topBannerView) : null;
                                            kVar.f5977c = bannerAdView;
                                            if (bannerAdView != null) {
                                                bannerAdView.setAdListener(new C0158z(kVar, 10));
                                            }
                                            homePalmZoneTabV2.f35136B = kVar;
                                        }
                                        Me.k kVar2 = homePalmZoneTabV2.f35136B;
                                        if (kVar2 != null && (view2 = kVar2.f5978d) != null) {
                                            p220oa.h.s(view2, zBooleanValue6);
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
                Bc.i iVar8 = homePalmZoneTabV2.f35139L;
                if (iVar8 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) iVar8.f730i;
                    r10 = linearLayout3.getChildCount() > 0 ? linearLayout3 : 0;
                    if (r10 != 0 && (childAt = r10.getChildAt(0)) != null) {
                        p220oa.h.k(childAt, 0, null, null, null, 14);
                    }
                }
                return Unit.f38893a;
            case 7:
                Throwable e10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                LiveIDResult.Error error = new LiveIDResult.Error(e10);
                D6.e eVar = (D6.e) obj3;
                eVar.f1619o = error;
                do {
                    g0Var = eVar.f1617i;
                    value = g0Var.getValue();
                } while (!g0Var.compareAndSet(value, D6.i.a((D6.i) value, null, 0.0f, null, null, D6.g.f1637c, null, null, 79)));
                return Unit.f38893a;
            case 8:
                Throwable e11 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(e11, "e");
                LiveIDResult.Error error2 = new LiveIDResult.Error(e11);
                D6.m mVar3 = (D6.m) obj3;
                mVar3.f1683v = error2;
                do {
                    g0Var2 = mVar3.f1682p;
                    value2 = g0Var2.getValue();
                } while (!g0Var2.compareAndSet(value2, D6.i.a((D6.i) value2, null, 0.0f, null, null, D6.g.f1637c, null, null, 79)));
                return Unit.f38893a;
            case 9:
                IconicsDrawable apply3 = (IconicsDrawable) obj;
                InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                Intrinsics.checkNotNullParameter(apply3, "$this$apply");
                p118hf.a.I(apply3, 20);
                D3.a.F(apply3, ((InterBankCashInInstructionActivity) obj3).getColor(L6.b.ppColorPrimary));
                return Unit.f38893a;
            case 10:
                IconicsDrawable apply4 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply4, "$this$apply");
                p118hf.a.I(apply4, 16);
                D3.a.F(apply4, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, ((BankAccountPalmPayContactFragment) obj3).requireContext()));
                return Unit.f38893a;
            case 11:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                p220oa.h.y((TransferToBankHomeBeneficiariesFragment) obj3, it3);
                return Unit.f38893a;
            case 12:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                p220oa.h.y((TransferToBankHomeFavoriteFragment) obj3, it4);
                return Unit.f38893a;
            case 13:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                Balloon balloon = ((TransferToPalmPayHomeFragment) obj3).f33815B;
                if (balloon != null) {
                    balloon.f();
                }
                return Unit.f38893a;
            case 14:
                WithdrawHomeEntranceBean withdrawHomeEntranceBean = (WithdrawHomeEntranceBean) obj;
                WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) obj3;
                withdrawV2Fragment.f27068v0 = withdrawHomeEntranceBean;
                if (Intrinsics.c(withdrawHomeEntranceBean.stampDutySwitch, Boolean.TRUE) && (textView = (TextView) withdrawV2Fragment.f27067v.getValue()) != null) {
                    textView.setText(withdrawHomeEntranceBean.stampDutyMinAmountTip);
                }
                return Unit.f38893a;
            case 15:
                IconicsDrawable apply5 = (IconicsDrawable) obj;
                int i16 = BankCustomerServiceView.f33829c;
                Intrinsics.checkNotNullParameter(apply5, "$this$apply");
                p118hf.a.I(apply5, 12);
                D3.a.F(apply5, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, ((BankCustomerServiceView) obj3).getContext()));
                return Unit.f38893a;
            case 16:
                String account = (String) obj;
                int i17 = TransferToBankAccountView.f33899A;
                Intrinsics.checkNotNullParameter(account, "account");
                Bc.E e12 = ((TransferToBankAccountView) obj3).f33900c;
                if (e12 != null && (customAutoCompleteTextView = (CustomAutoCompleteTextView) e12.f648w) != null) {
                    CommonViewExtKt.setTextAndSelection(customAutoCompleteTextView, account);
                }
                return Unit.f38893a;
            case 17:
                String account2 = (String) obj;
                int i18 = TransferToPalmPayAccountView.t;
                Intrinsics.checkNotNullParameter(account2, "account");
                Bc.D d2 = ((TransferToPalmPayAccountView) obj3).f33930c;
                if (d2 != null && (customAutoCompleteTextView2 = (CustomAutoCompleteTextView) d2.f616b) != null) {
                    CommonViewExtKt.setTextAndSelection(customAutoCompleteTextView2, account2);
                }
                return Unit.f38893a;
            case 18:
                IconicsDrawable apply6 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply6, "$this$apply");
                p118hf.a.I(apply6, 20);
                apply6.f23574F = ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, ((Hb.P) obj3).c()));
                apply6.q();
                apply6.d();
                return Unit.f38893a;
            case 19:
                IconicsDrawable apply7 = (IconicsDrawable) obj;
                int i19 = KkCarQrView.f33948o;
                Intrinsics.checkNotNullParameter(apply7, "$this$apply");
                p118hf.a.I(apply7, 32);
                D3.a.F(apply7, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, ((KkCarQrView) obj3).getContext()));
                return Unit.f38893a;
            case 20:
                VerifyQuestionNodeBean verifyQuestionNodeBean = (VerifyQuestionNodeBean) obj;
                if (verifyQuestionNodeBean != null) {
                    final CheckSafetyAssessmentQAQuestionFragment checkSafetyAssessmentQAQuestionFragment = (CheckSafetyAssessmentQAQuestionFragment) obj3;
                    checkSafetyAssessmentQAQuestionFragment.t = verifyQuestionNodeBean;
                    p142ja.j jVar3 = (p142ja.j) checkSafetyAssessmentQAQuestionFragment.f27335j;
                    if (jVar3 != null) {
                        jVar3.f38494f.setText(verifyQuestionNodeBean.questionTitle);
                        jVar3.f38493e.setText(verifyQuestionNodeBean.questionContent);
                        ?? llQuestionContainer = jVar3.f38490b;
                        Intrinsics.checkNotNullExpressionValue(llQuestionContainer, "llQuestionContainer");
                        while (llQuestionContainer.getChildCount() > 1) {
                            llQuestionContainer.removeViewAt(1);
                        }
                        ArrayList arrayList = checkSafetyAssessmentQAQuestionFragment.f28022v;
                        arrayList.clear();
                        List<VerifyQuestionOptionBean> list = verifyQuestionNodeBean.optionDTOList;
                        if (list != null) {
                            for (final VerifyQuestionOptionBean verifyQuestionOptionBean : list) {
                                Context contextRequireContext = checkSafetyAssessmentQAQuestionFragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                ?? linearLayout4 = new LinearLayout(contextRequireContext);
                                linearLayout4.setOrientation(0);
                                linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                linearLayout4.setGravity(48);
                                linearLayout4.setPadding(CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(12));
                                final IconicsCheckBox iconicsCheckBox2 = new IconicsCheckBox(contextRequireContext, r10, 6, i10);
                                iconicsCheckBox2.setTag(verifyQuestionOptionBean.optionNumber);
                                iconicsCheckBox2.setBackground(null);
                                iconicsCheckBox2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                iconicsCheckBox2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, contextRequireContext));
                                IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, S6.a.pay_CircleFill);
                                iconicsDrawable.a(new Ja.z(contextRequireContext, i10));
                                iconicsCheckBox2.setCheckedIcon(iconicsDrawable);
                                IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext, S6.a.pay_CircleOutline);
                                iconicsDrawable2.a(new Ja.z(contextRequireContext, 1));
                                iconicsCheckBox2.setUncheckedIcon(iconicsDrawable2);
                                iconicsCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ja.A
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                                        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                                        CheckSafetyAssessmentQAQuestionFragment checkSafetyAssessmentQAQuestionFragment2 = checkSafetyAssessmentQAQuestionFragment;
                                        ArrayList<IconicsCheckBox> arrayList2 = checkSafetyAssessmentQAQuestionFragment2.f28022v;
                                        if (!z3) {
                                            if (arrayList2 == null || !arrayList2.isEmpty()) {
                                                Iterator it5 = arrayList2.iterator();
                                                while (it5.hasNext()) {
                                                    if (((IconicsCheckBox) it5.next()).isChecked()) {
                                                        return;
                                                    }
                                                }
                                            }
                                            p142ja.j jVar4 = (p142ja.j) checkSafetyAssessmentQAQuestionFragment2.f27335j;
                                            if (jVar4 != null) {
                                                jVar4.f38491c.setEnabled(false);
                                                return;
                                            }
                                            return;
                                        }
                                        for (IconicsCheckBox iconicsCheckBox3 : arrayList2) {
                                            if (!Intrinsics.c(iconicsCheckBox3, iconicsCheckBox2)) {
                                                iconicsCheckBox3.setChecked(false);
                                            }
                                        }
                                        String str2 = verifyQuestionOptionBean.optionNumber;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        VerifyQuestionNodeBean verifyQuestionNodeBean2 = checkSafetyAssessmentQAQuestionFragment2.t;
                                        if (verifyQuestionNodeBean2 != null) {
                                            verifyQuestionNodeBean2.selectedOptionId = str2;
                                        }
                                        p142ja.j jVar5 = (p142ja.j) checkSafetyAssessmentQAQuestionFragment2.f27335j;
                                        if (jVar5 != null) {
                                            jVar5.f38491c.setEnabled(true);
                                        }
                                    }
                                });
                                TextView textView3 = new TextView(contextRequireContext);
                                textView3.setText(verifyQuestionOptionBean.optionContent);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                                layoutParams.leftMargin = CommonViewExtKt.getDp(8);
                                textView3.setLayoutParams(layoutParams);
                                textView3.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, contextRequireContext));
                                textView3.setTextSize(16.0f);
                                textView3.setGravity(48);
                                textView3.setOnClickListener(new Ha.d(iconicsCheckBox2, 29));
                                linearLayout4.addView(iconicsCheckBox2);
                                linearLayout4.addView(textView3);
                                arrayList.add(iconicsCheckBox2);
                                llQuestionContainer.addView(linearLayout4);
                            }
                        }
                        String str2 = verifyQuestionNodeBean.selectedOptionId;
                        PpButton ppButton = jVar3.f38491c;
                        if (str2 != null) {
                            for (Object obj4 : arrayList) {
                                if (Intrinsics.c(((IconicsCheckBox) obj4).getTag(), str2)) {
                                    obj2 = obj4;
                                    iconicsCheckBox = (IconicsCheckBox) obj2;
                                    if (iconicsCheckBox != null) {
                                        iconicsCheckBox.setChecked(true);
                                    }
                                    ppButton.setEnabled(true);
                                }
                            }
                            iconicsCheckBox = (IconicsCheckBox) obj2;
                            if (iconicsCheckBox != null) {
                                iconicsCheckBox.setChecked(true);
                            }
                            ppButton.setEnabled(true);
                        } else {
                            ppButton.setEnabled(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 21:
                IconicsDrawable apply8 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply8, "$this$apply");
                p118hf.a.I(apply8, 16);
                Context context = ((Ke.i) obj3).f5447a;
                Intrinsics.e(context);
                D3.a.F(apply8, context.getColor(L6.b.ppColorTextPrimary));
                return Unit.f38893a;
            case 22:
                String it5 = (String) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                ((ArrayList) obj3).add(it5);
                return Unit.f38893a;
            case 23:
                return SearchBarView.b((SearchBarView) obj3, (CustomSearchView) obj);
            case 24:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                Me.l lVar3 = (Me.l) obj3;
                AppCompatImageView appCompatImageView = (AppCompatImageView) lVar3.f5949a;
                if (appCompatImageView != null) {
                    p220oa.h.A(appCompatImageView, false, p025ba.a.core_anim_fade_out);
                }
                ModelPalmPrizeBanner modelPalmPrizeBanner2 = lVar3.f5980d;
                if (zBooleanValue7) {
                    if (modelPalmPrizeBanner2 != null) {
                        p220oa.h.A(modelPalmPrizeBanner2, true, p025ba.a.core_anim_fade_in);
                    }
                } else if (modelPalmPrizeBanner2 != null) {
                    p220oa.h.c(modelPalmPrizeBanner2);
                }
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                boolean zBooleanValue8 = ((Boolean) obj).booleanValue();
                Me.m mVar4 = (Me.m) obj3;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) mVar4.f5949a;
                if (appCompatImageView2 != null) {
                    p220oa.h.A(appCompatImageView2, false, p025ba.a.core_anim_fade_out);
                }
                if (zBooleanValue8) {
                    View view8 = mVar4.f5984d;
                    if (view8 != null) {
                        p220oa.h.s(view8, true);
                    }
                    mVar4.k(view8, true);
                    ModelPremiumBenefits modelPremiumBenefits2 = mVar4.f5985e;
                    if (modelPremiumBenefits2 != null) {
                        p220oa.h.A(modelPremiumBenefits2, true, p025ba.a.core_anim_fade_in);
                    }
                } else {
                    View view9 = mVar4.f5984d;
                    if (view9 != null) {
                        p220oa.h.s(view9, false);
                    }
                    mVar4.k(view9, false);
                }
                return Unit.f38893a;
            case 26:
                return Float.valueOf(((SheetDelegate) obj3).f25394a.getHeight());
            case 27:
                androidx.activity.z addCallback = (androidx.activity.z) obj;
                AccountActivateSuccessActivity.a aVar4 = AccountActivateSuccessActivity.f25810a;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                AccountActivateSuccessActivity accountActivateSuccessActivity = (AccountActivateSuccessActivity) obj3;
                ActivityResultCaller activityResultCallerD = accountActivateSuccessActivity.getSupportFragmentManager().D(F8.d.fragmentContainer);
                if ((activityResultCallerD instanceof CustomActionCallback) && ((CustomActionCallback) activityResultCallerD).goBack(null)) {
                    return Unit.f38893a;
                }
                i0.H(null);
                accountActivateSuccessActivity.finish();
                return Unit.f38893a;
            case 28:
                androidx.activity.z addCallback2 = (androidx.activity.z) obj;
                AddGuardianActivity.a aVar5 = AddGuardianActivity.f25811i;
                Intrinsics.checkNotNullParameter(addCallback2, "$this$addCallback");
                AddGuardianActivity addGuardianActivity = (AddGuardianActivity) obj3;
                F6.d.h(addGuardianActivity.TAG, 3, d0.q("addOnBackPressedCallback: ", addGuardianActivity.isTaskRoot()));
                NavHostFragment navHostFragment = addGuardianActivity.f25812a;
                Object obj5 = (navHostFragment == null || (childFragmentManager = navHostFragment.getChildFragmentManager()) == null || (listF = childFragmentManager.f17069c.f()) == null) ? null : (Fragment) listF.get(0);
                if (obj5 instanceof AddGuardianResultFragment) {
                    addGuardianActivity.finish();
                    return Unit.f38893a;
                }
                if ((obj5 instanceof CustomActionCallback) && ((CustomActionCallback) obj5).goBack(null)) {
                    return Unit.f38893a;
                }
                NavHostFragment navHostFragment2 = addGuardianActivity.f25812a;
                if (navHostFragment2 != null && (pF = navHostFragment2.f()) != null && !pF.j()) {
                    i0.l();
                    i0.H(null);
                }
                return Unit.f38893a;
            default:
                androidx.activity.z addCallback3 = (androidx.activity.z) obj;
                EnableCashBoxAutoSaveActivity.a aVar6 = EnableCashBoxAutoSaveActivity.f25851j;
                Intrinsics.checkNotNullParameter(addCallback3, "$this$addCallback");
                n0.g().l("CashBoxAutoSaveBackButton");
                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = (EnableCashBoxAutoSaveActivity) obj3;
                enableCashBoxAutoSaveActivity.n(enableCashBoxAutoSaveActivity.f25854e);
                return Unit.f38893a;
        }
    }
}
