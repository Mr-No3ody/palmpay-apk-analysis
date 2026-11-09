package Uc;

import com.transsnet.palmpay.p2pcash.bean.req.QueryAppointmentHistoryReq;
import com.transsnet.palmpay.p2pcash.business.IApiP2PCashService;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0672p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9705e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9706a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0649c f9708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BookingHistoryPage f9709d;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("historyData", "getHistoryData()Ljava/util/ArrayList;", C0672p.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9705e = new KProperty[]{rVar};
    }

    public C0672p(BookingHistoryPage bookingHistoryPage) {
        this.f9709d = bookingHistoryPage;
        this.f9708c = new C0649c(new ArrayList(), bookingHistoryPage, this);
    }

    public final void a(int i7) {
        QueryAppointmentHistoryReq queryAppointmentHistoryReq = new QueryAppointmentHistoryReq();
        queryAppointmentHistoryReq.pageNum = i7;
        ((IApiP2PCashService) Tc.a.f9070a.f41176b).queryAppointmentHistory(queryAppointmentHistoryReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0671o(this.f9709d, i7, this));
    }
}
