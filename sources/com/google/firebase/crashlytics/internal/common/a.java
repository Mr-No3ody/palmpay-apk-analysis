package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22944a;

    public /* synthetic */ a(int i7) {
        this.f22944a = i7;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f22944a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.lambda$static$0(file, str);
            default:
                return CrashlyticsController.lambda$static$0(file, str);
        }
    }
}
