package com.google.firebase.crashlytics.internal.model;

import C0.G;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {
    private final int arch;
    private final int availableProcessors;
    private final long diskSpace;
    private final boolean isEmulator;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final int state;
    private final long totalRam;

    public AutoValue_StaticSessionData_DeviceData(int i7, String str, int i10, long j6, long j10, boolean z3, int i11, String str2, String str3) {
        this.arch = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.model = str;
        this.availableProcessors = i10;
        this.totalRam = j6;
        this.diskSpace = j10;
        this.isEmulator = z3;
        this.state = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.manufacturer = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.modelClass = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.availableProcessors;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.diskSpace;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.DeviceData) {
            StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
            if (this.arch == deviceData.arch() && this.model.equals(deviceData.model()) && this.availableProcessors == deviceData.availableProcessors() && this.totalRam == deviceData.totalRam() && this.diskSpace == deviceData.diskSpace() && this.isEmulator == deviceData.isEmulator() && this.state == deviceData.state() && this.manufacturer.equals(deviceData.manufacturer()) && this.modelClass.equals(deviceData.modelClass())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.availableProcessors) * 1000003;
        long j6 = this.totalRam;
        int i7 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.diskSpace;
        return ((((((((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.isEmulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.isEmulator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.state;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.arch);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", availableProcessors=");
        sb2.append(this.availableProcessors);
        sb2.append(", totalRam=");
        sb2.append(this.totalRam);
        sb2.append(", diskSpace=");
        sb2.append(this.diskSpace);
        sb2.append(", isEmulator=");
        sb2.append(this.isEmulator);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", manufacturer=");
        sb2.append(this.manufacturer);
        sb2.append(", modelClass=");
        return G.r(sb2, this.modelClass, "}");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.totalRam;
    }
}
