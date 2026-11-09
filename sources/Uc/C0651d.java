package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0651d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9624e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0649c f9625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Vc.c f9626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vc.a f9627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BookingDetailPage f9628d;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("orderData", "getOrderData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentDetailResp$DataBean;", C0651d.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9624e = new KProperty[]{rVar};
    }

    public C0651d(BookingDetailPage bookingDetailPage) {
        this.f9628d = bookingDetailPage;
        this.f9625a = new C0649c(this, bookingDetailPage);
    }

    public final Vc.a a() {
        Vc.a aVar = this.f9627c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("agentBean");
        throw null;
    }

    public final Vc.c b() {
        Vc.c cVar = this.f9626b;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("appointmentBean");
        throw null;
    }

    public final QueryAppointmentDetailResp.DataBean c() {
        return (QueryAppointmentDetailResp.DataBean) this.f9625a.getValue(this, f9624e[0]);
    }

    public final void d() {
        IApiP2PCashService iApiP2PCashService = (IApiP2PCashService) Tc.a.f9070a.f41176b;
        BookingDetailPage bookingDetailPage = this.f9628d;
        iApiP2PCashService.queryAppointmentDetail(bookingDetailPage.f32816v).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0647b(this, bookingDetailPage));
    }
}
