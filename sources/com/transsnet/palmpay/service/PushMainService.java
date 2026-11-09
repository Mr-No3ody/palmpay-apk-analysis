package com.transsnet.palmpay.service;

import Ae.n;
import F6.d;
import Ld.b;
import Ld.c;
import Pa.T;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.core.app.M;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.aidl.IRemoteCallback;
import com.transsnet.palmpay.aidl.Msg;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.core.provider.IPushModule;
import com.transsnet.palmpay.service.PushMainService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/service/PushMainService;", "Landroid/app/Service;", "Landroid/os/IBinder$DeathRecipient;", "<init>", "()V", "Ld/c", "Ld/b", "a", "lib_push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PushMainService extends Service implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f34093f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static PushMainService f34094g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f34096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RemoteCallbackList f34098d = new RemoteCallbackList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34099e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(a aVar, Context context, boolean z3, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            aVar.start(context, z3);
        }

        @Nullable
        public final synchronized PushMainService getInstance() {
            return PushMainService.f34094g;
        }

        public final void start(@NotNull Context context, boolean z3) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (getInstance() == null) {
                    Intent intent = new Intent(context, (Class<?>) PushMainService.class);
                    intent.putExtra("KEY_LAUNCH_BY_NOTIFICATION", z3);
                    context.startService(intent);
                }
            } catch (Exception unused) {
            }
        }

        private a() {
        }
    }

    public PushMainService() {
        final int i7 = 0;
        this.f34096b = C2131j.b(new Function0(this) { // from class: Ld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushMainService f5652b;

            {
                this.f5652b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PushMainService pushMainService = this.f5652b;
                switch (i7) {
                    case 0:
                        PushMainService.a aVar = PushMainService.f34093f;
                        return new c(pushMainService);
                    case 1:
                        PushMainService.a aVar2 = PushMainService.f34093f;
                        return new b(pushMainService);
                    default:
                        PushMainService.a aVar3 = PushMainService.f34093f;
                        Ea.a.a(pushMainService);
                        return (IPushModule) ARouter.getInstance().navigation(IPushModule.class);
                }
            }
        });
        final int i10 = 1;
        this.f34097c = C2131j.b(new Function0(this) { // from class: Ld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushMainService f5652b;

            {
                this.f5652b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PushMainService pushMainService = this.f5652b;
                switch (i10) {
                    case 0:
                        PushMainService.a aVar = PushMainService.f34093f;
                        return new c(pushMainService);
                    case 1:
                        PushMainService.a aVar2 = PushMainService.f34093f;
                        return new b(pushMainService);
                    default:
                        PushMainService.a aVar3 = PushMainService.f34093f;
                        Ea.a.a(pushMainService);
                        return (IPushModule) ARouter.getInstance().navigation(IPushModule.class);
                }
            }
        });
        final int i11 = 2;
        this.f34099e = C2131j.b(new Function0(this) { // from class: Ld.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushMainService f5652b;

            {
                this.f5652b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PushMainService pushMainService = this.f5652b;
                switch (i11) {
                    case 0:
                        PushMainService.a aVar = PushMainService.f34093f;
                        return new c(pushMainService);
                    case 1:
                        PushMainService.a aVar2 = PushMainService.f34093f;
                        return new b(pushMainService);
                    default:
                        PushMainService.a aVar3 = PushMainService.f34093f;
                        Ea.a.a(pushMainService);
                        return (IPushModule) ARouter.getInstance().navigation(IPushModule.class);
                }
            }
        });
    }

    public final void a(Msg msg) {
        d.h("aidl-service-main", 2, "main service handleMessage:" + msg);
        synchronized (this.f34098d) {
            int iBeginBroadcast = this.f34098d.beginBroadcast();
            for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                try {
                    ((IRemoteCallback) this.f34098d.getBroadcastItem(i7)).notifyEvent(msg);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                    this.f34098d.finishBroadcast();
                    Unit unit = Unit.f38893a;
                }
            }
            this.f34098d.finishBroadcast();
            Unit unit2 = Unit.f38893a;
        }
    }

    public final void b() {
        try {
            this.f34095a = true;
            startService(new Intent(this, (Class<?>) PushSubService.class));
            c cVar = (c) this.f34096b.getValue();
            if (cVar != null) {
                d.h("aidl-service-main", 5, "start bind push service ");
                this.f34095a = true;
                bindService(new Intent(this, (Class<?>) PushSubService.class), cVar, 1);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        b();
    }

    public final void c() {
        stopForeground(1);
        M m7 = new M(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(m7, "from(...)");
        int i7 = Oe.d.f6840a;
        m7.a(3);
        a(new Msg(MsgEvent.MSG_EVENT_STOP_FOREGROUND, ""));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return (b) this.f34097c.getValue();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d.h("aidl-service-main", 5, "main service create");
        f34094g = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f34094g = null;
        d.h("aidl-service-main", 5, "main service destroy");
        try {
            c cVar = (c) this.f34096b.getValue();
            if (cVar != null) {
                unbindService(cVar);
                cVar.onServiceDisconnected(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        d.h("aidl-service-main", 5, "main service onStartCommand");
        T.b(-4).execute(new n(this, 29));
        if (intent != null && intent.getBooleanExtra("KEY_LAUNCH_BY_NOTIFICATION", false)) {
            c();
        }
        return super.onStartCommand(intent, i7, i10);
    }
}
