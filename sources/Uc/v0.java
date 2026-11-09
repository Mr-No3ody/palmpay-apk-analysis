package Uc;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9730a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f9731b;

    public v0(w0 w0Var) {
        this.f9731b = w0Var;
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        if (this.f9730a) {
            w0 w0Var = this.f9731b;
            w0Var.f9733a = true;
            w0Var.a();
            this.f9730a = false;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
    }
}
