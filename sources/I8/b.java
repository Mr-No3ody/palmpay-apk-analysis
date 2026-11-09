package I8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f4040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatCheckBox f4041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatCheckBox f4042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f4043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardView f4044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4045g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4046i;

    public b(LinearLayout linearLayout, PpButton ppButton, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, ConstraintLayout constraintLayout, CardView cardView, TextView textView, TextView textView2) {
        this.f4039a = linearLayout;
        this.f4040b = ppButton;
        this.f4041c = appCompatCheckBox;
        this.f4042d = appCompatCheckBox2;
        this.f4043e = constraintLayout;
        this.f4044f = cardView;
        this.f4045g = textView;
        this.f4046i = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4039a;
    }
}
