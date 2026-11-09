package Bc;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f849d;

    public t(ConstraintLayout constraintLayout, View view, IconicsImageView iconicsImageView, ImageView imageView, View view2) {
        this.f846a = constraintLayout;
        this.f847b = view;
        this.f848c = iconicsImageView;
        this.f849d = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f846a;
    }
}
