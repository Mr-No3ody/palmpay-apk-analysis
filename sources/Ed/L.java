package Ed;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements FasterSendToPalmPayAccountDialog.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFavoriteFragment f2327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientListResp.RecipientBean f2328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountMemberInfoResp f2329c;

    public L(TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment, RecipientListResp.RecipientBean recipientBean, BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.f2327a = transferToBankHomeFavoriteFragment;
        this.f2328b = recipientBean;
        this.f2329c = bankAccountMemberInfoResp;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onLeftClick() {
        this.f2327a.u(this.f2328b);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onRightClick() {
        ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", this.f2329c.memberId).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_4").navigation();
    }
}
