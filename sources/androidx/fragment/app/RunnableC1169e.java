package androidx.fragment.app;

import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1169e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17118e;

    public /* synthetic */ RunnableC1169e(int i7, Object obj, Object obj2, Object obj3, boolean z3) {
        this.f17114a = i7;
        this.f17116c = obj;
        this.f17117d = obj2;
        this.f17115b = z3;
        this.f17118e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f17118e;
        boolean z3 = this.f17115b;
        Object obj2 = this.f17117d;
        Object obj3 = this.f17116c;
        switch (this.f17114a) {
            case 0:
                M.f sharedElements = (M.f) obj;
                Intrinsics.checkNotNullParameter(sharedElements, "$lastInViews");
                q0 q0Var = l0.f17180a;
                Fragment inFragment = ((x0) obj3).f17248c;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                Fragment outFragment = ((x0) obj2).f17248c;
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (!z3) {
                    inFragment.getEnterTransitionCallback();
                } else {
                    outFragment.getEnterTransitionCallback();
                }
                break;
            case 1:
                ((SessionReportingCoordinator) obj3).lambda$persistEvent$0((CrashlyticsReport.Session.Event) obj2, (EventMetadata) obj, z3);
                break;
            default:
                ((FileUploadManager) obj3).lambda$uploadFileSync$1((File) obj2, z3, (FileUploadManager.UploadListener) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC1169e(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z3) {
        this.f17114a = 1;
        this.f17116c = sessionReportingCoordinator;
        this.f17117d = event;
        this.f17118e = eventMetadata;
        this.f17115b = z3;
    }
}
