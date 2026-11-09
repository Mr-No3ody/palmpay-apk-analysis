package X6;

import com.palmpay.lib.ui.picker.picker.PickerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f11012b;

    public /* synthetic */ g(k kVar, int i7) {
        this.f11011a = i7;
        this.f11012b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11011a) {
            case 0:
                k kVar = this.f11012b;
                N6.d dVar = kVar.f11021d;
                if (dVar != null) {
                    PickerView pickerView = dVar.f6095c;
                    Function3 function3 = kVar.f11023f;
                    if (function3 != null) {
                        function3.invoke(Integer.valueOf(pickerView.getOneWheelView().getCurrentItem()), Integer.valueOf(pickerView.getTowWheelView().getCurrentItem()), Integer.valueOf(pickerView.getThreeWheelView().getCurrentItem()));
                    }
                }
                kVar.dismiss();
                return Unit.f38893a;
            case 1:
                List list = this.f11012b.f11022e;
                return list == null ? z.f38935a : list;
            case 2:
                List list2 = this.f11012b.f11022e;
                return list2 == null ? z.f38935a : list2;
            default:
                List list3 = this.f11012b.f11022e;
                return list3 == null ? z.f38935a : list3;
        }
    }
}
