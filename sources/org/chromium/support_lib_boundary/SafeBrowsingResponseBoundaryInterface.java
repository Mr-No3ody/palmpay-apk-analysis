package org.chromium.support_lib_boundary;

import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface SafeBrowsingResponseBoundaryInterface {
    void backToSafety(boolean z3);

    void proceed(boolean z3);

    void showInterstitial(boolean z3);
}
