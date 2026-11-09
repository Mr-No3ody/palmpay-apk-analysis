package Z6;

import android.widget.TextView;
import com.palmpay.lib.ui.picker.picker.date.RangeDatePickerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11530c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f11528a = i7;
        this.f11529b = obj;
        this.f11530c = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.f11529b;
        Object obj5 = this.f11530c;
        switch (this.f11528a) {
            case 0:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                RangeDatePickerFragment.a aVar = RangeDatePickerFragment.f24528C;
                N6.c cVar = (N6.c) obj4;
                long time = cVar.f6092d.getTime();
                RangeDatePickerFragment rangeDatePickerFragment = (RangeDatePickerFragment) obj5;
                if (((TextView) cVar.f6091c.f664d).isSelected()) {
                    rangeDatePickerFragment.q(time);
                } else {
                    rangeDatePickerFragment.o(time);
                }
                break;
            case 1:
                ((p072eg.e) obj4).unlock(obj5);
                break;
            default:
                p072eg.a aVar2 = (p072eg.a) obj5;
                p072eg.e eVar = (p072eg.e) obj4;
                p072eg.e.f36303i.set(eVar, aVar2.f36296b);
                eVar.unlock(aVar2.f36296b);
                break;
        }
        return Unit.f38893a;
    }
}
