package V8;

import Bc.C0105b;
import C0.AbstractC0130w;
import C0.G;
import C0.U;
import C9.C0142i;
import C9.V;
import Jb.C0354m;
import N8.q0;
import Pa.AbstractC0512i;
import Pa.n0;
import Pa.r0;
import Rd.C0587c;
import Rd.C0593i;
import Rd.d0;
import Wf.C0765i;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.dialog.IdentityVerificationErrorDialog;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQBean;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpConfigInfoBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpTaskManagerActivity;
import com.transsnet.palmpay.airtime.ui.USSDTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpGuideFragment;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetWebActivity;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayLinkFavesFriendsActivity;
import com.transsnet.palmpay.core.bean.BillerUSSDInfoBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberAddressBean;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenRsp;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetMoneyConfigResp;
import com.transsnet.palmpay.core.bean.rsp.GetRecentMerchantsResp;
import com.transsnet.palmpay.core.bean.rsp.InvitationCodeResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.FlexiPayOneClickOpenActivity;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;
import com.transsnet.palmpay.credit.bean.resp.OcUpgradeGoldCardResp;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcGoldCardUpgradeConfirmDialog;
import com.transsnet.palmpay.credit.viewmodel.OcGoldCardUpgradeViewModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponData;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.SavingStatBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetPayoutOptionsResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetSavingHomeResp;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.J;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CongratulationsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxAutoSaveFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OldUserFixedSavingFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableListResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterActivity;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import face.security.device.api.FaceSecCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o9.K;
import o9.L;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10167b;

    public /* synthetic */ w(int i7, Object obj, Object obj2) {
        this.f10166a = i7;
        this.f10167b = obj2;
    }

    private final Object a(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonListResultV2.isSuccess() && commonListResultV2.data != null) {
                    int i7 = ScheduleTopUpHomeActivity.f26471i;
                    L l5 = (L) ((ScheduleTopUpHomeActivity) this.f10167b).f26474f.getValue();
                    Object cacheData = commonListResultV2.data;
                    if (cacheData == null) {
                        cacheData = kotlin.collections.z.f38935a;
                    }
                    l5.getClass();
                    Intrinsics.checkNotNullParameter(cacheData, "cacheData");
                    l5.f40123e.k(cacheData);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess() && commonBeanResult.data != 0) {
                    K k2 = (K) ((ScheduleTopUpTaskManagerActivity) this.f10167b).f26482j.getValue();
                    T data = commonBeanResult.data;
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    ScheduleTopUpConfigInfoBean info = (ScheduleTopUpConfigInfoBean) data;
                    k2.getClass();
                    Intrinsics.checkNotNullParameter(info, "info");
                    k2.f40121d.k(info);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj) {
        C0587c c0587c;
        PpAmountEditText ppAmountEditText;
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        List<Long> list;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = false;
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    BillerUSSDInfoBean billerUSSDInfoBean = (BillerUSSDInfoBean) commonBeanResult.data;
                    USSDTopUpHomeActivity uSSDTopUpHomeActivity = (USSDTopUpHomeActivity) this.f10167b;
                    if (billerUSSDInfoBean != null && (list = billerUSSDInfoBean.amounts) != null) {
                        uSSDTopUpHomeActivity.f26544e.clear();
                        ArrayList arrayList = uSSDTopUpHomeActivity.f26544e;
                        arrayList.addAll(list);
                        uSSDTopUpHomeActivity.n().setList(arrayList);
                    }
                    int i7 = USSDTopUpHomeActivity.f26542o;
                    C0587c c0587c2 = (C0587c) uSSDTopUpHomeActivity.f27334c;
                    if (c0587c2 != null && (textView2 = c0587c2.t) != null) {
                        BillerUSSDInfoBean billerUSSDInfoBean2 = (BillerUSSDInfoBean) commonBeanResult.data;
                        if (billerUSSDInfoBean2 != null && (str2 = billerUSSDInfoBean2.tips) != null && str2.length() > 0) {
                            z3 = true;
                        }
                        p220oa.h.s(textView2, z3);
                    }
                    C0587c c0587c3 = (C0587c) uSSDTopUpHomeActivity.f27334c;
                    if (c0587c3 != null && (textView = c0587c3.t) != null) {
                        BillerUSSDInfoBean billerUSSDInfoBean3 = (BillerUSSDInfoBean) commonBeanResult.data;
                        if (billerUSSDInfoBean3 == null || (str = billerUSSDInfoBean3.tips) == null) {
                            str = "";
                        }
                        textView.setText(str);
                    }
                    BillerUSSDInfoBean billerUSSDInfoBean4 = (BillerUSSDInfoBean) commonBeanResult.data;
                    if (!TextUtils.isEmpty(billerUSSDInfoBean4 != null ? billerUSSDInfoBean4.inputHint : null) && (c0587c = (C0587c) uSSDTopUpHomeActivity.f27334c) != null && (ppAmountEditText = c0587c.f8218f) != null) {
                        BillerUSSDInfoBean billerUSSDInfoBean5 = (BillerUSSDInfoBean) commonBeanResult.data;
                        ppAmountEditText.setHintText(billerUSSDInfoBean5 != null ? billerUSSDInfoBean5.inputHint : null);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object d(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CheckPayResp checkPayResp = (CheckPayResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = checkPayResp.isSuccess();
                CouponPackageResultActivity couponPackageResultActivity = (CouponPackageResultActivity) this.f10167b;
                if (zIsSuccess) {
                    PayByOrderResp.DataBean data = checkPayResp.getData();
                    if (data != null) {
                        couponPackageResultActivity.f34664c = data;
                        CouponPackageResultActivity.m(couponPackageResultActivity);
                    }
                } else {
                    p220oa.h.x(couponPackageResultActivity, checkPayResp.getRespMsg());
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:84:0x0142  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp;
        List<ScheduleTopUpAmountItemBean> month;
        List<ScheduleTopUpAmountItemBean> month2;
        d0 d0Var;
        Object next;
        String itemId;
        List<ScheduleTopUpAmountItemBean> week;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = (ScheduleTopUpEditTaskFragment) this.f10167b;
            if (z3) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                    d0 d0Var2 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                    if (d0Var2 != null) {
                        p220oa.h.C(d0Var2.f8251b);
                    }
                    ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp2 = (ScheduleTopUpAmountItemRsp) commonBeanResult.data;
                    scheduleTopUpEditTaskFragment.f26568B = scheduleTopUpAmountItemRsp2;
                    if ((scheduleTopUpAmountItemRsp2 == null || (week = scheduleTopUpAmountItemRsp2.getWeek()) == null || !(!week.isEmpty())) && (scheduleTopUpAmountItemRsp = (ScheduleTopUpAmountItemRsp) commonBeanResult.data) != null && (month = scheduleTopUpAmountItemRsp.getMonth()) != null && (!month.isEmpty())) {
                        scheduleTopUpEditTaskFragment.w(2);
                    } else {
                        scheduleTopUpEditTaskFragment.w(1);
                    }
                    ScheduleTopUpTaskBean scheduleTopUpTaskBean = scheduleTopUpEditTaskFragment.t;
                    if (scheduleTopUpTaskBean != null) {
                        Integer timeType = scheduleTopUpTaskBean.getTimeType();
                        Unit unit = null;
                        if (timeType != null && timeType.intValue() == 1) {
                            ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp3 = scheduleTopUpEditTaskFragment.f26568B;
                            if (scheduleTopUpAmountItemRsp3 != null) {
                                month2 = scheduleTopUpAmountItemRsp3.getWeek();
                            } else {
                                month2 = null;
                            }
                        } else {
                            ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp4 = scheduleTopUpEditTaskFragment.f26568B;
                            if (scheduleTopUpAmountItemRsp4 != null) {
                                month2 = scheduleTopUpAmountItemRsp4.getMonth();
                            } else {
                                month2 = null;
                            }
                        }
                        Integer timeType2 = scheduleTopUpTaskBean.getTimeType();
                        m9.r rVar = scheduleTopUpEditTaskFragment.f26570H;
                        int iIntValue = -1;
                        if (timeType2 != null && timeType2.intValue() == 1) {
                            scheduleTopUpEditTaskFragment.w(1);
                            Integer timeValue = scheduleTopUpTaskBean.getTimeValue();
                            if ((timeValue != null ? timeValue.intValue() : -1) > 10000) {
                                Integer timeValue2 = scheduleTopUpTaskBean.getTimeValue();
                                iIntValue = (timeValue2 != null ? timeValue2.intValue() : -1) - FaceSecCode.SC_SUCCESS;
                            } else {
                                Integer timeValue3 = scheduleTopUpTaskBean.getTimeValue();
                                if (timeValue3 != null) {
                                    iIntValue = timeValue3.intValue();
                                }
                            }
                            rVar.setValue(scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment.f26566Y[1], Integer.valueOf(iIntValue));
                        } else {
                            scheduleTopUpEditTaskFragment.w(2);
                            Integer timeValue4 = scheduleTopUpTaskBean.getTimeValue();
                            rVar.setValue(scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment.f26566Y[1], Integer.valueOf(timeValue4 != null ? timeValue4.intValue() : -1));
                        }
                        if (month2 != null) {
                            Iterator<T> it2 = month2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = (ScheduleTopUpAmountItemBean) next;
                                String itemId2 = scheduleTopUpAmountItemBean.getItemId();
                                if ((itemId2 != null && itemId2.equals(scheduleTopUpTaskBean.getBillId())) || ((itemId = scheduleTopUpAmountItemBean.getItemId()) != null && itemId.equals(scheduleTopUpTaskBean.getItemId()))) {
                                    break;
                                }
                            }
                            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = (ScheduleTopUpAmountItemBean) next;
                            if (scheduleTopUpAmountItemBean2 != null) {
                                scheduleTopUpEditTaskFragment.f26571L = scheduleTopUpAmountItemBean2;
                                scheduleTopUpEditTaskFragment.f26572M = scheduleTopUpAmountItemBean2;
                                scheduleTopUpEditTaskFragment.v().a(month2.indexOf(scheduleTopUpAmountItemBean2));
                                d0 d0Var3 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                                if (d0Var3 != null) {
                                    p220oa.h.c(d0Var3.f8254e);
                                    unit = Unit.f38893a;
                                }
                                if (unit == null) {
                                    if (month2 != null && (!month2.isEmpty())) {
                                        scheduleTopUpEditTaskFragment.f26571L = month2.get(0);
                                        scheduleTopUpEditTaskFragment.v().a(0);
                                    }
                                    d0Var = (d0) scheduleTopUpEditTaskFragment.f27335j;
                                    if (d0Var != null) {
                                        p220oa.h.C(d0Var.f8254e);
                                    }
                                }
                            } else {
                                if (month2 != null) {
                                    scheduleTopUpEditTaskFragment.f26571L = month2.get(0);
                                    scheduleTopUpEditTaskFragment.v().a(0);
                                }
                                d0Var = (d0) scheduleTopUpEditTaskFragment.f27335j;
                                if (d0Var != null) {
                                    p220oa.h.C(d0Var.f8254e);
                                }
                            }
                        } else {
                            if (month2 != null) {
                                scheduleTopUpEditTaskFragment.f26571L = month2.get(0);
                                scheduleTopUpEditTaskFragment.v().a(0);
                            }
                            d0Var = (d0) scheduleTopUpEditTaskFragment.f27335j;
                            if (d0Var != null) {
                                p220oa.h.C(d0Var.f8254e);
                            }
                        }
                    }
                } else {
                    KProperty[] kPropertyArr2 = ScheduleTopUpEditTaskFragment.f26566Y;
                    d0 d0Var4 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                    if (d0Var4 != null) {
                        p220oa.h.c(d0Var4.f8251b);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
                KProperty[] kPropertyArr3 = ScheduleTopUpEditTaskFragment.f26566Y;
                d0 d0Var5 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                if (d0Var5 != null) {
                    p220oa.h.c(d0Var5.f8251b);
                }
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj) {
        ScheduleTopUpFAQResp scheduleTopUpFAQResp;
        List<ScheduleTopUpFAQBean> faqVOS;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult != null && (scheduleTopUpFAQResp = (ScheduleTopUpFAQResp) commonBeanResult.data) != null && (faqVOS = scheduleTopUpFAQResp.getFaqVOS()) != null) {
                    if (faqVOS.isEmpty()) {
                        faqVOS = null;
                    }
                    if (faqVOS != null) {
                        ScheduleTopUpGuideFragment scheduleTopUpGuideFragment = (ScheduleTopUpGuideFragment) this.f10167b;
                        p155k9.n nVarU = scheduleTopUpGuideFragment.u();
                        View viewInflate = LayoutInflater.from(scheduleTopUpGuideFragment.requireContext()).inflate(Pd.d.qt_airtime_schedule_faq_header, (ViewGroup) null);
                        viewInflate.findViewById(Pd.c.ivArrowRight).setOnClickListener(new V(15, commonBeanResult, scheduleTopUpGuideFragment));
                        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
                        M1.j.setHeaderView$default(nVarU, viewInflate, 0, 0, 6, null);
                        scheduleTopUpGuideFragment.u().setList(faqVOS);
                        p155k9.n nVarU2 = scheduleTopUpGuideFragment.u();
                        if (nVarU2 != null) {
                            nVarU2.setOnItemClickListener(new p1.c(scheduleTopUpGuideFragment, 24));
                        }
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object g(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                PayByOrderResp.DataBean data = ((CheckPayResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).getData();
                if (data != null) {
                    String str = data.orderData;
                    int i7 = PayCodeTransactionResultActivity.f34792A;
                    ((PayCodeTransactionResultActivity) this.f10167b).n(str);
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object h(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                List<Long> list = ((GetMoneyConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                if (list != null) {
                    PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) this.f10167b;
                    ArrayList arrayList = payShopInputAmountActivity.f33178e;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = payShopInputAmountActivity.f33178e;
                    if (arrayList2 != null) {
                        arrayList2.addAll(list);
                    }
                    P8.a aVar = payShopInputAmountActivity.f33179f;
                    if (aVar != null) {
                        aVar.setList(arrayList2);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object i(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                List<Long> list = ((GetMoneyConfigResp) ((com.transsnet.palmpay.core.base.p) it).f27360a).data;
                if (list != null) {
                    WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) this.f10167b;
                    ArrayList arrayList = withdrawInputAmountActivity.f33297g;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = withdrawInputAmountActivity.f33297g;
                    if (arrayList2 != null) {
                        arrayList2.addAll(list);
                    }
                    P8.a aVar = withdrawInputAmountActivity.f33299j;
                    if (aVar != null) {
                        aVar.setList(arrayList2);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess() && !TextUtils.isEmpty((CharSequence) commonBeanResult.data)) {
                    String str = (String) commonBeanResult.data;
                    BettingQuickBetWebActivity bettingQuickBetWebActivity = (BettingQuickBetWebActivity) this.f10167b;
                    bettingQuickBetWebActivity.f26694d = str;
                    C0593i c0593i = (C0593i) bettingQuickBetWebActivity.f27334c;
                    if (c0593i != null) {
                        AndroidXWebView androidXWebView = c0593i.f8340o;
                        bettingQuickBetWebActivity.f26698i = str;
                        Intrinsics.e(str);
                        androidXWebView.loadUrl(str);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object k(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                GetRecentMerchantsResp getRecentMerchantsResp = (GetRecentMerchantsResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = getRecentMerchantsResp.isSuccess();
                PastShopListActivity pastShopListActivity = (PastShopListActivity) this.f10167b;
                if (zIsSuccess) {
                    GetRecentMerchantsResp.DataBean dataBean = getRecentMerchantsResp.data;
                    if (dataBean != null) {
                        List<GetRecentMerchantsResp.ListDataBean> list = dataBean.list;
                        if (list == null || list.isEmpty()) {
                            int i7 = PastShopListActivity.f28701j;
                            pastShopListActivity.n().getLoadMoreModule().g();
                        } else {
                            int i10 = PastShopListActivity.f28701j;
                            if (!pastShopListActivity.o().isShown()) {
                                p220oa.h.C(pastShopListActivity.o());
                            }
                            if (pastShopListActivity.f28703g == 1) {
                                pastShopListActivity.n().setList(dataBean.list);
                            } else {
                                p339wb.r rVarN = pastShopListActivity.n();
                                List<GetRecentMerchantsResp.ListDataBean> list2 = dataBean.list;
                                Intrinsics.checkNotNullExpressionValue(list2, "list");
                                rVarN.addData((Collection<Object>) list2);
                            }
                            if (dataBean.list.size() < 10) {
                                pastShopListActivity.n().getLoadMoreModule().g();
                            }
                        }
                    }
                } else {
                    p220oa.h.x(pastShopListActivity, getRecentMerchantsResp.getRespMsg());
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = commonBeanResult.isSuccess();
                PayShopPaymentResultActivity payShopPaymentResultActivity = (PayShopPaymentResultActivity) this.f10167b;
                if (zIsSuccess) {
                    QueryOrderDetailRsp queryOrderDetailRsp = (QueryOrderDetailRsp) commonBeanResult.data;
                    if (queryOrderDetailRsp != null) {
                        payShopPaymentResultActivity.f28739B = queryOrderDetailRsp;
                        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
                        if (dataBean != null) {
                            dataBean.payStatus = queryOrderDetailRsp.orderStatus;
                            dataBean.orderNo = dataBean.orderNo;
                            dataBean.payId = dataBean.payId;
                            dataBean.payStatusDesc = queryOrderDetailRsp.orderStatusDesc;
                        } else {
                            dataBean = null;
                        }
                        payShopPaymentResultActivity.f28738A = dataBean;
                        PayShopPaymentResultActivity.n(payShopPaymentResultActivity);
                    }
                } else {
                    p220oa.h.x(payShopPaymentResultActivity, commonBeanResult.getRespMsg());
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                nVar.getClass();
            }
        }
        return Unit.f38893a;
    }

    private final Object m(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            OcGoldCardUpgradeActivity ocGoldCardUpgradeActivity = (OcGoldCardUpgradeActivity) this.f10167b;
            if (z3) {
                OcUpgradeGoldCardResp ocUpgradeGoldCardResp = (OcUpgradeGoldCardResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (ocUpgradeGoldCardResp.isSuccess() && Intrinsics.c(ocUpgradeGoldCardResp.getData(), Boolean.TRUE)) {
                    OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog = ocGoldCardUpgradeActivity.f29486p0;
                    if (ocGoldCardUpgradeConfirmDialog != null) {
                        ocGoldCardUpgradeConfirmDialog.dismiss();
                    }
                    OcGoldCardUpgradeViewModel ocGoldCardUpgradeViewModel = (OcGoldCardUpgradeViewModel) ocGoldCardUpgradeActivity.l();
                    ocGoldCardUpgradeViewModel.getClass();
                    p140j8.f.s(ocGoldCardUpgradeViewModel, new C0354m(1, null), ocGoldCardUpgradeViewModel.f30906f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                } else {
                    OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog2 = ocGoldCardUpgradeActivity.f29486p0;
                    if (ocGoldCardUpgradeConfirmDialog2 != null) {
                        ocGoldCardUpgradeConfirmDialog2.showConfirmStatus();
                    }
                    p220oa.h.x(ocGoldCardUpgradeActivity, ocUpgradeGoldCardResp.getRespMsg());
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                String str = ((com.transsnet.palmpay.core.base.n) it).f27358a;
                OcGoldCardUpgradeConfirmDialog ocGoldCardUpgradeConfirmDialog3 = ocGoldCardUpgradeActivity.f29486p0;
                if (ocGoldCardUpgradeConfirmDialog3 != null) {
                    ocGoldCardUpgradeConfirmDialog3.showConfirmStatus();
                }
                p220oa.h.x(ocGoldCardUpgradeActivity, str);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = commonBeanResult.isSuccess();
                WelcomeBackActivity welcomeBackActivity = (WelcomeBackActivity) this.f10167b;
                if (zIsSuccess) {
                    C0105b c0105b = welcomeBackActivity.f35038j;
                    if (c0105b != null) {
                        p220oa.h.s((ImageView) c0105b.f665e, true);
                    }
                    WelcomeCouponData welcomeCouponData = (WelcomeCouponData) commonBeanResult.data;
                    if (welcomeCouponData != null) {
                        String strY0 = TextUtils.isEmpty(welcomeCouponData.topPic) ? r0.y0("main_welcome_back_head_bg.png") : welcomeCouponData.topPic;
                        C0105b c0105b2 = welcomeBackActivity.f35038j;
                        ViewGroup viewGroup = null;
                        r0.h1(c0105b2 != null ? (ImageView) c0105b2.f664d : null, strY0, Ac.d.main_welcome_back_head_bg);
                        List<WelcomeCouponBean> list = welcomeCouponData.configs;
                        if (list == null || list.isEmpty()) {
                            C0105b c0105b3 = welcomeBackActivity.f35038j;
                            if (c0105b3 != null) {
                                p220oa.h.s((LinearLayout) c0105b3.f666f, false);
                            }
                            C0105b c0105b4 = welcomeBackActivity.f35038j;
                            if (c0105b4 != null) {
                                p220oa.h.s((LinearLayout) c0105b4.f662b, false);
                            }
                        } else {
                            List<WelcomeCouponBean> list2 = welcomeCouponData.configs;
                            if (list2 != null) {
                                List listU = CollectionsKt.U(list2, 2);
                                List list3 = listU;
                                if (list3 == null || list3.isEmpty()) {
                                    C0105b c0105b5 = welcomeBackActivity.f35038j;
                                    if (c0105b5 != null) {
                                        p220oa.h.s((LinearLayout) c0105b5.f662b, false);
                                    }
                                } else {
                                    C0105b c0105b6 = welcomeBackActivity.f35038j;
                                    if (c0105b6 != null) {
                                        p220oa.h.s((LinearLayout) c0105b6.f662b, true);
                                    }
                                    int size = listU.size();
                                    C0105b c0105b7 = welcomeBackActivity.f35038j;
                                    if (c0105b7 != null) {
                                        ((LinearLayout) c0105b7.f662b).removeAllViews();
                                    }
                                    int i7 = size > 2 ? 2 : size;
                                    int i10 = 0;
                                    while (i10 < i7) {
                                        WelcomeCouponBean bean = (WelcomeCouponBean) listU.get(i10);
                                        View view = LayoutInflater.from(welcomeBackActivity).inflate(Ac.f.main_welcome_back_coupon_item_layout_v2, viewGroup);
                                        Intrinsics.e(view);
                                        N2.a aVar = new N2.a();
                                        Intrinsics.checkNotNullParameter(view, "view");
                                        Intrinsics.checkNotNullParameter(bean, "bean");
                                        aVar.f6064a = view;
                                        aVar.f6065b = (ImageView) view.findViewById(Ac.e.ivFinger);
                                        aVar.f6066c = (TextView) view.findViewById(Ac.e.text1);
                                        aVar.f6067d = (TextView) view.findViewById(Ac.e.text2);
                                        aVar.f6068e = (TextView) view.findViewById(Ac.e.btn);
                                        ImageView iv_hot = (ImageView) view.findViewById(Ac.e.iv_hot);
                                        Intrinsics.checkNotNullExpressionValue(iv_hot, "iv_hot");
                                        p220oa.h.s(iv_hot, bean.hot == 1);
                                        view.setOnClickListener(new J(aVar, 7, bean, welcomeBackActivity));
                                        ((TextView) aVar.f6066c).setText(bean.title);
                                        ((TextView) aVar.f6067d).setText(bean.reward);
                                        ((TextView) aVar.f6068e).setText(bean.button);
                                        if (size > 1) {
                                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(SizeUtils.dp2px(156.0f), -2);
                                            int dimensionPixelOffset = welcomeBackActivity.getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp6);
                                            layoutParams.leftMargin = dimensionPixelOffset;
                                            layoutParams.rightMargin = dimensionPixelOffset;
                                            C0105b c0105b8 = welcomeBackActivity.f35038j;
                                            if (c0105b8 != null) {
                                                ((LinearLayout) c0105b8.f662b).addView(view, layoutParams);
                                            }
                                        } else {
                                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(SizeUtils.dp2px(180.0f), -2);
                                            C0105b c0105b9 = welcomeBackActivity.f35038j;
                                            if (c0105b9 != null) {
                                                ((LinearLayout) c0105b9.f662b).addView(view, layoutParams2);
                                            }
                                        }
                                        if (bean.hot == 1) {
                                            ImageView imageView = (ImageView) aVar.f6065b;
                                            if (i10 != 0) {
                                                if (i10 == 1 && welcomeBackActivity.f35033d == null) {
                                                    welcomeBackActivity.f35033d = welcomeBackActivity.m(imageView, welcomeBackActivity.f35035f);
                                                }
                                            } else if (welcomeBackActivity.f35032c == null) {
                                                welcomeBackActivity.f35032c = welcomeBackActivity.m(imageView, welcomeBackActivity.f35034e);
                                            }
                                        }
                                        i10++;
                                        viewGroup = null;
                                    }
                                }
                                int size2 = list2.size();
                                if (size2 > 2) {
                                    C0105b c0105b10 = welcomeBackActivity.f35038j;
                                    if (c0105b10 != null) {
                                        p220oa.h.s((LinearLayout) c0105b10.f666f, true);
                                    }
                                    P8.a aVar2 = welcomeBackActivity.f35036g;
                                    if (aVar2 != null) {
                                        aVar2.setList(list2.subList(2, size2));
                                    }
                                } else {
                                    C0105b c0105b11 = welcomeBackActivity.f35038j;
                                    if (c0105b11 != null) {
                                        p220oa.h.s((LinearLayout) c0105b11.f666f, false);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    p220oa.h.x(welcomeBackActivity, commonBeanResult.getRespMsg());
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object o(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = (ScheduleTransferForBankUnstableBeneficiariesListActivity) this.f10167b;
            if (z3) {
                RecipientListResp recipientListResp = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                int i7 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                scheduleTransferForBankUnstableBeneficiariesListActivity.o().setRefreshing(false);
                if (recipientListResp.isSuccess()) {
                    p355xf.t tVar = scheduleTransferForBankUnstableBeneficiariesListActivity.f33432j;
                    ((CopyOnWriteArrayList) tVar.getValue()).clear();
                    List<RecipientListResp.RecipientBean> data = recipientListResp.getData();
                    if (data == null || !(!data.isEmpty())) {
                        View viewInflate = scheduleTransferForBankUnstableBeneficiariesListActivity.getLayoutInflater().inflate(p159kd.f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
                        viewInflate.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_bl_br_12_bg_white);
                        ImageView imageView = (ImageView) viewInflate.findViewById(p159kd.e.iv_empty_icon);
                        TextView textView = (TextView) viewInflate.findViewById(p159kd.e.tv_empty_title);
                        TextView textView2 = (TextView) viewInflate.findViewById(p159kd.e.tv_empty_tip);
                        imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
                        textView.setText(p159kd.h.sm_no_beneficiaries_yet);
                        textView2.setText("Beneficiaries will be added automatically if the transfer is successful");
                        scheduleTransferForBankUnstableBeneficiariesListActivity.m().setEmptyView(viewInflate);
                    } else {
                        ((CopyOnWriteArrayList) tVar.getValue()).addAll(recipientListResp.getData());
                        scheduleTransferForBankUnstableBeneficiariesListActivity.m().setList((CopyOnWriteArrayList) tVar.getValue());
                    }
                } else {
                    p220oa.h.x(scheduleTransferForBankUnstableBeneficiariesListActivity, recipientListResp.getRespMsg());
                    scheduleTransferForBankUnstableBeneficiariesListActivity.m().getLoadMoreModule().h();
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                p220oa.h.x(scheduleTransferForBankUnstableBeneficiariesListActivity, ((com.transsnet.palmpay.core.base.n) it).f27358a);
                int i10 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                scheduleTransferForBankUnstableBeneficiariesListActivity.o().setRefreshing(false);
                scheduleTransferForBankUnstableBeneficiariesListActivity.m().getLoadMoreModule().h();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        InvitationCodeResp invitationCodeResp;
        String str;
        String strY;
        List listH;
        T t;
        int i7 = 8;
        int size = 0;
        Object obj2 = this.f10167b;
        switch (this.f10166a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment = (IdentityVerificationStepFace2Fragment) obj2;
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            CheckIdentifyRsp checkIdentifyRsp = (CheckIdentifyRsp) commonBeanResult.data;
                            if (TextUtils.isEmpty(checkIdentifyRsp != null ? checkIdentifyRsp.verifyToken : null)) {
                                U u6 = new U(false, false, F8.d.fragment_identity_verification_step_id, false, false, -1, -1, -1, -1);
                                AbstractC0130w abstractC0130w = identityVerificationStepFace2Fragment.t;
                                if (abstractC0130w != null) {
                                    abstractC0130w.h(F8.d.fragment_identity_verification_step2, null, u6);
                                }
                            } else {
                                IdentityVerificationActivity identityVerificationActivityU = identityVerificationStepFace2Fragment.u();
                                ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityU != null ? identityVerificationActivityU.m() : null;
                                if (applyBalanceV2ReqM != null) {
                                    CheckIdentifyRsp checkIdentifyRsp2 = (CheckIdentifyRsp) commonBeanResult.data;
                                    applyBalanceV2ReqM.verifyToken = checkIdentifyRsp2 != null ? checkIdentifyRsp2.verifyToken : null;
                                }
                                IdentityVerificationActivity identityVerificationActivityU2 = identityVerificationStepFace2Fragment.u();
                                if (identityVerificationActivityU2 == null || (preCheckPhoneRsp2 = identityVerificationActivityU2.f25869i) == null || !preCheckPhoneRsp2.needIndustry) {
                                    IdentityVerificationActivity identityVerificationActivityU3 = identityVerificationStepFace2Fragment.u();
                                    if (identityVerificationActivityU3 == null || (preCheckPhoneRsp = identityVerificationActivityU3.f25869i) == null || !preCheckPhoneRsp.needAddress) {
                                        IdentityVerificationActivity identityVerificationActivityU4 = identityVerificationStepFace2Fragment.u();
                                        if (Intrinsics.c(identityVerificationActivityU4 != null ? identityVerificationActivityU4.f25866e : null, "FROM_REGISITER_PAGE")) {
                                            I8.r rVar = (I8.r) identityVerificationStepFace2Fragment.f27335j;
                                            if (rVar != null) {
                                                ((PpButton) rVar.f4201b.f755c).b(true);
                                            }
                                            IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationStepFace2Fragment.f27333i;
                                            if (identityVerificationViewModel != null) {
                                                identityVerificationViewModel.e(applyBalanceV2ReqM);
                                            }
                                        } else {
                                            IdentityVerificationActivity identityVerificationActivityU5 = identityVerificationStepFace2Fragment.u();
                                            if (identityVerificationActivityU5 != null) {
                                                identityVerificationActivityU5.t(((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                                            }
                                        }
                                    } else {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                                        CheckIdentifyRsp.copyAddressFromBundle(identityVerificationStepFace2Fragment.getArguments(), bundle);
                                        AbstractC0130w abstractC0130w2 = identityVerificationStepFace2Fragment.t;
                                        if (abstractC0130w2 != null) {
                                            abstractC0130w2.h(F8.d.fragment_identity_verification_step_address, ((CheckIdentifyRsp) commonBeanResult.data).saveAddressToBundle(bundle), null);
                                        }
                                    }
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                                    CheckIdentifyRsp.copyAddressFromBundle(identityVerificationStepFace2Fragment.getArguments(), bundle2);
                                    AbstractC0130w abstractC0130w3 = identityVerificationStepFace2Fragment.t;
                                    if (abstractC0130w3 != null) {
                                        abstractC0130w3.h(F8.d.fragment_identity_verification_step_profile, ((CheckIdentifyRsp) commonBeanResult.data).saveAddressToBundle(bundle2), null);
                                    }
                                }
                            }
                        } else {
                            I8.r rVar2 = (I8.r) identityVerificationStepFace2Fragment.f27335j;
                            if (rVar2 != null) {
                                ((PpButton) rVar2.f4201b.f755c).b(false);
                            }
                            if ("VL000014".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                                androidx.fragment.app.E activity = identityVerificationStepFace2Fragment.getActivity();
                                if (activity != null) {
                                    io.fastkv.n.O(activity, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_re_enter_id), null, new v(identityVerificationStepFace2Fragment, 1), Integer.valueOf(F8.h.ac_rescan_face), null, null, null, false, 0, 8385151);
                                }
                            } else if ("VL000012".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                                IdentityVerificationErrorDialog identityVerificationErrorDialog = new IdentityVerificationErrorDialog(identityVerificationStepFace2Fragment.getActivity());
                                identityVerificationErrorDialog.show();
                                androidx.fragment.app.E activity2 = identityVerificationStepFace2Fragment.getActivity();
                                if (activity2 != null) {
                                    p220oa.h.h(activity2, "FacialRecognitionFailedPopup2");
                                }
                                identityVerificationErrorDialog.update(commonBeanResult.getRespMsg());
                                identityVerificationErrorDialog.setConfirmCallback(new C0142i(identityVerificationStepFace2Fragment, i7));
                            } else if ("VL000107".equalsIgnoreCase(commonBeanResult.getRespCode())) {
                                androidx.fragment.app.E activity3 = identityVerificationStepFace2Fragment.getActivity();
                                if (activity3 != null) {
                                    io.fastkv.n.O(activity3, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_confirm), null, new v(identityVerificationStepFace2Fragment, 2), null, null, null, null, false, 0, 8387199);
                                }
                            } else {
                                androidx.fragment.app.E activity4 = identityVerificationStepFace2Fragment.getActivity();
                                if (activity4 != null) {
                                    io.fastkv.n.O(activity4, 0, Integer.valueOf(p025ba.k.core_title_attention), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388221);
                                }
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        String str2 = nVar.f27358a;
                        I8.r rVar3 = (I8.r) identityVerificationStepFace2Fragment.f27335j;
                        if (rVar3 != null) {
                            ((PpButton) rVar3.f4201b.f755c).b(false);
                        }
                        p220oa.h.y(identityVerificationStepFace2Fragment, str2);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2 != null && (invitationCodeResp = (InvitationCodeResp) commonBeanResult2.data) != null && (str = invitationCodeResp.invitQrCode) != null) {
                            ((FindInviteFriendsActivity) obj2).f27216f = str;
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                boolean z3 = true;
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        PalmPayContactListResp palmPayContactListResp = (PalmPayContactListResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (!palmPayContactListResp.isSuccess()) {
                            ToastUtils.showLong(palmPayContactListResp.getRespMsg(), new Object[0]);
                        } else if (palmPayContactListResp.getData() != null) {
                            ArrayList arrayList = new ArrayList();
                            if (palmPayContactListResp.getData().getMemberContactsRelationshipList() != null && !palmPayContactListResp.getData().getMemberContactsRelationshipList().isEmpty()) {
                                ArrayList arrayList2 = new ArrayList();
                                for (PalmPayContact palmPayContact : palmPayContactListResp.getData().getMemberContactsRelationshipList()) {
                                    palmPayContact.setFromLinkFaves(z3);
                                    arrayList2.add(palmPayContact);
                                    z3 = true;
                                }
                                arrayList.addAll(arrayList2);
                            }
                            if (palmPayContactListResp.getData().getMemberContactsList() != null) {
                                List<PalmPayContact> memberContactsList = palmPayContactListResp.getData().getMemberContactsList();
                                Intrinsics.checkNotNullExpressionValue(memberContactsList, "getMemberContactsList(...)");
                                if (!memberContactsList.isEmpty()) {
                                    List<PalmPayContact> memberContactsList2 = palmPayContactListResp.getData().getMemberContactsList();
                                    ArrayList arrayList3 = AbstractC0512i.f7093a;
                                    arrayList3.clear();
                                    if (memberContactsList2 != null && !memberContactsList2.isEmpty()) {
                                        arrayList3.addAll(memberContactsList2);
                                    }
                                    List<PalmPayContact> memberContactsList3 = palmPayContactListResp.getData().getMemberContactsList();
                                    Intrinsics.checkNotNullExpressionValue(memberContactsList3, "getMemberContactsList(...)");
                                    arrayList.addAll(memberContactsList3);
                                }
                            }
                            W9.A a3 = ((PalmPayLinkFavesFriendsActivity) obj2).f27247d;
                            if (a3 != null) {
                                a3.f4985b = arrayList;
                            }
                            if (a3 != null) {
                                a3.notifyDataSetChanged();
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 3:
                p355xf.o oVar = p355xf.q.f43977a;
                Unit unit = Unit.f38893a;
                ((C0765i) obj2).resumeWith(unit);
                return unit;
            case 4:
                androidx.activity.z addCallback = (androidx.activity.z) obj;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                CoreCashierPreviewActivity coreCashierPreviewActivity = (CoreCashierPreviewActivity) obj2;
                if (coreCashierPreviewActivity.F()) {
                    coreCashierPreviewActivity.G();
                } else {
                    coreCashierPreviewActivity.finish();
                }
                n0.g().m("PreviewPage", "Action_PreviewBackPage", "");
                return Unit.f38893a;
            case 5:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    FlexiPayOneClickOpenActivity flexiPayOneClickOpenActivity = (FlexiPayOneClickOpenActivity) obj2;
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        FlexiOneClickOpenRsp flexiOneClickOpenRsp = (FlexiOneClickOpenRsp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        flexiPayOneClickOpenActivity.showLoadingDialog(false);
                        int i11 = FlexiPayOneClickOpenActivity.f27632e;
                        FlexiOneClickOpenRsp.DataBean dataBean = flexiOneClickOpenRsp.data;
                        String str3 = dataBean != null ? dataBean.accountId : null;
                        FlexiPayOneClickOpenActivity.o(flexiPayOneClickOpenActivity, (!flexiOneClickOpenRsp.isSuccess() || str3 == null || str3.length() == 0) ? 2 : 1, str3, dataBean != null ? dataBean.errorText : null, 8);
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it4).getClass();
                        flexiPayOneClickOpenActivity.showLoadingDialog(false);
                        FlexiPayOneClickOpenActivity.o(flexiPayOneClickOpenActivity, 2, null, null, 14);
                    }
                }
                return Unit.f38893a;
            case 6:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        final CreatePlanActivity createPlanActivity = (CreatePlanActivity) obj2;
                        createPlanActivity.f32074d = ((GetBeforeOrderResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a).getData();
                        CreatePlanActivity.n(createPlanActivity, p059e1.a.D(0, "invest_interest_disable"));
                        GetBeforeOrderResp.BeforeOrderBean beforeOrderBean = createPlanActivity.f32074d;
                        if (beforeOrderBean != null) {
                            createPlanActivity.f32079j = beforeOrderBean.getEndDate();
                            createPlanActivity.v();
                            Lc.a aVar = createPlanActivity.f32071H;
                            if (aVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar.t.setVisibility(0);
                            createPlanActivity.f32073c = beforeOrderBean.getStateInfo();
                            createPlanActivity.f32076f = beforeOrderBean.getBuyMaxLimit();
                            Lc.a aVar2 = createPlanActivity.f32071H;
                            if (aVar2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar2.f5637f.setHint(G.p("Min ", r0.n0(beforeOrderBean.getBuyMinLimit()), " - Max ", r0.n0(beforeOrderBean.getBuyMaxLimit())));
                            Math.max(beforeOrderBean.getMemberBalance(), beforeOrderBean.getCashBoxBalance());
                            Lc.a aVar3 = createPlanActivity.f32071H;
                            if (aVar3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar3.f5644p0.setVisibility(0);
                            Lc.a aVar4 = createPlanActivity.f32071H;
                            if (aVar4 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar4.f5643p.setVisibility(8);
                            Lc.a aVar5 = createPlanActivity.f32071H;
                            if (aVar5 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            long memberBalance = beforeOrderBean.getMemberBalance();
                            long j6 = createPlanActivity.f32081p;
                            if (memberBalance >= j6) {
                                createPlanActivity.f32077g = beforeOrderBean.getMemberBalance();
                                strY = q0.y(createPlanActivity.getResources().getString(Jc.f.mm_plan_palmpay_balance), ":", r0.B(beforeOrderBean.getMemberBalance(), true));
                            } else if (beforeOrderBean.getCashBoxBalance() >= j6) {
                                createPlanActivity.f32077g = beforeOrderBean.getCashBoxBalance();
                                strY = q0.y(createPlanActivity.getResources().getString(Jc.f.mm_plan_cashbox_balance), ":", r0.B(beforeOrderBean.getCashBoxBalance(), true));
                            } else {
                                createPlanActivity.f32077g = beforeOrderBean.getMemberBalance();
                                Lc.a aVar6 = createPlanActivity.f32071H;
                                if (aVar6 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                aVar6.f5644p0.setVisibility(8);
                                Lc.a aVar7 = createPlanActivity.f32071H;
                                if (aVar7 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                aVar7.f5643p.setVisibility(0);
                                strY = q0.y(createPlanActivity.getResources().getString(Jc.f.mm_plan_palmpay_balance), ":", r0.B(beforeOrderBean.getMemberBalance(), true));
                            }
                            aVar5.f5644p0.setText(strY);
                            Lc.a aVar8 = createPlanActivity.f32071H;
                            if (aVar8 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar8.f5641k0.setText(createPlanActivity.s(beforeOrderBean.getStartDate(), beforeOrderBean.getEndDate()));
                            Drawable drawable = createPlanActivity.getDrawable(Jc.b.mm_micro_more_icon);
                            if (drawable != null) {
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                            Lc.a aVar9 = createPlanActivity.f32071H;
                            if (aVar9 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            TextView textView = aVar9.f5645q0;
                            if (beforeOrderBean.getDurationDay() == beforeOrderBean.getMaxDurationDay()) {
                                drawable = null;
                            }
                            textView.setCompoundDrawables(null, null, drawable, null);
                            Lc.a aVar10 = createPlanActivity.f32071H;
                            if (aVar10 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar10.f5635d.removeAllViews();
                            ArrayList arrayList4 = createPlanActivity.f32082v;
                            arrayList4.clear();
                            GetBeforeOrderResp.BeforeOrderBean beforeOrderBean2 = createPlanActivity.f32074d;
                            long durationDay = beforeOrderBean2 != null ? beforeOrderBean2.getDurationDay() : 0L;
                            GetBeforeOrderResp.BeforeOrderBean beforeOrderBean3 = createPlanActivity.f32074d;
                            long maxDurationDay = beforeOrderBean3 != null ? beforeOrderBean3.getMaxDurationDay() : 0L;
                            long j10 = (maxDurationDay - durationDay) + 1;
                            if (j10 >= 4) {
                                long j11 = (durationDay + maxDurationDay) / ((long) 2);
                                if (j11 > 10) {
                                    long j12 = 10;
                                    j11 = ((j11 + ((long) 5)) / j12) * j12;
                                }
                                listH = C1850q.h(Long.valueOf(durationDay), Long.valueOf(j11), Long.valueOf(maxDurationDay), 0L);
                            } else if (j10 == 1) {
                                listH = C1850q.h(Long.valueOf(durationDay), -1L, -1L, -1L);
                            } else {
                                listH = j10 == 2 ? C1850q.h(Long.valueOf(durationDay), Long.valueOf(maxDurationDay), -1L, -1L) : C1850q.h(Long.valueOf(durationDay), Long.valueOf((durationDay + maxDurationDay) / ((long) 2)), Long.valueOf(maxDurationDay), -1L);
                            }
                            final int i12 = 0;
                            for (Object obj3 : listH) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    C1850q.k();
                                    throw null;
                                }
                                final long jLongValue = ((Number) obj3).longValue();
                                if (jLongValue == -1) {
                                    View view = new View(createPlanActivity);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 20, 1.0f);
                                    if (i12 < listH.size() - 1) {
                                        layoutParams.setMarginEnd(CommonViewExtKt.getDp(8.0f));
                                    }
                                    int dp = CommonViewExtKt.getDp(6.0f);
                                    view.setPadding(0, dp, 0, dp);
                                    view.setLayoutParams(layoutParams);
                                    view.setVisibility(4);
                                    Lc.a aVar11 = createPlanActivity.f32071H;
                                    if (aVar11 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    aVar11.f5635d.addView(view);
                                } else {
                                    TextView textView2 = new TextView(createPlanActivity);
                                    textView2.setText(jLongValue == 0 ? "More" : jLongValue + " days");
                                    textView2.setTextColor(textView2.getResources().getColor(Jc.a.mm_saving_tab_text_selector));
                                    textView2.setTextSize(12.0f);
                                    textView2.setGravity(17);
                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                                    if (i12 < listH.size() - 1) {
                                        layoutParams2.setMarginEnd(CommonViewExtKt.getDp(8.0f));
                                    }
                                    textView2.setLayoutParams(layoutParams2);
                                    int dp2 = CommonViewExtKt.getDp(6.0f);
                                    textView2.setPadding(0, dp2, 0, dp2);
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.p
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i14 = CreatePlanActivity.f32067M;
                                            CreatePlanActivity createPlanActivity2 = createPlanActivity;
                                            createPlanActivity2.y(i12);
                                            long j13 = jLongValue;
                                            if (j13 == 0) {
                                                createPlanActivity2.q();
                                                return;
                                            }
                                            if (j13 > 0) {
                                                String strS = createPlanActivity2.s(System.currentTimeMillis(), (86400000 * j13) + System.currentTimeMillis());
                                                Lc.a aVar12 = createPlanActivity2.f32071H;
                                                if (aVar12 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                aVar12.f5641k0.setText(strS);
                                                createPlanActivity2.f32075e = j13;
                                            }
                                        }
                                    });
                                    arrayList4.add(textView2);
                                    Lc.a aVar12 = createPlanActivity.f32071H;
                                    if (aVar12 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    aVar12.f5635d.addView(textView2);
                                }
                                i12 = i13;
                            }
                            createPlanActivity.y(createPlanActivity.t);
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                    }
                }
                return Unit.f38893a;
            case 7:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        ((UserFixedSavingActivity) obj2).f32211d = ((GetPayoutOptionsResp) ((com.transsnet.palmpay.core.base.p) it6).f27360a).getData();
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it6).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                    }
                }
                return Unit.f38893a;
            case 8:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                        if (commonBeanResult3.isSuccess()) {
                            CashBoxAutoSaveFragment cashBoxAutoSaveFragment = (CashBoxAutoSaveFragment) obj2;
                            cashBoxAutoSaveFragment.f32350Q = (GetAutoTransferConfigResp) commonBeanResult3.data;
                            cashBoxAutoSaveFragment.t();
                        }
                    } else if (!(it7 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it7;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        nVar2.getClass();
                    }
                }
                return Unit.f38893a;
            case 9:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                        GetSavingHomeResp getSavingHomeResp = (GetSavingHomeResp) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                        GetSavingHomeResp.Data data = getSavingHomeResp.getData();
                        SavingStatBean savingStat = data != null ? data.getSavingStat() : null;
                        GetSavingHomeResp.Data data2 = getSavingHomeResp.getData();
                        if (data2 != null) {
                            data2.getPlanListContent();
                        }
                        OldUserFixedSavingFragment oldUserFixedSavingFragment = (OldUserFixedSavingFragment) obj2;
                        if (savingStat != null) {
                            oldUserFixedSavingFragment.f32507Y = savingStat;
                            boolean zC = p059e1.a.C("savings_balance_shown", true);
                            oldUserFixedSavingFragment.f32505Q = savingStat.getTotalSavingBalance();
                            oldUserFixedSavingFragment.w(zC);
                            IconicsTextView iconicsTextViewZ = oldUserFixedSavingFragment.z();
                            if (iconicsTextViewZ != null) {
                                iconicsTextViewZ.setText(zC ? r0.B(savingStat.getTotalSavingBalance(), true) : "****");
                            }
                            TextView textView3 = (TextView) oldUserFixedSavingFragment.f32499A.getValue();
                            if (textView3 != null) {
                                textView3.setText(oldUserFixedSavingFragment.getString(Jc.f.mm_total_interest_with_amount, zC ? r0.B(savingStat.getMaturedEarning(), true) : "****"));
                            }
                        }
                        GetSavingHomeResp.Data data3 = getSavingHomeResp.getData();
                        ProductBean popUp = data3 != null ? data3.getPopUp() : null;
                        GetSavingHomeResp.Data data4 = getSavingHomeResp.getData();
                        Long popupTodayCashCount = data4 != null ? data4.getPopupTodayCashCount() : null;
                        if (popUp != null && popUp.getTotalPayback() > 0) {
                            CongratulationsDialogFragment congratulationsDialogFragmentNewInstance = CongratulationsDialogFragment.f32292L.newInstance(popUp.getShowName(), popUp.getTotalPayback(), popupTodayCashCount != null ? popupTodayCashCount.longValue() : 0L, oldUserFixedSavingFragment.m(), popUp.getPayoutOption());
                            com.transsnet.palmpay.managemoney.ui.fragment.V leftClick = new com.transsnet.palmpay.managemoney.ui.fragment.V(oldUserFixedSavingFragment, size);
                            X6.c rightClick = new X6.c(congratulationsDialogFragmentNewInstance, oldUserFixedSavingFragment);
                            congratulationsDialogFragmentNewInstance.getClass();
                            Intrinsics.checkNotNullParameter(leftClick, "leftClick");
                            Intrinsics.checkNotNullParameter(rightClick, "rightClick");
                            congratulationsDialogFragmentNewInstance.f32293C = leftClick;
                            congratulationsDialogFragmentNewInstance.f32294H = rightClick;
                            Z childFragmentManager = oldUserFixedSavingFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            congratulationsDialogFragmentNewInstance.show(childFragmentManager, "showCongratulationsDialog");
                        }
                    } else if (!(it8 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it8).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it8).getClass();
                    }
                }
                return Unit.f38893a;
            case 10:
                com.transsnet.palmpay.core.base.q it9 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!(it9 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it9 instanceof com.transsnet.palmpay.core.base.p) {
                        if (((Boolean) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it9).f27360a).data).booleanValue()) {
                            OrderDetailFragment.a aVar13 = OrderDetailFragment.f32510k0;
                            CashBoxAutoSaveDialogFragment cashBoxAutoSaveDialogFragmentNewInstance = CashBoxAutoSaveDialogFragment.f32279M.newInstance("fixed_savings_result_page");
                            Z childFragmentManager2 = ((OrderDetailFragment) obj2).getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                            cashBoxAutoSaveDialogFragmentNewInstance.show(childFragmentManager2, "showCashBoxAutoSaveDialog");
                        }
                    } else if (!(it9 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it9 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it9).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it9).getClass();
                    }
                }
                return Unit.f38893a;
            case 11:
                com.transsnet.palmpay.core.base.q it10 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!(it10 instanceof com.transsnet.palmpay.core.base.o)) {
                    TransactionHistoryDownloadActivity transactionHistoryDownloadActivity = (TransactionHistoryDownloadActivity) obj2;
                    if (it10 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it10).f27360a;
                        if (commonResult.isSuccess()) {
                            String string = transactionHistoryDownloadActivity.getResources().getString(Ac.h.main_application_has_submitted);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            TransactionHistoryDownloadActivity.a aVar14 = TransactionHistoryDownloadActivity.f34576g;
                            transactionHistoryDownloadActivity.m(string, true);
                        } else if ("CFRONT_810001".equals(commonResult.getRespCode())) {
                            String respMsg = commonResult.getRespMsg();
                            if (respMsg != null) {
                                TransactionHistoryDownloadActivity.a aVar15 = TransactionHistoryDownloadActivity.f34576g;
                                transactionHistoryDownloadActivity.m(respMsg, false);
                            }
                        } else {
                            String respMsg2 = commonResult.getRespMsg();
                            if (respMsg2 != null) {
                                ToastUtils.showShort(respMsg2, new Object[0]);
                            }
                        }
                    } else if (!(it10 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it10 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar3 = (com.transsnet.palmpay.core.base.n) it10;
                        ToastUtils.showLong(nVar3.f27358a, new Object[0]);
                        ToastUtils.showShort(nVar3.f27358a, new Object[0]);
                    }
                    transactionHistoryDownloadActivity.showLoadingDialog(false);
                }
                return Unit.f38893a;
            case 12:
                com.transsnet.palmpay.core.base.q it11 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!(it11 instanceof com.transsnet.palmpay.core.base.o)) {
                    TransactionHistoryDownloadFilterActivity transactionHistoryDownloadFilterActivity = (TransactionHistoryDownloadFilterActivity) obj2;
                    if (it11 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it11).f27360a;
                        if (commonBeanResult4.isSuccess() && (t = commonBeanResult4.data) != 0) {
                            transactionHistoryDownloadFilterActivity.f34582A = (MemberAddressBean) t;
                        }
                    } else if (!(it11 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it11 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar4 = (com.transsnet.palmpay.core.base.n) it11;
                        ToastUtils.showLong(nVar4.f27358a, new Object[0]);
                        nVar4.getClass();
                    }
                    transactionHistoryDownloadFilterActivity.showLoadingDialog(false);
                }
                return Unit.f38893a;
            case 13:
                return a(obj);
            case 14:
                return b(obj);
            case 15:
                return c(obj);
            case 16:
                return d(obj);
            case 17:
                return e(obj);
            case 18:
                return f(obj);
            case 19:
                return g(obj);
            case 20:
                return h(obj);
            case 21:
                return i(obj);
            case 22:
                return j(obj);
            case 23:
                return k(obj);
            case 24:
                return l(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (obj != null) {
                    ((OcGetInstallmentCreditActivity) obj2).f29466t0 = (String) obj;
                }
                return Unit.f38893a;
            case 26:
                return m(obj);
            case 27:
                return n(obj);
            case 28:
                return o(obj);
            default:
                com.transsnet.palmpay.core.base.q it12 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (!(it12 instanceof com.transsnet.palmpay.core.base.o)) {
                    ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = (ScheduleTransferForBankUnstableOrderListActivity) obj2;
                    if (it12 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult5 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it12).f27360a;
                        int i14 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        scheduleTransferForBankUnstableOrderListActivity.r().setRefreshing(false);
                        if (commonBeanResult5.isSuccess()) {
                            ScheduleTransferForBankUnstableListResp scheduleTransferForBankUnstableListResp = (ScheduleTransferForBankUnstableListResp) commonBeanResult5.data;
                            if (scheduleTransferForBankUnstableListResp != null) {
                                Integer isBookStatus = scheduleTransferForBankUnstableListResp.getIsBookStatus();
                                if (isBookStatus != null) {
                                    int iIntValue = isBookStatus.intValue();
                                    if (iIntValue == 1) {
                                        TextView textView4 = scheduleTransferForBankUnstableOrderListActivity.f33484w;
                                        if (textView4 != null) {
                                            p220oa.h.C(textView4);
                                        }
                                        TextView textView5 = scheduleTransferForBankUnstableOrderListActivity.f33472A;
                                        if (textView5 != null) {
                                            p220oa.h.C(textView5);
                                        }
                                        View viewInflate = scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(p159kd.f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
                                        viewInflate.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_bl_br_12_bg_white);
                                        TextView textView6 = (TextView) viewInflate.findViewById(p159kd.e.tv_empty_title);
                                        if (textView6 != null) {
                                            p220oa.h.c(textView6);
                                        }
                                        ImageView imageView = (ImageView) viewInflate.findViewById(p159kd.e.iv_empty_icon);
                                        if (imageView != null) {
                                            imageView.getLayoutParams().height = CommonViewExtKt.getDp(100);
                                            imageView.getLayoutParams().width = CommonViewExtKt.getDp(100);
                                            imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
                                        }
                                        TextView textView7 = (TextView) viewInflate.findViewById(p159kd.e.tv_empty_tip);
                                        if (textView7 != null) {
                                            textView7.setTextSize(1, 12.0f);
                                            textView7.setText("There are no completed bookings");
                                        }
                                        ((LinearLayout) viewInflate.findViewById(p159kd.e.ll_empty_content)).setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_16_bg_white);
                                        scheduleTransferForBankUnstableOrderListActivity.o().setEmptyView(viewInflate);
                                    } else if (iIntValue == 0) {
                                        TextView textView8 = scheduleTransferForBankUnstableOrderListActivity.f33484w;
                                        if (textView8 != null) {
                                            p220oa.h.c(textView8);
                                        }
                                        TextView textView9 = scheduleTransferForBankUnstableOrderListActivity.f33472A;
                                        if (textView9 != null) {
                                            p220oa.h.c(textView9);
                                        }
                                    }
                                }
                                Long currentTime = scheduleTransferForBankUnstableListResp.getCurrentTime();
                                if (currentTime != null) {
                                    scheduleTransferForBankUnstableOrderListActivity.n(Long.valueOf(currentTime.longValue()));
                                }
                                CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> activeBookingHistoryDTO = scheduleTransferForBankUnstableListResp.getActiveBookingHistoryDTO();
                                if (activeBookingHistoryDTO != null) {
                                    List<ScheduleTransferForBankUnstableOrderResp> list = activeBookingHistoryDTO.list;
                                    if (list == null || !(!list.isEmpty())) {
                                        RecyclerView recyclerView = scheduleTransferForBankUnstableOrderListActivity.t;
                                        if (recyclerView != null) {
                                            p220oa.h.c(recyclerView);
                                        }
                                        TextView textView10 = scheduleTransferForBankUnstableOrderListActivity.f33483v;
                                        if (textView10 != null) {
                                            p220oa.h.c(textView10);
                                        }
                                        Integer isBookStatus2 = scheduleTransferForBankUnstableListResp.getIsBookStatus();
                                        if (isBookStatus2 != null && isBookStatus2.intValue() == 0) {
                                            View viewInflate2 = scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(p159kd.f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
                                            viewInflate2.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_rect_corner_bl_br_12_bg_white);
                                            ImageView imageView2 = (ImageView) viewInflate2.findViewById(p159kd.e.iv_empty_icon);
                                            TextView textView11 = (TextView) viewInflate2.findViewById(p159kd.e.tv_empty_title);
                                            TextView textView12 = (TextView) viewInflate2.findViewById(p159kd.e.tv_empty_tip);
                                            imageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
                                            textView11.setText("No booking history yet");
                                            textView12.setText("Enjoy Seamless Transaction on PalmPay!");
                                            scheduleTransferForBankUnstableOrderListActivity.o().setEmptyView(viewInflate2);
                                        }
                                    } else {
                                        RecyclerView recyclerView2 = scheduleTransferForBankUnstableOrderListActivity.t;
                                        if (recyclerView2 != null) {
                                            p220oa.h.C(recyclerView2);
                                        }
                                        TextView textView13 = scheduleTransferForBankUnstableOrderListActivity.f33483v;
                                        if (textView13 != null) {
                                            p220oa.h.C(textView13);
                                        }
                                        ((p173ld.h) scheduleTransferForBankUnstableOrderListActivity.f33478g.getValue()).setList(activeBookingHistoryDTO.list);
                                        Integer isBookStatus3 = scheduleTransferForBankUnstableListResp.getIsBookStatus();
                                        if (isBookStatus3 != null && isBookStatus3.intValue() == 0) {
                                            scheduleTransferForBankUnstableOrderListActivity.o().setEmptyView(p159kd.f.sm_item_foot_empty);
                                        }
                                    }
                                }
                                CommonListResult.CommonList<ScheduleTransferForBankUnstableOrderResp> completedBookingHistory = scheduleTransferForBankUnstableListResp.getCompletedBookingHistory();
                                if (completedBookingHistory != null) {
                                    p173ld.h hVarO = scheduleTransferForBankUnstableOrderListActivity.o();
                                    Intrinsics.checkNotNullParameter(hVarO, "<this>");
                                    int i15 = completedBookingHistory.curPage;
                                    if (i15 == 0 || i15 == 1) {
                                        hVarO.setList(completedBookingHistory.list);
                                        S1.c loadMoreModule = hVarO.getLoadMoreModule();
                                        int i16 = completedBookingHistory.pageSize;
                                        List<ScheduleTransferForBankUnstableOrderResp> list2 = completedBookingHistory.list;
                                        size = list2 != null ? list2.size() : 0;
                                        Intrinsics.checkNotNullParameter(loadMoreModule, "<this>");
                                        if (i16 > size) {
                                            loadMoreModule.g();
                                        } else {
                                            loadMoreModule.j(true);
                                        }
                                    } else {
                                        List<ScheduleTransferForBankUnstableOrderResp> list3 = completedBookingHistory.list;
                                        if (list3 != null) {
                                            hVarO.addData((Collection<Object>) list3);
                                        }
                                        S1.c loadMoreModule2 = hVarO.getLoadMoreModule();
                                        int i17 = completedBookingHistory.pageSize;
                                        List<ScheduleTransferForBankUnstableOrderResp> list4 = completedBookingHistory.list;
                                        size = list4 != null ? list4.size() : 0;
                                        Intrinsics.checkNotNullParameter(loadMoreModule2, "<this>");
                                        if (i17 > size) {
                                            loadMoreModule2.g();
                                        } else {
                                            loadMoreModule2.f();
                                        }
                                    }
                                }
                            }
                        } else {
                            p220oa.h.x(scheduleTransferForBankUnstableOrderListActivity, commonBeanResult5.getRespMsg());
                            scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().h();
                        }
                    } else if (!(it12 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it12 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        p220oa.h.x(scheduleTransferForBankUnstableOrderListActivity, ((com.transsnet.palmpay.core.base.n) it12).f27358a);
                        int i18 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        scheduleTransferForBankUnstableOrderListActivity.r().setRefreshing(false);
                        scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().h();
                    }
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ w(Object obj, int i7) {
        this.f10166a = i7;
        this.f10167b = obj;
    }
}
