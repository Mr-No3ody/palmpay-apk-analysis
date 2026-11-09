package B8;

import android.text.InputFilter;
import android.text.Spanned;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PInputAmountView;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import java.util.regex.Pattern;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f564a;

    public /* synthetic */ b(int i7) {
        this.f564a = i7;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f564a) {
            case 0:
                int i13 = InputView.f25702B;
                if (Pattern.matches("[\\+|\\||\\d| ]*", charSequence)) {
                    return null;
                }
                return "";
            case 1:
                int i14 = InputView.f25702B;
                if (Pattern.matches("\\d*", charSequence)) {
                    return null;
                }
                return "";
            case 2:
                int i15 = P2PInputAmountView.t;
                if (Pattern.matches("^[\\d,]*$", charSequence)) {
                    return null;
                }
                return "";
            case 3:
                if (StringsKt.A(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, false)) {
                    return y.k(charSequence.toString(), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "");
                }
                return null;
            case 4:
                int i16 = PayShopInputAmountActivity.f33176p;
                while (i7 < i10) {
                    int type = Character.getType(charSequence.charAt(i7));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i7++;
                }
                return null;
            case 5:
                int i17 = WithdrawInputAmountActivity.f33293p;
                while (i7 < i10) {
                    int type2 = Character.getType(charSequence.charAt(i7));
                    if (type2 == 19 || type2 == 28) {
                        return "";
                    }
                    i7++;
                }
                return null;
            case 6:
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                while (i7 < i10) {
                    int type3 = Character.getType(charSequence.charAt(i7));
                    if (type3 == 19 || type3 == 28) {
                        return "";
                    }
                    i7++;
                }
                return null;
            default:
                int i18 = TransferToPalmPayInputAmountActivity.f33602Y;
                while (i7 < i10) {
                    int type4 = Character.getType(charSequence.charAt(i7));
                    if (type4 == 19 || type4 == 28) {
                        return "";
                    }
                    i7++;
                }
                return null;
        }
    }
}
