package D;

import Ae.n;
import E.AbstractC0198c;
import E.C0206k;
import M7.v;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.camera2.internal.C0936k;
import androidx.camera.camera2.internal.C0944o;
import androidx.camera.camera2.internal.J;
import androidx.camera.core.impl.utils.executor.i;
import androidx.camera.core.impl.utils.futures.j;
import androidx.concurrent.futures.k;
import androidx.core.view.w0;
import com.facebook.react.devsupport.DebugOverlayController;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.flexibank.sdk.core.viewmodel.FlexiBankOneTimeCodeView;
import com.google.android.material.internal.ViewUtils;
import com.swmansion.rnscreens.ScreenFragment;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeSimpleView;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1573c;

    public /* synthetic */ b(Object obj, boolean z3, int i7) {
        this.f1571a = i7;
        this.f1573c = obj;
        this.f1572b = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 8;
        int i10 = 0;
        switch (this.f1571a) {
            case 0:
                d dVar = (d) this.f1573c;
                boolean z3 = dVar.f1577a;
                boolean z8 = this.f1572b;
                if (z3 != z8) {
                    dVar.f1577a = z8;
                    if (!z8) {
                        C0206k c0206k = new C0206k("The camera control has became inactive.");
                        k kVar = (k) dVar.f1583g;
                        if (kVar != null) {
                            kVar.d(c0206k);
                            dVar.f1583g = null;
                        }
                    } else if (dVar.f1578b) {
                        C0944o c0944o = (C0944o) dVar.f1579c;
                        c0944o.getClass();
                        j.e(AbstractC0198c.y(new C0936k(c0944o, i10))).addListener(new n(dVar, i7), (i) dVar.f1580d);
                        dVar.f1578b = false;
                    }
                    break;
                }
                break;
            case 1:
                ScreenFragment.a aVar = ScreenFragment.f25321i;
                boolean z10 = this.f1572b;
                ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragment) this.f1573c;
                screenFragmentWrapper.getClass();
                if (!z10) {
                    screenFragmentWrapper.dispatchLifecycleEvent(v.f5857b, screenFragmentWrapper);
                    screenFragmentWrapper.dispatchTransitionProgressEvent(0.0f, false);
                } else {
                    screenFragmentWrapper.dispatchLifecycleEvent(v.f5856a, screenFragmentWrapper);
                    screenFragmentWrapper.dispatchTransitionProgressEvent(1.0f, false);
                }
                break;
            case 2:
                w0 w0Var = (w0) this.f1573c;
                boolean z11 = this.f1572b;
                org.chromium.support_lib_boundary.util.b bVar = w0Var.f16298a;
                if (!z11) {
                    bVar.k0(1);
                } else {
                    bVar.G(1);
                }
                break;
            case 3:
                ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = (ModelEnterPhoneNumber1) this.f1573c;
                if (!this.f1572b || TextUtils.isEmpty(modelEnterPhoneNumber1.f28343c.getText().toString())) {
                    modelEnterPhoneNumber1.f28347g.setVisibility(8);
                    modelEnterPhoneNumber1.f28348i.setVisibility(0);
                    modelEnterPhoneNumber1.f28344d.setVisibility(0);
                } else {
                    modelEnterPhoneNumber1.f28347g.setVisibility(0);
                    modelEnterPhoneNumber1.f28348i.setVisibility(8);
                    modelEnterPhoneNumber1.f28344d.setVisibility(8);
                }
                if (modelEnterPhoneNumber1.f28350o) {
                    modelEnterPhoneNumber1.f28348i.setVisibility(8);
                }
                break;
            case 4:
                ((OneTimeCodeSimpleView) this.f1573c).setSendOtcButtonStateInternal(this.f1572b);
                break;
            case 5:
                ((OneTimeCodeV2View) this.f1573c).setSendOtcButtonStateInternal(this.f1572b);
                break;
            case 6:
                ((OneTimeCodeV3View) this.f1573c).setSendOtcButtonStateInternal(this.f1572b);
                break;
            case 7:
                ((OneTimeCodeV4View) this.f1573c).setSendOtcButtonStateInternal(this.f1572b);
                break;
            case 8:
                OneTimeCodeV5View.c((OneTimeCodeV5View) this.f1573c, this.f1572b);
                break;
            case 9:
                ((OneTimeCodeView) this.f1573c).setSendOtcButtonStateInternal(this.f1572b);
                break;
            case 10:
                J j6 = (J) this.f1573c;
                boolean z12 = this.f1572b;
                j6.f13196w0 = z12;
                if (z12 && j6.f13166B0 == 4) {
                    j6.v(false);
                    break;
                }
                break;
            case 11:
                DebugOverlayController.setFpsDebugViewVisible$lambda$0(this.f1572b, (DebugOverlayController) this.f1573c);
                break;
            case 12:
                JavaTimerManager.setSendIdleEvents$lambda$7((JavaTimerManager) this.f1573c, this.f1572b);
                break;
            case 13:
                StatusBarModule.setHidden$lambda$1((Activity) this.f1573c, this.f1572b);
                break;
            case 14:
                ViewUtils.showKeyboard((View) this.f1573c, this.f1572b);
                break;
            case 15:
                AdManager.saveAdShowStatus((AdEntity) this.f1573c, this.f1572b);
                break;
            case 16:
                InterstitialAdView.emptyData$lambda$18(this.f1572b, (InterstitialAdView) this.f1573c);
                break;
            default:
                FlexiBankOneTimeCodeView.a((FlexiBankOneTimeCodeView) this.f1573c, this.f1572b);
                break;
        }
    }

    public /* synthetic */ b(boolean z3, Object obj, int i7) {
        this.f1571a = i7;
        this.f1572b = z3;
        this.f1573c = obj;
    }
}
