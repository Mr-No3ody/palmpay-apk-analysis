package com.palmpay.lib.bridge;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.flexibank.sdk.g;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d3.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lcom/palmpay/lib/bridge/SyncBridge;", "T", "Lcom/palmpay/lib/bridge/BaseBridge;", "()V", "execute", "", "gson", "Lcom/google/gson/Gson;", "handle", "args", "(Ljava/lang/Object;)V", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class SyncBridge<T> extends BaseBridge<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m107execute$lambda0(SyncBridge this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handle(obj);
    }

    private final void handle(T args) {
        onHandle(args, new k(this, 20));
    }

    @Override // com.palmpay.lib.bridge.BaseBridge, com.palmpay.lib.bridge.IBridge
    public void execute(@Nullable Gson gson) {
        try {
            T args = parseArgs(gson);
            if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                handle(args);
                return;
            }
            Handler mHandler = getMHandler();
            if (mHandler != null) {
                mHandler.post(new g(13, this, args));
            }
        } catch (Exception e10) {
            handleFail(e10);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onStart() {
    }
}
