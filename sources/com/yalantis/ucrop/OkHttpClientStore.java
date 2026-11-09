package com.yalantis.ucrop;

import androidx.annotation.NonNull;
import okhttp3.U;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpClientStore {
    public static final OkHttpClientStore INSTANCE = new OkHttpClientStore();
    private U client;

    private OkHttpClientStore() {
    }

    @NonNull
    public U getClient() {
        if (this.client == null) {
            this.client = new U();
        }
        return this.client;
    }

    public void setClient(@NonNull U u6) {
        this.client = u6;
    }
}
