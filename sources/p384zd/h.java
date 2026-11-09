package p384zd;

import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements PpAmountEditText.OnTextInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferViaUssdActivity f44686a;

    public h(TransferViaUssdActivity transferViaUssdActivity) {
        this.f44686a = transferViaUssdActivity;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public final void OnTextInput(String str) {
        int i7 = TransferViaUssdActivity.f33628A;
        TransferViaUssdActivity transferViaUssdActivity = this.f44686a;
        if (transferViaUssdActivity.m() == null) {
            return;
        }
        Intrinsics.e(str);
        if (StringsKt.A(str, Consts.DOT, false)) {
            transferViaUssdActivity.m().setAmount(y.k(str, Consts.DOT, ""));
            return;
        }
        transferViaUssdActivity.f33638o = str;
        if (TextUtils.isEmpty(str)) {
            transferViaUssdActivity.t = "Amount";
        }
        transferViaUssdActivity.p();
    }
}
