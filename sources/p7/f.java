package p7;

import android.database.Cursor;
import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends GuardedAsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f41261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncStorageModule f41262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AsyncStorageModule asyncStorageModule, ReactApplicationContext reactApplicationContext, Callback callback) {
        super(reactApplicationContext);
        this.f41262b = asyncStorageModule;
        this.f41261a = callback;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        AsyncStorageModule asyncStorageModule = this.f41262b;
        boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
        Callback callback = this.f41261a;
        if (!zEnsureDatabase) {
            callback.invoke(n.n("Database Error"), null);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Cursor cursorQuery = asyncStorageModule.mReactDatabaseSupplier.d().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
        try {
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        writableArrayCreateArray.pushString(cursorQuery.getString(0));
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
                callback.invoke(null, writableArrayCreateArray);
            } catch (Exception e10) {
                p229p2.a.w("ReactNative", e10.getMessage(), e10);
                callback.invoke(n.n(e10.getMessage()), null);
                cursorQuery.close();
            }
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }
}
