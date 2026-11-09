package Ae;

import B6.C0081c;
import B6.RunnableC0085g;
import C6.v;
import Pa.i0;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.api.Service;
import com.google.mlkit.vision.face.FaceDetection;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.core.bean.req.QueryCouponByConditionReq;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountNgFragment;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountOtpFragment;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfo;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfoV2;
import com.transsnet.palmpay.credit.view.KingKongContentInfoView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarOnboardingFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.viewmodel.KkCarHostViewModel;
import com.transsnet.palmpay.ui.dialog.OtpVerifyDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneCouponRewardsDialog;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.MessageListFragment;
import com.transsnet.palmpay.ui.fragment.PalmZoneTaskRewardsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p173ld.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f283a = i7;
        this.f284b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Object obj = this.f284b;
        switch (this.f283a) {
            case 0:
                return OtpVerifyDialog.mAdapter_delegate$lambda$0((OtpVerifyDialog) obj);
            case 1:
                return FaceDetection.getClient(((C0081c) obj).f464a);
            case 2:
                return PalmZoneCouponRewardsDialog.ivClose_delegate$lambda$0((PalmZoneCouponRewardsDialog) obj);
            case 3:
                return FaceDetection.getClient(((v) obj).f1225M);
            case 4:
                int i7 = HomeFinanceFragment.f35071H;
                View view = ((HomeFinanceFragment) obj).f27318b;
                if (view != null) {
                    return (SwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                }
                return null;
            case 5:
                View view2 = ((HomeFragment) obj).f27318b;
                if (view2 != null) {
                    return view2.findViewById(Ac.e.navbarBg);
                }
                return null;
            case 6:
                View view3 = ((MessageListFragment) obj).f27318b;
                if (view3 != null) {
                    return (SwipeRecyclerView) view3.findViewById(Ac.e.messageList);
                }
                return null;
            case 7:
                PalmZoneTaskRewardsFragment.a aVar = PalmZoneTaskRewardsFragment.f35232v;
                View view4 = ((PalmZoneTaskRewardsFragment) obj).f27318b;
                if (view4 != null) {
                    return (SwipeRecyclerView) view4.findViewById(Ac.e.rewardsList);
                }
                return null;
            case 8:
                return FaceDetection.getClient(((D6.e) obj).f1607B);
            case 9:
                return FaceDetection.getClient(((D6.m) obj).f1673L);
            case 10:
                int i10 = AddMoneyHomeActivity.f26973o;
                Intent intent = ((AddMoneyHomeActivity) obj).getIntent();
                if (intent != null) {
                    return intent.getStringExtra("scene");
                }
                return null;
            case 11:
                int i11 = KkCarOnboardingFragment.t;
                E eRequireActivity = ((KkCarOnboardingFragment) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                return (KkCarHostViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(KkCarHostViewModel.class);
            case 12:
                top.zibin.luban.io.a aVar2 = (top.zibin.luban.io.a) obj;
                aVar2.getClass();
                if (top.zibin.luban.io.a.l() && (str = (String) aVar2.f42646c) != null) {
                    ((Handler) aVar2.f42647d).postDelayed(new RunnableC0085g(11, aVar2, str), 3000L);
                }
                return Unit.f38893a;
            case 13:
                TransferToBankAddBankAccountFragment.a aVar3 = TransferToBankAddBankAccountFragment.f33758M;
                return new w(((TransferToBankAddBankAccountFragment) obj).m());
            case 14:
                int i12 = KingKongContentInfoView.f30791b;
                return (RecyclerView) ((KingKongContentInfoView) obj).findViewById(Ya.e.rvInfoList);
            case 15:
                LoanOutstandingSummaryView loanOutstandingSummaryView = (LoanOutstandingSummaryView) obj;
                OutstandingContentInfoV2 outstandingContentInfoV2 = loanOutstandingSummaryView.f30799c;
                if (outstandingContentInfoV2 != null) {
                    loanOutstandingSummaryView.g(outstandingContentInfoV2);
                }
                return Unit.f38893a;
            case 16:
                ProductContentListView.a aVar4 = ProductContentListView.f30875c;
                return (RecyclerView) ((ProductContentListView) obj).findViewById(Ya.e.rvProductList);
            case 17:
                TotalOutstandingView totalOutstandingView = (TotalOutstandingView) obj;
                OutstandingContentInfo outstandingContentInfo = totalOutstandingView.f30886c;
                if (outstandingContentInfo != null) {
                    totalOutstandingView.k(outstandingContentInfo);
                }
                return Unit.f38893a;
            case 18:
                int i13 = BankCustomerServiceView.f33829c;
                return (TextView) ((BankCustomerServiceView) obj).findViewById(p159kd.e.tv_customer_service_tips);
            case 19:
                int i14 = SearchRecipientAccountToBankView.f33834f;
                return new w(i0.V((SearchRecipientAccountToBankView) obj));
            case 20:
                int i15 = TransferToBankAccountView.f33899A;
                return new w(i0.V((TransferToBankAccountView) obj));
            case 21:
                AddBankAccountNgFragment.a aVar5 = AddBankAccountNgFragment.f27884C;
                View view5 = ((AddBankAccountNgFragment) obj).f27318b;
                if (view5 != null) {
                    return (TextView) view5.findViewById(L9.a.tvNext);
                }
                return null;
            case 22:
                AddBankAccountOtpFragment.a aVar6 = AddBankAccountOtpFragment.f27887H;
                View view6 = ((AddBankAccountOtpFragment) obj).f27318b;
                if (view6 != null) {
                    return (TextView) view6.findViewById(L9.a.tvNext);
                }
                return null;
            case 23:
                return new n((Je.j) obj, 23);
            case 24:
                return ((AccountApiService) p324va.c.f43141a.f14623d).checkCardBindNum((CheckCardBindNumReq) obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((PayApiService) p324va.c.f43141a.f14621b).bindBankCard((BindBankCardReq) obj);
            case 26:
                return ((AccountApiService) p324va.c.f43141a.f14623d).checkInputBankInfo((CheckBankCardInfoReq) obj);
            case 27:
                return ((PayApiService) p324va.c.f43141a.f14621b).queryUserCouponListByCondition((QueryCouponByConditionReq) obj);
            case 28:
                return ((PayApiService) p324va.c.f43141a.f14621b).queryLimitAmountV2((QueryLimitAmountV2Req) obj);
            default:
                return ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethodV3((PaymentMethodReq) obj);
        }
    }
}
