package p7;

import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends GuardedAsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f41259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncStorageModule f41260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AsyncStorageModule asyncStorageModule, ReactApplicationContext reactApplicationContext, Callback callback) {
        super(reactApplicationContext);
        this.f41260b = asyncStorageModule;
        this.f41259a = callback;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        Callback callback = this.f41259a;
        AsyncStorageModule asyncStorageModule = this.f41260b;
        asyncStorageModule.mReactDatabaseSupplier.c();
        try {
            g gVar = asyncStorageModule.mReactDatabaseSupplier;
            synchronized (gVar) {
                gVar.d().delete("catalystLocalStorage", null, null);
            }
            callback.invoke(new Object[0]);
        } catch (Exception e10) {
            p229p2.a.w("ReactNative", e10.getMessage(), e10);
            callback.invoke(n.n(e10.getMessage()));
        }
    }
}
