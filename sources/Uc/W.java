package Uc;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.p2pcash.bean.req.QueryNearbyAgentByLocationReq;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class W {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9594j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9599e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9600f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ShopHomeByMemberIdResp.NearbyShopListBean f9601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S3.c f9602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MapPage f9603i;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("nearbyAgentData", "getNearbyAgentData()Ljava/util/ArrayList;", W.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9594j = new KProperty[]{rVar};
    }

    public W(MapPage mapPage) {
        this.f9603i = mapPage;
        this.f9602h = new S3.c(new ArrayList(), mapPage, 3);
    }

    public final ShopHomeByMemberIdResp.NearbyShopListBean a() {
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = this.f9601g;
        if (nearbyShopListBean != null) {
            return nearbyShopListBean;
        }
        Intrinsics.n("agentData");
        throw null;
    }

    public final void b() {
        try {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF == null || locationRecordF.isExpired()) {
                this.f9595a = "6.532021238270723";
                this.f9596b = "3.350835709013934";
                this.f9598d = "6.532021238270723";
                this.f9597c = "3.350835709013934";
                return;
            }
            this.f9595a = String.valueOf(locationRecordF.getLatitude());
            this.f9596b = String.valueOf(locationRecordF.getLongitude());
            this.f9598d = String.valueOf(locationRecordF.getLatitude());
            this.f9597c = String.valueOf(locationRecordF.getLongitude());
        } catch (Exception unused) {
            this.f9595a = "6.532021238270723";
            this.f9596b = "3.350835709013934";
            this.f9598d = "6.532021238270723";
            this.f9597c = "3.350835709013934";
        }
    }

    public final ArrayList c() {
        return (ArrayList) this.f9602h.getValue(this, f9594j[0]);
    }

    public final void d(double d2, double d10) {
        if (!this.f9600f) {
            this.f9600f = true;
            return;
        }
        boolean z3 = this.f9599e;
        MapPage mapPage = this.f9603i;
        if (z3) {
            int i7 = MapPage.f32859u0;
            mapPage.s().b().clear();
            Y yS = mapPage.s();
            yS.getClass();
            try {
                MarkerOptions markerOptionsIcon = new MarkerOptions().position(new LatLng(d10, d2)).icon(BitmapDescriptorFactory.fromResource(Sc.d.p2p_search_marker));
                Intrinsics.checkNotNullExpressionValue(markerOptionsIcon, "icon(...)");
                yS.b().addMarker(markerOptionsIcon);
            } catch (Exception unused) {
            }
        } else {
            this.f9599e = true;
        }
        QueryNearbyAgentByLocationReq queryNearbyAgentByLocationReq = new QueryNearbyAgentByLocationReq();
        queryNearbyAgentByLocationReq.longitude = String.valueOf(d2);
        queryNearbyAgentByLocationReq.latitude = String.valueOf(d10);
        queryNearbyAgentByLocationReq.distance = 4.0d;
        queryNearbyAgentByLocationReq.size = 20;
        queryNearbyAgentByLocationReq.pageSize = 20;
        queryNearbyAgentByLocationReq.pageNum = 1;
        queryNearbyAgentByLocationReq.businessType = 2;
        String str = this.f9598d;
        queryNearbyAgentByLocationReq.memberLatitude = str != null ? Double.valueOf(Double.parseDouble(str)) : null;
        String str2 = this.f9597c;
        queryNearbyAgentByLocationReq.memberLongitude = str2 != null ? Double.valueOf(Double.parseDouble(str2)) : null;
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryNearbyAgentByLocation(queryNearbyAgentByLocationReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new V(mapPage, this));
    }
}
