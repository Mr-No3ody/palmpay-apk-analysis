package p142ja;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f38496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f38497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f38498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f38499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpTitleBar f38500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f38501g;

    public k(ConstraintLayout constraintLayout, PpButton ppButton, PpButton ppButton2, ImageView imageView, RecyclerView recyclerView, PpTitleBar ppTitleBar, TextView textView) {
        this.f38495a = constraintLayout;
        this.f38496b = ppButton;
        this.f38497c = ppButton2;
        this.f38498d = imageView;
        this.f38499e = recyclerView;
        this.f38500f = ppTitleBar;
        this.f38501g = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38495a;
    }
}
