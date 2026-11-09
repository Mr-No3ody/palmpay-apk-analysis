package com.transsnet.palmpay.credit.ui.fragment;

import Bc.p;
import C0.G;
import Ce.J;
import Eb.b;
import F6.d;
import Jb.C0355n;
import Jb.y;
import Pa.C0525w;
import Pa.r0;
import Ya.e;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.adsdk.widgets.snackbar.SnackBarAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmVBFragment;
import com.transsnet.palmpay.credit.bean.CLPromoteData;
import com.transsnet.palmpay.credit.bean.LoanHomeBottomInfo;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.req.CLCalcReturnSendCouponReq;
import com.transsnet.palmpay.credit.bean.req.CLPermissionInfo;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialogFragment;
import com.transsnet.palmpay.credit.ui.view.NotifyInfoView;
import com.transsnet.palmpay.credit.view.KingKongContentInfoView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.ReboundScrollView;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p099gb.g;
import p140j8.f;
import p220oa.h;
import p284sb.C2023v;
import p284sb.C2025x;
import p355xf.o;
import p355xf.q;
import p382zb.N;
import p382zb.r;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_home_finance_fragment")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcHomeFinanceFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmVBFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Lgb/g;", "Lcom/transsnet/palmpay/credit/view/ProductContentListAdapter$OnApplyClickListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcHomeFinanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcHomeFinanceFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeFinanceFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,427:1\n171#2,12:428\n215#2:440\n115#2,8:441\n145#2:449\n115#2,8:450\n145#2:458\n774#3:459\n865#3,2:460\n774#3:462\n865#3,2:463\n*S KotlinDebug\n*F\n+ 1 OcHomeFinanceFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeFinanceFragment\n*L\n90#1:428,12\n90#1:440\n96#1:441,8\n96#1:449\n100#1:450,8\n100#1:458\n302#1:459\n302#1:460,2\n303#1:462\n303#1:463,2\n*E\n"})
public final class OcHomeFinanceFragment extends CreditBaseMvvmVBFragment<OcHomeFinanceViewModel, g> implements ProductContentListAdapter$OnApplyClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f30429p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        l lVar = ocHomeFinanceViewModel != null ? ocHomeFinanceViewModel.f30916j : null;
        if (lVar != null) {
            lVar.e(this, new C2023v(new r(this, this, 3), 19));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModel2 = (OcHomeFinanceViewModel) this.f27333i;
        l lVar2 = ocHomeFinanceViewModel2 != null ? ocHomeFinanceViewModel2.f30911L : null;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new N(this, 0), 19));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModel3 = (OcHomeFinanceViewModel) this.f27333i;
        l lVar3 = ocHomeFinanceViewModel3 != null ? ocHomeFinanceViewModel3.f30917o : null;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new N(this, 1), 19));
        }
        d.h(this.f27317a, 3, "preloadDialogBg >>>");
        r0.D1(getContext(), CLIncreaseAmountDialog.URL_DIALOG_BG);
        r0.D1(getContext(), CLIncreaseAmountDialog.URL_DIALOG_BL_BG);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        C0525w c0525wF = C0525w.f();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("home_loan_data") : null;
        c0525wF.getClass();
        u((LoanHomeDataInfo) C0525w.d(string, LoanHomeDataInfo.class));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        if (isAdded()) {
            try {
                String string = getString(Ya.g.oc_finance_tab_snack_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                SnackBarAdView snackBarAdView = new SnackBarAdView(string, new C2025x(21));
                E activity = getActivity();
                if (activity != null) {
                    snackBarAdView.show(activity, new J(activity, 1));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        g gVar = (g) this.f27335j;
        if (gVar == null) {
            return 0;
        }
        gVar.f37151i.setOnApplyClickListener(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener
    public final void onApplyClick(ProductContentInfo contentInfo) {
        Intrinsics.checkNotNullParameter(contentInfo, "contentInfo");
        d.h(this.f27317a, 3, G.p("loanProduct=", contentInfo.loanProduct, ", status=", contentInfo.status));
        if (TextUtils.equals(contentInfo.status, "canBorrow")) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            Z childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            iLoanCreditService.startBorrow(childFragmentManager, contentInfo.loanProduct, (124 & 4) != 0 ? null : contentInfo.amount, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : new JumpLinkInfo(contentInfo.jumpPath, contentInfo.jumpType, contentInfo.jumpParams, null, 8, null), null, null);
            return;
        }
        if (TextUtils.equals(contentInfo.loanProduct, "INSTALLMENT_LOAN")) {
            LoanCreditService loanCreditService = new LoanCreditService(this);
            Z childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            n.y(loanCreditService, childFragmentManager2, "INSTALLMENT_LOAN", null, null, 12);
            return;
        }
        if (TextUtils.equals(contentInfo.loanProduct, "OK_CARD")) {
            ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "OTHER").navigation(getContext());
            return;
        }
        ILoanCreditService iLoanCreditService2 = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        Z childFragmentManager3 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
        iLoanCreditService2.startCredit(childFragmentManager3, contentInfo.loanProduct, "OTHER", contentInfo.applyId);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (c.b().e(this)) {
            return;
        }
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 563) {
            C0525w c0525wF = C0525w.f();
            String eventContent = event.getEventContent();
            c0525wF.getClass();
            u((LoanHomeDataInfo) C0525w.d(eventContent, LoanHomeDataInfo.class));
            return;
        }
        if (eventType != 565) {
            return;
        }
        String eventContent2 = event.getEventContent();
        try {
            o oVar = q.f43977a;
            if (eventContent2 != null) {
                d.h(this.f27317a, 3, "eventContent = ".concat(eventContent2));
                JSONObject jSONObjectOptJSONObject = new JSONObject(eventContent2).optJSONObject("NativeMap");
                CLCalcReturnSendCouponReq req = new CLCalcReturnSendCouponReq(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("loanProduct") : null);
                OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
                if (ocHomeFinanceViewModel != null) {
                    Intrinsics.checkNotNullParameter(req, "req");
                    f.s(ocHomeFinanceViewModel, new C0355n(req, null), ocHomeFinanceViewModel.f30917o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    Unit unit = Unit.f38893a;
                }
            }
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED.equalsIgnoreCase(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType) || "5065".equalsIgnoreCase(pushMessage.content.messageType) || "5066".equalsIgnoreCase(pushMessage.content.messageType) || "5067".equalsIgnoreCase(pushMessage.content.messageType) || PushMessage.MESSAGE_TYPE_OKCARD_INCREASE.equalsIgnoreCase(pushMessage.content.messageType) || "M0539".equalsIgnoreCase(pushMessage.content.messageType)) {
            v();
            return;
        }
        if (TextUtils.equals(PushMessage.MESSAGE_TYPE_CASH_INCREASE, pushMessage.content.messageType) || TextUtils.equals(PushMessage.MESSAGE_TYPE_CASH_NO_INCREASE, pushMessage.content.messageType)) {
            try {
                JSONObject jSONObject = new JSONObject(pushMessage.content.businessInfo);
                int i7 = jSONObject.getInt("calculateType");
                if (i7 == 20) {
                    long j6 = jSONObject.getLong("creditQuota");
                    int i10 = jSONObject.getInt(FirebaseAnalytics.Param.TERM);
                    int i11 = jSONObject.getInt("maxLoanDays");
                    double d2 = jSONObject.getDouble("interestRatio");
                    long j10 = jSONObject.getLong("loanAmount");
                    long j11 = jSONObject.getLong("dailyInterest");
                    if (SPUtils.get().getBoolean(BaseApplication.get().getUser().getMemberId() + "show_installment_increase_dialog")) {
                        CLIncreaseAmountDialogFragment cLIncreaseAmountDialogFragmentNewInstance = CLIncreaseAmountDialogFragment.f29944C.newInstance(new CLPromoteData(Integer.valueOf(i7), Long.valueOf(j6), Integer.valueOf(i10), Integer.valueOf(i11), Double.valueOf(d2), Long.valueOf(j10), Long.valueOf(j11), null, null, MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, null));
                        Z childFragmentManager = getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        cLIncreaseAmountDialogFragmentNewInstance.show(childFragmentManager, "showCLIncreaseAmountDialog");
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        E activity = getActivity();
        if (activity == null || i7 != 1001) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = grantResults.length;
        for (int i10 = 0; i10 < length; i10++) {
            CLPermissionInfo cLPermissionInfo = new CLPermissionInfo(null, 0, 3, null);
            cLPermissionInfo.setName(permissions[i10]);
            if (grantResults[i10] == 0) {
                cLPermissionInfo.setState(1);
            } else if (AbstractC1032a.h(activity, permissions[i10])) {
                cLPermissionInfo.setState(2);
            } else {
                cLPermissionInfo.setState(3);
            }
            arrayList.add(cLPermissionInfo);
        }
        PermissionReq req = new PermissionReq("flexi cash", "trade", Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), arrayList);
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(ocHomeFinanceViewModel, new y(req, null), ocHomeFinanceViewModel.f30918p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        p143jb.g.f38511o.getInstance().l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Set set = b.f2269a;
        p118hf.a.f37382e = Boolean.FALSE;
        if (this.f30428o) {
            v();
        }
        this.f30428o = true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Ya.f.cs_fragment_home_finance, viewGroup, false);
        int i7 = e.adViewTop;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = e.adviewBottom;
            BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
            if (bannerAdView != null) {
                ReboundScrollView reboundScrollView = (ReboundScrollView) viewInflate;
                i7 = e.otherLoansStub;
                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub != null) {
                    i7 = e.viewContainer;
                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.viewKingKongContentInfo;
                        KingKongContentInfoView kingKongContentInfoView = (KingKongContentInfoView) p059e1.a.m(i7, viewInflate);
                        if (kingKongContentInfoView != null) {
                            i7 = e.viewLoanHomeBottomInfo;
                            LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) p059e1.a.m(i7, viewInflate);
                            if (loanHomeBottomInfoView != null) {
                                i7 = e.viewNotifyInfo;
                                NotifyInfoView notifyInfoView = (NotifyInfoView) p059e1.a.m(i7, viewInflate);
                                if (notifyInfoView != null) {
                                    i7 = e.viewProductContentList;
                                    ProductContentListView productContentListView = (ProductContentListView) p059e1.a.m(i7, viewInflate);
                                    if (productContentListView != null) {
                                        i7 = e.viewTotalOutstanding;
                                        TotalOutstandingView totalOutstandingView = (TotalOutstandingView) p059e1.a.m(i7, viewInflate);
                                        if (totalOutstandingView != null) {
                                            g gVar = new g(reboundScrollView, singleAdView, bannerAdView, viewStub, kingKongContentInfoView, loanHomeBottomInfoView, notifyInfoView, productContentListView, totalOutstandingView);
                                            Intrinsics.checkNotNullExpressionValue(gVar, "inflate(...)");
                                            return gVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.transsnet.palmpay.credit.view.ProductContentListView] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.transsnet.palmpay.credit.view.ProductContentListView] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
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
    public final void u(LoanHomeDataInfo loanHomeDataInfo) {
        ?? arrayList;
        ?? arrayList2;
        p pVar;
        View viewInflate;
        if (loanHomeDataInfo != null) {
            loanHomeDataInfo.normalizeHirePurchaseAboutRepayment();
        }
        if (loanHomeDataInfo != null) {
            g gVar = (g) this.f27335j;
            org.chromium.support_lib_boundary.util.b.c(gVar != null ? gVar.f37145b : null);
            g gVar2 = (g) this.f27335j;
            if (gVar2 != null) {
                gVar2.f37145b.setSlotId(loanHomeDataInfo.topAdvertisementId);
            }
            g gVar3 = (g) this.f27335j;
            if (gVar3 != null) {
                gVar3.f37152j.k(loanHomeDataInfo.outstandingContentInfo);
            }
            List<ProductContentInfo> list = loanHomeDataInfo.productContentInfo;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.c(((ProductContentInfo) obj).isOtherLoan, Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = z.f38935a;
            }
            List<ProductContentInfo> list2 = loanHomeDataInfo.productContentInfo;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.c(((ProductContentInfo) obj2).isOtherLoan, Boolean.TRUE)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = z.f38935a;
            }
            g gVar4 = (g) this.f27335j;
            if (gVar4 != null) {
                gVar4.f37151i.f(arrayList);
            }
            if (!((Collection) arrayList2).isEmpty()) {
                if (this.f30429p == null) {
                    g gVar5 = (g) this.f27335j;
                    if (gVar5 != null && (viewInflate = gVar5.f37147d.inflate()) != null) {
                        int i7 = e.tvOtherLoan;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = e.viewOtherProductContentList;
                            ProductContentListView productContentListView = (ProductContentListView) p059e1.a.m(i7, viewInflate);
                            if (productContentListView != null) {
                                this.f30429p = new p((LinearLayout) viewInflate, textView, productContentListView, 18);
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                    }
                    p pVar2 = this.f30429p;
                    if (pVar2 != null) {
                        ((ProductContentListView) pVar2.f813d).setOnApplyClickListener(this);
                    }
                }
                if (arrayList.isEmpty()) {
                    p pVar3 = this.f30429p;
                    if (pVar3 != null) {
                        h.c((TextView) pVar3.f812c);
                    }
                } else if (!TextUtils.isEmpty(((ProductContentInfo) arrayList2.get(0)).groupTitle) && (pVar = this.f30429p) != null) {
                    ((TextView) pVar.f812c).setText(((ProductContentInfo) arrayList2.get(0)).groupTitle);
                }
                p pVar4 = this.f30429p;
                if (pVar4 != null) {
                    ((ProductContentListView) pVar4.f813d).f(arrayList2);
                }
            }
            g gVar6 = (g) this.f27335j;
            if (gVar6 != null) {
                gVar6.f37148e.e(p186mb.d.f39634e.getInstance().f39638c);
            }
            g gVar7 = (g) this.f27335j;
            if (gVar7 != null) {
                LoanHomeBottomInfoView loanHomeBottomInfoView = gVar7.f37149f;
                LoanHomeBottomInfo loanHomeBottomInfo = p186mb.d.f39634e.getInstance().f39636a;
                int i10 = LoanHomeBottomInfoView.f30793c;
                loanHomeBottomInfoView.e(loanHomeBottomInfo, null, null);
            }
            g gVar8 = (g) this.f27335j;
            org.chromium.support_lib_boundary.util.b.c(gVar8 != null ? gVar8.f37146c : null);
            g gVar9 = (g) this.f27335j;
            if (gVar9 != null) {
                gVar9.f37146c.setSlotId(loanHomeDataInfo.bottomAdvertisementId);
            }
            g gVar10 = (g) this.f27335j;
            if (gVar10 != null) {
                gVar10.f37150g.a(loanHomeDataInfo.notifyInfo);
                Unit unit = Unit.f38893a;
            }
        }
    }

    public final void v() {
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        if (ocHomeFinanceViewModel != null) {
            List scenes = C1849p.c("MAIN_LOAN_ACTIVITY_CONFIG");
            Intrinsics.checkNotNullParameter(scenes, "scenes");
            f.s(ocHomeFinanceViewModel, new Jb.q(scenes, null), ocHomeFinanceViewModel.f30911L, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
