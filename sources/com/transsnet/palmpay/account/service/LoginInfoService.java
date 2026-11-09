package com.transsnet.palmpay.account.service;

import M8.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.transsnet.palmpay.account.ILoginInfoInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/service/LoginInfoService;", "Landroid/app/Service;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginInfoService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f25809a;

    public LoginInfoService() {
        a aVar = new a();
        aVar.attachInterface(aVar, ILoginInfoInterface.DESCRIPTOR);
        this.f25809a = aVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f25809a;
    }
}
