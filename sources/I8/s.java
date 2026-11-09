package I8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f4202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpFormVertical f4203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f4204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpButton f4205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4207f;

    public s(LinearLayout linearLayout, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpButton ppButton, TextView textView, TextView textView2) {
        this.f4202a = linearLayout;
        this.f4203b = ppFormVertical;
        this.f4204c = ppFormVertical2;
        this.f4205d = ppButton;
        this.f4206e = textView;
        this.f4207f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4202a;
    }
}
