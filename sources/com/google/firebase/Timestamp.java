package com.google.firebase;

import C0.G;
import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.u;
import com.luck.picture.lib.config.FileSizeUnit;
import com.microsoft.codepush.react.CodePushConstants;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\nJ\b\u0010\u0014\u001a\u00020\rH\u0007J\u0011\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "seconds", "", "nanoseconds", "", "<init>", "(JI)V", "date", "Ljava/util/Date;", "(Ljava/util/Date;)V", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getSeconds", "()J", "getNanoseconds", "()I", "toDate", "toInstant", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "now", "toPreciseTime", "Lkotlin/Pair;", "", "", "Ljava/util/Date;", "validateRange", "", "seconds", "nanoseconds", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> toPreciseTime(Date date) {
            long j6 = 1000;
            long time = date.getTime() / j6;
            int time2 = (int) ((date.getTime() % j6) * ((long) FileSizeUnit.ACCURATE_MB));
            return time2 < 0 ? new Pair<>(Long.valueOf(time - 1), Integer.valueOf(time2 + FileSizeUnit.ACCURATE_GB)) : new Pair<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new IllegalArgumentException(G.m(nanoseconds, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new IllegalArgumentException(u.i(seconds, "Timestamp seconds out of range: ").toString());
            }
        }

        @JvmStatic
        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j6, int i7) {
        INSTANCE.validateRange(j6, i7);
        this.seconds = j6;
        this.nanoseconds = i7;
    }

    @JvmStatic
    @NotNull
    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j6 = this.seconds;
        return (((((int) j6) * 1369) + ((int) (j6 >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / FileSizeUnit.ACCURATE_MB)));
    }

    @RequiresApi(26)
    @NotNull
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.seconds);
        sb2.append(", nanoseconds=");
        return q0.m(sb2, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Function1[] selectors = {new x() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.x, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new x() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.x, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        for (int i7 = 0; i7 < 2; i7++) {
            Function1 function1 = selectors[i7];
            int iA = Bf.a.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public Timestamp(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Companion companion = INSTANCE;
        Pair preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.f38891a).longValue();
        int iIntValue = ((Number) preciseTime.f38892b).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public Timestamp(@NotNull Instant time) {
        this(time.getEpochSecond(), time.getNano());
        Intrinsics.checkNotNullParameter(time, "time");
    }
}
