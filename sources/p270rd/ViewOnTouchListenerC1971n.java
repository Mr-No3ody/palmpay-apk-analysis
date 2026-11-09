package p270rd;

import android.view.MotionEvent;
import android.view.View;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p223od.a;
import p223od.i;
import p223od.j;

/* JADX INFO: renamed from: rd.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnTouchListenerC1971n implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditText f41761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmVBActivity f41762c;

    public /* synthetic */ ViewOnTouchListenerC1971n(BaseMvvmVBActivity baseMvvmVBActivity, AmountEditText amountEditText, int i7) {
        this.f41760a = i7;
        this.f41762c = baseMvvmVBActivity;
        this.f41761b = amountEditText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        DigitalKeyboardView digitalKeyboardView;
        DigitalKeyboardView digitalKeyboardView2;
        DigitalKeyboardView digitalKeyboardView3;
        DigitalKeyboardView digitalKeyboardView4;
        AmountEditText amountEditText = this.f41761b;
        BaseMvvmVBActivity baseMvvmVBActivity = this.f41762c;
        switch (this.f41760a) {
            case 0:
                int i7 = PayShopInputAmountActivity.f33176p;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) baseMvvmVBActivity;
                    payShopInputAmountActivity.getClass();
                    a aVar = (a) payShopInputAmountActivity.f27334c;
                    KeyboardUtils.hideSoftInput(aVar != null ? aVar.f40289e : null);
                    if (amountEditText != null) {
                        amountEditText.requestFocus();
                    }
                    a aVar2 = (a) payShopInputAmountActivity.f27334c;
                    if (aVar2 != null && (digitalKeyboardView = aVar2.f40295p) != null) {
                        h.s(digitalKeyboardView, true);
                    }
                }
                break;
            case 1:
                int i10 = WithdrawInputAmountActivity.f33293p;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) baseMvvmVBActivity;
                    withdrawInputAmountActivity.getClass();
                    a aVar3 = (a) withdrawInputAmountActivity.f27334c;
                    KeyboardUtils.hideSoftInput(aVar3 != null ? aVar3.f40289e : null);
                    if (amountEditText != null) {
                        amountEditText.requestFocus();
                    }
                    a aVar4 = (a) withdrawInputAmountActivity.f27334c;
                    if (aVar4 != null && (digitalKeyboardView2 = aVar4.f40295p) != null) {
                        h.s(digitalKeyboardView2, true);
                    }
                }
                break;
            case 2:
                TransferToBankInputAmountActivity.a aVar5 = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) baseMvvmVBActivity;
                    transferToBankInputAmountActivity.getClass();
                    i iVar = (i) transferToBankInputAmountActivity.f27334c;
                    KeyboardUtils.hideSoftInput(iVar != null ? iVar.f40373b : null);
                    amountEditText.requestFocus();
                    i iVar2 = (i) transferToBankInputAmountActivity.f27334c;
                    if (iVar2 != null && (digitalKeyboardView3 = iVar2.f40380j) != null) {
                        h.s(digitalKeyboardView3, true);
                    }
                }
                break;
            default:
                int i11 = TransferToPalmPayInputAmountActivity.f33602Y;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) baseMvvmVBActivity;
                    transferToPalmPayInputAmountActivity.getClass();
                    KeyboardUtils.hideSoftInput(transferToPalmPayInputAmountActivity.f33606H);
                    amountEditText.requestFocus();
                    j jVar = (j) transferToPalmPayInputAmountActivity.f27334c;
                    if (jVar != null && (digitalKeyboardView4 = jVar.f40403p) != null) {
                        h.s(digitalKeyboardView4, true);
                    }
                }
                break;
        }
        return false;
    }
}
