package p7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.utils.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends GuardedAsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f41247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadableArray f41248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncStorageModule f41249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AsyncStorageModule asyncStorageModule, ReactApplicationContext reactApplicationContext, Callback callback, ReadableArray readableArray) {
        super(reactApplicationContext);
        this.f41249c = asyncStorageModule;
        this.f41247a = callback;
        this.f41248b = readableArray;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        AsyncStorageModule asyncStorageModule = this.f41249c;
        boolean zEnsureDatabase = asyncStorageModule.ensureDatabase();
        Callback callback = this.f41247a;
        if (!zEnsureDatabase) {
            callback.invoke(n.n("Database Error"), null);
            return;
        }
        String[] strArr = {"key", "value"};
        HashSet<String> hashSet = new HashSet();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int i7 = 0;
        while (true) {
            ReadableArray readableArray = this.f41248b;
            if (i7 >= readableArray.size()) {
                callback.invoke(null, writableArrayCreateArray);
                return;
            }
            int iMin = Math.min(readableArray.size() - i7, 999);
            SQLiteDatabase sQLiteDatabaseD = asyncStorageModule.mReactDatabaseSupplier.d();
            String strD = p002a.a.d(iMin);
            String[] strArr2 = new String[iMin];
            for (int i10 = 0; i10 < iMin; i10++) {
                strArr2[i10] = readableArray.getString(i7 + i10);
            }
            ReadableArray readableArray2 = readableArray;
            Cursor cursorQuery = sQLiteDatabaseD.query("catalystLocalStorage", strArr, strD, strArr2, null, null, null);
            hashSet.clear();
            try {
                try {
                    if (cursorQuery.getCount() != readableArray2.size()) {
                        int i11 = i7;
                        while (i11 < i7 + iMin) {
                            ReadableArray readableArray3 = readableArray2;
                            hashSet.add(readableArray3.getString(i11));
                            i11++;
                            readableArray2 = readableArray3;
                        }
                    }
                    if (cursorQuery.moveToFirst()) {
                        do {
                            WritableArray writableArrayCreateArray2 = Arguments.createArray();
                            writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                            writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                            writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                            hashSet.remove(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    for (String str : hashSet) {
                        WritableArray writableArrayCreateArray3 = Arguments.createArray();
                        writableArrayCreateArray3.pushString(str);
                        writableArrayCreateArray3.pushNull();
                        writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                    }
                    hashSet.clear();
                    i7 += 999;
                } catch (Exception e10) {
                    p229p2.a.w("ReactNative", e10.getMessage(), e10);
                    callback.invoke(n.n(e10.getMessage()), null);
                    cursorQuery.close();
                    return;
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }
}
