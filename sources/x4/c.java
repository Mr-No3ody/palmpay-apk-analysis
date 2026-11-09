package x4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f43583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatEditText f43584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f43585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f43586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43588g;

    public c(LinearLayout linearLayout, PpButton ppButton, AppCompatEditText appCompatEditText, ImageView imageView, IconicsImageView iconicsImageView, TextView textView, TextView textView2) {
        this.f43582a = linearLayout;
        this.f43583b = ppButton;
        this.f43584c = appCompatEditText;
        this.f43585d = imageView;
        this.f43586e = iconicsImageView;
        this.f43587f = textView;
        this.f43588g = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43582a;
    }
}
