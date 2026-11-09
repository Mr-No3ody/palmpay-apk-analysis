package Z6;

import android.view.View;
import com.palmpay.lib.ui.picker.picker.date.DatePickerFragment;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DatePickerFragment f11527c;

    public /* synthetic */ a(View view, DatePickerFragment datePickerFragment, int i7) {
        this.f11525a = i7;
        this.f11526b = view;
        this.f11527c = datePickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DatePickerFragment datePickerFragment = this.f11527c;
        View view2 = this.f11526b;
        switch (this.f11525a) {
            case 0:
                view2.setClickable(false);
                DatePickerFragment.a aVar = DatePickerFragment.f24520o;
                datePickerFragment.getClass();
                ((N6.c) datePickerFragment.f23811b).f6092d.j(Calendar.getInstance().getTimeInMillis());
                Function0 function0 = datePickerFragment.f24527j;
                if (function0 != null) {
                    function0.invoke();
                }
                view2.postDelayed(new X6.a(view2, 9), 2000L);
                break;
            default:
                view2.setClickable(false);
                long time = ((N6.c) datePickerFragment.f23811b).f6092d.getTime();
                Function2 function2 = datePickerFragment.f24526i;
                if (function2 != null) {
                    function2.invoke(Long.valueOf(time), null);
                }
                view2.postDelayed(new X6.a(view2, 10), 2000L);
                break;
        }
    }
}
