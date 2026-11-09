package org.chromium.support_lib_boundary;

import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    boolean getIncludeCookiesOnIntercept();

    void setAllowContentAccess(boolean z3);

    void setAllowFileAccess(boolean z3);

    void setBlockNetworkLoads(boolean z3);

    void setCacheMode(int i7);

    void setIncludeCookiesOnIntercept(boolean z3);
}
