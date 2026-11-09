package Ed;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2319b;

    public /* synthetic */ H(TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment, int i7) {
        this.f2318a = i7;
        this.f2319b = transferToBankHomeBeneficiariesFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2318a) {
            case 0:
                Postcard postcardBuild = ARouter.getInstance().build("/sm/back_account_beneficiary");
                TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = this.f2319b;
                postcardBuild.withString("core_order_source_type", transferToBankHomeBeneficiariesFragment.f33769o).withBoolean("extra_data", false).navigation(transferToBankHomeBeneficiariesFragment.requireContext());
                break;
            default:
                ARouter.getInstance().build("/sm/transfer_via_ussd").navigation(this.f2319b.requireActivity());
                break;
        }
    }
}
