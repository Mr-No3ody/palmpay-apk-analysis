package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;

/* JADX INFO: renamed from: Rd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0585a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f8201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OrderResultCustomerServiceModel f8202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OrderResultHeaderModel f8203e;

    public C0585a(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, OrderResultCustomerServiceModel orderResultCustomerServiceModel, OrderResultHeaderModel orderResultHeaderModel) {
        this.f8199a = linearLayout;
        this.f8200b = linearLayout2;
        this.f8201c = linearLayout3;
        this.f8202d = orderResultCustomerServiceModel;
        this.f8203e = orderResultHeaderModel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8199a;
    }
}
