package Ce;

import android.widget.LinearLayout;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalBillActivity;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements IAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1537b;

    public /* synthetic */ u0(Object obj, int i7) {
        this.f1536a = i7;
        this.f1537b = obj;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f1536a) {
            case 0:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                com.chuanyi.ad.a.a(((TransactionHistoryFragment) this.f1537b).f27317a, adEntity);
                break;
            case 1:
                Pa.T.c(new Nc.m(adEntity, 0));
                break;
            default:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
        int i7 = this.f1536a;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        SingleAdView singleAdView;
        Object obj = this.f1537b;
        switch (this.f1536a) {
            case 0:
                int i7 = TransactionHistoryFragment.f35248k0;
                Bc.x xVar = (Bc.x) ((TransactionHistoryFragment) obj).f27335j;
                if (xVar != null && (singleAdView = xVar.f870b) != null) {
                    singleAdView.setVisibility(8);
                    break;
                }
                break;
            case 1:
                Pa.T.c(new Nc.l((Nc.n) obj, 0));
                break;
            default:
                Object value = ((OcTotalBillActivity) obj).f29907o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        SingleAdView singleAdView;
        Object obj = this.f1537b;
        switch (this.f1536a) {
            case 0:
                int i7 = TransactionHistoryFragment.f35248k0;
                Bc.x xVar = (Bc.x) ((TransactionHistoryFragment) obj).f27335j;
                if (xVar != null && (singleAdView = xVar.f870b) != null) {
                    singleAdView.setVisibility(0);
                    break;
                }
                break;
            case 1:
                Pa.T.c(new Nc.l((Nc.n) obj, 1));
                break;
            default:
                Object value = ((OcTotalBillActivity) obj).f29907o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
