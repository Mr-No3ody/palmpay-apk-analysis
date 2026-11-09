package p7;

import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends GuardedAsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f41253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadableArray f41254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncStorageModule f41255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AsyncStorageModule asyncStorageModule, ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
        super(reactApplicationContext);
        this.f41255c = asyncStorageModule;
        this.f41253a = callback;
        this.f41254b = readableArray;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        WritableMap writableMapN;
        ReadableArray readableArray = this.f41254b;
        AsyncStorageModule asyncStorageModule = this.f41255c;
        boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
        Callback callback = this.f41253a;
        if (!zEnsureDatabase) {
            callback.invoke(n.n("Database Error"));
            return;
        }
        try {
            try {
                asyncStorageModule.mReactDatabaseSupplier.d().beginTransaction();
                for (int i7 = 0; i7 < readableArray.size(); i7 += 999) {
                    int iMin = Math.min(readableArray.size() - i7, 999);
                    SQLiteDatabase sQLiteDatabaseD = asyncStorageModule.mReactDatabaseSupplier.d();
                    String strD = p002a.a.d(iMin);
                    String[] strArr = new String[iMin];
                    for (int i10 = 0; i10 < iMin; i10++) {
                        strArr[i10] = readableArray.getString(i7 + i10);
                    }
                    sQLiteDatabaseD.delete("catalystLocalStorage", strD, strArr);
                }
                asyncStorageModule.mReactDatabaseSupplier.d().setTransactionSuccessful();
                try {
                    asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                    writableMapN = null;
                } catch (Exception e10) {
                    p229p2.a.w("ReactNative", e10.getMessage(), e10);
                    writableMapN = n.n(e10.getMessage());
                }
            } catch (Throwable th) {
                try {
                    asyncStorageModule.mReactDatabaseSupplier.d().endTransaction();
                } catch (Exception e11) {
                    p229p2.a.w("ReactNative", e11.getMessage(), e11);
                    n.n(e11.getMessage());
                }
                throw th;
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
    }
}
