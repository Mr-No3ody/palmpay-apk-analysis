package x4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f43626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f43627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f43628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43630f;

    public k(View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f43625a = view;
        this.f43626b = imageView;
        this.f43627c = textView;
        this.f43628d = textView2;
        this.f43629e = textView3;
        this.f43630f = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43625a;
    }
}
