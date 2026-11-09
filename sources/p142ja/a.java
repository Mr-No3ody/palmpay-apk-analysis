package p142ja;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionResultHeaderModel f38445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpTitleBar f38446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38447d;

    public a(LinearLayout linearLayout, TransactionResultHeaderModel transactionResultHeaderModel, PpTitleBar ppTitleBar, TextView textView) {
        this.f38444a = linearLayout;
        this.f38445b = transactionResultHeaderModel;
        this.f38446c = ppTitleBar;
        this.f38447d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38444a;
    }
}
