package Uc;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;

/* JADX INFO: renamed from: Uc.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0660h0 extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0664j0 f9651c;

    public C0660h0(NearbyAgent2Page nearbyAgent2Page, int i7, C0664j0 c0664j0) {
        this.f9649a = nearbyAgent2Page;
        this.f9650b = i7;
        this.f9651c = c0664j0;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        try {
            org.chromium.support_lib_boundary.util.b.P(adEntity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
        F6.d.h("==========onClosed===========", 4, new Object[0]);
        onLoadFailed();
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        int i7 = NearbyAgent2Page.f32889k0;
        this.f9649a.n().a().remove(this.f9650b);
        this.f9651c.notifyDataSetChanged();
    }
}
