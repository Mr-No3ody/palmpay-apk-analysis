package com.bumptech.glide.load.resource.gif;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f20998a;

    public g(h hVar) {
        this.f20998a = hVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        h hVar = this.f20998a;
        if (i7 == 1) {
            hVar.b((f) message.obj);
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        hVar.f21002d.e((f) message.obj);
        return false;
    }
}
