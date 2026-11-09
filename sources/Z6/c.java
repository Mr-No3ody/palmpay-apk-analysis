package Z6;

import android.view.View;
import com.palmpay.lib.ui.picker.picker.date.RangeDatePickerFragment;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RangeDatePickerFragment f11533c;

    public /* synthetic */ c(View view, RangeDatePickerFragment rangeDatePickerFragment, int i7) {
        this.f11531a = i7;
        this.f11532b = view;
        this.f11533c = rangeDatePickerFragment;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function2 function2;
        RangeDatePickerFragment rangeDatePickerFragment = this.f11533c;
        View view2 = this.f11532b;
        switch (this.f11531a) {
            case 0:
                view2.setClickable(false);
                RangeDatePickerFragment.m(rangeDatePickerFragment);
                view2.postDelayed(new X6.a(view2, 11), 2000L);
                break;
            case 1:
                view2.setClickable(false);
                RangeDatePickerFragment.m(rangeDatePickerFragment);
                view2.postDelayed(new X6.a(view2, 12), 2000L);
                break;
            case 2:
                view2.setClickable(false);
                RangeDatePickerFragment.a aVar = RangeDatePickerFragment.f24528C;
                Function0 function0 = rangeDatePickerFragment.f24527j;
                if (function0 != null) {
                    function0.invoke();
                }
                view2.postDelayed(new X6.a(view2, 13), 2000L);
                break;
            default:
                view2.setClickable(false);
                if (rangeDatePickerFragment.f24533w != Integer.MAX_VALUE) {
                    long j6 = rangeDatePickerFragment.f24531p;
                    long j10 = rangeDatePickerFragment.t;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j6);
                    W6.a.b(calendar);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(j10);
                    W6.a.a(calendar2);
                    if ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / rangeDatePickerFragment.f24530B <= rangeDatePickerFragment.f24533w) {
                        function2 = rangeDatePickerFragment.f24526i;
                        if (function2 != null) {
                            function2.invoke(Long.valueOf(rangeDatePickerFragment.f24531p), Long.valueOf(rangeDatePickerFragment.t));
                        }
                    } else {
                        Function3 function3 = rangeDatePickerFragment.f24529A;
                        if (function3 != null) {
                            function3.invoke(Long.valueOf(rangeDatePickerFragment.f24531p), Long.valueOf(rangeDatePickerFragment.t), Integer.valueOf(rangeDatePickerFragment.f24533w));
                        }
                    }
                } else {
                    function2 = rangeDatePickerFragment.f24526i;
                    if (function2 != null) {
                        function2.invoke(Long.valueOf(rangeDatePickerFragment.f24531p), Long.valueOf(rangeDatePickerFragment.t));
                    }
                }
                view2.postDelayed(new X6.a(view2, 14), 2000L);
                break;
        }
    }
}
