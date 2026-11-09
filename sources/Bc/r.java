package Bc;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OrderResultHeaderModel f827d;

    public /* synthetic */ r(LinearLayout linearLayout, LinearLayout linearLayout2, OrderResultHeaderModel orderResultHeaderModel, int i7) {
        this.f824a = i7;
        this.f825b = linearLayout;
        this.f826c = linearLayout2;
        this.f827d = orderResultHeaderModel;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f824a) {
            case 0:
                break;
        }
        return this.f825b;
    }
}
