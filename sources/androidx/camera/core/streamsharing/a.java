package androidx.camera.core.streamsharing;

import android.util.Rational;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14457b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f14456a = i7;
        this.f14457b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14456a) {
            case 0:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) this.f14457b;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f10 = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f10);
            default:
                String billerName = ((BettingBillerListItemBean) obj).getBillerName();
                PickBettingBillerDialog pickBettingBillerDialog = (PickBettingBillerDialog) this.f14457b;
                String firstLetter = pickBettingBillerDialog.getFirstLetter(billerName);
                if (firstLetter == null) {
                    firstLetter = "#";
                }
                if (firstLetter.equals("#")) {
                    firstLetter = "ZZZ";
                }
                String firstLetter2 = pickBettingBillerDialog.getFirstLetter(((BettingBillerListItemBean) obj2).getBillerName());
                if (firstLetter2 == null) {
                    firstLetter2 = "#";
                }
                return Bf.a.a(firstLetter, firstLetter2.equals("#") ? "ZZZ" : firstLetter2);
        }
    }
}
