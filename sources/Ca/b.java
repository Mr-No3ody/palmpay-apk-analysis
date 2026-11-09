package Ca;

import android.app.Application;
import android.os.Build;
import com.alibaba.android.alpha.Task;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.rnbridge.PreloadReactNativeInitTask;
import com.transsnet.palmpay.util.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreloadReactNativeInitTask f1341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f1342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PreloadReactNativeInitTask preloadReactNativeInitTask, Application application, String str) {
        super(str);
        this.f1341a = preloadReactNativeInitTask;
        this.f1342b = application;
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        Application application = this.f1342b;
        PreloadReactNativeInitTask preloadReactNativeInitTask = this.f1341a;
        BaseInitTask.beginSection$default(preloadReactNativeInitTask, null, 1, null);
        try {
            f.a(application);
            DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(application.getApplicationContext());
            if (Build.VERSION.SDK_INT != 34 && (deviceLevel == DeviceUtils.LEVEL.BEST || deviceLevel == DeviceUtils.LEVEL.HIGH)) {
                preloadReactNativeInitTask.preload();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        BaseInitTask.endSection$default(preloadReactNativeInitTask, null, 1, null);
    }
}
