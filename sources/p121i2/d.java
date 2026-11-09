package p121i2;

import S9.a;
import U2.B;
import android.content.Context;
import android.util.Log;
import androidx.camera.core.processing.Operation;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.soloader.C1392b;
import com.facebook.soloader.D;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.v;
import com.facebook.soloader.w;
import com.facebook.soloader.x;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.picker.DatePickerBridge;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.core.rnbridge.bridge.InvestStorageSetBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.StorageGetBridge;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.b0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements CacheErrorLogger, RecoveryStrategy, Function, Operation, AutoMigrationSpec, ObjectConstructor, IRouterProxy, SharingStarted {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f37413b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37414a;

    public /* synthetic */ d(byte b7, int i7) {
        this.f37414a = i7;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        switch (this.f37414a) {
            case 2:
                return ((ContactsApiService) a.f8824a.f41079b).queryMobileContacts((List) obj);
            default:
                throw null;
        }
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f37414a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return new T(new b0(stateFlow, null));
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new ArrayList();
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f37414a) {
            case 6:
                return new DatePickerBridge();
            case 7:
                return new InvestStorageSetBridge();
            default:
                return new StorageGetBridge();
        }
    }

    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.execSQL("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        if (!(unsatisfiedLinkError instanceof w) || (unsatisfiedLinkError instanceof v)) {
            return false;
        }
        String str = ((w) unsatisfiedLinkError).f21905a;
        StringBuilder sb2 = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb2.append(unsatisfiedLinkError);
        sb2.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb2.toString());
        for (x xVar : xVarArr) {
            if (xVar instanceof D) {
                D d2 = (D) xVar;
                if (d2 instanceof C1392b) {
                    continue;
                } else {
                    try {
                        Log.e("SoLoader", "Runpacking " + d2.b());
                        d2.d(2);
                    } catch (Exception e10) {
                        Log.e("SoLoader", "Encountered an exception while reunpacking " + d2.b() + " for library " + str + ": ", e10);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public String toString() {
        switch (this.f37414a) {
            case 10:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public d(int i7) {
        this.f37414a = 9;
        new LinkedHashSet(i7);
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    public void logError(a aVar, Class cls, String str, Throwable th) {
    }
}
