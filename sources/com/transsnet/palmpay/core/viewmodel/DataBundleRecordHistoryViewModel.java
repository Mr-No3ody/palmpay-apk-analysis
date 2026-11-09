package com.transsnet.palmpay.core.viewmodel;

import B6.RunnableC0085g;
import C0.G;
import Pa.H;
import Pa.T;
import Ua.C0630k;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/DataBundleRecordHistoryViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleRecordHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleRecordHistoryViewModel.kt\ncom/transsnet/palmpay/core/viewmodel/DataBundleRecordHistoryViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,43:1\n85#2,13:44\n*S KotlinDebug\n*F\n+ 1 DataBundleRecordHistoryViewModel.kt\ncom/transsnet/palmpay/core/viewmodel/DataBundleRecordHistoryViewModel\n*L\n26#1:44,13\n*E\n"})
public final class DataBundleRecordHistoryViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f28220e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBundleRecordHistoryViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f28220e = new l();
    }

    public final void d() {
        Application application = this.f17439d;
        Intrinsics.f(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        H hC = H.c(application);
        String strP = G.p("Pref_", p367ya.a.d().i(), "_AirtimeAndDataBundleLastRecordList_", BaseApplication.getCountryLocale());
        Pa.G g7 = hC.f7020a;
        if (g7 == null) {
            return;
        }
        File file = new File(g7.f7014a, strP.hashCode() + "");
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        T.b(-4).execute(new RunnableC0085g(16, file, lValueOf));
        g7.f7017d.put(file, lValueOf);
        file.delete();
    }

    public final void e() {
        AbstractC0780y.m(V.h(this), null, null, new C0630k(this.f28220e, G.p("Pref_", p367ya.a.d().i(), "_AirtimeAndDataBundleLastRecordList_", BaseApplication.getCountryLocale()), null), 3);
    }
}
