package Rd;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;

/* JADX INFO: renamed from: Rd.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0597m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderDetailInfoListModel f8396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OrderResultCopyToken f8397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OrderResultCustomerServiceModel f8398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OrderResultHeaderModel f8399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OrderResultViewReceiptModel f8400g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewStub f8401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewStub f8402j;

    public C0597m(LinearLayout linearLayout, LinearLayout linearLayout2, OrderDetailInfoListModel orderDetailInfoListModel, OrderResultCopyToken orderResultCopyToken, OrderResultCustomerServiceModel orderResultCustomerServiceModel, OrderResultHeaderModel orderResultHeaderModel, OrderResultViewReceiptModel orderResultViewReceiptModel, ViewStub viewStub, ViewStub viewStub2) {
        this.f8394a = linearLayout;
        this.f8395b = linearLayout2;
        this.f8396c = orderDetailInfoListModel;
        this.f8397d = orderResultCopyToken;
        this.f8398e = orderResultCustomerServiceModel;
        this.f8399f = orderResultHeaderModel;
        this.f8400g = orderResultViewReceiptModel;
        this.f8401i = viewStub;
        this.f8402j = viewStub2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8394a;
    }
}
