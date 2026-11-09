package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() { // from class: com.google.firebase.perf.metrics.Counter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Counter[] newArray(int i7) {
            return new Counter[i7];
        }
    };
    private final AtomicLong count;
    private final String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCount() {
        return this.count.get();
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public void increment(long j6) {
        this.count.addAndGet(j6);
    }

    public void setCount(long j6) {
        this.count.set(j6);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.name);
        parcel.writeLong(this.count.get());
    }

    public Counter(@NonNull String str) {
        this.name = str;
        this.count = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.name = parcel.readString();
        this.count = new AtomicLong(parcel.readLong());
    }
}
