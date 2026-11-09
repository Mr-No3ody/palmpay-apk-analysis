package Bc;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f781c;

    public /* synthetic */ n(LinearLayout linearLayout, PpTitleBar ppTitleBar, int i7) {
        this.f779a = i7;
        this.f780b = linearLayout;
        this.f781c = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f779a) {
            case 0:
                break;
        }
        return this.f780b;
    }
}
