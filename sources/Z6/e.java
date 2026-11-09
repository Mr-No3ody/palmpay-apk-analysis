package Z6;

import N8.q0;
import com.palmpay.lib.ui.picker.picker.date.TimePickerFragment;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerFragment f11537a;

    public e(TimePickerFragment timePickerFragment) {
        this.f11537a = timePickerFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, iIntValue);
        calendar.set(12, iIntValue2);
        calendar.set(9, iIntValue3);
        long jC = q0.c(calendar, 13, 0, 14, 0);
        Function2 function2 = this.f11537a.f24538f;
        if (function2 != null) {
            function2.invoke(Long.valueOf(jC), null);
        }
        return Unit.f38893a;
    }
}
