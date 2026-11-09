package Ld;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.transsnet.palmpay.aidl.IEventInterface;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.service.PushSubService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PushSubService f5655a;

    public d(PushSubService pushSubService) {
        this.f5655a = pushSubService;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        PushSubService pushSubService = this.f5655a;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        F6.d.h("aidl-service-push", 5, "main service connected");
        try {
            service.linkToDeath(pushSubService, 0);
            pushSubService.f34102a = true;
            pushSubService.f34103b = IEventInterface.Stub.asInterface(service);
            IEventInterface iEventInterface = pushSubService.f34103b;
            if (iEventInterface != null) {
                F6.d.h("aidl-service-push", 5, "IEventInterface register callback");
                iEventInterface.registerCallback(pushSubService.f34104c);
                CopyOnWriteArrayList copyOnWriteArrayList = pushSubService.f34106e;
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                F6.d.h("aidl-service-push", 5, "main service connected, start notify messages");
                Iterator it = copyOnWriteArrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    iEventInterface.notify((Msg) it.next());
                }
                copyOnWriteArrayList.clear();
            }
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        F6.d.h("aidl-service-push", 5, "main service disconnected");
        PushSubService pushSubService = this.f5655a;
        pushSubService.f34102a = false;
        pushSubService.f34103b = null;
    }
}
