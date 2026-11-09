package com.transsnet.palmpay.core.base;

import android.os.MessageQueue;
import com.transsnet.palmpay.core.init.LateInitGate;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27348a;

    public /* synthetic */ d(int i7) {
        this.f27348a = i7;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.f27348a) {
            case 0:
                LateInitGate.release("idle");
                break;
            default:
                LateInitGate.release("idle");
                break;
        }
        return false;
    }
}
