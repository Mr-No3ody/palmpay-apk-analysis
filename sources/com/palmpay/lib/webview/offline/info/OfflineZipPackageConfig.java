package com.palmpay.lib.webview.offline.info;

import C0.G;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class OfflineZipPackageConfig implements Serializable {
    private String bisName;
    private String ver;
    private String versionCode;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.bisName, ((OfflineZipPackageConfig) obj).bisName);
    }

    public String getBisName() {
        return this.bisName;
    }

    public String getVer() {
        return this.ver;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return Objects.hash(this.bisName);
    }

    public void setBisName(String str) {
        this.bisName = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineZipPackageConfig{bisName='");
        sb2.append(this.bisName);
        sb2.append("', ver='");
        return G.r(sb2, this.ver, "'}");
    }
}
