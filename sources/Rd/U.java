package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f8155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f8156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f8157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f8158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f8160g;

    public U(ConstraintLayout constraintLayout, PpButton ppButton, IconicsImageView iconicsImageView, ImageView imageView, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f8154a = constraintLayout;
        this.f8155b = ppButton;
        this.f8156c = iconicsImageView;
        this.f8157d = imageView;
        this.f8158e = recyclerView;
        this.f8159f = textView;
        this.f8160g = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8154a;
    }
}
