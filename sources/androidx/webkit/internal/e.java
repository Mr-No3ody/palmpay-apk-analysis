package androidx.webkit.internal;

import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18298b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f18297a = i7;
        this.f18298b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18297a) {
            case 0:
                return new f((JsReplyProxyBoundaryInterface) this.f18298b);
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((org.greenrobot.eventbus.f) this.f18298b).f41079b;
                Long longValue = workDatabase.d().getLongValue("next_alarm_manager_id");
                int iLongValue = longValue != null ? (int) longValue.longValue() : 0;
                workDatabase.d().insertPreference(new androidx.work.impl.model.c("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 2:
                return ((CrashlyticsCore) this.f18298b).lambda$checkForPreviousCrash$10();
            case 3:
                return ((FirebaseInstallations) this.f18298b).deleteFirebaseInstallationId();
            case 4:
                return ((ConfigStorageClient) this.f18298b).read();
            default:
                p045d3.d this$0 = (p045d3.d) this.f18298b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    this$0.f35501g.a();
                    this$0.f35495a.clearAll();
                    return null;
                } catch (Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "th");
                    throw th;
                }
        }
    }
}
