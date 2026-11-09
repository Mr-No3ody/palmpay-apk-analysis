package Uc;

import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.p2pcash.bean.req.QueryNearbyAgentReq;
import com.transsnet.palmpay.p2pcash.bean.req.ShopHomeByMemberIdReq;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9695j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0666k0 f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f9702g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9704i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9696a = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S3.c f9703h = new S3.c(new ArrayList(), this, 4);

    static {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x("areaId", "getAreaId()Ljava/lang/String;", o0.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9695j = new KProperty[]{xVar, new kotlin.jvm.internal.r("agentData", "getAgentData()Ljava/util/ArrayList;", o0.class), new kotlin.jvm.internal.r("appointmentData", "getAppointmentData()Ljava/util/ArrayList;", o0.class), new kotlin.jvm.internal.r("appointmentOrderData", "getAppointmentOrderData()Ljava/util/ArrayList;", o0.class)};
    }

    public o0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9704i = nearbyAgent2Page;
        this.f9700e = new C0666k0(nearbyAgent2Page);
        this.f9701f = new n0(new ArrayList(), nearbyAgent2Page, 0);
        this.f9702g = new n0(new ArrayList(), nearbyAgent2Page, 1);
    }

    public final ArrayList a() {
        return (ArrayList) this.f9701f.getValue(this, f9695j[1]);
    }

    public final void b() {
        try {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF == null || locationRecordF.isExpired()) {
                this.f9698c = null;
                this.f9699d = null;
            } else {
                this.f9698c = String.valueOf(locationRecordF.getLatitude());
                this.f9699d = String.valueOf(locationRecordF.getLongitude());
            }
        } catch (Exception unused) {
            this.f9698c = null;
            this.f9699d = null;
        }
    }

    public final void c() {
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).shopHomeByMemberId(new ShopHomeByMemberIdReq()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0668l0(this.f9704i, this));
    }

    public final void d(int i7) {
        QueryNearbyAgentReq queryNearbyAgentReq = new QueryNearbyAgentReq();
        queryNearbyAgentReq.areaCode = (String) this.f9700e.getValue(this, f9695j[0]);
        queryNearbyAgentReq.pageNum = i7;
        queryNearbyAgentReq.longitude = this.f9699d;
        queryNearbyAgentReq.latitude = this.f9698c;
        queryNearbyAgentReq.distance = Double.valueOf(10.0d);
        queryNearbyAgentReq.businessType = 2;
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryNearbyAgent(queryNearbyAgentReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new m0(this.f9704i, i7, this));
    }

    public final void e(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f9701f.setValue(this, f9695j[1], arrayList);
    }
}
