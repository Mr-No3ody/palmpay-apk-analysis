package p353xd;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import p220oa.h;
import p223od.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43905b;

    public /* synthetic */ v(Object obj, int i7) {
        this.f43904a = i7;
        this.f43905b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        IconicsImageView iconicsImageView;
        IconicsImageView iconicsImageView2;
        Editable text;
        Editable text2;
        String string = null;
        Object obj = this.f43905b;
        switch (this.f43904a) {
            case 0:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) obj;
                if (!z3) {
                    i iVar = (i) transferToBankInputAmountActivity.f27334c;
                    if (iVar != null && (iconicsImageView = iVar.f40376e) != null) {
                        h.c(iconicsImageView);
                        break;
                    }
                } else {
                    i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
                    if (iVar2 != null && (iconicsImageView2 = iVar2.f40376e) != null) {
                        EditText editText = iVar2.f40373b;
                        if (editText != null && (text = editText.getText()) != null) {
                            string = text.toString();
                        }
                        h.s(iconicsImageView2, !TextUtils.isEmpty(string));
                        break;
                    }
                }
                break;
            case 1:
                TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
                if (!z3) {
                    IconicsImageView iconicsImageView3 = transferToPalmPayInputAmountActivity.f33607L;
                    if (iconicsImageView3 != null) {
                        h.c(iconicsImageView3);
                    }
                } else {
                    IconicsImageView iconicsImageView4 = transferToPalmPayInputAmountActivity.f33607L;
                    if (iconicsImageView4 != null) {
                        EditText editText2 = transferToPalmPayInputAmountActivity.f33606H;
                        if (editText2 != null && (text2 = editText2.getText()) != null) {
                            string = text2.toString();
                        }
                        h.s(iconicsImageView4, !TextUtils.isEmpty(string));
                    }
                }
                break;
            default:
                ImageView imageView = ((SelectBankForTransferViaUssdDialog) obj).f33625M;
                if (imageView != null) {
                    imageView.setVisibility(z3 ? 8 : 0);
                }
                break;
        }
    }
}
