package Bc;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f587f;

    public /* synthetic */ A(ConstraintLayout constraintLayout, PpButton ppButton, TextView textView, TextView textView2, TextView textView3, int i7) {
        this.f582a = i7;
        this.f583b = constraintLayout;
        this.f584c = ppButton;
        this.f585d = textView;
        this.f586e = textView2;
        this.f587f = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f582a) {
            case 0:
                break;
        }
        return this.f583b;
    }
}
