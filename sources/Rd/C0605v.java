package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: renamed from: Rd.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0605v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatEditText f8529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8531g;

    public C0605v(ConstraintLayout constraintLayout, PpButton ppButton, ImageView imageView, TextView textView, AppCompatEditText appCompatEditText, TextView textView2, TextView textView3) {
        this.f8525a = constraintLayout;
        this.f8526b = ppButton;
        this.f8527c = imageView;
        this.f8528d = textView;
        this.f8529e = appCompatEditText;
        this.f8530f = textView2;
        this.f8531g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8525a;
    }
}
