package Ed;

import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankAddBankAccountViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements AddFromContactsDialog.OnAddFromContactsListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAddBankAccountFragment f2305a;

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = this.f2305a;
        transferToBankAddBankAccountFragment.A((BankInfo) ((p173ld.w) transferToBankAddBankAccountFragment.f33760B.getValue()).getItem(i7));
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog.OnAddFromContactsListener
    public void onSelected(AddFromContactListResp addFromContactListResp) {
        EditText editText;
        String recipientAccountNumber;
        TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = this.f2305a;
        if (addFromContactListResp != null) {
            TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
            String recipientBankCode = addFromContactListResp.getRecipientBankCode();
            if (recipientBankCode != null) {
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
                    transferToBankAddBankAccountFragment.t = bankInfo;
                    transferToBankAddBankAccountFragment.A(bankInfo);
                }
            }
        }
        Bc.j jVar = transferToBankAddBankAccountFragment.f33763L;
        if (jVar != null && (editText = (EditText) jVar.f735b) != null) {
            editText.setText((addFromContactListResp == null || (recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber()) == null) ? null : r0.w(recipientAccountNumber));
        }
        TransferToBankAddBankAccountViewModel transferToBankAddBankAccountViewModel = (TransferToBankAddBankAccountViewModel) transferToBankAddBankAccountFragment.f27333i;
        if (transferToBankAddBankAccountViewModel != null) {
            transferToBankAddBankAccountViewModel.d(addFromContactListResp != null ? addFromContactListResp.getAccountType() : null);
        }
    }
}
