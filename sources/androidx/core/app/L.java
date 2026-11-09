package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f15934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15935c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f15936d = new HashSet();

    public L(Context context) {
        this.f15933a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f15934b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(K k2) {
        boolean z3;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = k2.f15928a;
        if (zIsLoggable) {
            Objects.toString(componentName);
            k2.f15931d.size();
        }
        if (k2.f15931d.isEmpty()) {
            return;
        }
        if (k2.f15929b) {
            z3 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f15933a;
            boolean zBindService = context.bindService(component, this, 33);
            k2.f15929b = zBindService;
            if (zBindService) {
                k2.f15932e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z3 = k2.f15929b;
        }
        if (!z3 || k2.f15930c == null) {
            b(k2);
            return;
        }
        while (true) {
            arrayDeque = k2.f15931d;
            NotificationManagerCompat$Task notificationManagerCompat$Task = (NotificationManagerCompat$Task) arrayDeque.peek();
            if (notificationManagerCompat$Task == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    notificationManagerCompat$Task.toString();
                }
                notificationManagerCompat$Task.send(k2.f15930c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(k2);
    }

    public final void b(K k2) {
        Handler handler = this.f15934b;
        ComponentName componentName = k2.f15928a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = k2.f15932e;
        int i10 = i7 + 1;
        k2.f15932e = i10;
        if (i10 <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i7) * 1000);
            return;
        }
        ArrayDeque arrayDeque = k2.f15931d;
        arrayDeque.size();
        Objects.toString(componentName);
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        INotificationSideChannel iNotificationSideChannel = null;
        if (i7 == 0) {
            NotificationManagerCompat$Task notificationManagerCompat$Task = (NotificationManagerCompat$Task) message.obj;
            String string = Settings.Secure.getString(this.f15933a.getContentResolver(), "enabled_notification_listeners");
            synchronized (M.f15937c) {
                if (string != null) {
                    try {
                        if (!string.equals(M.f15938d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            M.f15939e = hashSet2;
                            M.f15938d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = M.f15939e;
            }
            if (!hashSet.equals(this.f15936d)) {
                this.f15936d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f15933a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f15935c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f15935c.put(componentName2, new K(componentName2));
                    }
                }
                Iterator it = this.f15935c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        K k2 = (K) entry.getValue();
                        if (k2.f15929b) {
                            this.f15933a.unbindService(this);
                            k2.f15929b = false;
                        }
                        k2.f15930c = null;
                        it.remove();
                    }
                }
            }
            for (K k8 : this.f15935c.values()) {
                k8.f15931d.add(notificationManagerCompat$Task);
                a(k8);
            }
        } else if (i7 == 1) {
            J j6 = (J) message.obj;
            ComponentName componentName3 = j6.f15926a;
            IBinder iBinder = j6.f15927b;
            K k10 = (K) this.f15935c.get(componentName3);
            if (k10 != null) {
                int i10 = p089g.b.f36804a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.f11979g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) {
                        p089g.a aVar = new p089g.a();
                        aVar.f36803a = iBinder;
                        iNotificationSideChannel = aVar;
                    } else {
                        iNotificationSideChannel = (INotificationSideChannel) iInterfaceQueryLocalInterface;
                    }
                }
                k10.f15930c = iNotificationSideChannel;
                k10.f15932e = 0;
                a(k10);
                return true;
            }
        } else if (i7 == 2) {
            K k11 = (K) this.f15935c.get((ComponentName) message.obj);
            if (k11 != null) {
                if (k11.f15929b) {
                    this.f15933a.unbindService(this);
                    k11.f15929b = false;
                }
                k11.f15930c = null;
                return true;
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            K k12 = (K) this.f15935c.get((ComponentName) message.obj);
            if (k12 != null) {
                a(k12);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f15934b.obtainMessage(1, new J(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f15934b.obtainMessage(2, componentName).sendToTarget();
    }
}
