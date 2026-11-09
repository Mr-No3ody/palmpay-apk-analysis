package com.transsnet.palmpay.core.service;

import android.app.IntentService;
import android.content.Intent;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import p045d3.k;

/* JADX INFO: loaded from: classes3.dex */
public class RequestContactDeleteService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f27404a;

    public RequestContactDeleteService() {
        super("RequestContactDeleteService");
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f27404a = new k(this);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        ((RequestContactDao) this.f27404a.f35518b).delete((RequestContact) d0.l(RequestContact.class, intent.getStringExtra("contact_info")));
    }
}
