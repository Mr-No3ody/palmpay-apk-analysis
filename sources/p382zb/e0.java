package p382zb;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements IAdListener {
    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        b.P(adEntity);
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
    }
}
