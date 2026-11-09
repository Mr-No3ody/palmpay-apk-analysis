package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22945a;

    public /* synthetic */ b(int i7) {
        this.f22945a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22945a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.lambda$static$1((File) obj, (File) obj2);
            default:
                return SessionReportingCoordinator.lambda$getSortedCustomAttributes$1((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
        }
    }
}
