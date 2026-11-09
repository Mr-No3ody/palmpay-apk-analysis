package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/AvailableCouponListDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailableCouponListDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f29932H = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f29933C = C2131j.b(new X6.c(this, 18));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvailableCouponListDialogFragment newInstance(@NotNull ArrayList<CouponItem> couponList) {
            Intrinsics.checkNotNullParameter(couponList, "couponList");
            AvailableCouponListDialogFragment availableCouponListDialogFragment = new AvailableCouponListDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("key_coupon_list", couponList);
            availableCouponListDialogFragment.setArguments(bundle);
            return availableCouponListDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), Ya.f.cs_available_coupon_list_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31240e = DensityUtil.dp2px(368.0f);
        this.f31246p = true;
        this.f31243i = p025ba.l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(Ya.e.ivClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p220oa.h.l(new Yd.i(this, 28), viewFindViewById);
        RecyclerView recyclerView = (RecyclerView) viewF.findViewById(Ya.e.rvCouponList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.addItemDecoration(new C1548f(requireContext().getColor(com.transsnet.palmpay.custom_view.p.transparent), DensityUtil.dp2px(18.0f)));
        p355xf.t tVar = this.f29933C;
        recyclerView.setAdapter((p052da.I) tVar.getValue());
        p052da.I i7 = (p052da.I) tVar.getValue();
        Bundle arguments = getArguments();
        i7.f4985b = arguments != null ? arguments.getParcelableArrayList("key_coupon_list") : null;
        ((p052da.I) tVar.getValue()).notifyDataSetChanged();
        ((p052da.I) tVar.getValue()).f4986c = new com.transsnet.palmpay.core.ui.activity.Z(this, 1);
        return baseDialog;
    }
}
