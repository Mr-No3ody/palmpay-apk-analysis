package Rd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f8181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f8186g;

    public Y(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout2) {
        this.f8180a = frameLayout;
        this.f8181b = imageView;
        this.f8182c = textView;
        this.f8183d = textView2;
        this.f8184e = textView3;
        this.f8185f = textView4;
        this.f8186g = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8180a;
    }
}
