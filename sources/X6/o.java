package X6;

import C9.V;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import java.util.Calendar;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bc.l f11036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f11038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f11039g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f11040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function2 f11041j;

    @Override // V6.a
    public final void c(ViewBinding viewBinding) {
        int i7 = 1;
        N6.b binding = (N6.b) viewBinding;
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.e(binding);
        Bc.l lVarB = Bc.l.b(LayoutInflater.from(getContext()));
        this.f11036d = lVarB;
        binding.f6086b.addView((TimePickerView) lVarB.f755c);
        c cVar = new c(this, 2);
        Bc.k kVar = binding.f6087c;
        TextView tvPositive = (TextView) kVar.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new n(tvPositive, cVar, 0));
        if (this.f11037e == 3) {
            Bc.l lVar = this.f11036d;
            if (lVar == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            TimePickerView timePickerView = (TimePickerView) lVar.f755c;
            timePickerView.f24500C = true;
            timePickerView.l(Boolean.FALSE);
        }
        Long l5 = this.f11040i;
        if (l5 != null) {
            long jLongValue = l5.longValue();
            Bc.l lVar2 = this.f11036d;
            if (lVar2 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            Calendar calendar = Calendar.getInstance();
            Long l6 = this.f11039g;
            if (l6 != null) {
                calendar.setTimeInMillis(l6.longValue());
            } else {
                calendar.set(1, 1790);
                calendar.set(2, 0);
                calendar.set(5, 1);
            }
            Intrinsics.e(calendar);
            W6.a.b(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            TimePickerView timePickerView2 = (TimePickerView) lVar2.f755c;
            int i10 = TimePickerView.f24497u0;
            timePickerView2.k(timeInMillis, jLongValue, null);
        }
        Long l8 = this.f11038f;
        if (l8 != null) {
            long jLongValue2 = l8.longValue();
            Bc.l lVar3 = this.f11036d;
            if (lVar3 == null) {
                Intrinsics.n("pickerBinding");
                throw null;
            }
            ((TimePickerView) lVar3.f755c).j(jLongValue2);
        }
        TextView tvNegative = (TextView) kVar.f749c;
        Intrinsics.checkNotNullExpressionValue(tvNegative, "tvNegative");
        tvNegative.setOnClickListener(new V(8, tvNegative, this));
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new n(tvPositive, cVar, i7));
    }

    @Override // V6.a
    public final ViewBinding d() {
        return N6.b.a(getLayoutInflater());
    }
}
