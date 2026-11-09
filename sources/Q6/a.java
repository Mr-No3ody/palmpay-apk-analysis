package Q6;

import C0.G;
import android.text.InputFilter;
import android.text.Spanned;
import androidx.appcompat.widget.AppCompatEditText;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.utils.CvUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatEditText f7628b;

    public /* synthetic */ a(AppCompatEditText appCompatEditText, int i7) {
        this.f7627a = i7;
        this.f7628b = appCompatEditText;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        switch (this.f7627a) {
            case 0:
                String string = spanned.toString();
                AmountEditText amountEditText = (AmountEditText) this.f7628b;
                String strS = d.s(amountEditText.getContext());
                if (charSequence.equals(strS) && string.length() == 0) {
                    return "0".concat(strS);
                }
                if (!string.contains(strS) || i12 - string.indexOf(strS) < amountEditText.f24353a + 1) {
                    return null;
                }
                return "";
            case 1:
                String string2 = spanned.toString();
                com.transsnet.palmpay.custom_view.AmountEditText amountEditText2 = (com.transsnet.palmpay.custom_view.AmountEditText) this.f7628b;
                String decimalPoint = CvUtils.getDecimalPoint(amountEditText2.getContext());
                if (charSequence.equals(decimalPoint) && string2.length() == 0) {
                    return G.o("0", decimalPoint);
                }
                if (!string2.contains(decimalPoint) || i12 - string2.indexOf(decimalPoint) < amountEditText2.f30940a + 1) {
                    return null;
                }
                return "";
            default:
                String string3 = spanned.toString();
                StateAmountEditText stateAmountEditText = (StateAmountEditText) this.f7628b;
                String decimalPoint2 = CvUtils.getDecimalPoint(stateAmountEditText.getContext());
                if (charSequence.equals(decimalPoint2) && string3.length() == 0) {
                    return G.o("0", decimalPoint2);
                }
                if (!string3.contains(decimalPoint2) || i12 - string3.indexOf(decimalPoint2) < stateAmountEditText.f31126o + 1) {
                    return null;
                }
                return "";
        }
    }
}
