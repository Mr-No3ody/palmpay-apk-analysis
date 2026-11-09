package com.palmpay.lib.bridge;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.uimanager.ViewProps;
import com.flexibank.sdk.g;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.palmpay.lib.bridge.entry.BridgeResult;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0014\u0010!\u001a\u00020\u001b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0014\u0010$\u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020'H\u0016J\u0014\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0014\u0010)\u001a\u00020\u001b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020 J\b\u0010,\u001a\u00020\u001bH\u0016J+\u0010,\u001a\u00020\u001b\"\u0004\b\u0001\u0010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u0001H-2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202H\u0016J!\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH$¢\u0006\u0002\u00105J\b\u00106\u001a\u00020\u001bH\u0014J\u0019\u00107\u001a\u0004\u0018\u00018\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010:J\u0014\u0010;\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010:J\u0014\u0010<\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010:J&\u0010=\u001a\u00020\u001b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006>"}, d2 = {"Lcom/palmpay/lib/bridge/BaseBridge;", "T", "Lcom/palmpay/lib/bridge/IBridge;", "Landroid/os/Handler$Callback;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "request", "Lcom/palmpay/lib/bridge/param/BridgeRequestParam;", "getRequest", "()Lcom/palmpay/lib/bridge/param/BridgeRequestParam;", "setRequest", "(Lcom/palmpay/lib/bridge/param/BridgeRequestParam;)V", "execute", "", "gson", "Lcom/google/gson/Gson;", "handleCancel", "message", "", "handleFail", "e", "", "handleIllegalArgument", "handleMessage", "", "Landroid/os/Message;", "handleNotSupport", "handleReject", "handleResult", "result", "handleSuccess", "Entry", "entry", "(Ljava/lang/Object;Ljava/lang/String;)V", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onHandle", "params", "(Ljava/lang/Object;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "onStart", "parseArgs", "(Lcom/google/gson/Gson;)Ljava/lang/Object;", "sendFailMessage", "Lcom/palmpay/lib/bridge/entry/BridgeResult;", "sendRejectMessage", "sendSuccessMessage", ViewProps.START, "lib_bridge_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseBridge<T> implements IBridge, Handler.Callback, DefaultLifecycleObserver {

    @Nullable
    private Activity activity;

    @Nullable
    private IBridgeCallback callback;

    @Nullable
    private Handler mHandler;

    @Nullable
    private BridgeRequestParam request;

    public static /* synthetic */ void handleCancel$default(BaseBridge baseBridge, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCancel");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        baseBridge.handleCancel(str);
    }

    public static /* synthetic */ void handleFail$default(BaseBridge baseBridge, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleFail");
        }
        if ((i7 & 1) != 0) {
            th = null;
        }
        baseBridge.handleFail(th);
    }

    public static /* synthetic */ void handleIllegalArgument$default(BaseBridge baseBridge, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleIllegalArgument");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        baseBridge.handleIllegalArgument(str);
    }

    public static /* synthetic */ void handleNotSupport$default(BaseBridge baseBridge, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleNotSupport");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        baseBridge.handleNotSupport(str);
    }

    public static /* synthetic */ void handleReject$default(BaseBridge baseBridge, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleReject");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        baseBridge.handleReject(str);
    }

    public static /* synthetic */ void handleSuccess$default(BaseBridge baseBridge, Object obj, String str, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSuccess");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        baseBridge.handleSuccess(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: start$lambda-1, reason: not valid java name */
    public static final void m106start$lambda1(Activity activity, BaseBridge this$0) {
        AbstractC1205o lifecycle;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (activity != 0) {
            LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
            if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                return;
            }
            lifecycle.a(this$0);
        }
    }

    @Override // com.palmpay.lib.bridge.IBridge
    public void execute(@Nullable Gson gson) {
        try {
            onHandle(parseArgs(gson), this.callback);
        } catch (Throwable th) {
            handleFail(th);
        }
    }

    @Nullable
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Handler getMHandler() {
        return this.mHandler;
    }

    @Nullable
    public final BridgeRequestParam getRequest() {
        return this.request;
    }

    public void handleCancel(@Nullable String message) {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.cancelResult(message));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResult.cancelResult(message))");
            iBridgeCallback.resolved(json);
        }
    }

    public void handleFail(@Nullable Throwable e10) {
        if (e10 != null) {
            e10.printStackTrace();
        }
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.failResult(e10 != null ? e10.getMessage() : null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResult.failResult(e?.message))");
            iBridgeCallback.resolved(json);
        }
    }

    public void handleIllegalArgument(@Nullable String message) {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.illegalArgumentResult(message));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResu…lArgumentResult(message))");
            iBridgeCallback.resolved(json);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message message) {
        IBridgeCallback iBridgeCallback;
        Intrinsics.checkNotNullParameter(message, "message");
        int i7 = message.what;
        if (i7 == 0) {
            IBridgeCallback iBridgeCallback2 = this.callback;
            if (iBridgeCallback2 == null) {
                return false;
            }
            String json = new Gson().toJson(message.obj);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(message.obj)");
            iBridgeCallback2.resolved(json);
            return false;
        }
        if (i7 != 1) {
            if (i7 != 3 || (iBridgeCallback = this.callback) == null) {
                return false;
            }
            String json2 = new Gson().toJson(message.obj);
            Intrinsics.checkNotNullExpressionValue(json2, "Gson().toJson(message.obj)");
            iBridgeCallback.resolved(json2);
            return false;
        }
        IBridgeCallback iBridgeCallback3 = this.callback;
        if (iBridgeCallback3 == null) {
            return false;
        }
        String json3 = new Gson().toJson(message.obj);
        Intrinsics.checkNotNullExpressionValue(json3, "Gson().toJson(message.obj)");
        iBridgeCallback3.resolved(json3);
        return false;
    }

    public void handleNotSupport(@Nullable String message) {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.notSupportResult(message));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResu…otSupportResult(message))");
            iBridgeCallback.resolved(json);
        }
    }

    public void handleReject(@Nullable String message) {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.rejectResult(message));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResult.rejectResult(message))");
            iBridgeCallback.resolved(json);
        }
    }

    public final void handleResult(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            iBridgeCallback.resolved(result);
        }
    }

    public <Entry> void handleSuccess(@Nullable Entry entry, @Nullable String message) {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.successResult(entry, message));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResu…ssResult(entry, message))");
            iBridgeCallback.resolved(json);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.callback = null;
        this.activity = null;
    }

    public abstract void onHandle(@Nullable T params, @Nullable IBridgeCallback callback);

    public void onStart() {
    }

    @Nullable
    public T parseArgs(@Nullable Gson gson) {
        T t;
        Unit unit;
        Class<?> superclass = getClass();
        Type genericSuperclass = superclass.getGenericSuperclass();
        do {
            if (genericSuperclass == null ? true : genericSuperclass instanceof ParameterizedType) {
                Intrinsics.f(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                Intrinsics.f(type, "null cannot be cast to non-null type java.lang.Class<*>");
                Class cls = (Class) type;
                if (gson != null) {
                    BridgeRequestParam bridgeRequestParam = this.request;
                    t = (T) gson.fromJson((JsonElement) (bridgeRequestParam != null ? bridgeRequestParam.getArgs() : null), (Type) cls);
                } else {
                    t = null;
                }
                if (t == null) {
                    return null;
                }
                return t;
            }
            superclass = superclass != null ? superclass.getSuperclass() : null;
            if (superclass != null) {
                genericSuperclass = superclass.getGenericSuperclass();
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
        } while (unit != null);
        return null;
    }

    public final void sendFailMessage(@Nullable BridgeResult<?> result) {
        Handler handler = this.mHandler;
        Message messageObtainMessage = handler != null ? handler.obtainMessage(1) : null;
        if (messageObtainMessage != null) {
            messageObtainMessage.obj = result;
        }
        if (messageObtainMessage != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void sendRejectMessage(@Nullable BridgeResult<?> result) {
        Handler handler = this.mHandler;
        Message messageObtainMessage = handler != null ? handler.obtainMessage(3) : null;
        if (messageObtainMessage != null) {
            messageObtainMessage.obj = result;
        }
        if (messageObtainMessage != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void sendSuccessMessage(@Nullable BridgeResult<?> result) {
        Handler handler = this.mHandler;
        Message messageObtainMessage = handler != null ? handler.obtainMessage(0) : null;
        if (messageObtainMessage != null) {
            messageObtainMessage.obj = result;
        }
        if (messageObtainMessage != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    public final void setMHandler(@Nullable Handler handler) {
        this.mHandler = handler;
    }

    public final void setRequest(@Nullable BridgeRequestParam bridgeRequestParam) {
        this.request = bridgeRequestParam;
    }

    @Override // com.palmpay.lib.bridge.IBridge
    public void start(@Nullable Activity activity, @Nullable BridgeRequestParam request, @Nullable IBridgeCallback callback) {
        this.activity = activity;
        this.request = request;
        this.callback = callback;
        Handler handler = new Handler(Looper.getMainLooper(), this);
        this.mHandler = handler;
        handler.post(new g(12, activity, this));
        onStart();
    }

    public void handleSuccess() {
        IBridgeCallback iBridgeCallback = this.callback;
        if (iBridgeCallback != null) {
            String json = new Gson().toJson(BridgeResult.INSTANCE.successResult(null, null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResu…uccessResult(null, null))");
            iBridgeCallback.resolved(json);
        }
    }
}
