package N6;

import Bc.C0105b;
import Bc.k;
import L6.f;
import L6.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.picker.picker.TimePickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f6090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0105b f6091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimePickerView f6092d;

    public c(ConstraintLayout constraintLayout, k kVar, C0105b c0105b, TimePickerView timePickerView) {
        this.f6089a = constraintLayout;
        this.f6090b = kVar;
        this.f6091c = c0105b;
        this.f6092d = timePickerView;
    }

    public static c a(LayoutInflater layoutInflater) {
        View viewM;
        View viewM2;
        View viewM3;
        View viewInflate = layoutInflater.inflate(g.lib_ui_layout_date_picker, (ViewGroup) null, false);
        int i7 = f.ly_button;
        View viewM4 = p059e1.a.m(i7, viewInflate);
        if (viewM4 != null) {
            k kVarA = k.a(viewM4);
            int i10 = f.ly_range;
            View viewM5 = p059e1.a.m(i10, viewInflate);
            if (viewM5 != null) {
                int i11 = f.tv_end;
                TextView textView = (TextView) p059e1.a.m(i11, viewM5);
                if (textView != null) {
                    i11 = f.tv_start;
                    TextView textView2 = (TextView) p059e1.a.m(i11, viewM5);
                    if (textView2 != null && (viewM = p059e1.a.m((i11 = f.tv_to), viewM5)) != null && (viewM2 = p059e1.a.m((i11 = f.v_divider_end), viewM5)) != null && (viewM3 = p059e1.a.m((i11 = f.v_divider_start), viewM5)) != null) {
                        C0105b c0105b = new C0105b((ConstraintLayout) viewM5, textView, textView2, viewM, viewM2, viewM3, 14);
                        i10 = f.v_time_picker;
                        TimePickerView timePickerView = (TimePickerView) p059e1.a.m(i10, viewInflate);
                        if (timePickerView != null) {
                            return new c((ConstraintLayout) viewInflate, kVarA, c0105b, timePickerView);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM5.getResources().getResourceName(i11)));
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f6089a;
    }
}
