package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.g;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new g(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContextChain f21213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21215e;

    public ContextChain(Parcel parcel) {
        this.f21211a = parcel.readString();
        this.f21212b = parcel.readString();
        this.f21215e = parcel.readString();
        this.f21213c = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContextChain contextChain = (ContextChain) obj;
            if (Objects.equals(this.f21215e, contextChain.f21215e) && Objects.equals(this.f21213c, contextChain.f21213c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21213c, this.f21215e);
    }

    public final String toString() {
        if (this.f21214d == null) {
            this.f21214d = this.f21215e;
            ContextChain contextChain = this.f21213c;
            if (contextChain != null) {
                this.f21214d = contextChain.toString() + '/' + this.f21214d;
            }
        }
        return this.f21214d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f21211a);
        parcel.writeString(this.f21212b);
        parcel.writeString(this.f21215e);
        parcel.writeParcelable(this.f21213c, i7);
    }
}
