package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;

/* JADX INFO: renamed from: Rd.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0607x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f8542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.f f8543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelMobileWithIconInputLayout f8544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f8545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f8546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f8547g;

    public C0607x(LinearLayout linearLayout, TextView textView, Bc.f fVar, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, ConstraintLayout constraintLayout, ImageView imageView, PpTitleBar ppTitleBar) {
        this.f8541a = linearLayout;
        this.f8542b = textView;
        this.f8543c = fVar;
        this.f8544d = modelMobileWithIconInputLayout;
        this.f8545e = constraintLayout;
        this.f8546f = imageView;
        this.f8547g = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8541a;
    }
}
