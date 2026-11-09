package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: renamed from: Rd.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0588d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f8240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f8241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f8242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f8243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f8244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8245g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpButton f8246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IconicsTextView f8247j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PpButton f8248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8249p;
    public final TextView t;

    public C0588d(ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, PpButton ppButton, IconicsTextView iconicsTextView, PpButton ppButton2, TextView textView2, TextView textView3) {
        this.f8239a = constraintLayout;
        this.f8240b = imageView;
        this.f8241c = appCompatImageView;
        this.f8242d = linearLayout;
        this.f8243e = linearLayout2;
        this.f8244f = linearLayout3;
        this.f8245g = textView;
        this.f8246i = ppButton;
        this.f8247j = iconicsTextView;
        this.f8248o = ppButton2;
        this.f8249p = textView2;
        this.t = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8239a;
    }
}
