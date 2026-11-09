package Ed;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;

/* JADX INFO: renamed from: Ed.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0226f implements FasterSendToPalmPayAccountDialog.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountBeneficiaryFragment f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientListResp.RecipientBean f2369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountMemberInfoResp f2370c;

    public C0226f(BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment, RecipientListResp.RecipientBean recipientBean, BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.f2368a = bankAccountBeneficiaryFragment;
        this.f2369b = recipientBean;
        this.f2370c = bankAccountMemberInfoResp;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onLeftClick() {
        this.f2368a.w(this.f2369b);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onRightClick() {
        ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", this.f2370c.memberId).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
    }
}
