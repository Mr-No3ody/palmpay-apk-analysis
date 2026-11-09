package O8;

import N8.C0457a;
import Pa.F;
import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.text.TextUtils;
import androidx.camera.camera2.internal.C0944o;
import androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import com.transsnet.palmpay.account.bean.req.ApplyT3QuotaReq;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Argument2Callback, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6679b;

    public /* synthetic */ a(long j6, Object obj) {
        this.f6679b = obj;
        this.f6678a = j6;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final k kVar) {
        C0944o c0944o = (C0944o) this.f6679b;
        c0944o.getClass();
        final long j6 = this.f6678a;
        c0944o.a(new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.l
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                if (!C0944o.h(totalCaptureResult, j6)) {
                    return false;
                }
                kVar.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j6;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        if (((Integer) obj).intValue() != -1) {
            int i7 = Tier3QuotaManageActivity.f26091f;
            return;
        }
        Tier3QuotaManageActivity tier3QuotaManageActivity = (Tier3QuotaManageActivity) this.f6679b;
        ApplyT3QuotaReq applyT3QuotaReq = tier3QuotaManageActivity.f26093d;
        applyT3QuotaReq.transactionLimit = this.f6678a;
        String stringExtra = intent != null ? intent.getStringExtra("extra_data") : null;
        applyT3QuotaReq.pin = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            ToastUtils.showLong("Operation fail", new Object[0]);
            return;
        }
        Intent intentA = F.a(tier3QuotaManageActivity, "/main/palm_safe_scan_face");
        if (intentA != null) {
            intentA.putExtra("extra_data", true);
            intentA.putExtra("extra_type", 25);
            intentA.putExtra("extra_use_night_mode", true);
            tier3QuotaManageActivity.f26092c.f(intentA, new C0457a(tier3QuotaManageActivity, 7));
        }
    }
}
