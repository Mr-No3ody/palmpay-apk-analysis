package Uc;

import C9.ViewOnClickListenerC0150q;
import Pa.C0525w;
import android.content.Intent;
import android.view.View;
import com.google.gson.Gson;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class S implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapPage f9587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShopHomeByMemberIdResp.NearbyShopListBean f9588c;

    public /* synthetic */ S(MapPage mapPage, ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean, int i7) {
        this.f9586a = i7;
        this.f9587b = mapPage;
        this.f9588c = nearbyShopListBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = this.f9588c;
        MapPage mapPage = this.f9587b;
        switch (this.f9586a) {
            case 0:
                C0656f0 c0656f0 = (C0656f0) mapPage.f32884r0.getValue();
                String data = ((Gson) C0525w.f().f7166b).toJson(nearbyShopListBean);
                Intrinsics.checkNotNullExpressionValue(data, "toJson(...)");
                c0656f0.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                MapPage mapPage2 = c0656f0.f9643a;
                Intrinsics.checkNotNullParameter(mapPage2, "<this>");
                Intent intent = new Intent(mapPage2, (Class<?>) BookingNotesPage.class);
                intent.putExtra("MAP_DATA", data);
                mapPage2.startActivity(intent);
                break;
            default:
                int i7 = MapPage.f32859u0;
                C0654e0 c0654e0T = mapPage.t();
                String address = nearbyShopListBean.networkAddress;
                Intrinsics.checkNotNullExpressionValue(address, "networkAddress");
                c0654e0T.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                MapPage mapPage3 = c0654e0T.f9640g;
                Intrinsics.checkNotNullParameter(mapPage3, "<this>");
                O6.c cVar = new O6.c(mapPage3);
                cVar.f6596b = O6.d.f("Full Address");
                cVar.f6598d = address;
                String string = mapPage3.getString(p025ba.k.core_copy);
                ViewOnClickListenerC0150q viewOnClickListenerC0150q = new ViewOnClickListenerC0150q(address, 2);
                cVar.f6600f = string;
                cVar.f6602h = viewOnClickListenerC0150q;
                cVar.a().show();
                break;
        }
    }
}
