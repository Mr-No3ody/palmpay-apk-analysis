package Ed;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;

/* JADX INFO: renamed from: Ed.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0232l implements FasterSendToPalmPayAccountDialog.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountFavoriteFragment f2381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipientListResp.RecipientBean f2382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountMemberInfoResp f2383c;

    public C0232l(BankAccountFavoriteFragment bankAccountFavoriteFragment, RecipientListResp.RecipientBean recipientBean, BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.f2381a = bankAccountFavoriteFragment;
        this.f2382b = recipientBean;
        this.f2383c = bankAccountMemberInfoResp;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onLeftClick() {
        this.f2381a.u(this.f2382b);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FasterSendToPalmPayAccountDialog.OnButtonClickListener
    public final void onRightClick() {
        ARouter.getInstance().build("/sm/palmpay_personal_transfer").withString("MEMBER_ID", this.f2383c.memberId).withInt("extra_type", 2).withBoolean("existRecipient", true).withString("core_order_source_type", "2BANK2PALMPAY_5").navigation();
    }
}
