package com.google.firebase.crashlytics.internal.model;

import C0.G;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final List<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private List<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload build() {
            List<CrashlyticsReport.FilesPayload.File> list = this.files;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.orgId);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.files = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        public Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.FilesPayload) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            if (this.files.equals(filesPayload.getFiles()) && ((str = this.orgId) != null ? str.equals(filesPayload.getOrgId()) : filesPayload.getOrgId() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @NonNull
    public List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    public int hashCode() {
        int iHashCode = (this.files.hashCode() ^ 1000003) * 1000003;
        String str = this.orgId;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.files);
        sb2.append(", orgId=");
        return G.r(sb2, this.orgId, "}");
    }

    private AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, @Nullable String str) {
        this.files = list;
        this.orgId = str;
    }
}
