package Ld;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.transsnet.palmpay.service.PushMainService;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PushMainService f5654a;

    public c(PushMainService pushMainService) {
        this.f5654a = pushMainService;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        F6.d.h("aidl-service-main", 5, "push service connected");
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f5654a, 0);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        F6.d.h("aidl-service-main", 5, "push service disconnected");
        PushMainService.a aVar = PushMainService.f34093f;
        this.f5654a.b();
    }
}
