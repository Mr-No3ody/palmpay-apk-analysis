package Uc;

import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Uc.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0681z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f9742f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ShopHomeByMemberIdResp.NearbyShopListBean f9743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0680y f9744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0680y f9745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BookingNotesPage f9747e;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("moneyData", "getMoneyData()Lcom/transsnet/palmpay/p2pcash/bean/rsp/CommonMoneyListResp$DataBean;", C0681z.class);
        kotlin.jvm.internal.G.f38952a.getClass();
        f9742f = new KProperty[]{rVar, new kotlin.jvm.internal.r("amount", "getAmount()J", C0681z.class)};
    }

    public C0681z(BookingNotesPage bookingNotesPage) {
        this.f9747e = bookingNotesPage;
        this.f9744b = new C0680y(bookingNotesPage, 0);
        this.f9745c = new C0680y(bookingNotesPage, 1);
    }

    public final ShopHomeByMemberIdResp.NearbyShopListBean a() {
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = this.f9743a;
        if (nearbyShopListBean != null) {
            return nearbyShopListBean;
        }
        Intrinsics.n("agentData");
        throw null;
    }
}
