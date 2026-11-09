package F5;

import android.content.Intent;
import android.util.Log;
import com.masteratul.exceptionhandler.ReactNativeExceptionHandlerModule;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReactNativeExceptionHandlerModule f2594c;

    public e(ReactNativeExceptionHandlerModule reactNativeExceptionHandlerModule, boolean z3, boolean z8) {
        this.f2594c = reactNativeExceptionHandlerModule;
        this.f2592a = z3;
        this.f2593b = z8;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        ReactNativeExceptionHandlerModule reactNativeExceptionHandlerModule = this.f2594c;
        reactNativeExceptionHandlerModule.callbackHolder.invoke(stackTraceString);
        if (ReactNativeExceptionHandlerModule.nativeExceptionHandler != null) {
            ReactNativeExceptionHandlerModule.nativeExceptionHandler.handleNativeException(thread, th, reactNativeExceptionHandlerModule.originalHandler);
            return;
        }
        reactNativeExceptionHandlerModule.activity = reactNativeExceptionHandlerModule.getCurrentActivity();
        Intent intent = new Intent();
        intent.setClass(reactNativeExceptionHandlerModule.activity, ReactNativeExceptionHandlerModule.errorIntentTargetClass);
        intent.putExtra("stack_trace_string", stackTraceString);
        intent.setFlags(268435456);
        reactNativeExceptionHandlerModule.activity.startActivity(intent);
        reactNativeExceptionHandlerModule.activity.finish();
        if (this.f2592a && reactNativeExceptionHandlerModule.originalHandler != null) {
            reactNativeExceptionHandlerModule.originalHandler.uncaughtException(thread, th);
        }
        if (this.f2593b) {
            System.exit(0);
        }
    }
}
