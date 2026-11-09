package Da;

import V0.H;
import V0.I;
import android.app.Activity;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.P0;
import androidx.camera.video.C;
import androidx.camera.video.VideoOutput;
import androidx.lifecycle.F;
import androidx.work.Operation;
import androidx.work.Tracer;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.core.web.JsInterface;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashSet;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1731f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1726a = i7;
        this.f1728c = obj;
        this.f1727b = obj2;
        this.f1729d = obj3;
        this.f1730e = obj4;
        this.f1731f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1731f;
        Object obj2 = this.f1730e;
        Object obj3 = this.f1727b;
        Object obj4 = this.f1729d;
        Object obj5 = this.f1728c;
        switch (this.f1726a) {
            case 0:
                PPRNBridge.commonShareDialog$lambda$15((Activity) obj5, (String) obj3, (String) obj4, (String) obj2, (PPRNBridge) obj);
                return;
            case 1:
                String str = (String) obj3;
                Function0 function0 = (Function0) obj4;
                F f10 = (F) obj2;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) obj;
                Tracer tracer = (Tracer) obj5;
                boolean zIsEnabled = tracer.isEnabled();
                if (zIsEnabled) {
                    try {
                        tracer.beginSection(str);
                    } catch (Throwable th) {
                        if (zIsEnabled) {
                            tracer.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    function0.invoke();
                    I i7 = Operation.f18343f0;
                    f10.i(i7);
                    kVar.b(i7);
                    break;
                } catch (Throwable th2) {
                    f10.i(new H(th2));
                    kVar.d(th2);
                }
                Unit unit = Unit.f38893a;
                if (zIsEnabled) {
                    tracer.endSection();
                    return;
                }
                return;
            case 2:
                HashSet hashSet = JsInterface.f28583f;
                Activity topActivity = ActivityUtils.getTopActivity();
                if (topActivity != null) {
                    if (((String) obj3).equals(topActivity.getLocalClassName())) {
                        ShareDialog shareDialog = new ShareDialog(topActivity);
                        shareDialog.setH5ShareText(Integer.parseInt((String) obj4), (String) obj2, (String) obj);
                        shareDialog.setOnDismissListener(new Dd.b((Activity) obj5, 12));
                        shareDialog.show();
                        return;
                    }
                    return;
                }
                return;
            default:
                C c6 = (C) obj5;
                CameraInternal cameraInternal = (CameraInternal) obj4;
                if (cameraInternal == c6.b()) {
                    c6.t = ((androidx.camera.core.processing.m) obj3).d(cameraInternal, true);
                    VideoOutput videoOutput = (VideoOutput) ((androidx.camera.video.impl.a) obj2).retrieveOption(androidx.camera.video.impl.a.f14607b);
                    Objects.requireNonNull(videoOutput);
                    videoOutput.onSurfaceRequested(c6.t, (P0) obj);
                    c6.N();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, Activity activity) {
        this.f1726a = 2;
        this.f1727b = str;
        this.f1729d = str2;
        this.f1730e = str3;
        this.f1731f = str4;
        this.f1728c = activity;
    }
}
