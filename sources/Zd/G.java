package Zd;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.TvPaymentListFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TvPaymentListFragment f11646b;

    public /* synthetic */ G(TvPaymentListFragment tvPaymentListFragment, int i7) {
        this.f11645a = i7;
        this.f11646b = tvPaymentListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        String string2;
        String string3;
        switch (this.f11645a) {
            case 0:
                Fragment fragmentRequireParentFragment = this.f11646b.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 1:
                Fragment fragmentRequireParentFragment2 = this.f11646b.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment2, "requireParentFragment(...)");
                return fragmentRequireParentFragment2;
            case 2:
                Bundle arguments = this.f11646b.getArguments();
                return (arguments == null || (string = arguments.getString("operatorCode")) == null) ? "" : string;
            case 3:
                Bundle arguments2 = this.f11646b.getArguments();
                return (arguments2 == null || (string2 = arguments2.getString("categoryId")) == null) ? "" : string2;
            default:
                Bundle arguments3 = this.f11646b.getArguments();
                if (arguments3 == null || (string3 = arguments3.getString("listJson")) == null) {
                    string3 = "";
                }
                if (string3.length() > 0) {
                    return (TvListByCategoryIdResp.TvCategoryBean) d0.l(TvListByCategoryIdResp.TvCategoryBean.class, string3);
                }
                return null;
        }
    }
}
