package I8;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.view.GenderV2View;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GenderV2View f4167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f4168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpFormVertical f4169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpFormVertical f4170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpFormVertical f4171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpButton f4172g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IconicsTextView f4174j;

    public o(ConstraintLayout constraintLayout, GenderV2View genderV2View, PpFormVertical ppFormVertical, PpFormVertical ppFormVertical2, PpFormVertical ppFormVertical3, PpFormVertical ppFormVertical4, PpButton ppButton, TextView textView, IconicsTextView iconicsTextView) {
        this.f4166a = constraintLayout;
        this.f4167b = genderV2View;
        this.f4168c = ppFormVertical;
        this.f4169d = ppFormVertical2;
        this.f4170e = ppFormVertical3;
        this.f4171f = ppFormVertical4;
        this.f4172g = ppButton;
        this.f4173i = textView;
        this.f4174j = iconicsTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4166a;
    }
}
