package Ia;

import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountSelectBankFragment;
import com.transsnet.palmpay.core.viewmodel.ModelBankInfoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements SelectBankDialogV2.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddBankAccountSelectBankFragment f4297a;

    public c(AddBankAccountSelectBankFragment addBankAccountSelectBankFragment) {
        this.f4297a = addBankAccountSelectBankFragment;
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onChooseBankClick(BankInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4297a;
        addBankAccountSelectBankFragment.onChooseBankClick(data);
        SelectBankDialogV2 selectBankDialogV2 = addBankAccountSelectBankFragment.f27901Z;
        if (selectBankDialogV2 != null) {
            selectBankDialogV2.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onClickPayMethod(PaymentMethod data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AddBankAccountSelectBankFragment addBankAccountSelectBankFragment = this.f4297a;
        ModelBankInfoItem modelBankInfoItem = addBankAccountSelectBankFragment.t;
        if (modelBankInfoItem != null) {
            modelBankInfoItem.e(true);
        }
        new BankInfo();
        BankInfo bankInfo = addBankAccountSelectBankFragment.f27880o;
        if (bankInfo != null) {
            bankInfo.bankName = data.bankName;
        }
        if (bankInfo != null) {
            bankInfo.bankUrl = data.bankUrl;
        }
        if (bankInfo != null) {
            bankInfo.bankCode = data.bankCode;
        }
        addBankAccountSelectBankFragment.onChooseBankClick(bankInfo);
        SelectBankDialogV2 selectBankDialogV2 = addBankAccountSelectBankFragment.f27901Z;
        if (selectBankDialogV2 != null) {
            selectBankDialogV2.dismiss();
        }
    }
}
