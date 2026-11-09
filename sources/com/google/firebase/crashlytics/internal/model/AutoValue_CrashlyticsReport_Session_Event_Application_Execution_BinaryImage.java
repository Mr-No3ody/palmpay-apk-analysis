package com.google.firebase.crashlytics.internal.model;

import C0.G;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {
    private final long baseAddress;
    private final String name;
    private final long size;
    private final String uuid;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {
        private long baseAddress;
        private String name;
        private byte set$0;
        private long size;
        private String uuid;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String str;
            if (this.set$0 == 3 && (str = this.name) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.baseAddress, this.size, str, this.uuid);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" size");
            }
            if (this.name == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j6) {
            this.baseAddress = j6;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j6) {
            this.size = j6;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String str) {
            this.uuid = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            if (this.baseAddress == binaryImage.getBaseAddress() && this.size == binaryImage.getSize() && this.name.equals(binaryImage.getName()) && ((str = this.uuid) != null ? str.equals(binaryImage.getUuid()) : binaryImage.getUuid() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public long getBaseAddress() {
        return this.baseAddress;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public long getSize() {
        return this.size;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Nullable
    @Encodable.Ignore
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        long j6 = this.baseAddress;
        long j10 = this.size;
        int iHashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.uuid;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.baseAddress);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", uuid=");
        return G.r(sb2, this.uuid, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j6, long j10, String str, @Nullable String str2) {
        this.baseAddress = j6;
        this.size = j10;
        this.name = str;
        this.uuid = str2;
    }
}
