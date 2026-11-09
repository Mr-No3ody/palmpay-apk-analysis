package com.transsnet.palmpay.account.bean;

import Pa.C0525w;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public class FaceToken {
    private long expiration = System.currentTimeMillis() + 1800000;
    private String phone;
    private String token;

    public FaceToken(String str, String str2) {
        this.token = str;
        this.phone = str2;
    }

    public static String getLastValidToken(String str) {
        FaceToken faceToken;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strI = a.I("account_sp_last_face_token" + str, "");
        if (TextUtils.isEmpty(strI) || (faceToken = (FaceToken) d0.l(FaceToken.class, strI)) == null || TextUtils.isEmpty(faceToken.token) || !str.equalsIgnoreCase(faceToken.phone) || System.currentTimeMillis() > faceToken.expiration) {
            return null;
        }
        return faceToken.token;
    }

    public void saveToken() {
        a.W("account_sp_last_face_token" + this.phone, ((Gson) C0525w.f().f7166b).toJson(this));
    }
}
