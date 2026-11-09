package Z6;

import Bc.l;
import android.view.View;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import com.palmpay.lib.ui.picker.picker.date.TimePickerFragment;
import com.palmpay.lib.ui.picker.picker.model.TimePickerBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerFragment f11536c;

    public /* synthetic */ d(View view, TimePickerFragment timePickerFragment, int i7) {
        this.f11534a = i7;
        this.f11535b = view;
        this.f11536c = timePickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11534a) {
            case 0:
                View view2 = this.f11535b;
                view2.setClickable(false);
                TimePickerFragment timePickerFragment = this.f11536c;
                Long l5 = timePickerFragment.f24537e;
                if (l5 != null) {
                    long jLongValue = l5.longValue();
                    l lVar = timePickerFragment.f24539g;
                    if (lVar == null) {
                        Intrinsics.n("pickerBinding");
                        throw null;
                    }
                    HoursMinutesPickerView hoursMinutesPickerView = (HoursMinutesPickerView) lVar.f755c;
                    hoursMinutesPickerView.t.setTimeInMillis(jLongValue);
                    hoursMinutesPickerView.g();
                }
                view2.postDelayed(new X6.a(view2, 15), 2000L);
                return;
            default:
                View view3 = this.f11535b;
                view3.setClickable(false);
                TimePickerFragment timePickerFragment2 = this.f11536c;
                l lVar2 = timePickerFragment2.f24539g;
                if (lVar2 == null) {
                    Intrinsics.n("pickerBinding");
                    throw null;
                }
                e block = new e(timePickerFragment2);
                HoursMinutesPickerView hoursMinutesPickerView2 = (HoursMinutesPickerView) lVar2.f755c;
                Intrinsics.checkNotNullParameter(block, "block");
                Integer time = ((TimePickerBean) hoursMinutesPickerView2.f24484v.get(hoursMinutesPickerView2.getThreeWheelView().getCurrentItem())).getTime();
                Integer time2 = ((TimePickerBean) hoursMinutesPickerView2.f24485w.get(hoursMinutesPickerView2.getTowWheelView().getCurrentItem())).getTime();
                Integer time3 = ((TimePickerBean) hoursMinutesPickerView2.f24480A.get(hoursMinutesPickerView2.getOneWheelView().getCurrentItem())).getTime();
                Intrinsics.e(time);
                Intrinsics.e(time2);
                Intrinsics.e(time3);
                block.invoke(time, time2, time3);
                view3.postDelayed(new X6.a(view3, 16), 2000L);
                return;
        }
    }
}
