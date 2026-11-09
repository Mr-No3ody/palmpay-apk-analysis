package Ce;

import android.view.View;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class X implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeSavingsUserV2Fragment f1458b;

    public /* synthetic */ X(HomeSavingsUserV2Fragment homeSavingsUserV2Fragment, int i7) {
        this.f1457a = i7;
        this.f1458b = homeSavingsUserV2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeSavingsUserV2Fragment homeSavingsUserV2Fragment = this.f1458b;
        switch (this.f1457a) {
            case 0:
                HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                Pa.n0.g().l("CashBox_WithdrawPop_Cancel_Click");
                Pa.i0.O(homeSavingsUserV2Fragment.getContext());
                break;
            default:
                HomeSavingsUserV2Fragment.a aVar2 = HomeSavingsUserV2Fragment.f35149F0;
                BaseDialogFragment baseDialogFragment = (BaseDialogFragment) com.horcrux.svg.d0.m("/manage_money/wealth_more_dialog", "null cannot be cast to non-null type com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment");
                androidx.fragment.app.Z childFragmentManager = homeSavingsUserV2Fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogFragment.show(childFragmentManager, "showMoreFunctionDialog");
                break;
        }
    }
}
