package com.google.firebase.crashlytics.internal.model;

import N8.q0;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.d;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {
    private final Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {
        private Double batteryLevel;
        private int batteryVelocity;
        private long diskUsed;
        private int orientation;
        private boolean proximityOn;
        private long ramUsed;
        private byte set$0;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device build() {
            if (this.set$0 == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.batteryLevel, this.batteryVelocity, this.proximityOn, this.orientation, this.ramUsed, this.diskUsed);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.set$0 & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.set$0 & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.set$0 & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.set$0 & Ascii.DLE) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d2) {
            this.batteryLevel = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i7) {
            this.batteryVelocity = i7;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j6) {
            this.diskUsed = j6;
            this.set$0 = (byte) (this.set$0 | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i7) {
            this.orientation = i7;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z3) {
            this.proximityOn = z3;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j6) {
            this.ramUsed = j6;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Device) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            Double d2 = this.batteryLevel;
            if (d2 != null ? d2.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
                if (this.batteryVelocity == device.getBatteryVelocity() && this.proximityOn == device.isProximityOn() && this.orientation == device.getOrientation() && this.ramUsed == device.getRamUsed() && this.diskUsed == device.getDiskUsed()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    @Nullable
    public Double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getBatteryVelocity() {
        return this.batteryVelocity;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getDiskUsed() {
        return this.diskUsed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public int getOrientation() {
        return this.orientation;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public long getRamUsed() {
        return this.ramUsed;
    }

    public int hashCode() {
        Double d2 = this.batteryLevel;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.batteryVelocity) * 1000003) ^ (this.proximityOn ? 1231 : 1237)) * 1000003) ^ this.orientation) * 1000003;
        long j6 = this.ramUsed;
        long j10 = this.diskUsed;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public boolean isProximityOn() {
        return this.proximityOn;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.batteryLevel);
        sb2.append(", batteryVelocity=");
        sb2.append(this.batteryVelocity);
        sb2.append(", proximityOn=");
        sb2.append(this.proximityOn);
        sb2.append(", orientation=");
        sb2.append(this.orientation);
        sb2.append(", ramUsed=");
        sb2.append(this.ramUsed);
        sb2.append(", diskUsed=");
        return q0.n(sb2, "}", this.diskUsed);
    }

    private AutoValue_CrashlyticsReport_Session_Event_Device(@Nullable Double d2, int i7, boolean z3, int i10, long j6, long j10) {
        this.batteryLevel = d2;
        this.batteryVelocity = i7;
        this.proximityOn = z3;
        this.orientation = i10;
        this.ramUsed = j6;
        this.diskUsed = j10;
    }
}
