package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zabc extends com.google.android.gms.internal.base.zao {
    final /* synthetic */ zabd zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabd zabdVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zabdVar);
        this.zaa = zabdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            ((zabb) message.obj).zab(this.zaa);
        } else {
            if (i7 == 2) {
                throw ((RuntimeException) message.obj);
            }
            new StringBuilder(String.valueOf(i7).length() + 20);
        }
    }
}
