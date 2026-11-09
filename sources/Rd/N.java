package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;

/* JADX INFO: loaded from: classes4.dex */
public final class N implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderDetailInfoListModel f8116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OrderResultCustomerServiceModel f8117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OrderResultHeaderModel f8118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OrderResultViewReceiptModel f8119f;

    public N(LinearLayout linearLayout, LinearLayout linearLayout2, OrderDetailInfoListModel orderDetailInfoListModel, OrderResultCustomerServiceModel orderResultCustomerServiceModel, OrderResultHeaderModel orderResultHeaderModel, OrderResultViewReceiptModel orderResultViewReceiptModel) {
        this.f8114a = linearLayout;
        this.f8115b = linearLayout2;
        this.f8116c = orderDetailInfoListModel;
        this.f8117d = orderResultCustomerServiceModel;
        this.f8118e = orderResultHeaderModel;
        this.f8119f = orderResultViewReceiptModel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8114a;
    }
}
