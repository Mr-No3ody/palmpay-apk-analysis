package androidx.work.impl.foreground;

import E0.h;
import V0.C;
import V0.C0697p;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.provider.m;
import androidx.lifecycle.AbstractServiceC1213x;
import androidx.work.impl.s;
import androidx.work.impl.utils.k;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39801b})
public class SystemForegroundService extends AbstractServiceC1213x implements SystemForegroundDispatcher$Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18548e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f18550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationManager f18551d;

    static {
        C.d("SystemFgService");
    }

    public final void a() {
        this.f18551d = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f18550c = aVar;
        if (aVar.f18561j != null) {
            C.c().a(a.f18552o, "A callback already exists.");
        } else {
            aVar.f18561j = this;
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public final void cancelNotification(int i7) {
        this.f18551d.cancel(i7);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public final void notify(int i7, Notification notification) {
        this.f18551d.notify(i7, notification);
    }

    @Override // androidx.lifecycle.AbstractServiceC1213x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC1213x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f18550c.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        if (this.f18549b) {
            C.c().getClass();
            this.f18550c.c();
            a();
            this.f18549b = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f18550c;
        aVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C c6 = C.c();
            Objects.toString(intent);
            c6.getClass();
            aVar.f18554b.executeOnTaskThread(new m(aVar, 1, intent.getStringExtra("KEY_WORKSPEC_ID"), false));
            aVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C.c().getClass();
            SystemForegroundService systemForegroundService = aVar.f18561j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.stop(i10);
            return 3;
        }
        C c10 = C.c();
        Objects.toString(intent);
        c10.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID id2 = UUID.fromString(stringExtra);
        s workManagerImpl = aVar.f18553a;
        workManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        C0697p c0697p = workManagerImpl.f18676c.f9934o;
        k kVar = workManagerImpl.f18678e.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        p002a.a.q(c0697p, "CancelWorkById", kVar, new h(2, workManagerImpl, id2));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i7) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f18550c.d(i7, 2048);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public final void startForeground(int i7, int i10, Notification notification) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            b.b(this, i7, notification, i10);
        } else if (i11 >= 29) {
            b.a(this, i7, notification, i10);
        } else {
            startForeground(i7, notification);
        }
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher$Callback
    public final void stop(int i7) {
        this.f18549b = true;
        C.c().getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf(i7);
    }

    public final void onTimeout(int i7, int i10) {
        this.f18550c.d(i7, i10);
    }
}
