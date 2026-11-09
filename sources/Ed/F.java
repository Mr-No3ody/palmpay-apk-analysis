package Ed;

import Kd.S0;
import Pa.C0525w;
import Pa.n0;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2315a;

    public /* synthetic */ F(TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment) {
        this.f2315a = transferToBankHomeBeneficiariesFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == p159kd.e.btnSetup) {
            TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = this.f2315a;
            RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) transferToBankHomeBeneficiariesFragment.t().getItem(i7);
            if (recipientBean != null) {
                TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) transferToBankHomeBeneficiariesFragment.f27333i;
                if (transferToBankHomeViewModel != null) {
                    p140j8.f.s(transferToBankHomeViewModel, new S0(recipientBean.getRecipientId(), null), new com.transsnet.palmpay.core.base.l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                d0.g(2, "/sm/add_beneficiary", "beneficiary_type").withString("beneficiary_bean", ((Gson) C0525w.f().f7166b).toJson(recipientBean)).navigation(transferToBankHomeBeneficiariesFragment.requireContext());
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = this.f2315a;
        RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) transferToBankHomeBeneficiariesFragment.t().getItem(i7);
        if (recipientBean != null) {
            n0.g().k((ClickEvent) C0.G.f("Transfer_ToBank_ContactZone_Click", "element_name", "Recent"));
            if (recipientBean.tagType == 2) {
                TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) transferToBankHomeBeneficiariesFragment.f27333i;
                if (transferToBankHomeViewModel != null) {
                    transferToBankHomeViewModel.d(recipientBean);
                    return;
                }
                return;
            }
            TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) transferToBankHomeBeneficiariesFragment.f27333i;
            if (transferToBankHomeViewModel2 != null) {
                transferToBankHomeViewModel2.f(recipientBean);
            }
        }
    }
}
