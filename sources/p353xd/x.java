package p353xd;

import N8.q0;
import Pa.r0;
import com.transsnet.palmpay.send_money.bean.resp.BankAccountMemberInfoResp;
import com.transsnet.palmpay.send_money.bean.resp.CreateTransferOrderBeforeResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.CyberSecurityLevyDialog;
import kotlin.Pair;
import p002a.a;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements CyberSecurityLevyDialog.OnButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreateTransferOrderBeforeResp f43908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43910c;

    public x(CreateTransferOrderBeforeResp createTransferOrderBeforeResp, TransferToBankInputAmountActivity transferToBankInputAmountActivity, String str) {
        this.f43908a = createTransferOrderBeforeResp;
        this.f43909b = transferToBankInputAmountActivity;
        this.f43910c = str;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.CyberSecurityLevyDialog.OnButtonClickListener
    public final void onCancel() {
        TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
        this.f43909b.p(this.f43910c);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.CyberSecurityLevyDialog.OnButtonClickListener
    public final void onConfirm() {
        CreateTransferOrderBeforeResp createTransferOrderBeforeResp = this.f43908a;
        if (createTransferOrderBeforeResp.getBankAccountMemberInfo() == null) {
            q0.u("/send/money");
            return;
        }
        BankAccountMemberInfoResp bankAccountMemberInfo = createTransferOrderBeforeResp.getBankAccountMemberInfo();
        String str = bankAccountMemberInfo != null ? bankAccountMemberInfo.phone : null;
        Pair pair = new Pair("core_order_source_type", this.f43909b.f33530j);
        BankAccountMemberInfoResp bankAccountMemberInfo2 = createTransferOrderBeforeResp.getBankAccountMemberInfo();
        r0.O0("03", 2, str, a.e(pair, new Pair("MEMBER_ID", bankAccountMemberInfo2 != null ? bankAccountMemberInfo2.memberId : null)));
    }
}
