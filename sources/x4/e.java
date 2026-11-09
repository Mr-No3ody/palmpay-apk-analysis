package x4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.core.viewmodel.FlexiBankAndroidXWebView;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f43593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexiBankAndroidXWebView f43594c;

    public e(LinearLayout linearLayout, ProgressBar progressBar, FlexiBankAndroidXWebView flexiBankAndroidXWebView) {
        this.f43592a = linearLayout;
        this.f43593b = progressBar;
        this.f43594c = flexiBankAndroidXWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43592a;
    }
}
