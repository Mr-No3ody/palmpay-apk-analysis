package com.transsnet.palmpay.core.service;

import C0.G;
import F6.d;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.O;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import p045d3.k;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public class RequestContactService extends O {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27405j = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f27406i;

    @Override // androidx.core.app.O
    public final void e(Intent intent) {
        RequestContact requestContact = (RequestContact) d0.l(RequestContact.class, intent.getStringExtra("contact_info"));
        if (requestContact == null) {
            return;
        }
        if (!TextUtils.isEmpty(requestContact.getContactsMemberId()) && !TextUtils.isEmpty(requestContact.getMemberId())) {
            try {
                ((RequestContactDao) this.f27406i.f35518b).insert(requestContact);
            } catch (Exception e10) {
                d.c("RequestContactService", "insertContact failed", e10);
            }
        }
        if (TextUtils.isEmpty(requestContact.getContactsMemberId()) || a.d().f44149a.getString("key_new_contact_request_member", "").contains(requestContact.getContactsMemberId())) {
            return;
        }
        int i7 = a.d().f44149a.getInt("key_new_contact_request_num", 0);
        a.d().f44149a.f(i7 + 1, "key_new_contact_request_num");
        String string = a.d().f44149a.getString("key_new_contact_request_member", "");
        a aVarD = a.d();
        StringBuilder sbT = G.t(string, "_");
        sbT.append(requestContact.getContactsMemberId());
        aVarD.f44149a.i("key_new_contact_request_member", sbT.toString());
    }

    @Override // androidx.core.app.O, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f27406i = new k(this);
    }
}
