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
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f43576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatEditText f43577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f43578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f43579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f43580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f43581g;

    public b(LinearLayout linearLayout, PpButton ppButton, AppCompatEditText appCompatEditText, ImageView imageView, IconicsImageView iconicsImageView, TextView textView, TextView textView2) {
        this.f43575a = linearLayout;
        this.f43576b = ppButton;
        this.f43577c = appCompatEditText;
        this.f43578d = imageView;
        this.f43579e = iconicsImageView;
        this.f43580f = textView;
        this.f43581g = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43575a;
    }
}
