package com.palmpay.lib.webview.offline.info;

import C0.G;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class OfflinePackageInfo implements Serializable {
    private String bisName;
    private int refreshMode;
    private int result;
    private String url;
    private String version;
    private String versionCode;

    public OfflinePackageInfo(String str, int i7, String str2, int i10, String str3) {
        this.bisName = str;
        this.result = i7;
        this.url = str2;
        this.refreshMode = i10;
        this.version = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.bisName, ((OfflinePackageInfo) obj).bisName);
    }

    public String getBisName() {
        return this.bisName;
    }

    public int getRefreshMode() {
        return this.refreshMode;
    }

    public int getResult() {
        return this.result;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return Objects.hash(this.bisName);
    }

    public boolean isEnable() {
        return this.result != -1;
    }

    public boolean isForceRefresh() {
        return this.refreshMode == 1;
    }

    public boolean isNeedUpdate() {
        return this.result == 1;
    }

    public boolean isSameVer() {
        return this.result == 0;
    }

    public void setBisName(String str) {
        this.bisName = str;
    }

    public void setRefreshMode(int i7) {
        this.refreshMode = i7;
    }

    public void setResult(int i7) {
        this.result = i7;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(String str) {
        this.versionCode = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OfflinePackageInfo{bisName='");
        sb2.append(this.bisName);
        sb2.append("', result=");
        sb2.append(this.result);
        sb2.append(", url='");
        sb2.append(this.url);
        sb2.append("', refreshMode=");
        sb2.append(this.refreshMode);
        sb2.append(", version='");
        sb2.append(this.version);
        sb2.append("', versionCode='");
        return G.r(sb2, this.versionCode, "'}");
    }

    public OfflinePackageInfo(String str, String str2) {
        this.bisName = str;
        this.versionCode = str2;
    }
}
