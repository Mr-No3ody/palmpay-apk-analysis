package I8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f4085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f4086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatTextView f4087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f4088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f4089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4090g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f4091i;

    public h(FrameLayout frameLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView, TextView textView2, View view) {
        this.f4084a = frameLayout;
        this.f4085b = appCompatImageView;
        this.f4086c = frameLayout2;
        this.f4087d = appCompatTextView;
        this.f4088e = appCompatTextView2;
        this.f4089f = textView;
        this.f4090g = textView2;
        this.f4091i = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4084a;
    }
}
