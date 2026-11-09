package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f19451a;

    public f0(Enum[] enumArr) {
        this.f19451a = enumArr;
    }

    @Override // com.adjust.sdk.sig.d
    public final int a() {
        return this.f19451a.length;
    }

    @Override // com.adjust.sdk.sig.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        Enum[] enumArr = this.f19451a;
        int iOrdinal = r10.ordinal();
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f19451a;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(androidx.camera.video.u.h(i7, "index: ", length, ", size: "));
        }
        return enumArr[i7];
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f19451a;
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // com.adjust.sdk.sig.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        Enum[] enumArr = this.f19451a;
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r10) {
            return iOrdinal;
        }
        return -1;
    }
}
