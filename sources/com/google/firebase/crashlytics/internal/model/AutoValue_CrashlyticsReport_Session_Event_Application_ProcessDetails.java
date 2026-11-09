package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.airbnb.lottie.model.layer.d;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {
    private final boolean defaultProcess;
    private final int importance;
    private final int pid;
    private final String processName;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {
        private boolean defaultProcess;
        private int importance;
        private int pid;
        private String processName;
        private byte set$0;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str;
            if (this.set$0 == 7 && (str = this.processName) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(str, this.pid, this.importance, this.defaultProcess);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.processName == null) {
                sb2.append(" processName");
            }
            if ((this.set$0 & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.set$0 & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z3) {
            this.defaultProcess = z3;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i7) {
            this.importance = i7;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i7) {
            this.pid = i7;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.processName = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            if (this.processName.equals(processDetails.getProcessName()) && this.pid == processDetails.getPid() && this.importance == processDetails.getImportance() && this.defaultProcess == processDetails.isDefaultProcess()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    @NonNull
    public String getProcessName() {
        return this.processName;
    }

    public int hashCode() {
        return ((((((this.processName.hashCode() ^ 1000003) * 1000003) ^ this.pid) * 1000003) ^ this.importance) * 1000003) ^ (this.defaultProcess ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public boolean isDefaultProcess() {
        return this.defaultProcess;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", defaultProcess=" + this.defaultProcess + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i7, int i10, boolean z3) {
        this.processName = str;
        this.pid = i7;
        this.importance = i10;
        this.defaultProcess = z3;
    }
}
