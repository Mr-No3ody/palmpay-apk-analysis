package Ed;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements FasterSendToPalmPayAccountDialog.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeBeneficiariesFragment f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientListResp.RecipientBean f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountMemberInfoResp f2322c;

    public I(TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment, RecipientListResp.RecipientBean recipientBean, BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.f2320a = transferToBankHomeBeneficiariesFragment;
        this.f2321b = recipientBean;
        this.f2322c = bankAccountMemberInfoResp;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onLeftClick() {
        this.f2320a.u(this.f2321b);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onRightClick() {
        ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", this.f2322c.memberId).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_4").navigation();
    }
}
