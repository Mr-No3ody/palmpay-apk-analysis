package N6;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.picker.picker.PickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PickerView f6094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PickerView f6095c;

    public /* synthetic */ d(PickerView pickerView, PickerView pickerView2, int i7) {
        this.f6093a = i7;
        this.f6094b = pickerView;
        this.f6095c = pickerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f6093a) {
            case 0:
                break;
        }
        return this.f6094b;
    }
}
