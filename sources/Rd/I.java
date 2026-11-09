package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderDetailInfoListModel f8075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OrderResultCopyToken f8076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OrderResultCustomerServiceModel f8077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OrderResultHeaderModel f8078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderResultViewReceiptModel f8079g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewStub f8080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8081j;

    public I(LinearLayout linearLayout, LinearLayout linearLayout2, OrderDetailInfoListModel orderDetailInfoListModel, OrderResultCopyToken orderResultCopyToken, OrderResultCustomerServiceModel orderResultCustomerServiceModel, OrderResultHeaderModel orderResultHeaderModel, OrderResultViewReceiptModel orderResultViewReceiptModel, ViewStub viewStub, TextView textView) {
        this.f8073a = linearLayout;
        this.f8074b = linearLayout2;
        this.f8075c = orderDetailInfoListModel;
        this.f8076d = orderResultCopyToken;
        this.f8077e = orderResultCustomerServiceModel;
        this.f8078f = orderResultHeaderModel;
        this.f8079g = orderResultViewReceiptModel;
        this.f8080i = viewStub;
        this.f8081j = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8073a;
    }
}
