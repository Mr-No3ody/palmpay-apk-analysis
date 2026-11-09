package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zaax extends com.google.android.gms.internal.base.zao {
    final /* synthetic */ zaaz zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaax(zaaz zaazVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zaazVar);
        this.zaa = zaazVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            this.zaa.zaj();
        } else if (i7 != 2) {
            new StringBuilder(String.valueOf(i7).length() + 20);
        } else {
            this.zaa.zai();
        }
    }
}
