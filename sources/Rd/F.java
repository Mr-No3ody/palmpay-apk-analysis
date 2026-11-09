package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.custom_view.model.TransactionDetailHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelPreviewItem f8042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionDetailHeaderModel f8043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelPreviewItem f8044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ModelPreviewItem f8045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8047g;

    public F(LinearLayout linearLayout, ModelPreviewItem modelPreviewItem, TransactionDetailHeaderModel transactionDetailHeaderModel, ModelPreviewItem modelPreviewItem2, ModelPreviewItem modelPreviewItem3, TextView textView, TextView textView2) {
        this.f8041a = linearLayout;
        this.f8042b = modelPreviewItem;
        this.f8043c = transactionDetailHeaderModel;
        this.f8044d = modelPreviewItem2;
        this.f8045e = modelPreviewItem3;
        this.f8046f = textView;
        this.f8047g = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8041a;
    }
}
