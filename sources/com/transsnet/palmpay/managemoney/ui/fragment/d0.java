package com.transsnet.palmpay.managemoney.ui.fragment;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderPreFragment f32602b;

    public /* synthetic */ d0(OrderPreFragment orderPreFragment, int i7) {
        this.f32601a = i7;
        this.f32602b = orderPreFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i7 = 0;
        int i10 = 27;
        OrderPreFragment orderPreFragment = this.f32602b;
        switch (this.f32601a) {
            case 0:
                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                Pa.n0.g().l(orderPreFragment.f32532M == 0 ? "PreviewPage_EnableStrictMode_Click" : "PreviewPage_DisableStrictMode_Click");
                i7 = orderPreFragment.f32532M == 0 ? 1 : 0;
                orderPreFragment.f32532M = i7;
                int i11 = i7 == 1 ? com.transsnet.palmpay.custom_view.r.cv_switch_open_green : com.transsnet.palmpay.custom_view.r.cv_switch_close_gray;
                AppCompatImageView appCompatImageView = (AppCompatImageView) orderPreFragment.f32528B.getValue();
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(i11);
                }
                ProductBean productBeanU = orderPreFragment.u();
                if (productBeanU != null) {
                    orderPreFragment.t(productBeanU);
                }
                break;
            default:
                OrderPreFragment.a aVar2 = OrderPreFragment.f32526Q;
                ProductBean productBeanU2 = orderPreFragment.u();
                if (productBeanU2 != null && productBeanU2.isStrictMode() == 1) {
                    O6.c cVar = new O6.c(orderPreFragment.f27319c);
                    cVar.f6598d = "This fixed savings plan follows the activity rules and can't be withdrawn early.\n It will stay in strict savings mode until maturity to maximize your savings return.";
                    cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1478l(i10));
                    cVar.g();
                } else {
                    int i12 = orderPreFragment.f32532M;
                    String str = i12 == 0 ? "Do you want to Enable Strict Mode?" : "Do you want to Disable Strict Mode?";
                    if (i12 == 0) {
                        Resources resources = orderPreFragment.getResources();
                        int i13 = Jc.f.mm_saving_open_strict;
                        ProductBean productBeanU3 = orderPreFragment.u();
                        String strMillis2String = TimeUtils.millis2String(productBeanU3 != null ? productBeanU3.getMaturityDate() : 0L, new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH));
                        ProductBean productBeanU4 = orderPreFragment.u();
                        string = resources.getString(i13, strMillis2String, Pa.r0.z0(Pa.r0.w1(String.valueOf(productBeanU4 != null ? Float.valueOf(productBeanU4.getEarlyWithdrawalFeeRate()) : null), "100").toString()));
                    } else {
                        Resources resources2 = orderPreFragment.getResources();
                        int i14 = Jc.f.mm_saving_dis_strict;
                        ProductBean productBeanU5 = orderPreFragment.u();
                        string = resources2.getString(i14, TimeUtils.millis2String(productBeanU5 != null ? productBeanU5.getMaturityDate() : 0L, new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)));
                    }
                    Intrinsics.e(string);
                    Pa.n0.g().v(orderPreFragment.f32532M == 0 ? "EnableStrictMode_View" : "DisableStrictMode_View");
                    O6.c cVar2 = new O6.c(orderPreFragment.f27319c);
                    cVar2.f6596b = O6.d.f(str);
                    cVar2.f6598d = string;
                    cVar2.c(p025ba.k.core_cancel, new ViewOnClickListenerC1478l(i10));
                    cVar2.d(p025ba.k.core_confirm, new d0(orderPreFragment, i7));
                    cVar2.g();
                }
                break;
        }
    }
}
