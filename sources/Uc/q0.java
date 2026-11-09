package Uc;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.app.AbstractC1032a;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9714b;

    public /* synthetic */ q0(w0 w0Var, NearbyAgent2Page nearbyAgent2Page) {
        this.f9713a = 0;
        this.f9714b = nearbyAgent2Page;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NearbyAgent2Page nearbyAgent2Page = this.f9714b;
        switch (this.f9713a) {
            case 0:
                int i7 = NearbyAgent2Page.f32889k0;
                NearbyAgent2Page nearbyAgent2Page2 = nearbyAgent2Page.o().f9710a;
                Intrinsics.checkNotNullParameter(nearbyAgent2Page2, "<this>");
                if (!AbstractC1032a.h(nearbyAgent2Page2, com.transsnet.palmpay.core.config.d.j())) {
                    x0 x0VarQ = nearbyAgent2Page.q();
                    x0VarQ.getClass();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    NearbyAgent2Page nearbyAgent2Page3 = x0VarQ.f9737a;
                    Uri uriFromParts = Uri.fromParts("package", nearbyAgent2Page3.getPackageName(), null);
                    Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    nearbyAgent2Page3.startActivityForResult(intent, 16705);
                } else {
                    androidx.activity.result.a aVar = (androidx.activity.result.a) nearbyAgent2Page.f32898Y.getValue();
                    String strJ = com.transsnet.palmpay.core.config.d.j();
                    Intrinsics.checkNotNullExpressionValue(strJ, "getLocationPermission(...)");
                    aVar.a(strJ);
                }
                break;
            case 1:
                nearbyAgent2Page.onBackPressed();
                break;
            case 2:
                int i10 = NearbyAgent2Page.f32889k0;
                x0 x0VarQ2 = nearbyAgent2Page.q();
                x0VarQ2.getClass();
                NearbyAgent2Page nearbyAgent2Page4 = x0VarQ2.f9737a;
                Intrinsics.checkNotNullParameter(nearbyAgent2Page4, "<this>");
                nearbyAgent2Page4.startActivity(new Intent(nearbyAgent2Page4, (Class<?>) BookingHistoryPage.class));
                break;
            default:
                int i11 = NearbyAgent2Page.f32889k0;
                if (!nearbyAgent2Page.o().a()) {
                    NearbyAgent2Page nearbyAgent2Page5 = nearbyAgent2Page.o().f9710a;
                    Intrinsics.checkNotNullParameter(nearbyAgent2Page5, "<this>");
                    if (!AbstractC1032a.h(nearbyAgent2Page5, com.transsnet.palmpay.core.config.d.j())) {
                        ToastUtils.showLong("No location permission", new Object[0]);
                    } else {
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) nearbyAgent2Page.f32898Y.getValue();
                        String strJ2 = com.transsnet.palmpay.core.config.d.j();
                        Intrinsics.checkNotNullExpressionValue(strJ2, "getLocationPermission(...)");
                        aVar2.a(strJ2);
                    }
                } else {
                    nearbyAgent2Page.q().a(2, "{}");
                }
                break;
        }
    }

    public /* synthetic */ q0(NearbyAgent2Page nearbyAgent2Page, int i7) {
        this.f9713a = i7;
        this.f9714b = nearbyAgent2Page;
    }
}
