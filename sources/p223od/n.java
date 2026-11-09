package p223od;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f40429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f40430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f40431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f40432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f40433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f40434g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f40435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f40436j;

    public n(ConstraintLayout constraintLayout, TextView textView, TextView textView2, IconicsImageView iconicsImageView, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f40428a = constraintLayout;
        this.f40429b = textView;
        this.f40430c = textView2;
        this.f40431d = iconicsImageView;
        this.f40432e = imageView;
        this.f40433f = textView3;
        this.f40434g = textView4;
        this.f40435i = textView5;
        this.f40436j = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40428a;
    }
}
