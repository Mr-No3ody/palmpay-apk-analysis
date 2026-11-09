package p325vb;

import Bc.f;
import D6.n;
import Kd.S1;
import Ya.e;
import android.view.View;
import androidx.activity.H;
import androidx.camera.video.internal.c;
import androidx.fragment.app.E;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeLoanTabFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithdrawListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OpenAccountBaseFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p236pc.d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43147b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f43146a = i7;
        this.f43147b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BettingBillerListItemBean bettingBillerListItemBean;
        BettingBillerListItemBean bettingBillerListItemBean2;
        String billerName = null;
        Object obj = this.f43147b;
        switch (this.f43146a) {
            case 0:
                TransferByLoanActivity.a aVar = TransferByLoanActivity.f29927e;
                return (TransferByLoanViewModel) new c((TransferByLoanActivity) obj).h(TransferByLoanViewModel.class);
            case 1:
                ModelBettingRootView modelBettingRootView = (ModelBettingRootView) obj;
                H h7 = modelBettingRootView.f26745f;
                String billerId = (h7 == null || (bettingBillerListItemBean2 = (BettingBillerListItemBean) h7.invoke()) == null) ? null : bettingBillerListItemBean2.getBillerId();
                H h10 = modelBettingRootView.f26745f;
                if (h10 != null && (bettingBillerListItemBean = (BettingBillerListItemBean) h10.invoke()) != null) {
                    billerName = bettingBillerListItemBean.getBillerName();
                }
                f fVar = modelBettingRootView.f26742c;
                if (fVar != null) {
                    ((ModelBillerTipsInfo) fVar.f701g).b(billerId, billerName);
                }
                return Unit.f38893a;
            case 2:
                int i7 = ModelBettingRootView.f26741w;
                ((a) obj).invoke();
                return Unit.f38893a;
            case 3:
                ReferEarnWithRewardsListFragment.a aVar2 = ReferEarnWithRewardsListFragment.t;
                View view = ((ReferEarnWithRewardsListFragment) obj).f27318b;
                if (view != null) {
                    return (SwipeRecyclerView) view.findViewById(d.jp_recycle_view);
                }
                return null;
            case 4:
                ReferEarnWithdrawListFragment.a aVar3 = ReferEarnWithdrawListFragment.f31960w;
                View view2 = ((ReferEarnWithdrawListFragment) obj).f27318b;
                if (view2 != null) {
                    return (SwipeRecyclerView) view2.findViewById(d.jp_recycle_view);
                }
                return null;
            case 5:
                int i10 = SelfieCaptureActivity.f23859v;
                return new n(((SelfieCaptureActivity) obj).f23868j);
            case 6:
                int i11 = TransferToPalmPayHomeActivity.f33598d;
                return (S1) new c((TransferToPalmPayHomeActivity) obj).h(S1.class);
            case 7:
                int i12 = OcHomeLoanTabFragment.f30430v;
                E eRequireActivity = ((OcHomeLoanTabFragment) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                return (OcHomeFinanceViewModel) new c(eRequireActivity).h(OcHomeFinanceViewModel.class);
            case 8:
                OcReferEarnWithRewardsListFragment.a aVar4 = OcReferEarnWithRewardsListFragment.f30486o;
                View view3 = ((OcReferEarnWithRewardsListFragment) obj).f27318b;
                if (view3 != null) {
                    return (SwipeRecyclerView) view3.findViewById(e.swipeRecyclerView);
                }
                return null;
            case 9:
                OcReferEarnWithdrawListFragment.a aVar5 = OcReferEarnWithdrawListFragment.f30489o;
                View view4 = ((OcReferEarnWithdrawListFragment) obj).f27318b;
                if (view4 != null) {
                    return (SwipeRecyclerView) view4.findViewById(e.swipeRecyclerView);
                }
                return null;
            default:
                OpenAccountBaseFragment.z((OpenAccountBaseFragment) obj);
                return Unit.f38893a;
        }
    }
}
