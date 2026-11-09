package p287se;

import Ab.y;
import Bc.i;
import C0.G;
import Kd.C0397n;
import Ke.h;
import M1.j;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pe.p0;
import Wf.AbstractC0780y;
import Wf.I;
import Ya.b;
import Ya.g;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.transition.X;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.betting.ui.fragment.BettingHistoryFragment;
import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.SelectBillTypeDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillData;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListData;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.bean.rsp.PalmPayCardBillData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInviteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcInviteDiscoverDialog;
import com.transsnet.palmpay.credit.ui.fragment.BeneficiariesListFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanProductListFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnWithDraw;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnTipDialog;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.main.export.bean.rsp.ThirdPartyMerchantListResp;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.CreateBankShortcutActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayContactActivity;
import com.transsnet.palmpay.send_money.viewmodel.PayMeViewModel;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.ui.activity.settings.SetPaymentMethodActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantListActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.PayMethodViewModel;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;
import org.greenrobot.eventbus.c;
import p042cg.e;
import p051d9.C1605b;
import p141j9.C1798f;
import p235pb.p;
import p236pc.f;
import p294tb.C2057t;
import p310ub.K0;
import p355xf.t;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Argument2Callback, OnItemClickListener, BiFunction, Consumer, Function, Action, AmountEditText.OnTextInputListener, OnItemChildClickListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, PinEntryView.OnPinEnteredListener, SelectBillTypeDialog.CallBack, PpAmountEditText.OnTextInputListener, TabLayoutMediator.TabConfigurationStrategy, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42248b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f42247a = i7;
        this.f42248b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        Object obj2 = this.f42248b;
        switch (this.f42247a) {
            case 12:
                int i7 = ThirdPartyMerchantListActivity.f34998c;
                ThirdPartyMerchantListActivity thirdPartyMerchantListActivity = (ThirdPartyMerchantListActivity) obj2;
                thirdPartyMerchantListActivity.getClass();
                thirdPartyMerchantListActivity.startActivity(new Intent(thirdPartyMerchantListActivity, (Class<?>) ThirdPartyMerchantActivity.class).putExtra("merchant", (ThirdPartyMerchantListResp.ThirdPartyMerchant) obj));
                break;
            case 13:
            default:
                ReferEarnWithDraw referEarnWithDraw = (ReferEarnWithDraw) obj;
                ReferEarnWithdrawListFragment.a aVar = ReferEarnWithdrawListFragment.f31960w;
                int id2 = view.getId();
                ReferEarnWithdrawListFragment referEarnWithdrawListFragment = (ReferEarnWithdrawListFragment) obj2;
                if (id2 == p236pc.d.jp_history_action) {
                    CharSequence text = ((TextView) view).getText();
                    if (Intrinsics.c(text, referEarnWithdrawListFragment.getString(f.jp_resolve))) {
                        ARouter.getInstance().build("/refer_earn/resolve").withString("extra_data", referEarnWithDraw.referId).navigation();
                    } else if (Intrinsics.c(text, referEarnWithdrawListFragment.getString(f.jp_withdraw))) {
                        String str = referEarnWithDraw.referId;
                        referEarnWithdrawListFragment.showLoadingDialog(true);
                        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(referEarnWithdrawListFragment);
                        p042cg.f fVar = I.f10809a;
                        AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new p340wc.d(null, str, referEarnWithdrawListFragment), 2);
                    } else if (Intrinsics.c(text, referEarnWithdrawListFragment.getString(f.jp_share_earn))) {
                        ARouter.getInstance().build("/coreImpl/comment_add").withString("orderNo", referEarnWithDraw.orderNo).withString("COMMENT_TYPE", "ReferEarn").navigation();
                    }
                    break;
                } else if (id2 == p236pc.d.jp_history_failed && !TextUtils.isEmpty(referEarnWithDraw.remark)) {
                    Context contextRequireContext = referEarnWithdrawListFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    new ReferEarnTipDialog(contextRequireContext, referEarnWithDraw.remark).show();
                    break;
                }
                break;
            case 14:
                OcInviteListData ocInviteListData = (OcInviteListData) obj;
                int i10 = OcReferEarnActivity.f29672M;
                int id3 = view.getId();
                OcReferEarnActivity ocReferEarnActivity = (OcReferEarnActivity) obj2;
                if (id3 == Ya.e.parentInvite) {
                    new OcInviteDiscoverDialog(ocReferEarnActivity, new K0(ocReferEarnActivity)).show();
                } else if (id3 == Ya.e.tvInvite) {
                    ArrayList arrayList = new ArrayList();
                    String strSubstring = ocInviteListData.getFriendPhone().substring(1, 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = ocInviteListData.getFriendPhone().substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    arrayList.add("+" + strSubstring + strSubstring2);
                    ((p) ocReferEarnActivity.f27350a).inviteSms(ocReferEarnActivity, arrayList);
                }
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.AmountEditText.OnTextInputListener, com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        Long unpaidPrincipal;
        Long unpaidServiceFee;
        Long unpaidInterest;
        Long unpaidPenalty;
        Long unpaidAmount;
        Long unpaidAmount2;
        StampDutyPromptInfo stampDutyPromptInfo;
        Long unpaidPrincipal2;
        Long unpaidServiceFee2;
        Long unpaidInterest2;
        Long unpaidPenalty2;
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 10:
                int i7 = CLRepaymentActivity.f29036w0;
                CLRepaymentActivity cLRepaymentActivity = (CLRepaymentActivity) obj;
                AmountEditText amountEditTextQ = cLRepaymentActivity.q();
                long j6 = amountEditTextQ != null ? amountEditTextQ.getLong() : 0L;
                CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                long jLongValue = (cLCurrentBillData == null || (unpaidAmount2 = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount2.longValue();
                long j10 = cLRepaymentActivity.f29057q0;
                t tVar = cLRepaymentActivity.f29050g;
                if (j6 < j10) {
                    cLRepaymentActivity.r().setText(cLRepaymentActivity.getString(g.cs_cl_min_repayment_amount, r0.B(j10, false)));
                    CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                    if (((cLCurrentBillData2 == null || (unpaidAmount = cLCurrentBillData2.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue()) < j10) {
                        cLRepaymentActivity.r().setVisibility(8);
                        cLRepaymentActivity.o().setActionButtonEnable(true);
                        Object value = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ((Button) value).setEnabled(true);
                    } else {
                        cLRepaymentActivity.r().setVisibility(0);
                        cLRepaymentActivity.t().setBackgroundColor(cLRepaymentActivity.getColor(b.cs_cl_repayment_amount_tips_txt_color));
                        cLRepaymentActivity.o().setActionButtonEnable(false);
                        Object value2 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((Button) value2).setEnabled(false);
                    }
                } else if (j6 > jLongValue) {
                    cLRepaymentActivity.r().setText(cLRepaymentActivity.getString(g.cs_cl_max_repayment_amount, r0.B(jLongValue, true)));
                    cLRepaymentActivity.r().setVisibility(0);
                    cLRepaymentActivity.t().setBackgroundColor(cLRepaymentActivity.getColor(b.cs_cl_repayment_amount_tips_txt_color));
                    cLRepaymentActivity.o().setActionButtonEnable(false);
                    Object value3 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    ((Button) value3).setEnabled(false);
                } else {
                    cLRepaymentActivity.r().setVisibility(8);
                    cLRepaymentActivity.t().setBackgroundColor(cLRepaymentActivity.getColor(b.cs_cl_input_divider_focus_color));
                    cLRepaymentActivity.o().setActionButtonEnable(true);
                    Object value4 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((Button) value4).setEnabled(true);
                }
                CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                long jLongValue2 = (cLCurrentBillData3 == null || (unpaidPenalty = cLCurrentBillData3.getUnpaidPenalty()) == null) ? 0L : unpaidPenalty.longValue();
                CLCurrentBillData cLCurrentBillData4 = cLRepaymentActivity.f29053k0;
                long jLongValue3 = (cLCurrentBillData4 == null || (unpaidInterest = cLCurrentBillData4.getUnpaidInterest()) == null) ? 0L : unpaidInterest.longValue();
                CLCurrentBillData cLCurrentBillData5 = cLRepaymentActivity.f29053k0;
                long jLongValue4 = (cLCurrentBillData5 == null || (unpaidServiceFee = cLCurrentBillData5.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee.longValue();
                CLCurrentBillData cLCurrentBillData6 = cLRepaymentActivity.f29053k0;
                long jLongValue5 = (cLCurrentBillData6 == null || (unpaidPrincipal = cLCurrentBillData6.getUnpaidPrincipal()) == null) ? 0L : unpaidPrincipal.longValue();
                if (j6 < jLongValue2) {
                    jLongValue2 = j6;
                }
                long j11 = j6 - jLongValue2;
                if (j11 < jLongValue3) {
                    jLongValue3 = j11;
                }
                long j12 = j11 - jLongValue3;
                if (j12 < jLongValue4) {
                    jLongValue4 = j12;
                }
                long j13 = j12 - jLongValue4;
                if (j13 < jLongValue5) {
                    jLongValue5 = j13;
                }
                Object value5 = cLRepaymentActivity.t.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setText(r0.B(jLongValue5, false));
                Object value6 = cLRepaymentActivity.f29054o.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(r0.B(jLongValue3, false));
                Object value7 = cLRepaymentActivity.f29052j.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((TextView) value7).setText(r0.B(jLongValue4, false));
                Object value8 = cLRepaymentActivity.f29051i.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((TextView) value8).setText(r0.B(jLongValue2, false));
                break;
            case 16:
                int i10 = OcRepayActivity.f29705v1;
                OcRepayActivity ocRepayActivity = (OcRepayActivity) obj;
                long j14 = ocRepayActivity.x().getLong();
                F6.d.h(ocRepayActivity.TAG, 3, u.i(j14, "OnTextInput >>> "));
                Object value9 = ocRepayActivity.f29717H0.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((TextView) value9).setText(r0.B(j14, true));
                long j15 = ocRepayActivity.f29764q1;
                if (j14 != j15) {
                    OcRepayActivity.E(ocRepayActivity.z(), false);
                }
                if (j14 != ocRepayActivity.f1) {
                    OcRepayActivity.E(ocRepayActivity.u(), false);
                }
                WaiverInfo waiverInfoD = ocRepayActivity.D();
                boolean zC = Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL);
                t tVar2 = ocRepayActivity.f29724M0;
                if (zC) {
                    ocRepayActivity.t().setVisibility(8);
                    ocRepayActivity.p();
                } else if (j14 < j15) {
                    F6.d.h(ocRepayActivity.TAG, 5, "OnTextInput >>> less");
                    if (ocRepayActivity.f1 >= j15) {
                        ocRepayActivity.t().setText(ocRepayActivity.getString(g.cs_oc_minimum_repayment));
                        ocRepayActivity.t().setVisibility(0);
                        ocRepayActivity.o();
                    } else {
                        ocRepayActivity.t().setVisibility(8);
                        ocRepayActivity.p();
                    }
                } else if (j14 > ocRepayActivity.f1) {
                    F6.d.h(ocRepayActivity.TAG, 5, "OnTextInput >>> more");
                    ocRepayActivity.t().setText(ocRepayActivity.getString(g.cs_oc_max_repayment, r0.B(ocRepayActivity.f1, true)));
                    ocRepayActivity.t().setVisibility(0);
                    ocRepayActivity.o();
                } else {
                    F6.d.h(ocRepayActivity.TAG, 4, "OnTextInput >>> between");
                    ocRepayActivity.t().setVisibility(8);
                    OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                    if (ocCurBillData != null && (stampDutyPromptInfo = ocCurBillData.getStampDutyPromptInfo()) != null) {
                        Long thresholdAmount = stampDutyPromptInfo.getThresholdAmount();
                        boolean z3 = j14 >= (thresholdAmount != null ? thresholdAmount.longValue() : 1000000L);
                        Object value10 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ((RepayStampDutyView) value10).d(z3, stampDutyPromptInfo);
                    }
                    ocRepayActivity.p();
                }
                m mVar = new m();
                t tVar3 = ocRepayActivity.f29715G0;
                Object value11 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                mVar.e((ConstraintLayout) value11);
                Object value12 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                X.a((ConstraintLayout) value12, null);
                Object value13 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                if (((RepayStampDutyView) value13).getVisibility() == 0) {
                    mVar.h(Ya.e.oc_repay_all_tv, 3, Ya.e.repayStampDutyView, 4, CommonViewExtKt.getDp(12));
                } else {
                    mVar.h(Ya.e.oc_repay_all_tv, 3, Ya.e.min_amount_warn_tv, 4, CommonViewExtKt.getDp(12));
                }
                Object value14 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                mVar.b((ConstraintLayout) value14);
                long j16 = ocRepayActivity.x().getLong();
                if (Intrinsics.c(ocRepayActivity.f29751i1, "PALMPAY_CARD") && ocRepayActivity.f29749h1 != null) {
                    F6.d.h(ocRepayActivity.TAG, 3, u.i(j16, "calculateRepayDetail >>> inputAmount="));
                    PalmPayCardBillData palmPayCardBillData = ocRepayActivity.f29749h1;
                    long jLongValue6 = (palmPayCardBillData == null || (unpaidPenalty2 = palmPayCardBillData.getUnpaidPenalty()) == null) ? 0L : unpaidPenalty2.longValue();
                    PalmPayCardBillData palmPayCardBillData2 = ocRepayActivity.f29749h1;
                    long jLongValue7 = (palmPayCardBillData2 == null || (unpaidInterest2 = palmPayCardBillData2.getUnpaidInterest()) == null) ? 0L : unpaidInterest2.longValue();
                    PalmPayCardBillData palmPayCardBillData3 = ocRepayActivity.f29749h1;
                    long jLongValue8 = (palmPayCardBillData3 == null || (unpaidServiceFee2 = palmPayCardBillData3.getUnpaidServiceFee()) == null) ? 0L : unpaidServiceFee2.longValue();
                    PalmPayCardBillData palmPayCardBillData4 = ocRepayActivity.f29749h1;
                    long jLongValue9 = (palmPayCardBillData4 == null || (unpaidPrincipal2 = palmPayCardBillData4.getUnpaidPrincipal()) == null) ? 0L : unpaidPrincipal2.longValue();
                    if (j16 < jLongValue6) {
                        jLongValue6 = j16;
                    }
                    long j17 = j16 - jLongValue6;
                    if (j17 < jLongValue7) {
                        jLongValue7 = j17;
                    }
                    long j18 = j17 - jLongValue7;
                    if (j18 < jLongValue8) {
                        jLongValue8 = j18;
                    }
                    long j19 = j18 - jLongValue8;
                    if (j19 >= jLongValue9) {
                        j19 = jLongValue9;
                    }
                    Object value15 = ocRepayActivity.f29777y0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                    ((TextView) value15).setText(r0.B(j19, true));
                    ocRepayActivity.y().setText(r0.B(jLongValue6, true));
                    Object value16 = ocRepayActivity.f29767s0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                    ((TextView) value16).setText(r0.B(jLongValue7, true));
                    Object value17 = ocRepayActivity.f29763q0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    ((TextView) value17).setText(r0.B(jLongValue8, true));
                    break;
                }
                break;
            default:
                ((BettingWithdrawHomeFragment) obj).C();
                break;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        Object obj2 = this.f42248b;
        switch (this.f42247a) {
            case 3:
                int i7 = CLMainActivity.f28940q0;
                ((C2057t) obj2).invoke(obj);
                break;
            case 4:
                int i10 = CLMainActivity.f28940q0;
                ((C2057t) obj2).invoke(obj);
                break;
            case 7:
                int i11 = CLOpenResultActivity.f28955V0;
                ((C1798f) obj2).invoke(obj);
                break;
            case 8:
                int i12 = CLOpenResultActivity.f28955V0;
                ((D) obj2).invoke(obj);
                break;
            case 21:
                int i13 = CreateBankShortcutActivity.f33501e;
                ((C1798f) obj2).invoke(obj);
                break;
            case 23:
                int i14 = InputMobileActivity.f33535Z;
                ((C1605b) obj2).invoke(obj);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                p339wb.d dVar = ((BeneficiariesListFragment) obj2).f30231p;
                dVar.f43364b = (List) obj;
                dVar.notifyDataSetChanged();
                break;
            default:
                p339wb.m mVar = ((MobileContactsListFragment) obj2).f30365v;
                mVar.f4985b = (List) obj;
                mVar.notifyDataSetChanged();
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object p3) {
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 5:
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (ObservableSource) ((C1798f) obj).invoke(p3);
            case 6:
                int i7 = CLOpenResultActivity.f28955V0;
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (Long) ((D) obj).invoke(p3);
            default:
                int i10 = InputMobileActivity.f33535Z;
                Intrinsics.checkNotNullParameter(p3, "p0");
                return (ObservableSource) ((p323v9.d) obj).invoke(p3);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Uri uri;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        int i7 = PersonalActivityV2.f34952C;
        if (iIntValue == -1) {
            Uri data = intent != null ? intent.getData() : null;
            a aVarD = a.d();
            Intrinsics.e(data);
            aVarD.f44149a.i("key_avatar", data.getPath());
            boolean zIsEmpty = TextUtils.isEmpty(data.getPath());
            PersonalActivityV2 personalActivityV2 = (PersonalActivityV2) this.f42248b;
            if (zIsEmpty) {
                User user = personalActivityV2.f34954B;
                if ((user != null ? user.getAvatar() : null) != null) {
                    User user2 = personalActivityV2.f34954B;
                    uri = Uri.parse(user2 != null ? user2.getAvatar() : null);
                } else {
                    uri = null;
                }
                h hVar = personalActivityV2.f34955b;
                if (hVar != null) {
                    i iVar = (i) hVar.f5446d;
                    if (uri == null) {
                        r0.d1(iVar != null ? (RoundImageView) iVar.f725c : null, r.cv_avatar_default);
                    } else {
                        r0.f1(iVar != null ? (RoundImageView) iVar.f725c : null, uri);
                    }
                }
            } else {
                h hVar2 = personalActivityV2.f34955b;
                if (hVar2 != null) {
                    i iVar2 = (i) hVar2.f5446d;
                    r0.f1(iVar2 != null ? (RoundImageView) iVar2.f725c : null, data);
                }
            }
            G.u(4, c.b());
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 24:
                int i10 = TransferToPalmPayContactActivity.f33591j;
                Intrinsics.checkNotNullParameter(tab, "tab");
                tab.setText((CharSequence) ((ArrayList) ((TransferToPalmPayContactActivity) obj).f33597i.getValue()).get(i7));
                break;
            default:
                LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                Intrinsics.checkNotNullParameter(tab, "tab");
                LoanHomeFragment loanHomeFragment = (LoanHomeFragment) obj;
                View viewInflate = LayoutInflater.from(loanHomeFragment.requireContext()).inflate(Ya.f.cs_item_loan_home_tab, (ViewGroup) null);
                viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                TextView textView = (TextView) viewInflate.findViewById(Ya.e.tvTabText);
                AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(Ya.e.ivTabIcon);
                if (i7 == 0) {
                    textView.setText(loanHomeFragment.getString(g.cs_loan_home_tab_loan));
                    Context contextRequireContext = loanHomeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, S6.a.pay_LoanFill);
                    iconicsDrawable.a(new p323v9.d(5));
                    appCompatImageView.setImageDrawable(iconicsDrawable);
                } else {
                    textView.setText(loanHomeFragment.getString(g.cs_loan_home_tab_repayment));
                    Context contextRequireContext2 = loanHomeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext2, S6.a.pay_Friends);
                    iconicsDrawable2.a(new p323v9.d(6));
                    appCompatImageView.setImageDrawable(iconicsDrawable2);
                }
                tab.setCustomView(viewInflate);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j adapter, View view, int i7) {
        String string;
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 11:
                int i10 = PayMeActivity.t;
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                final PayMeActivity payMeActivity = (PayMeActivity) obj;
                PosterAccountBean posterAccountBean = (PosterAccountBean) payMeActivity.o().getData().get(i7);
                int id2 = view.getId();
                if (id2 == p159kd.e.tv_copy_info) {
                    n0.g().l("PPay_PayME_Btn_Copy_Number");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Account Number: " + posterAccountBean.getMappingAccountNo() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    sb2.append("Bank: PalmPay or PalmPay Limited\n");
                    sb2.append("Name:" + posterAccountBean.getAccountName());
                    ClipboardUtils.copyText(sb2);
                    ToastUtils.showLong(v.cv_copy_successful);
                    com.facebook.imagepipeline.nativecode.b.D(payMeActivity, sb2.toString());
                } else if (id2 == p159kd.e.tv_download) {
                    n0.g().l("PPay_PayME_Btn_Share");
                    final PosterAccountBean posterAccountBean2 = (PosterAccountBean) payMeActivity.o().getData().get(i7);
                    r0.L1(null, new CompleteCallback() { // from class: td.b
                        @Override // com.transsnet.palmpay.core.callback.CompleteCallback
                        public final void onComplete(Object[] objArr) {
                            Integer accountType;
                            File[] fileArr = (File[]) objArr;
                            int i11 = PayMeActivity.t;
                            if (fileArr == null || fileArr.length == 0 || (accountType = posterAccountBean2.getAccountType()) == null || accountType.intValue() != 0) {
                                return;
                            }
                            Context context = BaseApplication.getContext();
                            String strW = i0.w(BaseApplication.getContext());
                            File file = fileArr[0];
                            Intrinsics.e(file);
                            com.facebook.imagepipeline.nativecode.b.F(payMeActivity, androidx.core.content.f.getUriForFile(context, strW, file));
                        }
                    }, payMeActivity.o().getViewByPosition(i7, p159kd.e.iv_account));
                } else if (id2 == p159kd.e.tv_get_now) {
                    PayMeViewModel payMeViewModel = (PayMeViewModel) payMeActivity.l();
                    payMeViewModel.getClass();
                    p140j8.f.s(payMeViewModel, new C0397n(1, null), payMeViewModel.f33982f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            default:
                WelcomeBackActivity.a aVar = WelcomeBackActivity.f35031o;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                Object item = adapter.getItem(i7);
                Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean");
                WelcomeCouponBean welcomeCouponBean = (WelcomeCouponBean) item;
                WelcomeBackActivity welcomeBackActivity = (WelcomeBackActivity) obj;
                ActivityUtils.startActivity(F.a(welcomeBackActivity, welcomeCouponBean.androidUrl));
                n0 n0VarG = n0.g();
                ClickEvent clickEventAdd = new ClickEvent("olduserPagecouponClick").add(FirebaseAnalytics.Param.COUPON, welcomeCouponBean.title);
                Integer num = welcomeCouponBean.priority;
                if (num == null || (string = num.toString()) == null) {
                    string = "0";
                }
                n0VarG.k(clickEventAdd.add("priority", string));
                welcomeBackActivity.finish();
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 1:
                int i10 = SetPaymentMethodActivity.f34967f;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                SetPaymentMethodActivity setPaymentMethodActivity = (SetPaymentMethodActivity) obj;
                int i11 = 0;
                for (Object obj2 : setPaymentMethodActivity.m()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C1850q.k();
                        throw null;
                    }
                    if (i11 == i7) {
                        ((PaymentMethodListResp.DataBean.Data) setPaymentMethodActivity.m().get(i11)).setPrefered(1);
                    } else {
                        ((PaymentMethodListResp.DataBean.Data) setPaymentMethodActivity.m().get(i11)).setPrefered(0);
                    }
                    i11 = i12;
                }
                ((p328ve.t) setPaymentMethodActivity.f34970e.getValue()).notifyDataSetChanged();
                int type = ((PaymentMethodListResp.DataBean.Data) setPaymentMethodActivity.m().get(i7)).getType();
                PayMethodViewModel payMethodViewModel = (PayMethodViewModel) setPaymentMethodActivity.l();
                if (payMethodViewModel != null) {
                    kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
                    PaymentMethodListResp.DataBean.Data data = new PaymentMethodListResp.DataBean.Data();
                    f10.f38951a = data;
                    data.setType(type);
                    p140j8.f.s(payMethodViewModel, new p0(f10, null), payMethodViewModel.f35402e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                }
                return;
            default:
                int i13 = BettingHistoryFragment.f26727A;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                BillerHistoryItemBean billerHistoryItemBean = (BillerHistoryItemBean) ((Xd.j) ((BettingHistoryFragment) obj).f26728w.getValue()).getData().get(i7);
                Integer itemType = billerHistoryItemBean.getItemType();
                if (itemType != null && itemType.intValue() == 1) {
                    ARouter.getInstance().build("/quick_teller/bill_detail").withString("orderNo", billerHistoryItemBean.getOrderNo()).withString("extra_type", Intrinsics.c(billerHistoryItemBean.getCategoryId(), "8") ? TransType.TRANS_TYPE_BILLER_BETTING : TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW).navigation();
                    return;
                }
                return;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String str) {
        int i7 = OcInviteActivity.f29551f;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        t tVar = ((OcInviteActivity) this.f42248b).f29552d;
        if (zIsEmpty || str.length() < 4) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Button) value).setEnabled(false);
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((Button) value2).setEnabled(true);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Object obj = this.f42248b;
        switch (this.f42247a) {
            case 27:
                LoanProductListFragment.a aVar = LoanProductListFragment.f30354p;
                ((LoanProductListFragment) obj).u();
                break;
            default:
                LoanRepaymentListFragment.a aVar2 = LoanRepaymentListFragment.f30356w;
                ((LoanRepaymentListFragment) obj).v(false, false);
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBillTypeDialog.CallBack
    public void onTypeSelected(BillType billType) {
        int i7 = OcRepaidListActivity.f29695w;
        String type = billType.type;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        OcRepaidListActivity ocRepaidListActivity = (OcRepaidListActivity) this.f42248b;
        ocRepaidListActivity.f29704v = type;
        ocRepaidListActivity.m(true);
        SelectBillTypeDialog selectBillTypeDialog = ocRepaidListActivity.f29701j;
        if (selectBillTypeDialog != null) {
            selectBillTypeDialog.dismiss();
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i7 = CLOpenResultActivity.f28955V0;
        ((CLOpenResultActivity) this.f42248b).n();
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object p3, Object p10) {
        int i7 = CLMainActivity.f28940q0;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        return (Pair) ((y) this.f42248b).invoke(p3, p10);
    }
}
