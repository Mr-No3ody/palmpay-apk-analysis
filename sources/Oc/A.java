package Oc;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.transsnet.palmpay.airtime.ui.EditNameDialog;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6737b;

    public /* synthetic */ A(Object obj, int i7) {
        this.f6736a = i7;
        this.f6737b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Object obj = this.f6737b;
        switch (this.f6736a) {
            case 0:
                WhyTurnOffSaveDialogFragment.a aVar = WhyTurnOffSaveDialogFragment.f32329Z;
                if (i7 != 6) {
                    return false;
                }
                KeyboardUtils.hideSoftInput((EditText) obj);
                return true;
            case 1:
                int i10 = BillPaymentElectricityHomeFragment.f34255z0;
                if (i7 != 6) {
                    return false;
                }
                ((BillPaymentElectricityHomeFragment) obj).y();
                return true;
            case 2:
                int i11 = BillPaymentTvHomeFragment.f34295v0;
                if (i7 != 6) {
                    return false;
                }
                ((BillPaymentTvHomeFragment) obj).y();
                return true;
            case 3:
                return EditNameDialog.initViews$lambda$1((EditNameDialog) obj, textView, i7, keyEvent);
            case 4:
                int i12 = PayShopInputAmountActivity.f33176p;
                if (i7 != 6) {
                    return false;
                }
                PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) obj;
                p223od.a aVar2 = (p223od.a) payShopInputAmountActivity.f27334c;
                if (aVar2 == null || (textView2 = aVar2.f40278A) == null || !textView2.isEnabled()) {
                    return false;
                }
                if (payShopInputAmountActivity.o()) {
                    payShopInputAmountActivity.q();
                }
                return true;
            case 5:
                int i13 = TransferToBaseActivity.f33258Q;
                if (i7 != 6) {
                    return false;
                }
                TransferToBaseActivity transferToBaseActivity = (TransferToBaseActivity) obj;
                TextView textView5 = transferToBaseActivity.q().f28127a;
                if (!(textView5 != null ? textView5.isEnabled() : false)) {
                    return false;
                }
                transferToBaseActivity.w();
                return true;
            case 6:
                int i14 = WithdrawInputAmountActivity.f33293p;
                if (i7 != 6) {
                    return false;
                }
                WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) obj;
                p223od.a aVar3 = (p223od.a) withdrawInputAmountActivity.f27334c;
                if (aVar3 == null || (textView3 = aVar3.f40278A) == null || !textView3.isEnabled()) {
                    return false;
                }
                if (withdrawInputAmountActivity.o()) {
                    withdrawInputAmountActivity.q();
                }
                return true;
            case 7:
                KProperty[] kPropertyArr = InputAmountActivity.f28671Z;
                if (i7 != 6) {
                    return false;
                }
                InputAmountActivity inputAmountActivity = (InputAmountActivity) obj;
                TextView textView6 = inputAmountActivity.o().f28127a;
                if (!(textView6 != null ? textView6.isEnabled() : false)) {
                    return false;
                }
                inputAmountActivity.r();
                return true;
            case 8:
                TransferToBankInputAmountActivity.a aVar4 = TransferToBankInputAmountActivity.f33522C;
                if (i7 != 6) {
                    return false;
                }
                TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) obj;
                p223od.i iVar = (p223od.i) transferToBankInputAmountActivity.f27334c;
                if (iVar == null || (textView4 = iVar.f40368L) == null || !textView4.isEnabled()) {
                    return false;
                }
                transferToBankInputAmountActivity.s();
                return true;
            default:
                int i15 = TransferToPalmPayInputAmountActivity.f33602Y;
                if (i7 != 6) {
                    return false;
                }
                TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
                p223od.j jVar = (p223od.j) transferToPalmPayInputAmountActivity.f27334c;
                if (jVar == null || !jVar.f40388H.isEnabled()) {
                    return false;
                }
                if (transferToPalmPayInputAmountActivity.f33619v != null) {
                    transferToPalmPayInputAmountActivity.s();
                }
                return true;
        }
    }
}
