package H0;

import E.C0206k;
import Pa.C0505b;
import Uc.W;
import Uc.Y;
import android.app.Dialog;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.activity.C0820k;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.camera2.internal.A0;
import androidx.camera.camera2.internal.C0942n;
import androidx.camera.camera2.internal.C0944o;
import androidx.camera.camera2.internal.C0963y;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.camera.camera2.internal.j1;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1004t;
import androidx.camera.core.impl.CameraCaptureResult;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.modules.toast.ToastModule;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3537d;

    public /* synthetic */ a(int i7, Object obj, Object obj2, int i10) {
        this.f3534a = i10;
        this.f3535b = i7;
        this.f3536c = obj;
        this.f3537d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3534a) {
            case 0:
                ((b) this.f3536c).f3539b.onResultReceived(this.f3535b, (Serializable) this.f3537d);
                return;
            case 1:
                int i7 = Screen.f25275A0;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3536c;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
                int i10 = this.f3535b;
                bottomSheetBehavior.setMaxHeight(i10);
                Screen screen = (Screen) this.f3537d;
                screen.layout(screen.getLeft(), screen.getBottom() - i10, screen.getRight(), screen.getBottom());
                return;
            case 2:
                int i11 = MapPage.f32859u0;
                MapPage mapPage = (MapPage) this.f3536c;
                if (this.f3535b == mapPage.s().f9606b) {
                    W wR = mapPage.r();
                    LatLng latLng = (LatLng) this.f3537d;
                    wR.d(latLng.longitude, latLng.latitude);
                    mapPage.s().f9606b = 0;
                    return;
                }
                return;
            case 3:
                Y y8 = (Y) this.f3536c;
                if (this.f3535b == y8.f9607c) {
                    try {
                        y8.b().clear();
                        break;
                    } catch (Exception unused) {
                    }
                    y8.f9607c = 0;
                    ((Function0) this.f3537d).invoke();
                    return;
                }
                return;
            case 4:
                C0820k this$0 = (C0820k) this.f3536c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Serializable serializable = ((p177m.a) this.f3537d).f39404a;
                String str = (String) this$0.f12061a.get(Integer.valueOf(this.f3535b));
                if (str == null) {
                    return;
                }
                androidx.activity.result.c cVar = (androidx.activity.result.c) this$0.f12065e.get(str);
                if ((cVar != null ? cVar.f12052a : null) == null) {
                    this$0.f12067g.remove(str);
                    this$0.f12066f.put(str, serializable);
                    return;
                }
                ActivityResultCallback activityResultCallback = cVar.f12052a;
                Intrinsics.f(activityResultCallback, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                if (this$0.f12064d.remove(str)) {
                    activityResultCallback.onActivityResult(serializable);
                    return;
                }
                return;
            case 5:
                C0820k this$1 = (C0820k) this.f3536c;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                IntentSender.SendIntentException e10 = (IntentSender.SendIntentException) this.f3537d;
                Intrinsics.checkNotNullParameter(e10, "$e");
                this$1.a(this.f3535b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e10));
                return;
            case 6:
                ((AbstractC0999q) this.f3536c).c(this.f3535b, (C1004t) this.f3537d);
                return;
            case 7:
                ((AbstractC0999q) this.f3536c).b(this.f3535b, (CameraCaptureResult) this.f3537d);
                return;
            case 8:
                j1 j1Var = (j1) this.f3536c;
                boolean z3 = j1Var.f13567c;
                final androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f3537d;
                if (!z3) {
                    C0505b c0505b = (C0505b) j1Var.f13568d;
                    synchronized (c0505b.f7073c) {
                        c0505b.f7072b = 0;
                        break;
                    }
                    kVar.d(new C0206k("Camera is not active."));
                    return;
                }
                j1Var.a();
                p118hf.a.k(((androidx.concurrent.futures.k) j1Var.f13569e) == null, "mRunningCompleter should be null when starting set a new exposure compensation value");
                p118hf.a.k(((A0) j1Var.f13570f) == null, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
                final int i12 = this.f3535b;
                Camera2CameraControlImpl$CaptureResultListener camera2CameraControlImpl$CaptureResultListener = new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.A0
                    @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
                        int i13 = i12;
                        androidx.concurrent.futures.k kVar2 = kVar;
                        if (num == null || num2 == null) {
                            if (num2 == null || num2.intValue() != i13) {
                                return false;
                            }
                            kVar2.b(Integer.valueOf(i13));
                            return true;
                        }
                        int iIntValue = num.intValue();
                        if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i13) {
                            return false;
                        }
                        kVar2.b(Integer.valueOf(i13));
                        return true;
                    }
                };
                j1Var.f13570f = camera2CameraControlImpl$CaptureResultListener;
                j1Var.f13569e = kVar;
                C0944o c0944o = j1Var.f13565a;
                c0944o.a(camera2CameraControlImpl$CaptureResultListener);
                c0944o.k();
                return;
            case 9:
                ((CameraCaptureSession.CaptureCallback) ((C0942n) this.f3536c).f13600b).onCaptureSequenceAborted((CameraCaptureSession) this.f3537d, this.f3535b);
                return;
            case 10:
                ((CameraDevice.StateCallback) ((C0963y) this.f3536c).f13689b).onError((CameraDevice) this.f3537d, this.f3535b);
                return;
            case 11:
                HomeActivity.a aVar = HomeActivity.f34463H;
                ((HomeActivity) this.f3536c).p().showDialog((Dialog) this.f3537d, this.f3535b);
                return;
            case 12:
                ((HeadlessJsTaskContext) this.f3536c).startTask((HeadlessJsTaskConfig) this.f3537d, this.f3535b);
                return;
            default:
                ToastModule.show$lambda$0((ToastModule) this.f3536c, (String) this.f3537d, this.f3535b);
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i7, Object obj2, int i10) {
        this.f3534a = i10;
        this.f3536c = obj;
        this.f3535b = i7;
        this.f3537d = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i7, int i10) {
        this.f3534a = i10;
        this.f3536c = obj;
        this.f3537d = obj2;
        this.f3535b = i7;
    }
}
