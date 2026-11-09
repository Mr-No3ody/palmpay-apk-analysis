package Ce;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.rnmaps.maps.MapModule;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep0Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInConfirmPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import java.io.File;
import java.io.FileOutputStream;
import top.zibin.luban.InputStreamProvider;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1427d;

    public /* synthetic */ H() {
        this.f1424a = 18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        View viewResolveView;
        int i7 = 4;
        int i10 = 25;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        switch (this.f1424a) {
            case 0:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(i12, (HomeFragmentHomeTab) this.f1426c, (HomeFragmentHomeTab) this.f1427d));
                return;
            case 1:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(i11, (HomeMeFragment) this.f1426c, (HomeMeFragment) this.f1427d));
                return;
            case 2:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(3, (HomePalmZoneTabV2) this.f1426c, (HomePalmZoneTabV2) this.f1427d));
                return;
            case 3:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(i7, (TransferToBankHomeFragment) this.f1426c, (TransferToBankHomeFragment) this.f1427d));
                return;
            case 4:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(5, (TransferToPalmPayHomeFragment) this.f1426c, (TransferToPalmPayHomeFragment) this.f1427d));
                return;
            case 5:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(13, (VerifySafePinFragment) this.f1426c, (VerifySafePinFragment) this.f1427d));
                return;
            case 6:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(14, (BaseAddGuardianFragment) this.f1426c, (BaseAddGuardianFragment) this.f1427d));
                return;
            case 7:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(15, (IdentityVerificationStep0Fragment) this.f1426c, (IdentityVerificationStep0Fragment) this.f1427d));
                return;
            case 8:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(16, (IdentityVerificationStep1Fragment) this.f1426c, (IdentityVerificationStep1Fragment) this.f1427d));
                return;
            case 9:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(17, (IdentityVerificationStepFace2Fragment) this.f1426c, (IdentityVerificationStepFace2Fragment) this.f1427d));
                return;
            case 10:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(18, (IdentityVerificationUserProfileFragment) this.f1426c, (IdentityVerificationUserProfileFragment) this.f1427d));
                return;
            case 11:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(20, (LogInConfirmPinFragment) this.f1426c, (LogInConfirmPinFragment) this.f1427d));
                return;
            case 12:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(21, (LogInInputMobileFragment) this.f1426c, (LogInInputMobileFragment) this.f1427d));
                return;
            case 13:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(23, (BillPaymentElectricityHomeFragment) this.f1426c, (BillPaymentElectricityHomeFragment) this.f1427d));
                return;
            case 14:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(24, (BillPaymentTvHomeFragment) this.f1426c, (BillPaymentTvHomeFragment) this.f1427d));
                return;
            case 15:
                Ze.e eVar = (Ze.e) this.f1427d;
                try {
                    int i14 = eVar.f11712a;
                    int i15 = eVar.f11712a;
                    String str = eVar.f11719i;
                    if (i14 == -1) {
                        viewResolveView = eVar.t.getWindow().getDecorView().findViewById(R.id.content);
                    } else {
                        UIBlockViewResolver uIBlockViewResolver = (UIBlockViewResolver) this.f1425b;
                        viewResolveView = uIBlockViewResolver != null ? uIBlockViewResolver.resolveView(i14) : ((NativeViewHierarchyManager) this.f1426c).resolveView(i14);
                    }
                    Promise promise = eVar.f11720j;
                    if (viewResolveView == null) {
                        byte[] bArr = Ze.e.f11711w;
                        Log.e("e", "No view found with reactTag: " + i15, new AssertionError());
                        promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + i15);
                        return;
                    }
                    Ze.d dVar = new Ze.d(Ze.e.f11711w);
                    dVar.c(Math.min(viewResolveView.getHeight() * viewResolveView.getWidth() * 4, 32));
                    Ze.e.f11711w = dVar.b();
                    boolean zEquals = "tmpfile".equals(str);
                    int i16 = eVar.f11714c;
                    if (zEquals && -1 == i16) {
                        Ze.e.c(eVar, viewResolveView);
                        return;
                    }
                    if (!"tmpfile".equals(str) || -1 == i16) {
                        if (!MapModule.SNAPSHOT_RESULT_BASE64.equals(str) && !"zip-base64".equals(str)) {
                            if ("data-uri".equals(str)) {
                                Ze.e.b(eVar, viewResolveView);
                                return;
                            }
                            return;
                        }
                        Ze.e.a(eVar, viewResolveView);
                        return;
                    }
                    File file = eVar.f11718g;
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        eVar.e(viewResolveView, fileOutputStream);
                        fileOutputStream.close();
                        promise.resolve(Uri.fromFile(file).toString());
                        return;
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    byte[] bArr2 = Ze.e.f11711w;
                    Log.e("e", "Failed to capture view snapshot", th2);
                    eVar.f11720j.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
                    return;
                }
            case 16:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(i10, (SignUpStep1Fragment) this.f1426c, (SignUpStep1Fragment) this.f1427d));
                return;
            case 17:
                ((Handler) this.f1425b).post(new androidx.camera.core.impl.utils.futures.i(26, (SignUpStepInputPinV2Fragment) this.f1426c, (SignUpStepInputPinV2Fragment) this.f1427d));
                return;
            case 18:
                try {
                    objCall = ((androidx.core.provider.f) this.f1426c).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f1425b).post(new androidx.core.provider.m(i13, (androidx.core.provider.g) this.f1427d, objCall));
                return;
            case 19:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1427d;
                Context context = (Context) this.f1426c;
                Intent intent = (Intent) this.f1425b;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    V0.C c6 = V0.C.c();
                    int i17 = ConstraintProxyUpdateReceiver.f18407a;
                    c6.getClass();
                    androidx.work.impl.utils.i.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    androidx.work.impl.utils.i.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    androidx.work.impl.utils.i.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    androidx.work.impl.utils.i.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 20:
                p152k5.d dVar2 = (p152k5.d) this.f1427d;
                dVar2.c();
                p152k5.g gVar = (p152k5.g) dVar2.f38685g.get((String) this.f1425b);
                if (gVar != null) {
                    ((Object[]) this.f1426c)[0] = gVar.a(dVar2.f38683e);
                    return;
                }
                return;
            case 21:
                ((Object[]) this.f1425b)[0] = ((p152k5.g) this.f1426c).a(((p152k5.d) this.f1427d).f38683e);
                return;
            case 22:
                ((Handler) this.f1425b).post(new androidx.core.provider.m(i10, this, ((AsyncTaskExecutor) this.f1427d).doInBackground((Object[]) this.f1426c)));
                return;
            default:
                InputStreamProvider inputStreamProvider = (InputStreamProvider) this.f1426c;
                ph.e eVar2 = (ph.e) this.f1427d;
                try {
                    Handler handler = eVar2.f41330g;
                    handler.sendMessage(handler.obtainMessage(1));
                    try {
                        File fileA = eVar2.a((Context) this.f1425b, inputStreamProvider);
                        inputStreamProvider.close();
                        Message messageObtainMessage = eVar2.f41330g.obtainMessage(0);
                        messageObtainMessage.arg1 = inputStreamProvider.getIndex();
                        messageObtainMessage.obj = fileA;
                        Bundle bundle = new Bundle();
                        bundle.putString("source", inputStreamProvider.getPath());
                        messageObtainMessage.setData(bundle);
                        eVar2.f41330g.sendMessage(messageObtainMessage);
                        return;
                    } catch (Throwable th3) {
                        inputStreamProvider.close();
                        throw th3;
                    }
                } catch (Exception unused2) {
                    Message messageObtainMessage2 = eVar2.f41330g.obtainMessage(2);
                    messageObtainMessage2.arg1 = inputStreamProvider.getIndex();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", inputStreamProvider.getPath());
                    messageObtainMessage2.setData(bundle2);
                    eVar2.f41330g.sendMessage(messageObtainMessage2);
                    return;
                }
        }
    }

    public /* synthetic */ H(int i7, Object obj, Object obj2, Object obj3, boolean z3) {
        this.f1424a = i7;
        this.f1427d = obj;
        this.f1425b = obj2;
        this.f1426c = obj3;
    }

    public /* synthetic */ H(Object obj, int i7, Object obj2, Object obj3) {
        this.f1424a = i7;
        this.f1425b = obj;
        this.f1426c = obj2;
        this.f1427d = obj3;
    }

    public H(AsyncTaskExecutor asyncTaskExecutor, Object[] objArr, Handler handler) {
        this.f1424a = 22;
        this.f1427d = asyncTaskExecutor;
        this.f1426c = objArr;
        this.f1425b = handler;
    }
}
