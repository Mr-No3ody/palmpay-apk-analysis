package p141j9;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1796d implements OrderResultCustomerServiceModel.OnCustomerServiceModelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AirtimeBillDetailActivity f38398a;

    public C1796d(AirtimeBillDetailActivity airtimeBillDetailActivity) {
        this.f38398a = airtimeBillDetailActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onLeftClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        AirtimeBillDetailActivity airtimeBillDetailActivity = this.f38398a;
        i0.M(airtimeBillDetailActivity, AirtimeBillDetailActivity.n(airtimeBillDetailActivity));
    }

    @Override // com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel.OnCustomerServiceModelListener
    public final void onRightClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        i0.N(AirtimeBillDetailActivity.n(this.f38398a));
    }
}
