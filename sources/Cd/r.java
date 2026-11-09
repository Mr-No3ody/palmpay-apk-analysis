package Cd;

import Pa.r0;
import android.text.TextUtils;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements PpAmountEditText.OnTextInputListener, AddFromContactsDialog.OnAddFromContactsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferPaymentToBankFragment f1384a;

    public /* synthetic */ r(ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment) {
        this.f1384a = scheduleTransferPaymentToBankFragment;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        ScheduleTransferPaymentToBankFragment.a aVar = ScheduleTransferPaymentToBankFragment.f33711H;
        this.f1384a.w();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog.OnAddFromContactsListener
    public void onSelected(AddFromContactListResp addFromContactListResp) {
        SearchRecipientAccountToBankView searchRecipientAccountToBankView;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView2;
        String recipientAccountNumber;
        String recipientBankCode;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView3;
        ScheduleTransferPaymentToBankFragment scheduleTransferPaymentToBankFragment = this.f1384a;
        scheduleTransferPaymentToBankFragment.f33714C = false;
        if (addFromContactListResp != null && (recipientBankCode = addFromContactListResp.getRecipientBankCode()) != null) {
            if (TextUtils.isEmpty(recipientBankCode)) {
                recipientBankCode = null;
            }
            if (recipientBankCode != null) {
                BankInfo bankInfo = new BankInfo();
                bankInfo.bankCode = addFromContactListResp.getRecipientBankCode();
                bankInfo.bankName = addFromContactListResp.getRecipientBankName();
                bankInfo.bankUrl = addFromContactListResp.getRecipientHeadImage();
                Integer accountType = addFromContactListResp.getAccountType();
                bankInfo.accountType = accountType != null ? accountType.intValue() : 2;
                scheduleTransferPaymentToBankFragment.f33712A = bankInfo;
                p223od.o oVar = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
                if (oVar != null && (searchRecipientAccountToBankView3 = oVar.f40442f) != null) {
                    searchRecipientAccountToBankView3.c(bankInfo);
                }
            }
        }
        p223od.o oVar2 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
        if (oVar2 != null && (searchRecipientAccountToBankView2 = oVar2.f40442f) != null) {
            searchRecipientAccountToBankView2.setAccount((addFromContactListResp == null || (recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber()) == null) ? null : r0.w(recipientAccountNumber));
        }
        p223od.o oVar3 = (p223od.o) scheduleTransferPaymentToBankFragment.f27335j;
        if (oVar3 != null && (searchRecipientAccountToBankView = oVar3.f40442f) != null) {
            searchRecipientAccountToBankView.d(addFromContactListResp != null ? addFromContactListResp.getRecipientName() : null, null);
        }
        scheduleTransferPaymentToBankFragment.f33715o = addFromContactListResp != null ? addFromContactListResp.getRecipientName() : null;
        scheduleTransferPaymentToBankFragment.f33716p = addFromContactListResp != null ? addFromContactListResp.getRecipientMemberId() : null;
        scheduleTransferPaymentToBankFragment.w();
    }
}
