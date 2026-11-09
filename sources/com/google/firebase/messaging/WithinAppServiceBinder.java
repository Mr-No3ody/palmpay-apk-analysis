package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new G0.g(0), new l(bindRequest, 2));
    }
}
