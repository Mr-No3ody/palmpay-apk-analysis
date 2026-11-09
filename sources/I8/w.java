package I8;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.PinEntryView;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PinEntryView f4246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpTitleBar f4248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4249g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4250i;

    public /* synthetic */ w(ConstraintLayout constraintLayout, View view, PinEntryView pinEntryView, TextView textView, PpTitleBar ppTitleBar, TextView textView2, TextView textView3, int i7) {
        this.f4243a = i7;
        this.f4244b = constraintLayout;
        this.f4245c = view;
        this.f4246d = pinEntryView;
        this.f4247e = textView;
        this.f4248f = ppTitleBar;
        this.f4249g = textView2;
        this.f4250i = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4243a) {
            case 0:
                break;
        }
        return this.f4244b;
    }
}
