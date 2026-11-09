package Hb;

import Pa.n0;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0311m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductContentInfo f3837b;

    public /* synthetic */ ViewOnClickListenerC0311m(ProductContentInfo productContentInfo, int i7) {
        this.f3836a = i7;
        this.f3837b = productContentInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3836a) {
            case 0:
                ProductContentInfo productContentInfo = this.f3837b;
                F6.d.h("InstallmentLoanItemProvider", 3, C0.G.o("rtvIncrease >>> click=", productContentInfo.jumpPath2));
                Pa.F.f(productContentInfo.jumpPath2, productContentInfo.jumpType2, productContentInfo.jumpParams2);
                if (Intrinsics.c(productContentInfo.loanProduct, "PALMPAY_BUSINESS_LOAN")) {
                    n0.g().k((ClickEvent) C0.G.f("BusinessLoanIncreaseLimitLoanPageClick", "module_name", "IncreaseLimit"));
                }
                break;
            case 1:
                Pa.F.e(this.f3837b.androidLinkCard);
                break;
            case 2:
                Pa.F.e(this.f3837b.androidLinkCard);
                break;
            default:
                ProductContentInfo productContentInfo2 = this.f3837b;
                if (!TextUtils.isEmpty(productContentInfo2.increaseAndroidLink)) {
                    Pa.F.e(productContentInfo2.increaseAndroidLink);
                    break;
                }
                break;
        }
    }
}
