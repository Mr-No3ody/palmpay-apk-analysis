package Uc;

import Pa.C0525w;
import android.content.Intent;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.util.PhoneUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class T implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapPage f9590b;

    public /* synthetic */ T(MapPage mapPage, int i7) {
        this.f9589a = i7;
        this.f9590b = mapPage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MapPage mapPage = this.f9590b;
        switch (this.f9589a) {
            case 0:
                ((C0656f0) mapPage.f32884r0.getValue()).getClass();
                ARouter.getInstance().build("/cashout/withdraw_query_account").navigation();
                break;
            case 1:
                int i7 = MapPage.f32859u0;
                String str = mapPage.r().a().networkMobile;
                if (str != null) {
                    PhoneUtils.dial(Pa.r0.w0(str));
                }
                break;
            case 2:
                C0656f0 c0656f0 = (C0656f0) mapPage.f32884r0.getValue();
                String data = ((Gson) C0525w.f().f7166b).toJson(mapPage.r().a());
                Intrinsics.checkNotNullExpressionValue(data, "toJson(...)");
                c0656f0.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                MapPage mapPage2 = c0656f0.f9643a;
                Intrinsics.checkNotNullParameter(mapPage2, "<this>");
                Intent intent = new Intent(mapPage2, (Class<?>) BookingNotesPage.class);
                intent.putExtra("MAP_DATA", data);
                mapPage2.startActivity(intent);
                break;
            case 3:
                ((C0656f0) mapPage.f32884r0.getValue()).getClass();
                ARouter.getInstance().build("/cashout/withdraw_query_account").navigation();
                break;
            case 4:
                mapPage.finish();
                break;
            case 5:
                int i10 = MapPage.f32859u0;
                mapPage.r().b();
                Y yS = mapPage.s();
                yS.getClass();
                MapPage mapPage3 = yS.f9608d;
                if (((mapPage3.r().f9596b == null || mapPage3.r().f9595a == null) ? null : yS) != null) {
                    try {
                        String str2 = mapPage3.r().f9595a;
                        Intrinsics.e(str2);
                        double d2 = Double.parseDouble(str2);
                        String str3 = mapPage3.r().f9596b;
                        Intrinsics.e(str3);
                        yS.b().animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d2, Double.parseDouble(str3)), 13.0f));
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                mapPage.finish();
                break;
        }
    }
}
