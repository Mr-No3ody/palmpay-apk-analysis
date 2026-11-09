package com.transsnet.palmpay.service;

import C0.G;
import Ld.d;
import Ld.e;
import Oe.f;
import Pa.C0525w;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.M;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.aidl.IEventInterface;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/service/PushSubService;", "Landroid/app/Service;", "Landroid/os/IBinder$DeathRecipient;", "<init>", "()V", "Ld/d", "Ld/e", "a", "lib_push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushSubService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushSubService.kt\ncom/transsnet/palmpay/service/PushSubService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1#2:283\n*E\n"})
public final class PushSubService extends Service implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34100f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static PushSubService f34101g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IEventInterface f34103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f34104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f34105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f34106e = new CopyOnWriteArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final synchronized PushSubService getInstance() {
            return PushSubService.f34101g;
        }

        private a() {
        }
    }

    public final void a(Msg msg) {
        synchronized (this) {
            try {
                F6.d.h("aidl-service-push", 2, "push service notify code:" + Integer.valueOf(msg.code) + " message:" + msg.message);
                IEventInterface iEventInterface = this.f34103b;
                StringBuilder sb2 = new StringBuilder("iEventInterface = ");
                sb2.append(iEventInterface);
                F6.d.h("aidl-service-push", 5, sb2.toString());
                try {
                    if (this.f34102a) {
                        F6.d.h("aidl-service-push", 5, "main service alive and iEventInterface = " + this.f34103b);
                        IEventInterface iEventInterface2 = this.f34103b;
                        if (iEventInterface2 != null) {
                            iEventInterface2.notify(msg);
                            Unit unit = Unit.f38893a;
                        } else {
                            this.f34106e.add(msg);
                            Unit unit2 = Unit.f38893a;
                        }
                    } else {
                        F6.d.h("aidl-service-push", 5, "main service not alive, save message");
                        this.f34106e.add(msg);
                        Unit unit3 = Unit.f38893a;
                    }
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                    Unit unit4 = Unit.f38893a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            startService(new Intent(this, (Class<?>) PushMainService.class));
            d dVar = this.f34105d;
            if (dVar != null) {
                F6.d.h("aidl-service-push", 5, "start bind main service ");
                bindService(new Intent(this, (Class<?>) PushMainService.class), dVar, 1);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f34104c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        F6.d.h("aidl-service-push", 5, G.o("push service onCreate ", getPackageName()));
        f34101g = this;
        this.f34104c = new e(this);
        d dVar = new d(this);
        this.f34105d = dVar;
        F6.d.h("aidl-service-push", 5, "start bind main service ");
        bindService(new Intent(this, (Class<?>) PushMainService.class), dVar, 1);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f34101g = null;
        try {
            d dVar = this.f34105d;
            if (dVar != null) {
                unbindService(dVar);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        PushMessage pushMessage;
        Notification notificationB;
        F6.d.h("aidl-service-push", 5, "push service onStartCommand");
        if (intent != null) {
            String stringExtra = intent.getStringExtra("PUSH_MESSAGE_FOR_SERVICE");
            if (stringExtra != null && stringExtra.length() != 0 && (pushMessage = (PushMessage) d0.l(PushMessage.class, stringExtra)) != null) {
                if (pushMessage.startForegroundNotification) {
                    int i11 = Oe.d.f6840a;
                    pushMessage.notifyId = 3;
                    int i12 = pushMessage.notificationType;
                    if (i12 == 101) {
                        f.f6842a.get().getClass();
                        notificationB = f.b(pushMessage);
                    } else if (i12 != 102) {
                        notificationB = null;
                    } else {
                        f.f6842a.get().getClass();
                        notificationB = f.a(pushMessage);
                    }
                    if (notificationB != null) {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 >= 26) {
                            M m7 = new M(this);
                            Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
                            m7.b(3, notificationB);
                            try {
                                if (i13 >= 29) {
                                    startForeground(3, notificationB, 2);
                                } else {
                                    startForeground(3, notificationB);
                                }
                            } catch (Exception e10) {
                                F6.d.c("aidl-service-push", "startService: ", e10);
                            }
                        } else {
                            startForeground(3, new Notification());
                        }
                    }
                }
                if (pushMessage.notificationType > 0) {
                    a(new Msg(pushMessage.notificationType, ((Gson) C0525w.f().f7166b).toJson(pushMessage)));
                }
            }
            String stringExtra2 = intent.getStringExtra("KEY_REFRESH_TOKEN");
            if (stringExtra2 != null) {
                String str = TextUtils.isEmpty(stringExtra2) ? null : stringExtra2;
                if (str != null) {
                    a(new Msg(100, str));
                }
            }
        }
        d dVar = this.f34105d;
        if (dVar != null) {
            F6.d.h("aidl-service-push", 5, "start bind main service ");
            bindService(new Intent(this, (Class<?>) PushMainService.class), dVar, 1);
        }
        return 1;
    }
}
