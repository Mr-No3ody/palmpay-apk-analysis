package Gd;

import Bc.E;
import Kd.L0;
import android.text.Editable;
import android.text.TextWatcher;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.viewmodel.TransferAddBankAccountViewModel;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAccountView f3369b;

    public /* synthetic */ r(TransferToBankAccountView transferToBankAccountView, int i7) {
        this.f3368a = i7;
        this.f3369b = transferToBankAccountView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f3368a) {
            case 0:
                int i7 = TransferToBankAccountView.f33899A;
                TransferToBankAccountView transferToBankAccountView = this.f3369b;
                transferToBankAccountView.u();
                String bankAccount = transferToBankAccountView.getBankAccount();
                transferToBankAccountView.t(bankAccount);
                L0 l5 = transferToBankAccountView.f33903f;
                if (l5 == null) {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
                l5.f5075d = bankAccount;
                if (bankAccount.length() >= 10) {
                    E e10 = transferToBankAccountView.f33900c;
                    if (e10 != null) {
                        ((ModelErrorDivider) e10.f633M).setErrorMessage("");
                    }
                    transferToBankAccountView.i(false);
                    return;
                }
                if (bankAccount.length() == 0) {
                    transferToBankAccountView.o();
                    L0 l6 = transferToBankAccountView.f33903f;
                    if (l6 != null) {
                        l6.f5075d = "";
                        return;
                    } else {
                        Intrinsics.n("sharedViewModel");
                        throw null;
                    }
                }
                transferToBankAccountView.o();
                if (transferToBankAccountView.f33908p.isEmpty()) {
                    TransferAddBankAccountViewModel transferAddBankAccountViewModel = transferToBankAccountView.f33902e;
                    if (transferAddBankAccountViewModel != null) {
                        transferAddBankAccountViewModel.d();
                        return;
                    } else {
                        Intrinsics.n("requestViewModel");
                        throw null;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f3368a) {
            case 0:
                F6.d.h("TransferToBankAccountView", 3, String.valueOf(charSequence));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        E e10;
        CustomAutoCompleteTextView customAutoCompleteTextView;
        E e11;
        CustomAutoCompleteTextView customAutoCompleteTextView2;
        switch (this.f3368a) {
            case 0:
                if (BaseApplication.isNG() && charSequence != null && charSequence.length() > 0 && (e10 = this.f3369b.f33900c) != null && (customAutoCompleteTextView = (CustomAutoCompleteTextView) e10.f648w) != null) {
                    CommonViewExtKt.dealInputAccountWithSpace$default(customAutoCompleteTextView, charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    break;
                }
                break;
            default:
                if (BaseApplication.isNG() && charSequence != null && charSequence.length() > 0 && (e11 = this.f3369b.f33900c) != null && (customAutoCompleteTextView2 = (CustomAutoCompleteTextView) e11.f648w) != null) {
                    CommonViewExtKt.dealInputAccountWithSpace$default(customAutoCompleteTextView2, charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
                    break;
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
