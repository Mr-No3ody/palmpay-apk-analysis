package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import F6.d;
import Jb.y;
import Pa.C0525w;
import Pa.F;
import Pa.r0;
import Ya.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.activity.result.ActivityResultCaller;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmVBFragment;
import com.transsnet.palmpay.credit.bean.CLPromoteData;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfoV2;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.req.CLPermissionInfo;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialogFragment;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.ReboundScrollView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p099gb.i;
import p140j8.f;
import p220oa.h;
import p355xf.o;
import p355xf.q;
import p382zb.C2182z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanProductListFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmVBFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Lgb/i;", "Lcom/transsnet/palmpay/credit/view/ProductContentListAdapter$OnApplyClickListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanProductListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanProductListFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanProductListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,501:1\n1#2:502\n774#3:503\n865#3,2:504\n*S KotlinDebug\n*F\n+ 1 LoanProductListFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanProductListFragment\n*L\n210#1:503\n210#1:504,2\n*E\n"})
public final class LoanProductListFragment extends CreditBaseMvvmVBFragment<OcHomeFinanceViewModel, i> implements ProductContentListAdapter$OnApplyClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f30354p = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f30355o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoanProductListFragment newInstance() {
            LoanProductListFragment loanProductListFragment = new LoanProductListFragment();
            loanProductListFragment.setArguments(new Bundle());
            return loanProductListFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        p118hf.a.e(this, (OcHomeFinanceViewModel) this.f27333i, new C2182z(this, 1));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        String string;
        d.h(this.f27317a, 3, "preloadDialogBg >>>");
        r0.D1(getContext(), CLIncreaseAmountDialog.URL_DIALOG_BG);
        r0.D1(getContext(), CLIncreaseAmountDialog.URL_DIALOG_BL_BG);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("home_loan_data")) == null) {
            return;
        }
        if (StringsKt.F(string)) {
            string = null;
        }
        if (string != null) {
            LoanHomeDataInfoV2 loanHomeDataInfoV2 = (LoanHomeDataInfoV2) d0.l(LoanHomeDataInfoV2.class, string);
            Fragment parentFragment = getParentFragment();
            LoanHomeFragment loanHomeFragment = parentFragment instanceof LoanHomeFragment ? (LoanHomeFragment) parentFragment : null;
            if (loanHomeFragment != null) {
                loanHomeFragment.t(loanHomeDataInfoV2);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        p118hf.a.e(this, (OcHomeFinanceViewModel) this.f27333i, new C2182z(this, 0));
        i iVar = (i) this.f27335j;
        if (iVar != null) {
            iVar.f37165e.setOnRefreshListener(new p287se.d(this, 27));
        }
        i iVar2 = (i) this.f27335j;
        if (iVar2 == null) {
            return 0;
        }
        iVar2.f37168i.setOnApplyClickListener(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener
    public final void onApplyClick(ProductContentInfo contentInfo) {
        Intrinsics.checkNotNullParameter(contentInfo, "contentInfo");
        d.h(this.f27317a, 3, G.p("loanProduct=", contentInfo.loanProduct, ", status=", contentInfo.status));
        if (!TextUtils.isEmpty(contentInfo.androidLink)) {
            F.f(contentInfo.androidLink, null, null);
            return;
        }
        if (TextUtils.equals(contentInfo.status, "canBorrow") || TextUtils.equals(contentInfo.status, "borrowed")) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            Z childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            iLoanCreditService.startBorrow(childFragmentManager, contentInfo.loanProduct, (124 & 4) != 0 ? null : contentInfo.amount, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : new JumpLinkInfo(contentInfo.jumpPath, contentInfo.jumpType, contentInfo.jumpParams, contentInfo.androidLink), null, null);
            return;
        }
        if (!TextUtils.equals(contentInfo.loanProduct, "INSTALLMENT_LOAN")) {
            if (TextUtils.equals(contentInfo.loanProduct, "OK_CARD")) {
                ARouter.getInstance().build("/credit_score/oc_protocol_activity").withString("oc_apply_enter_point", "OTHER").navigation(getContext());
                return;
            }
            ILoanCreditService iLoanCreditService2 = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            Z childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            iLoanCreditService2.startCredit(childFragmentManager2, contentInfo.loanProduct, "OTHER", contentInfo.applyId);
            return;
        }
        if (!TextUtils.equals("declined", contentInfo.status) && !TextUtils.equals("needApply", contentInfo.status)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/ol_upgrade_installment_activity");
            return;
        }
        ILoanCreditService iLoanCreditService3 = (ILoanCreditService) d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
        Z childFragmentManager3 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
        iLoanCreditService3.startCredit(childFragmentManager3, contentInfo.loanProduct, "OTHER", contentInfo.applyId);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f30355o = null;
        super.onDestroyView();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 563) {
            C0525w c0525wF = C0525w.f();
            String eventContent = event.getEventContent();
            c0525wF.getClass();
            LoanHomeDataInfoV2 loanHomeDataInfoV2 = (LoanHomeDataInfoV2) C0525w.d(eventContent, LoanHomeDataInfoV2.class);
            Fragment parentFragment = getParentFragment();
            LoanHomeFragment loanHomeFragment = parentFragment instanceof LoanHomeFragment ? (LoanHomeFragment) parentFragment : null;
            if (loanHomeFragment != null) {
                loanHomeFragment.t(loanHomeDataInfoV2);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        PushMessage.Content content;
        String str;
        Object objF;
        if (pushMessage == null || (content = pushMessage.content) == null || (str = content.messageType) == null) {
            return;
        }
        d.c("pushMessage = ".concat(str), new Object[0]);
        if (TextUtils.equals(PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS, str) || TextUtils.equals(PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED, str) || TextUtils.equals(PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS, str) || TextUtils.equals("5065", str) || TextUtils.equals("5066", str) || TextUtils.equals("5067", str) || TextUtils.equals(PushMessage.MESSAGE_TYPE_OKCARD_INCREASE, str) || TextUtils.equals("M0539", str)) {
            u();
        }
        if (TextUtils.equals(PushMessage.MESSAGE_TYPE_CASH_INCREASE, str) || TextUtils.equals(PushMessage.MESSAGE_TYPE_CASH_NO_INCREASE, str)) {
            String str2 = content.businessInfo;
            try {
                o oVar = q.f43977a;
                if (str2 == null) {
                    str2 = "";
                }
                JSONObject jSONObject = new JSONObject(str2);
                int i7 = jSONObject.getInt("calculateType");
                if (i7 == 20) {
                    if (SPUtils.get().getBoolean(BaseApplication.get().getUser().getMemberId() + "show_installment_increase_dialog")) {
                        CLIncreaseAmountDialogFragment.a aVar = CLIncreaseAmountDialogFragment.f29944C;
                        Integer numValueOf = Integer.valueOf(i7);
                        Long lValueOf = Long.valueOf(jSONObject.getLong("creditQuota"));
                        Integer numValueOf2 = Integer.valueOf(jSONObject.getInt(FirebaseAnalytics.Param.TERM));
                        Integer numValueOf3 = Integer.valueOf(jSONObject.getInt("maxLoanDays"));
                        Double dValueOf = Double.valueOf(jSONObject.getDouble("interestRatio"));
                        Long lValueOf2 = Long.valueOf(jSONObject.getLong("loanAmount"));
                        Long lValueOf3 = Long.valueOf(jSONObject.getLong("dailyInterest"));
                        Integer numValueOf4 = Integer.valueOf(jSONObject.optInt("termSpan"));
                        String strOptString = jSONObject.optString("termSpanUnit");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                        CLIncreaseAmountDialogFragment cLIncreaseAmountDialogFragmentNewInstance = aVar.newInstance(new CLPromoteData(numValueOf, lValueOf, numValueOf2, numValueOf3, dValueOf, lValueOf2, lValueOf3, numValueOf4, strOptString));
                        Z childFragmentManager = getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        cLIncreaseAmountDialogFragmentNewInstance.show(childFragmentManager, "showCLIncreaseAmountDialog");
                        objF = Unit.f38893a;
                        Throwable thA = q.a(objF);
                        if (thA != null) {
                            d.c(this.f27317a, thA);
                        }
                    }
                }
            } catch (Throwable th) {
                o oVar2 = q.f43977a;
                objF = g.f(th);
            }
        }
        if (str.equals(PushMessage.MESSAGE_TYPE_OC_INCREASE_LIMIT)) {
            h.y(this, getString(Ya.g.cs_finance_okcard_increase_task_limit));
        } else if (str.equals(PushMessage.MESSAGE_TYPE_CL_INCREASE_LIMIT)) {
            h.y(this, getString(Ya.g.cs_finance_cash_increase_task_limit));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        E activity = getActivity();
        if (activity != null && i7 == 1001) {
            ArrayList arrayList = new ArrayList();
            int length = grantResults.length;
            int i10 = 0;
            while (i10 < length) {
                CLPermissionInfo cLPermissionInfo = new CLPermissionInfo(null, 0, 3, null);
                cLPermissionInfo.setName((i10 < 0 || i10 >= permissions.length) ? "" : permissions[i10]);
                if (grantResults[i10] != 0) {
                    cLPermissionInfo.setState(AbstractC1032a.h(activity, permissions[i10]) ? 2 : 3);
                } else {
                    cLPermissionInfo.setState(1);
                }
                arrayList.add(cLPermissionInfo);
                i10++;
            }
            PermissionReq req = new PermissionReq("flexi cash", "trade", Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), arrayList);
            OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
            if (ocHomeFinanceViewModel != null) {
                Intrinsics.checkNotNullParameter(req, "req");
                f.s(ocHomeFinanceViewModel, new y(req, null), ocHomeFinanceViewModel.f30918p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
            p143jb.g.f38511o.getInstance().l();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            v();
        }
        Fragment parentFragment = getParentFragment();
        LoanHomeFragment loanHomeFragment = parentFragment instanceof LoanHomeFragment ? (LoanHomeFragment) parentFragment : null;
        if (loanHomeFragment != null) {
            loanHomeFragment.t(loanHomeFragment.f30340B);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (c.b().e(this)) {
            return;
        }
        c.b().j(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (c.b().e(this)) {
            c.b().l(this);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Ya.f.cs_fragment_loan_product_list, viewGroup, false);
        int i7 = e.adViewTop;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = e.contentRsvMain;
            ReboundScrollView reboundScrollView = (ReboundScrollView) p059e1.a.m(i7, viewInflate);
            if (reboundScrollView != null) {
                i7 = e.emptyViewStub;
                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub != null) {
                    i7 = e.srlRefresh;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                    if (swipeRefreshLayout != null) {
                        i7 = e.viewLoanHomeBottomInfo;
                        LoanHomeBottomInfoView loanHomeBottomInfoView = (LoanHomeBottomInfoView) p059e1.a.m(i7, viewInflate);
                        if (loanHomeBottomInfoView != null) {
                            i7 = e.viewOutstandingSummary;
                            LoanOutstandingSummaryView loanOutstandingSummaryView = (LoanOutstandingSummaryView) p059e1.a.m(i7, viewInflate);
                            if (loanOutstandingSummaryView != null) {
                                i7 = e.viewProductContentList;
                                ProductContentListView productContentListView = (ProductContentListView) p059e1.a.m(i7, viewInflate);
                                if (productContentListView != null) {
                                    i iVar = new i((ConstraintLayout) viewInflate, singleAdView, reboundScrollView, viewStub, swipeRefreshLayout, loanHomeBottomInfoView, loanOutstandingSummaryView, productContentListView);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "inflate(...)");
                                    return iVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u() {
        ActivityResultCaller parentFragment = getParentFragment();
        LoanHomeRefreshHost loanHomeRefreshHost = parentFragment instanceof LoanHomeRefreshHost ? (LoanHomeRefreshHost) parentFragment : null;
        if (loanHomeRefreshHost != null) {
            loanHomeRefreshHost.refreshLoanHomeData(false);
            return;
        }
        i iVar = (i) this.f27335j;
        if (iVar != null) {
            iVar.f37165e.setRefreshing(false);
        }
        showLoadingDialog(false);
    }

    public final void v() {
        View viewInflate;
        i iVar = (i) this.f27335j;
        if (iVar != null) {
            iVar.f37163c.setVisibility(8);
        }
        if (this.f30355o == null) {
            i iVar2 = (i) this.f27335j;
            if (iVar2 == null || (viewInflate = iVar2.f37164d.inflate()) == null) {
                viewInflate = null;
            } else {
                viewInflate.setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
                h.j(viewInflate, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(96.0f)));
                View viewFindViewById = viewInflate.findViewById(e.rtvRefresh);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new p327vd.c(this, 18));
                }
            }
            this.f30355o = viewInflate;
        }
        View view = this.f30355o;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
