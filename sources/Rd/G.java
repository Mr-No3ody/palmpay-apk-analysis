package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionResultHeaderModel f8049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f8051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f8052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f8053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f8054g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8055i;

    public G(RelativeLayout relativeLayout, TransactionResultHeaderModel transactionResultHeaderModel, TextView textView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, PpTitleBar ppTitleBar, TextView textView2) {
        this.f8048a = relativeLayout;
        this.f8049b = transactionResultHeaderModel;
        this.f8050c = textView;
        this.f8051d = imageView;
        this.f8052e = linearLayout;
        this.f8053f = linearLayout2;
        this.f8054g = ppTitleBar;
        this.f8055i = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8048a;
    }
}
