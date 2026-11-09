package x4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.core.viewmodel.FlexiBankOneTimeCodeView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpTitleBar f43615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexiBankOneTimeCodeView f43616c;

    public i(LinearLayout linearLayout, PpTitleBar ppTitleBar, FlexiBankOneTimeCodeView flexiBankOneTimeCodeView) {
        this.f43614a = linearLayout;
        this.f43615b = ppTitleBar;
        this.f43616c = flexiBankOneTimeCodeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43614a;
    }
}
