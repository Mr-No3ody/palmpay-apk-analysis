package I8;

import Bc.C0107d;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f4069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0107d f4070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0107d f4071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0107d f4072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f4073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpButton f4074g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4076j;

    public f(FrameLayout frameLayout, IconicsImageView iconicsImageView, C0107d c0107d, C0107d c0107d2, C0107d c0107d3, FrameLayout frameLayout2, PpButton ppButton, TextView textView, TextView textView2) {
        this.f4068a = frameLayout;
        this.f4069b = iconicsImageView;
        this.f4070c = c0107d;
        this.f4071d = c0107d2;
        this.f4072e = c0107d3;
        this.f4073f = frameLayout2;
        this.f4074g = ppButton;
        this.f4075i = textView;
        this.f4076j = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4068a;
    }
}
