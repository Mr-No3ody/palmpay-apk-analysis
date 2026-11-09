package Bc;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f865e;

    public v(RelativeLayout relativeLayout, TextView textView, TextView textView2, IconicsImageView iconicsImageView, TextView textView3, TextView textView4) {
        this.f861a = relativeLayout;
        this.f862b = textView;
        this.f863c = textView2;
        this.f864d = textView3;
        this.f865e = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f861a;
    }
}
