package p382zb;

import Ya.d;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.IAdListener;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.custom_view.q;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements IAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcMainFragment f44575b;

    public /* synthetic */ d0(OcMainFragment ocMainFragment, int i7) {
        this.f44574a = i7;
        this.f44575b = ocMainFragment;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f44574a) {
            case 0:
                try {
                    b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            default:
                b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClosed() {
        int i7 = this.f44574a;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        switch (this.f44574a) {
            case 0:
                OcMainFragment ocMainFragment = this.f44575b;
                Object value = ocMainFragment.f30452M.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = ocMainFragment.getResources().getDimensionPixelSize(q.dp36);
                    linearLayout.setLayoutParams(layoutParams2);
                    linearLayout.setBackground(null);
                }
                break;
            default:
                Object value2 = this.f44575b.f30446A.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                LinearLayout linearLayout2 = (LinearLayout) value2;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        switch (this.f44574a) {
            case 0:
                OcMainFragment ocMainFragment = this.f44575b;
                Object value = ocMainFragment.f30452M.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value;
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = ocMainFragment.getResources().getDimensionPixelSize(q.dp107);
                    linearLayout.setLayoutParams(layoutParams2);
                    linearLayout.setBackgroundResource(d.cs_oc_finance_bg);
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
