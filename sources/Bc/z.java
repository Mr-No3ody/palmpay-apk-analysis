package Bc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f891f;

    public /* synthetic */ z(ConstraintLayout constraintLayout, PpButton ppButton, ImageView imageView, TextView textView, TextView textView2, int i7) {
        this.f886a = i7;
        this.f887b = constraintLayout;
        this.f888c = ppButton;
        this.f889d = imageView;
        this.f890e = textView;
        this.f891f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f886a) {
            case 0:
                break;
        }
        return this.f887b;
    }
}
