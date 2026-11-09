package Bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import org.sufficientlysecure.htmltextview.HtmlTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f755c;

    public /* synthetic */ l(ViewGroup viewGroup, Object obj, int i7) {
        this.f753a = i7;
        this.f754b = viewGroup;
        this.f755c = obj;
    }

    public static l a(View view) {
        int i7 = com.transsnet.palmpay.custom_view.s.btnScan;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, view);
        if (ppButton != null) {
            i7 = com.transsnet.palmpay.custom_view.s.tvFaceScanSecurityTips;
            if (((IconicsTextView) p059e1.a.m(i7, view)) != null) {
                return new l((FrameLayout) view, ppButton, 4);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    public static l b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(L6.g.lib_ui_layout_picker_date, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TimePickerView timePickerView = (TimePickerView) viewInflate;
        return new l(timePickerView, timePickerView, 2);
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f753a) {
            case 0:
                return (LinearLayout) this.f754b;
            case 1:
                return (ConstraintLayout) this.f754b;
            case 2:
                return (TimePickerView) this.f754b;
            case 3:
                return (HoursMinutesPickerView) this.f754b;
            case 4:
                return (FrameLayout) this.f754b;
            case 5:
                return (LinearLayout) this.f754b;
            default:
                return (ConstraintLayout) this.f754b;
        }
    }

    public l(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f753a = 5;
        this.f754b = linearLayout;
        this.f755c = textView;
    }

    public l(ConstraintLayout constraintLayout, PpButton ppButton, HtmlTextView htmlTextView) {
        this.f753a = 6;
        this.f754b = constraintLayout;
        this.f755c = ppButton;
    }
}
