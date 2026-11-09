package com.transsnet.mtn.sdk.util;

import D3.a;
import E.AbstractC0198c;
import Xe.d;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.common.net.HttpHeaders;
import com.transsnet.mtn.sdk.config.Configuration;
import com.transsnet.mtn.sdk.config.Result;
import com.transsnet.mtn.sdk.ui.GateActivity;
import p073f.c;

/* JADX INFO: loaded from: classes3.dex */
public class Auth {
    public static void go(@NonNull Configuration configuration, @NonNull MTNHandler mTNHandler) {
        if (configuration.auth_id == null) {
            Result result = new Result();
            result.resultCode = 102;
            result.msg = "auth_id must not be null!";
            mTNHandler.result(result);
            return;
        }
        c.a().f36334b = configuration.auth_id;
        AbstractC0198c.b();
        d dVar = AbstractC0198c.f1997f.f11213f;
        String str = "Bearer " + c.a().f36334b;
        dVar.j(HttpHeaders.AUTHORIZATION);
        dVar.e(str, HttpHeaders.AUTHORIZATION);
        c.a().f36336d = configuration.mtn_id;
        c.a().f36338f = configuration.phone;
        c cVarA = c.a();
        String str2 = configuration.agreeUrl;
        if (TextUtils.isEmpty(cVarA.f36335c)) {
            cVarA.f36335c = str2;
        }
        c.a().f36339g = mTNHandler;
        int i7 = GateActivity.f25687b;
        Intent intent = new Intent(a.f1587c, (Class<?>) GateActivity.class);
        intent.setFlags(268435456);
        a.f1587c.startActivity(intent);
    }
}
