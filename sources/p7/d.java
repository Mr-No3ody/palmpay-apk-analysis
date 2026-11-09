package p7;

import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends GuardedAsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f41256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadableArray f41257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncStorageModule f41258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AsyncStorageModule asyncStorageModule, ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
        super(reactApplicationContext);
        this.f41258c = asyncStorageModule;
        this.f41256a = callback;
        this.f41257b = readableArray;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        WritableMap writableMapN;
        ReadableArray readableArray = this.f41257b;
        AsyncStorageModule asyncStorageModule = this.f41258c;
        boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
        Callback callback = this.f41256a;
        if (!zEnsureDatabase) {
            callback.invoke(n.n("Database Error"));
            return;
        }
        try {
            try {
                asyncStorageModule.mReactDatabaseSupplier.d().beginTransaction();
                for (int i7 = 0; i7 < readableArray.size(); i7++) {
                    try {
                        if (readableArray.getArray(i7).size() != 2) {
                            n.n("Invalid Value");
                            asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                            return;
                        }
                        if (readableArray.getArray(i7).getString(0) == null) {
                            n.n("Invalid key");
                            asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                            return;
                        } else {
                            if (readableArray.getArray(i7).getString(1) == null) {
                                n.n("Invalid Value");
                                asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            }
                            if (!p002a.a.t(readableArray.getArray(i7).getString(0), readableArray.getArray(i7).getString(1), asyncStorageModule.mReactDatabaseSupplier.d())) {
                                n.n("Database Error");
                                asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                                return;
                            }
                        }
                    } catch (Exception e10) {
                        p229p2.a.w("ReactNative", e10.getMessage(), e10);
                        return;
                    }
                }
                asyncStorageModule.mReactDatabaseSupplier.d().setTransactionSuccessful();
                try {
                    asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                    writableMapN = null;
                } catch (Exception e11) {
                    p229p2.a.w("ReactNative", e11.getMessage(), e11);
                    writableMapN = n.n(e11.getMessage());
                }
            } catch (Exception e12) {
                p229p2.a.w("ReactNative", e12.getMessage(), e12);
                writableMapN = n.n(e12.getMessage());
                try {
                    asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                } catch (Exception e13) {
                    p229p2.a.w("ReactNative", e13.getMessage(), e13);
                }
            }
            if (writableMapN != null) {
                callback.invoke(writableMapN);
            } else {
                callback.invoke(new Object[0]);
            }
        } catch (Throwable th) {
            try {
                asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
            } catch (Exception e14) {
                p229p2.a.w("ReactNative", e14.getMessage(), e14);
                n.n(e14.getMessage());
            }
            throw th;
        }
    }
}
