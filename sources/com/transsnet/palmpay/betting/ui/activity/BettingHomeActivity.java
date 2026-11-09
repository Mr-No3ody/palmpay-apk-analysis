package com.transsnet.palmpay.betting.ui.activity;

import G9.i;
import Gb.M;
import Hb.L;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.d;
import Rd.r;
import S3.c;
import Wd.C0751z;
import Wf.AbstractC0780y;
import Wf.C0759d0;
import Wf.I;
import Z4.e;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.H;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.bean.BettingBillerListRsp;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRaceScheduleView;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.betting.ui.view.ModelBillerSelection;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.LimitAmountResp;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.teller.bean.BettingAcmountItemData;
import com.transsnet.palmpay.teller.bean.BettingDepositHomeParams;
import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListReq;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.bean.resp.BettingHomePageData;
import com.transsnet.palmpay.teller.bean.resp.CreateBettingOrderData;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.D;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p015ag.o;
import p025ba.k;
import p042cg.f;
import p054dd.q;
import p059e1.a;
import p177m.l;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p270rd.C1976t;
import p282s9.h;
import p282s9.j;
import p310ub.O;
import t9.b;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/quick_teller/betting_home")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingDepositViewModel;", "LRd/r;", "Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingHomeActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingHomeActivity\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,848:1\n33#2,3:849\n562#3,10:852\n1#4:862\n1878#5,3:863\n295#5,2:866\n171#6,12:868\n215#6:880\n171#6,12:881\n215#6:893\n171#6,12:894\n215#6:906\n171#6,12:907\n215#6:919\n*S KotlinDebug\n*F\n+ 1 BettingHomeActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingHomeActivity\n*L\n118#1:849,3\n271#1:852,10\n372#1:863,3\n435#1:866,2\n638#1:868,12\n638#1:880\n683#1:881,12\n683#1:893\n767#1:894,12\n767#1:906\n787#1:907,12\n787#1:919\n*E\n"})
public final class BettingHomeActivity extends BaseBillerActivity<BettingDepositViewModel, r> implements PickBettingBillerDialog.CallBack, CancelAdapt {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26660w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final List f26661x0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewStub f26662A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewStub f26663B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ViewStub f26664C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ViewStub f26665H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ViewStub f26666L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f26667M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public BettingBillerListRsp f26668Q;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public PaymentItemBean f26671Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelBettingRootView f26676p;
    public ModelQuickBettingView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PickBettingBillerDialog f26681t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ModelActivityBannerWithCoupon f26683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ModelBettingRaceScheduleView f26685w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26672i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26673j = "";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ArrayList f26669X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final c f26670Y = new c(this, 8);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final long f26674k0 = 10000000000L;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f26677p0 = 10000000000L;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f26678q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f26679r0 = 10000000000L;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f26680s0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Handler f26682u0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final androidx.activity.result.a f26684v0 = registerForActivityResult(new l(), new i(this, 8));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("mSelectBiller", "getMSelectBiller()Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", BettingHomeActivity.class);
        G.f38952a.getClass();
        f26660w0 = new KProperty[]{rVar};
        new a(null);
        f26661x0 = C1850q.h("quickBet", "body", LoanHomeSource.BANNER, "match", "moreService");
    }

    public static final void p(final BettingHomeActivity bettingHomeActivity, final List list, final long j6) {
        BettingBillerListRsp bettingBillerListRsp = bettingHomeActivity.f26668Q;
        if (bettingBillerListRsp == null) {
            BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
            if (bettingDepositViewModel != null) {
                bettingDepositViewModel.e(new Function0() { // from class: s9.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List list2;
                        BettingHomeActivity bettingHomeActivity2 = this.f42081a;
                        BettingBillerListRsp bettingBillerListRsp2 = bettingHomeActivity2.f26668Q;
                        List<BettingBillerListItemBean> allBillers = bettingBillerListRsp2 != null ? bettingBillerListRsp2.getAllBillers() : null;
                        BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity2.r();
                        String billerId = bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null;
                        List list3 = list;
                        BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) e.B(allBillers, list3, billerId);
                        long j10 = j6;
                        if (bettingBillerListItemBean != null) {
                            bettingHomeActivity2.t(bettingBillerListItemBean, true, new h(bettingHomeActivity2, j10, 1));
                        } else if (bettingHomeActivity2.r() != null && ((list2 = list3) == null || list2.isEmpty())) {
                            BettingHomeActivity.s(bettingHomeActivity2, j10);
                        }
                        return Unit.f38893a;
                    }
                });
                return;
            }
            return;
        }
        List<BettingBillerListItemBean> allBillers = bettingBillerListRsp.getAllBillers();
        BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
        BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) e.B(allBillers, list, bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null);
        if (bettingBillerListItemBean != null) {
            bettingHomeActivity.t(bettingBillerListItemBean, true, new h(bettingHomeActivity, j6, 0));
            return;
        }
        if (bettingHomeActivity.r() != null) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                s(bettingHomeActivity, j6);
            }
        }
    }

    public static final void q(BettingHomeActivity bettingHomeActivity) {
        if (bettingHomeActivity.f26681t0 == null) {
            bettingHomeActivity.f26681t0 = new PickBettingBillerDialog(bettingHomeActivity, bettingHomeActivity.isDarkMode());
        }
        PickBettingBillerDialog pickBettingBillerDialog = bettingHomeActivity.f26681t0;
        if (pickBettingBillerDialog != null) {
            String string = bettingHomeActivity.getString(Vd.a.qt_betting);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pickBettingBillerDialog.setBusinessName(string);
            pickBettingBillerDialog.setCallBack(bettingHomeActivity);
            if (!pickBettingBillerDialog.isShowing()) {
                pickBettingBillerDialog.show();
            }
            BettingBillerListRsp bettingBillerListRsp = bettingHomeActivity.f26668Q;
            pickBettingBillerDialog.setBillers(bettingBillerListRsp != null ? bettingBillerListRsp.getAllBillers() : null);
            BettingBillerListRsp bettingBillerListRsp2 = bettingHomeActivity.f26668Q;
            pickBettingBillerDialog.setHistoryBillers(bettingBillerListRsp2 != null ? bettingBillerListRsp2.getHistoryBillers() : null);
            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
            if (bettingBillerListItemBeanR != null) {
                pickBettingBillerDialog.setSelectBiller(bettingBillerListItemBeanR);
            }
        }
    }

    public static void s(BettingHomeActivity bettingHomeActivity, long j6) {
        ModelBettingRootView modelBettingRootView;
        PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
        if ((paymentItemBean == null || paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) && j6 > 0 && (modelBettingRootView = bettingHomeActivity.f26676p) != null) {
            String strE = r0.E(j6);
            Intrinsics.checkNotNullExpressionValue(strE, "getAmountStringWithThousandCharacterNoPoint(...)");
            modelBettingRootView.setInputAmount(strE);
        }
        ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
        if (modelBettingRootView2 != null) {
            BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
            CoroutineScope coroutineScopeH = bettingDepositViewModel != null ? V.h(bettingDepositViewModel) : null;
            b bVar = modelBettingRootView2.f26749o;
            if (bVar == null || coroutineScopeH == null) {
                return;
            }
            f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScopeH, o.f11960a, null, new t9.a(bVar, j6, null), 2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
        if (bettingDepositViewModel != null) {
            bettingDepositViewModel.f(new p282s9.f(this, 0));
        }
        BettingDepositViewModel bettingDepositViewModel2 = (BettingDepositViewModel) l();
        final int i7 = 0;
        n.B(this, bettingDepositViewModel2 != null ? bettingDepositViewModel2.f26775i : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel3;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i10 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i11 = 0;
                switch (i7) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit2 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit3 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel4 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel4 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel4.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel5 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel5 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel5, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel5.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel6 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel6 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel6.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel3 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel3, new x9.r(billerID, itemID, null), bettingDepositViewModel3.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i11) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel7 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel7 != null) {
                                                    bettingDepositViewModel7.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel8 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel8 != null) {
                                                    bettingDepositViewModel8.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i12 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i12), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i10) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel7 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel7 != null) {
                                                    bettingDepositViewModel7.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel8 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel8 != null) {
                                                    bettingDepositViewModel8.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(18), true, null, 224);
        BettingDepositViewModel bettingDepositViewModel3 = (BettingDepositViewModel) l();
        com.transsnet.palmpay.core.base.l lVar = bettingDepositViewModel3 != null ? bettingDepositViewModel3.f26776j : null;
        if (lVar != null) {
            lVar.e(this, new q(new j(this, this, 0), 25));
        }
        BettingDepositViewModel bettingDepositViewModel4 = (BettingDepositViewModel) l();
        final int i10 = 2;
        n.B(this, bettingDepositViewModel4 != null ? bettingDepositViewModel4.f26773f : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel5;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i11 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i12 = 0;
                switch (i10) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit3 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit4 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel6 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel6 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel6.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel7 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel7 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel7, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel7.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel8 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel8 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel8.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel5 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel5, new x9.r(billerID, itemID, null), bettingDepositViewModel5.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i12) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel9 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel9 != null) {
                                                    bettingDepositViewModel9.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel10 != null) {
                                                    bettingDepositViewModel10.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i13 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i13), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i11) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel9 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel9 != null) {
                                                    bettingDepositViewModel9.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel10 != null) {
                                                    bettingDepositViewModel10.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(19), true, null, 224);
        BettingDepositViewModel bettingDepositViewModel5 = (BettingDepositViewModel) l();
        final int i11 = 3;
        n.B(this, bettingDepositViewModel5 != null ? bettingDepositViewModel5.f26774g : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel6;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i12 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i13 = 0;
                switch (i11) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit4 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit5 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel7 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel7 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel7.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel8 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel8 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel8, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel8.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel9 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel9 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel9.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel6 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel6, new x9.r(billerID, itemID, null), bettingDepositViewModel6.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i13) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel10 != null) {
                                                    bettingDepositViewModel10.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel11 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel11 != null) {
                                                    bettingDepositViewModel11.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i14 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i14), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i12) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel10 != null) {
                                                    bettingDepositViewModel10.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel11 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel11 != null) {
                                                    bettingDepositViewModel11.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(20), true, null, 224);
        BettingDepositViewModel bettingDepositViewModel6 = (BettingDepositViewModel) l();
        com.transsnet.palmpay.core.base.l lVar2 = bettingDepositViewModel6 != null ? bettingDepositViewModel6.f26777o : null;
        if (lVar2 != null) {
            lVar2.e(this, new q(new j(this, this, 1), 25));
        }
        BettingDepositViewModel bettingDepositViewModel7 = (BettingDepositViewModel) l();
        final int i12 = 4;
        n.B(this, bettingDepositViewModel7 != null ? bettingDepositViewModel7.f26778p : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel8;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i13 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i14 = 0;
                switch (i12) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit5 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit6 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel9 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel9 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel9.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel10 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel10, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel10.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel11 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel11 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel11.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel8 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel8, new x9.r(billerID, itemID, null), bettingDepositViewModel8.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i14) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel12 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel12 != null) {
                                                    bettingDepositViewModel12.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel13 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel13 != null) {
                                                    bettingDepositViewModel13.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i15 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i15), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i13) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel12 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel12 != null) {
                                                    bettingDepositViewModel12.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel13 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel13 != null) {
                                                    bettingDepositViewModel13.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(21), false, null, 224);
        BettingDepositViewModel bettingDepositViewModel8 = (BettingDepositViewModel) l();
        final int i13 = 5;
        n.B(this, bettingDepositViewModel8 != null ? bettingDepositViewModel8.f26779v : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel9;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i14 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i15 = 0;
                switch (i13) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit6 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit7 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel10 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel10.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel11 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel11 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel11, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel11.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel12 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel12 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel12.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel9 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel9, new x9.r(billerID, itemID, null), bettingDepositViewModel9.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i15) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel13 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel13 != null) {
                                                    bettingDepositViewModel13.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel14 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel14 != null) {
                                                    bettingDepositViewModel14.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i16 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i16), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i14) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel13 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel13 != null) {
                                                    bettingDepositViewModel13.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel14 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel14 != null) {
                                                    bettingDepositViewModel14.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(22), true, null, 224);
        BettingDepositViewModel bettingDepositViewModel9 = (BettingDepositViewModel) l();
        com.transsnet.palmpay.core.base.l lVar3 = bettingDepositViewModel9 != null ? bettingDepositViewModel9.t : null;
        if (lVar3 != null) {
            lVar3.e(this, new q(new j(this, this, 2), 25));
        }
        BettingDepositViewModel bettingDepositViewModel10 = (BettingDepositViewModel) l();
        final int i14 = 1;
        n.B(this, bettingDepositViewModel10 != null ? bettingDepositViewModel10.f26770B : null, this, new Function2(this) { // from class: s9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BettingHomeActivity f42072b;

            {
                this.f42072b = this;
            }

            /* JADX WARN: Code duplicated, block: B:255:0x048e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:256:0x0490  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                long j6;
                LimitAmountResp amtLimit;
                LimitAmountResp amtLimit2;
                String billerId;
                String str;
                List<BettingBillerListItemBean> outBillerList;
                List<BettingAcmountItemData> amountList;
                Unit unit;
                String userIdTips;
                List<String> moduleSort;
                BettingDepositViewModel bettingDepositViewModel11;
                String customerId;
                String billerName;
                String name;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp2;
                Long businessAmount;
                CreateBettingOrderData.ValidateCustomer validateCustomerResp3;
                final int i15 = 1;
                String name2 = null;
                String itemID = "";
                long jLongValue = 0;
                BettingHomeActivity bettingHomeActivity = this.f42072b;
                final int i16 = 0;
                switch (i14) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        CommonBeanResult resp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(resp, "rsp");
                        if (resp.isSuccess()) {
                            BettingHomePageData bettingHomePageData = (BettingHomePageData) resp.data;
                            if (bettingHomePageData != null && (moduleSort = bettingHomePageData.getModuleSort()) != null) {
                                C0525w c0525wF = C0525w.f();
                                List listB = CollectionsKt.B(moduleSort);
                                if (!listB.contains("body")) {
                                    listB = CollectionsKt.P(C1849p.c("body"), listB);
                                }
                                String json = ((Gson) c0525wF.f7166b).toJson(listB);
                                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                                a.W("betting_deposit_module_sort", json);
                            }
                            ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
                            if (modelBettingRootView != null) {
                                Intrinsics.checkNotNullParameter(resp, "resp");
                                BettingHomePageData bettingHomePageData2 = (BettingHomePageData) resp.data;
                                Bc.f fVar = modelBettingRootView.f26742c;
                                if (bettingHomePageData2 == null || fVar == null) {
                                    j6 = 0;
                                } else {
                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) fVar.f701g;
                                    BettingBillerListItemBean defaultBiller = bettingHomePageData2.getDefaultBiller();
                                    String billerId2 = defaultBiller != null ? defaultBiller.getBillerId() : null;
                                    BettingBillerListItemBean defaultBiller2 = bettingHomePageData2.getDefaultBiller();
                                    modelBillerTipsInfo.b(billerId2, defaultBiller2 != null ? defaultBiller2.getBillerName() : null);
                                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                                    modelNumberInputLayout.setNumber(bettingHomePageData2.getCustomerId());
                                    Long businessAmount2 = bettingHomePageData2.getBusinessAmount();
                                    long jLongValue2 = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                                    if (jLongValue2 > 0) {
                                        Long businessAmount3 = bettingHomePageData2.getBusinessAmount();
                                        ppAmountEditText.setAmount(r0.A(businessAmount3 != null ? businessAmount3.longValue() : 0L));
                                        ppAmountEditText.setError("");
                                        j6 = 0;
                                    } else {
                                        PaymentItemBean defaultItem = bettingHomePageData2.getDefaultItem();
                                        j6 = 0;
                                        if ((defaultItem != null ? defaultItem.amount : 0L) > 0) {
                                            PaymentItemBean defaultItem2 = bettingHomePageData2.getDefaultItem();
                                            ppAmountEditText.setAmount(r0.A(defaultItem2 != null ? defaultItem2.amount : 0L));
                                            ppAmountEditText.setError("");
                                        }
                                    }
                                    BettingBillerListItemBean defaultBiller3 = bettingHomePageData2.getDefaultBiller();
                                    if (TextUtils.isEmpty(defaultBiller3 != null ? defaultBiller3.getAmountTip() : null)) {
                                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                                    } else {
                                        BettingBillerListItemBean defaultBiller4 = bettingHomePageData2.getDefaultBiller();
                                        ppAmountEditText.setHintText(defaultBiller4 != null ? defaultBiller4.getAmountTip() : null);
                                    }
                                    BettingBillerListItemBean defaultBiller5 = bettingHomePageData2.getDefaultBiller();
                                    if (defaultBiller5 == null || (userIdTips = defaultBiller5.getUserIdTips()) == null) {
                                        userIdTips = "";
                                    }
                                    modelNumberInputLayout.setHint(userIdTips);
                                }
                                BettingHomePageData bettingHomePageData3 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData3 != null && (amountList = bettingHomePageData3.getAmountList()) != null) {
                                    b bVar = modelBettingRootView.f26749o;
                                    if (bVar != null) {
                                        bVar.setList(amountList);
                                    }
                                    if (fVar != null) {
                                        p220oa.h.s((RecyclerView) fVar.f703j, !amountList.isEmpty());
                                        unit = Unit.f38893a;
                                    } else {
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        if (fVar != null) {
                                            p220oa.h.s((RecyclerView) fVar.f703j, false);
                                            Unit unit7 = Unit.f38893a;
                                        }
                                    }
                                } else if (fVar != null) {
                                    p220oa.h.s((RecyclerView) fVar.f703j, false);
                                    Unit unit8 = Unit.f38893a;
                                }
                            } else {
                                j6 = 0;
                            }
                            BettingHomePageData bettingHomePageData4 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26670Y.setValue(bettingHomeActivity, BettingHomeActivity.f26660w0[0], bettingHomePageData4 != null ? bettingHomePageData4.getDefaultBiller() : null);
                            BettingHomePageData bettingHomePageData5 = (BettingHomePageData) resp.data;
                            bettingHomeActivity.f26671Z = bettingHomePageData5 != null ? bettingHomePageData5.getDefaultItem() : null;
                            ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView2 != null) {
                                BettingHomePageData bettingHomePageData6 = (BettingHomePageData) resp.data;
                                if (bettingHomePageData6 == null || (outBillerList = bettingHomePageData6.getOutBillerList()) == null) {
                                    outBillerList = z.f38935a;
                                }
                                modelBettingRootView2.setBillerList(outBillerList);
                            }
                            ModelBettingRootView modelBettingRootView3 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView3 != null) {
                                modelBettingRootView3.g(bettingHomeActivity.r());
                            }
                            ModelBettingRootView modelBettingRootView4 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView4 != null) {
                                modelBettingRootView4.f();
                            }
                            BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
                            if (!TextUtils.isEmpty(bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null)) {
                                BettingDepositViewModel bettingDepositViewModel12 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel12 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
                                    if (bettingBillerListItemBeanR2 == null || (billerId = bettingBillerListItemBeanR2.getBillerId()) == null) {
                                        billerId = "";
                                    }
                                    PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
                                    if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
                                        itemID = str;
                                    }
                                    bettingDepositViewModel12.g(billerId, itemID, null);
                                }
                                BettingDepositViewModel bettingDepositViewModel13 = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel13 != null) {
                                    BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
                                    p140j8.f.s(bettingDepositViewModel13, new x9.e(bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getBillerId() : null, null), bettingDepositViewModel13.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                            }
                            BettingHomePageData bettingHomePageData7 = (BettingHomePageData) resp.data;
                            long j10 = bettingHomeActivity.f26674k0;
                            long maxAmount = (bettingHomePageData7 == null || (amtLimit2 = bettingHomePageData7.getAmtLimit()) == null) ? j10 : amtLimit2.getMaxAmount();
                            if (maxAmount <= j6) {
                                maxAmount = j10;
                            }
                            bettingHomeActivity.f26677p0 = maxAmount;
                            BettingHomePageData bettingHomePageData8 = (BettingHomePageData) resp.data;
                            long minAmount = (bettingHomePageData8 == null || (amtLimit = bettingHomePageData8.getAmtLimit()) == null) ? j6 : amtLimit.getMinAmount();
                            if (minAmount <= j6) {
                                minAmount = j6;
                            }
                            bettingHomeActivity.f26678q0 = minAmount;
                            PaymentItemBean paymentItemBean2 = bettingHomeActivity.f26671Z;
                            if (paymentItemBean2 != null) {
                                long j11 = paymentItemBean2.maxAmount;
                                if (j11 <= j6) {
                                    j11 = j10;
                                }
                                if (j11 > j6) {
                                    j10 = j11;
                                }
                                bettingHomeActivity.f26679r0 = j10;
                                long j12 = paymentItemBean2.minAmount;
                                if (j12 <= j6) {
                                    j12 = j6;
                                }
                                bettingHomeActivity.f26680s0 = j12 > j6 ? j12 : j6;
                            }
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        Function1 function1 = (Function1) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            T t = rsp.data;
                            if (t == 0) {
                                ModelQuickBettingView modelQuickBettingView = bettingHomeActivity.t;
                                if (modelQuickBettingView != null) {
                                    p220oa.h.s(modelQuickBettingView, false);
                                }
                            } else {
                                BettingQuickILotHomeBean bettingQuickILotHomeBean = (BettingQuickILotHomeBean) t;
                                if (function1 != null) {
                                    function1.invoke(bettingQuickILotHomeBean);
                                }
                            }
                        }
                        break;
                    case 2:
                        Function0 function2 = (Function0) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr3 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            BettingBillerListRsp bettingBillerListRsp = (BettingBillerListRsp) rsp2.data;
                            if (bettingBillerListRsp != null) {
                                bettingHomeActivity.f26668Q = bettingBillerListRsp;
                                if (function2 != null) {
                                    function2.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 3:
                        BettingDepositHomeParams bettingDepositHomeParams = (BettingDepositHomeParams) obj;
                        PaymentItemListRsp rsp3 = (PaymentItemListRsp) obj2;
                        KProperty[] kPropertyArr4 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<PaymentItemBean> list = rsp3.data;
                            if (list != null) {
                                ArrayList arrayList = bettingHomeActivity.f26669X;
                                arrayList.clear();
                                arrayList.addAll(list);
                                if (!arrayList.isEmpty()) {
                                    PaymentItemBean paymentItemBean3 = (PaymentItemBean) arrayList.get(0);
                                    Function0<Unit> function0IsCouponClick = bettingDepositHomeParams != null ? bettingDepositHomeParams.isCouponClick() : null;
                                    Boolean boolValueOf = bettingDepositHomeParams != null ? Boolean.valueOf(bettingDepositHomeParams.getClearCustomerId()) : null;
                                    if (paymentItemBean3 != null) {
                                        bettingHomeActivity.f26671Z = paymentItemBean3;
                                        ModelBettingRootView modelBettingRootView5 = bettingHomeActivity.f26676p;
                                        if (modelBettingRootView5 != null) {
                                            boolean z3 = paymentItemBean3.isAmountFixed == 0 && paymentItemBean3.amount > 0;
                                            Bc.f fVar2 = modelBettingRootView5.f26742c;
                                            if (fVar2 != null) {
                                                PpAmountEditText ppAmountEditText2 = (PpAmountEditText) fVar2.f699e;
                                                if (z3) {
                                                    ppAmountEditText2.setEnabled(false);
                                                    ppAmountEditText2.d(true);
                                                    ((RecyclerView) fVar2.f703j).setVisibility(8);
                                                } else {
                                                    ppAmountEditText2.setEnabled(true);
                                                    ppAmountEditText2.d(false);
                                                }
                                            }
                                        }
                                        long j13 = paymentItemBean3.maxAmount;
                                        if (j13 <= 0) {
                                            j13 = bettingHomeActivity.f26674k0;
                                        }
                                        bettingHomeActivity.f26679r0 = j13;
                                        long j14 = paymentItemBean3.minAmount;
                                        bettingHomeActivity.f26680s0 = j14 > 0 ? j14 : 0L;
                                        BettingDepositViewModel bettingDepositViewModel14 = (BettingDepositViewModel) bettingHomeActivity.l();
                                        if (bettingDepositViewModel14 != null) {
                                            String str2 = paymentItemBean3.billerId;
                                            if (str2 == null) {
                                                str2 = "";
                                            }
                                            String str3 = paymentItemBean3.paymentItemId;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            bettingDepositViewModel14.g(str2, str3, function0IsCouponClick);
                                        }
                                        if (!Intrinsics.c(boolValueOf, Boolean.FALSE) && (bettingDepositViewModel11 = (BettingDepositViewModel) bettingHomeActivity.l()) != null) {
                                            String billerID = paymentItemBean3.billerId;
                                            if (billerID == null) {
                                                billerID = "";
                                            }
                                            String str4 = paymentItemBean3.paymentItemId;
                                            itemID = str4 != null ? str4 : "";
                                            Intrinsics.checkNotNullParameter(billerID, "billerID");
                                            Intrinsics.checkNotNullParameter(itemID, "itemID");
                                            p140j8.f.s(bettingDepositViewModel11, new x9.r(billerID, itemID, null), bettingDepositViewModel11.f26777o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                        }
                                    }
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 4:
                        Function0 function3 = (Function0) obj;
                        CommonListResultV2 response = (CommonListResultV2) obj2;
                        KProperty[] kPropertyArr5 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(response, "rsp");
                        if (response.isSuccess()) {
                            ModelBettingRootView modelBettingRootView6 = bettingHomeActivity.f26676p;
                            if (modelBettingRootView6 != null) {
                                PaymentItemBean paymentItemBean4 = bettingHomeActivity.f26671Z;
                                Intrinsics.checkNotNullParameter(response, "response");
                                List<T> list2 = response.data;
                                Bc.f fVar3 = modelBettingRootView6.f26742c;
                                if (list2 != 0) {
                                    b bVar2 = modelBettingRootView6.f26749o;
                                    if (bVar2 != null) {
                                        bVar2.setList(list2);
                                    }
                                    if (fVar3 != null) {
                                        ((RecyclerView) fVar3.f703j).setVisibility(list2.isEmpty() ? 8 : 0);
                                    }
                                }
                                if (paymentItemBean4 != null && paymentItemBean4.isAmountFixed == 0 && paymentItemBean4.amount > 0 && fVar3 != null) {
                                    ((RecyclerView) fVar3.f703j).setVisibility(8);
                                }
                                if (function3 != null) {
                                    function3.invoke();
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        final CreateBettingOrderReq createBettingOrderReq = (CreateBettingOrderReq) obj;
                        CommonBeanResult rsp4 = (CommonBeanResult) obj2;
                        KProperty[] kPropertyArr6 = BettingHomeActivity.f26660w0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        boolean zIsSuccess = rsp4.isSuccess();
                        final BettingHomeActivity bettingHomeActivity2 = this.f42072b;
                        if (zIsSuccess) {
                            CreateBettingOrderData createBettingOrderData = (CreateBettingOrderData) rsp4.data;
                            if (createBettingOrderData == null || (validateCustomerResp3 = createBettingOrderData.getValidateCustomerResp()) == null || validateCustomerResp3.getExists()) {
                                C0751z c0751z = new C0751z(bettingHomeActivity2, 11);
                                CreateBettingOrderData createBettingOrderData2 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4971b = createBettingOrderData2 != null ? createBettingOrderData2.getOrderNo() : null;
                                if (createBettingOrderReq != null && (businessAmount = createBettingOrderReq.getBusinessAmount()) != null) {
                                    jLongValue = businessAmount.longValue();
                                }
                                c0751z.c(Long.valueOf(jLongValue));
                                c0751z.f4972c = createBettingOrderReq != null ? createBettingOrderReq.getTransType() : null;
                                CreateBettingOrderData createBettingOrderData3 = (CreateBettingOrderData) rsp4.data;
                                c0751z.f4978i = createBettingOrderData3 != null ? createBettingOrderData3.getCalculationExtInfo() : null;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = bettingHomeActivity2.getString(Vd.a.qt_user_id);
                                if (createBettingOrderReq == null || (customerId = createBettingOrderReq.getCustomerId()) == null) {
                                    customerId = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, customerId));
                                CreateBettingOrderData createBettingOrderData4 = (CreateBettingOrderData) rsp4.data;
                                if (createBettingOrderData4 != null && (validateCustomerResp2 = createBettingOrderData4.getValidateCustomerResp()) != null) {
                                    name2 = validateCustomerResp2.getName();
                                }
                                if (!TextUtils.isEmpty(name2)) {
                                    String string2 = bettingHomeActivity2.getString(Vd.a.qt_account_name);
                                    CreateBettingOrderData createBettingOrderData5 = (CreateBettingOrderData) rsp4.data;
                                    if (createBettingOrderData5 == null || (validateCustomerResp = createBettingOrderData5.getValidateCustomerResp()) == null || (name = validateCustomerResp.getName()) == null) {
                                        name = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, name));
                                }
                                String string3 = bettingHomeActivity2.getString(Pd.f.qt_biller_name);
                                if (createBettingOrderReq != null && (billerName = createBettingOrderReq.getBillerName()) != null) {
                                    itemID = billerName;
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, itemID));
                                c0751z.b(arrayList2);
                                c0751z.d();
                            } else {
                                ModelBettingRootView modelBettingRootView7 = bettingHomeActivity2.f26676p;
                                if (modelBettingRootView7 != null) {
                                    String string4 = bettingHomeActivity2.getString(Pd.f.qt_user_id_is_invalid);
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    modelBettingRootView7.setCustomerIdError(string4);
                                }
                            }
                        } else if ("BET00001".equalsIgnoreCase(rsp4.getRespCode())) {
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(Pd.f.qt_confirm_user_id), null, null, null, null, rsp4.getRespMsg(), Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i16) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel15 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel15 != null) {
                                                    bettingDepositViewModel15.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel16 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel16 != null) {
                                                    bettingDepositViewModel16.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else if ("A000009".equalsIgnoreCase(rsp4.getRespCode())) {
                            int i17 = Pd.f.qt_confirm_top_up_amount;
                            String respMsg = rsp4.getRespMsg();
                            n.O(bettingHomeActivity2, 0, Integer.valueOf(i17), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(k.core_continue), null, new View.OnClickListener() { // from class: s9.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    BettingHomeActivity bettingHomeActivity3 = bettingHomeActivity2;
                                    CreateBettingOrderReq createBettingOrderReq2 = createBettingOrderReq;
                                    switch (i15) {
                                        case 0:
                                            KProperty[] kPropertyArr7 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                createBettingOrderReq2.setVerifyPhone(false);
                                                BettingDepositViewModel bettingDepositViewModel15 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel15 != null) {
                                                    bettingDepositViewModel15.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                        default:
                                            KProperty[] kPropertyArr8 = BettingHomeActivity.f26660w0;
                                            if (createBettingOrderReq2 != null) {
                                                Long businessAmount4 = createBettingOrderReq2.getBusinessAmount();
                                                long j15 = 100;
                                                createBettingOrderReq2.setBusinessAmount(Long.valueOf(((businessAmount4 != null ? businessAmount4.longValue() : 0L) / j15) * j15));
                                                BettingDepositViewModel bettingDepositViewModel16 = (BettingDepositViewModel) bettingHomeActivity3.l();
                                                if (bettingDepositViewModel16 != null) {
                                                    bettingDepositViewModel16.d(createBettingOrderReq2);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, Integer.valueOf(k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, null, false, null, 248);
        BettingDepositViewModel bettingDepositViewModel11 = (BettingDepositViewModel) l();
        com.transsnet.palmpay.core.base.l lVar4 = bettingDepositViewModel11 != null ? bettingDepositViewModel11.f26771C : null;
        if (lVar4 != null) {
            lVar4.e(this, new q(new j(this, 3), 25));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_home_betting, (ViewGroup) null, false);
        int i7 = Pd.c.betting_deposit_scroll_view;
        if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = Pd.c.bettingRootLinearLayout;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = Pd.c.titleBar;
                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                if (ppTitleBar != null) {
                    r rVar = new r((LinearLayout) viewInflate, linearLayout, ppTitleBar);
                    Intrinsics.checkNotNullExpressionValue(rVar, "inflate(...)");
                    return rVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        P0 p3 = new P0(this);
        r rVar = (r) this.f27334c;
        p3.f13251f = rVar != null ? rVar.f8461b : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_tips, "deposit Betting"));
        p282s9.f listener = new p282s9.f(this, 2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        String string = getString(Pd.f.qt_dial861);
        p282s9.d dVar = new p282s9.d(this, 2);
        p3.f13248c = string;
        p3.f13250e = dVar;
        return p3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog.CallBack
    public final void onDialogBillerClick(BettingBillerListItemBean bettingBillerListItemBean) {
        Bc.f fVar;
        if (bettingBillerListItemBean != null) {
            ModelBettingRootView modelBettingRootView = this.f26676p;
            if (modelBettingRootView != null) {
                modelBettingRootView.g(bettingBillerListItemBean);
            }
            t(bettingBillerListItemBean, true, new C1976t(2));
            this.f26671Z = null;
            ModelBettingRootView modelBettingRootView2 = this.f26676p;
            if (modelBettingRootView2 == null || (fVar = modelBettingRootView2.f26742c) == null) {
                return;
            }
            ((RecyclerView) fVar.f703j).setVisibility(8);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType != 307 && eventType != 308) {
            switch (eventType) {
            }
        }
        BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
        if (bettingDepositViewModel != null) {
            bettingDepositViewModel.f(new C1976t(3));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        getWindow().getDecorView().post(new p7.h(this.f26682u0, 5, this, false));
    }

    public final BettingBillerListItemBean r() {
        return (BettingBillerListItemBean) this.f26670Y.getValue(this, f26660w0[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView rightImageView1;
        ImageView rightImageView2;
        BettingHomeActivity bettingHomeActivity = this;
        final int i7 = 1;
        super.setupView();
        u.a(bettingHomeActivity.getOnBackPressedDispatcher(), bettingHomeActivity, new p282s9.c(bettingHomeActivity, 0));
        ARouter.getInstance().inject(bettingHomeActivity);
        org.greenrobot.eventbus.c.b().j(bettingHomeActivity);
        bettingHomeActivity.initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, bettingHomeActivity));
        if (!TextUtils.isEmpty(bettingHomeActivity.f26675o)) {
            n0.g().w("PPay_Betting_Channel", F.b(new Pair("biller_channel", bettingHomeActivity.f26675o)));
        }
        r rVar = (r) bettingHomeActivity.f27334c;
        if (rVar != null) {
            LinearLayout linearLayout = rVar.f8461b;
            String strI = p059e1.a.I("betting_deposit_module_sort", "");
            List list = f26661x0;
            if (strI != null && strI.length() != 0) {
                try {
                    List list2 = (List) C0525w.f().e(strI, new TypeToken<List<? extends String>>() { // from class: com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity$getModuleSortOrderFromSp$1
                    }.getType());
                    if (list2 != null) {
                        list = list2;
                    }
                } catch (Exception unused) {
                }
            }
            List listB = CollectionsKt.B(list);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(bettingHomeActivity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = CommonViewExtKt.getDp(12);
            int i10 = 0;
            for (Object obj : listB) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C1850q.k();
                    throw null;
                }
                String str = (String) obj;
                LinearLayout.LayoutParams layoutParams3 = i10 == 0 ? layoutParams : layoutParams2;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals(LoanHomeSource.BANNER)) {
                            ViewStub viewStub = new ViewStub(bettingHomeActivity);
                            viewStub.setId(View.generateViewId());
                            viewStub.setLayoutResource(d.qt_layout_banner_coupon_item);
                            bettingHomeActivity.f26663B = viewStub;
                            linearLayout.addView(viewStub, layoutParams3);
                        }
                        break;
                    case -1066435740:
                        if (str.equals("quickBet")) {
                            ViewStub viewStub2 = new ViewStub(bettingHomeActivity);
                            viewStub2.setId(View.generateViewId());
                            viewStub2.setLayoutResource(d.qt_layout_banner_quick_bet);
                            bettingHomeActivity.f26662A = viewStub2;
                            linearLayout.addView(viewStub2, layoutParams3);
                        }
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            View viewInflate = layoutInflaterFrom.inflate(d.qt_layout_betting_root_view, (ViewGroup) linearLayout, false);
                            linearLayout.addView(viewInflate, layoutParams3);
                            bettingHomeActivity.f26676p = viewInflate instanceof ModelBettingRootView ? (ModelBettingRootView) viewInflate : null;
                        }
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            ViewStub viewStub3 = new ViewStub(bettingHomeActivity);
                            viewStub3.setId(View.generateViewId());
                            viewStub3.setLayoutResource(d.qt_layout_betting_race_schedule_stub);
                            bettingHomeActivity.f26664C = viewStub3;
                            linearLayout.addView(viewStub3, layoutParams3);
                        }
                        break;
                    case 432371099:
                        if (str.equals("disclaimer")) {
                            ViewStub viewStub4 = new ViewStub(bettingHomeActivity);
                            viewStub4.setId(View.generateViewId());
                            viewStub4.setLayoutResource(d.qt_layout_betting_disclaimer_stub);
                            bettingHomeActivity.f26666L = viewStub4;
                            linearLayout.addView(viewStub4, layoutParams3);
                        }
                        break;
                    case 755280288:
                        if (str.equals("moreService")) {
                            ViewStub viewStub5 = new ViewStub(bettingHomeActivity);
                            viewStub5.setId(View.generateViewId());
                            viewStub5.setLayoutResource(d.qt_layout_more_service_stub);
                            bettingHomeActivity.f26665H = viewStub5;
                            linearLayout.addView(viewStub5, layoutParams3);
                        }
                        break;
                }
                i10 = i11;
            }
        }
        final ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
        if (modelBettingRootView != null) {
            boolean zIsDarkMode = bettingHomeActivity.isDarkMode();
            H getSelectBiller = new H(0, bettingHomeActivity, BettingHomeActivity.class, "getSelectBiller", "getSelectBiller()Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", 0, 4);
            H getSelectPaymentItem = new H(0, this, BettingHomeActivity.class, "getSelectPaymentItem", "getSelectPaymentItem()Lcom/transsnet/palmpay/teller/bean/PaymentItemBean;", 0, 5);
            H getMinAmount = new H(0, this, BettingHomeActivity.class, "getMinAmount", "getMinAmount()J", 0, 6);
            bettingHomeActivity = this;
            H getMaxAmount = new H(0, bettingHomeActivity, BettingHomeActivity.class, "getMaxAmount", "getMaxAmount()J", 0, 7);
            p282s9.l callback = new p282s9.l(bettingHomeActivity);
            Oe.a aVar = new Oe.a(bettingHomeActivity, 25);
            C0759d0 showLoadingDialog = new C0759d0(1, bettingHomeActivity, BettingHomeActivity.class, "showLoadingDialog", "showLoadingDialog(Z)V", 0, 4);
            Intrinsics.checkNotNullParameter(getSelectBiller, "getSelectBiller");
            Intrinsics.checkNotNullParameter(getSelectPaymentItem, "getSelectPaymentItem");
            Intrinsics.checkNotNullParameter(getMinAmount, "getMinAmount");
            Intrinsics.checkNotNullParameter(getMaxAmount, "getMaxAmount");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(showLoadingDialog, "showLoadingDialog");
            modelBettingRootView.f26743d = callback;
            modelBettingRootView.f26744e = zIsDarkMode;
            modelBettingRootView.f26745f = getSelectBiller;
            modelBettingRootView.f26746g = getSelectPaymentItem;
            modelBettingRootView.t = aVar;
            modelBettingRootView.f26747i = getMinAmount;
            modelBettingRootView.f26748j = getMaxAmount;
            modelBettingRootView.f26751v = showLoadingDialog;
            Bc.f fVar = modelBettingRootView.f26742c;
            if (fVar != null) {
                PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                ppAmountEditText.setCurrencySymbol(BaseApplication.getCurrencySymbol());
                modelBettingRootView.f26749o = new b(modelBettingRootView.f26744e);
                RecyclerView recyclerView = (RecyclerView) fVar.f703j;
                recyclerView.setLayoutManager(new GridLayoutManager(modelBettingRootView.getContext(), 3));
                recyclerView.addItemDecoration(new Qb.b(3, CommonViewExtKt.getDp(6), 0));
                recyclerView.setAdapter(modelBettingRootView.f26749o);
                modelBettingRootView.f();
                ppAmountEditText.setTextInputListener(new p338w9.b(modelBettingRootView));
                ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                TextView titleTv = modelNumberInputLayout.getTitleTv();
                if (titleTv != null) {
                    titleTv.setText(modelBettingRootView.getContext().getString(Vd.a.qt_user_id));
                }
                ModelNumberInputLayout filter = modelNumberInputLayout.setFilter(new InputFilter[]{new Tb.a(0), new Tb.c(32, 0)});
                if (filter != null) {
                    filter.build();
                }
                AppCompatAutoCompleteTextView numberEdit = modelNumberInputLayout.getNumberEdit();
                if (numberEdit != null) {
                    numberEdit.setSingleLine();
                }
                AppCompatAutoCompleteTextView numberEdit2 = modelNumberInputLayout.getNumberEdit();
                if (numberEdit2 != null) {
                    numberEdit2.setImeOptions(6);
                }
                modelNumberInputLayout.setOnNumberInputListener(new p338w9.e(modelBettingRootView));
                IconicsImageView contactIv = modelNumberInputLayout.getContactIv();
                if (contactIv != null) {
                    final int i12 = 0;
                    contactIv.setOnClickListener(new View.OnClickListener() { // from class: w9.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ModelBettingRootView modelBettingRootView2 = modelBettingRootView;
                            switch (i12) {
                                case 0:
                                    p282s9.l lVar = modelBettingRootView2.f26743d;
                                    if (lVar != null) {
                                        lVar.onContactsClick();
                                    }
                                    break;
                                default:
                                    int i13 = ModelBettingRootView.f26741w;
                                    modelBettingRootView2.e();
                                    break;
                            }
                        }
                    });
                }
                ppAmountEditText.setActionButtonListener(new View.OnClickListener() { // from class: w9.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ModelBettingRootView modelBettingRootView2 = modelBettingRootView;
                        switch (i7) {
                            case 0:
                                p282s9.l lVar = modelBettingRootView2.f26743d;
                                if (lVar != null) {
                                    lVar.onContactsClick();
                                }
                                break;
                            default:
                                int i13 = ModelBettingRootView.f26741w;
                                modelBettingRootView2.e();
                                break;
                        }
                    }
                });
                ModelBillerSelection modelBillerSelection = (ModelBillerSelection) fVar.f698d;
                modelBillerSelection.setDarkMode(modelBettingRootView.f26744e);
                modelBillerSelection.setCallback(new com.transsnet.palmpay.betting.ui.view.a(modelBettingRootView));
                b bVar = modelBettingRootView.f26749o;
                if (bVar != null) {
                    bVar.setOnItemClickListener(new p338w9.b(modelBettingRootView));
                }
                p325vb.a refreshTips = new p325vb.a(modelBettingRootView, 1);
                Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_BILLER_BETTING, "transType");
                Intrinsics.checkNotNullParameter(refreshTips, "refreshTips");
                ((ModelBillerTipsInfo) fVar.f701g).a(TransType.TRANS_TYPE_BILLER_BETTING, new p325vb.a(refreshTips, 2));
            }
            if (fVar != null) {
                modelBettingRootView.f26750p = new M();
                RecyclerView recyclerView2 = (RecyclerView) fVar.f696b;
                recyclerView2.setLayoutManager(new LinearLayoutManager(modelBettingRootView.getContext(), 0, false));
                recyclerView2.setAdapter(modelBettingRootView.f26750p);
                recyclerView2.addItemDecoration(new Qb.c(0, 0, 0, 8));
                M m7 = modelBettingRootView.f26750p;
                if (m7 != null) {
                    m7.f3242b = new O(modelBettingRootView);
                }
            }
            modelBettingRootView.d();
        }
        r rVar2 = (r) bettingHomeActivity.f27334c;
        if (rVar2 != null && (rightImageView2 = rVar2.f8462c.getRightImageView1()) != null) {
            rightImageView2.setImageResource(p025ba.d.core_bill_history_default);
        }
        r rVar3 = (r) bettingHomeActivity.f27334c;
        if (rVar3 != null && (rightImageView1 = rVar3.f8462c.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new p282s9.d(bettingHomeActivity, 0));
        }
        r rVar4 = (r) bettingHomeActivity.f27334c;
        if (rVar4 != null) {
            rVar4.f8462c.setBackButtonClickListener(new p282s9.d(bettingHomeActivity, 1));
        }
    }

    public final void t(BettingBillerListItemBean bettingBillerListItemBean, boolean z3, Function0 function0) {
        if (i0.W(this) && bettingBillerListItemBean != null) {
            this.f26670Y.setValue(this, f26660w0[0], bettingBillerListItemBean);
            ModelBettingRootView modelBettingRootView = this.f26676p;
            if (modelBettingRootView != null) {
                String billerName = bettingBillerListItemBean.getBillerName();
                String billerId = bettingBillerListItemBean.getBillerId();
                String userIdTips = bettingBillerListItemBean.getUserIdTips();
                String amountTip = bettingBillerListItemBean.getAmountTip();
                bettingBillerListItemBean.getInstitutionLogo();
                Bc.f fVar = modelBettingRootView.f26742c;
                if (fVar != null) {
                    PpAmountEditText ppAmountEditText = (PpAmountEditText) fVar.f699e;
                    ppAmountEditText.setAmount("");
                    ((ModelBillerTipsInfo) fVar.f701g).b(billerId, billerName);
                    ((ModelBillerSelection) fVar.f698d).setSelectedBillerId(billerId);
                    ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) fVar.f700f;
                    if (userIdTips == null) {
                        userIdTips = "";
                    }
                    modelNumberInputLayout.setHint(userIdTips);
                    if (TextUtils.isEmpty(amountTip)) {
                        ppAmountEditText.setHintText(modelBettingRootView.getContext().getString(v.cv_hint_enter_amount));
                    } else {
                        ppAmountEditText.setHintText(amountTip);
                    }
                    if (z3) {
                        modelNumberInputLayout.setNumber("");
                    }
                }
            }
            Integer status = bettingBillerListItemBean.getStatus();
            if (status == null || status.intValue() != 1) {
                String billerName2 = bettingBillerListItemBean.getBillerName();
                if (billerName2 == null) {
                    billerName2 = "";
                }
                String string = getString(Pd.f.qt_service_temporarily_unavailable_3, billerName2);
                ToastDialog toastDialog = new ToastDialog(this, t.cv_toast_dialog);
                toastDialog.setMessage(string);
                toastDialog.setTitle((String) null);
                toastDialog.setIcon(0);
                toastDialog.setIcon((Drawable) null);
                toastDialog.setBackground(0);
                toastDialog.show(4000L);
            }
            if (!TextUtils.isEmpty(bettingBillerListItemBean.getBillerId())) {
                BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
                if (bettingDepositViewModel != null) {
                    String billerId2 = bettingBillerListItemBean.getBillerId();
                    PaymentItemListReq paymentItemListReq = new PaymentItemListReq();
                    paymentItemListReq.categoryId = bettingDepositViewModel.f26772e;
                    paymentItemListReq.billerId = billerId2;
                    if (TextUtils.isEmpty(billerId2)) {
                        ToastUtils.showLong(Pd.f.qt_select_biller_first);
                    } else {
                        x9.d dVar = new x9.d(paymentItemListReq, null);
                        if (billerId2 == null) {
                            billerId2 = "";
                        }
                        BettingDepositHomeParams bettingDepositHomeParams = new BettingDepositHomeParams(z3, billerId2, function0);
                        com.transsnet.palmpay.core.base.l lVar = bettingDepositViewModel.f26774g;
                        lVar.f27356m = bettingDepositHomeParams;
                        Unit unit = Unit.f38893a;
                        p140j8.f.v(bettingDepositViewModel, dVar, lVar, 0L);
                    }
                }
                BettingDepositViewModel bettingDepositViewModel2 = (BettingDepositViewModel) l();
                if (bettingDepositViewModel2 != null) {
                    p140j8.f.s(bettingDepositViewModel2, new x9.e(bettingBillerListItemBean.getBillerId(), null), bettingDepositViewModel2.f26776j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
            }
            n0 n0VarG = n0.g();
            String billerName3 = bettingBillerListItemBean.getBillerName();
            n0VarG.n("Betting_BillerSelectTotal", F.b(new Pair("billerName", billerName3 != null ? billerName3 : "")));
        }
    }

    public final void u(String str) {
        BettingBillerListItemBean bettingBillerListItemBean;
        ModelBettingRootView modelBettingRootView;
        List<BettingBillerListItemBean> allBillers;
        List<BettingBillerListItemBean> allBillers2;
        Object next;
        BettingBillerListRsp bettingBillerListRsp = this.f26668Q;
        BettingBillerListItemBean bettingBillerListItemBean2 = null;
        if (bettingBillerListRsp == null || (allBillers2 = bettingBillerListRsp.getAllBillers()) == null) {
            bettingBillerListItemBean = null;
        } else {
            Iterator<T> it = allBillers2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.c(((BettingBillerListItemBean) next).getBillerId(), str));
            bettingBillerListItemBean = (BettingBillerListItemBean) next;
        }
        if (bettingBillerListItemBean != null) {
            Integer status = bettingBillerListItemBean.getStatus();
            if (status == null || status.intValue() != 0) {
                ModelBettingRootView modelBettingRootView2 = this.f26676p;
                if (modelBettingRootView2 != null) {
                    modelBettingRootView2.g(bettingBillerListItemBean);
                }
                t(bettingBillerListItemBean, false, new C1976t(2));
                return;
            }
            BettingBillerListRsp bettingBillerListRsp2 = this.f26668Q;
            if (bettingBillerListRsp2 != null && (allBillers = bettingBillerListRsp2.getAllBillers()) != null) {
                bettingBillerListItemBean2 = (BettingBillerListItemBean) CollectionsKt.firstOrNull(allBillers);
            }
            if (bettingBillerListItemBean2 != null && (modelBettingRootView = this.f26676p) != null) {
                modelBettingRootView.g(bettingBillerListItemBean2);
            }
            t(bettingBillerListItemBean2, true, new C1976t(2));
        }
    }

    public final void v(String str, String str2) {
        ModelBettingRootView modelBettingRootView = this.f26676p;
        if (modelBettingRootView != null) {
            modelBettingRootView.setHistoryBiller(str2);
        }
        if (this.f26668Q != null) {
            if (str != null) {
                u(str);
            }
        } else {
            BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) l();
            if (bettingDepositViewModel != null) {
                bettingDepositViewModel.e(new L(26, str, this));
            }
        }
    }
}
