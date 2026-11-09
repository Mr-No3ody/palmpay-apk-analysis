package Bc;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IconicsImageView f606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f609g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f611j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IconicsTextView f612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f613p;

    public C(ConstraintLayout constraintLayout, Button button, ImageView imageView, IconicsImageView iconicsImageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, IconicsTextView iconicsTextView, TextView textView5) {
        this.f603a = constraintLayout;
        this.f604b = button;
        this.f605c = imageView;
        this.f606d = iconicsImageView;
        this.f607e = imageView2;
        this.f608f = textView;
        this.f609g = textView2;
        this.f610i = textView3;
        this.f611j = textView4;
        this.f612o = iconicsTextView;
        this.f613p = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f603a;
    }
}
