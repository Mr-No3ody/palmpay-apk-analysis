package B3;

import C0.G;
import E.V;
import Je.d;
import Y.h;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.imagecapture.n;
import androidx.camera.core.imagecapture.t;
import androidx.camera.core.imagecapture.y;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.video.internal.encoder.v;
import androidx.camera.video.u;
import androidx.camera.view.w;
import androidx.work.impl.model.b;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlay;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.growingio.android.sdk.track.webservices.widget.TipView;
import com.swmansion.rnscreens.Screen;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p039cb.c;
import p140j8.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f363c;

    public /* synthetic */ a(int i7, Object obj, int i10) {
        this.f361a = i10;
        this.f362b = i7;
        this.f363c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ActivityInfo activityInfo;
        int i7 = this.f362b;
        Object obj = this.f363c;
        switch (this.f361a) {
            case 0:
                DebuggingOverlay.onDraw$lambda$1((DebuggingOverlay) obj, i7);
                return;
            case 1:
                ((d) obj).a(i7);
                return;
            case 2:
                int i10 = Screen.f25275A0;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
                bottomSheetBehavior.setMaxHeight(i7);
                return;
            case 3:
                Context context = (Context) obj;
                Bundle bundle = new Bundle();
                bundle.putString("package", AppUtils.getAppPackageName());
                bundle.putString("class", "com.transsnet.palmpay.ui.activity.SplashActivity");
                bundle.putInt("badgenumber", i7);
                try {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                    str = (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) ? activityInfo.packageName : null;
                    break;
                } catch (Exception unused) {
                }
                if (str != null) {
                    try {
                        ContentResolver contentResolver = context.getContentResolver();
                        if (StringsKt.A(str, "hilauncher", false)) {
                            contentResolver.call(Uri.parse("content://com.transsion.hilauncher.unreadprovider"), "change_badge", (String) null, bundle);
                        } else if (StringsKt.A(str, "XOSLauncher", false)) {
                            contentResolver.call(Uri.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", (String) null, bundle);
                        } else if (StringsKt.A(str, "itel.launcher", false)) {
                            contentResolver.call(Uri.parse("content://com.transsion.itel.launcher.unreadprovider"), "change_badge", (String) null, bundle);
                        } else {
                            Unit unit = Unit.f38893a;
                        }
                        return;
                    } catch (Exception e10) {
                        F6.d.h("BadgeUtils", 3, G.o("showUnreadBadge: ", e10.getMessage()));
                        return;
                    }
                }
                return;
            case 4:
                ((h) obj).onFontRetrievalFailed(i7);
                return;
            case 5:
                ((AbstractC0999q) obj).a(i7);
                return;
            case 6:
                Iterator it = ((LinkedHashSet) obj).iterator();
                while (it.hasNext()) {
                    ((SynchronizedCaptureSession) it.next()).onCameraDeviceError(i7);
                }
                return;
            case 7:
                t tVar = ((n) ((V) obj).f1957b).f13773a;
                if (tVar == null || tVar.f13807k == i7) {
                    return;
                }
                tVar.f13807k = i7;
                tVar.f13803g.onCaptureProcessProgressed(i7);
                return;
            case 8:
                y yVar = (y) obj;
                yVar.getClass();
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback = ((androidx.camera.core.imagecapture.h) yVar).f13759d;
                if (imageCapture$OnImageSavedCallback != null) {
                    imageCapture$OnImageSavedCallback.onCaptureProcessProgressed(i7);
                    return;
                }
                return;
            case 9:
                androidx.camera.video.internal.encoder.t tVar2 = (androidx.camera.video.internal.encoder.t) obj;
                boolean z3 = tVar2.f14721j;
                v vVar = tVar2.f14722k;
                if (z3) {
                    f.G(vVar.f14734a);
                    return;
                }
                switch (F.i(vVar.f14733D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        vVar.f14744k.offer(Integer.valueOf(i7));
                        vVar.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u.A(vVar.f14733D)));
                }
            case 10:
                w wVar = (w) obj;
                if (wVar.f15018c.get()) {
                    wVar.f15016a.onRotationChanged(i7);
                    return;
                }
                return;
            case 11:
                ReactInstanceManager.lambda$attachRootViewToInstance$6(i7, (ReactRoot) obj);
                return;
            case 12:
                ReactHostImpl.createMemoryPressureListener$lambda$12$lambda$11((WeakReference) obj, i7);
                return;
            case 13:
                ((SideSheetBehavior) obj).lambda$setState$0(i7);
                return;
            case 14:
                c cVar = (c) obj;
                ((TipView) cVar.f18901b).setErrorMessage(((Context) cVar.f18902c).getResources().getText(i7));
                return;
            case 15:
                b bVar = (b) obj;
                ((TipView) bVar.f18580b).setErrorMessage(((Context) bVar.f18581c).getResources().getText(i7));
                return;
            default:
                ToastUtils.lambda$show$0((CharSequence) obj, i7);
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i7, int i10) {
        this.f361a = i10;
        this.f363c = obj;
        this.f362b = i7;
    }
}
