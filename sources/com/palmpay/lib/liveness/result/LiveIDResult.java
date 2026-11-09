package com.palmpay.lib.liveness.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/palmpay/lib/liveness/result/LiveIDResult;", "T", "Landroid/os/Parcelable;", "Success", "Error", "Lcom/palmpay/lib/liveness/result/LiveIDResult$Error;", "Lcom/palmpay/lib/liveness/result/LiveIDResult$Success;", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LiveIDResult<T extends Parcelable> extends Parcelable {

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/palmpay/lib/liveness/result/LiveIDResult$Error;", "Lcom/palmpay/lib/liveness/result/LiveIDResult;", "", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements LiveIDResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f23816a;

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f23816a = throwable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.c(this.f23816a, ((Error) obj).f23816a);
        }

        public final int hashCode() {
            return this.f23816a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f23816a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f23816a);
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/liveness/result/LiveIDResult$Success;", "Landroid/os/Parcelable;", "T", "Lcom/palmpay/lib/liveness/result/LiveIDResult;", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<T extends Parcelable> implements LiveIDResult<T> {

        @NotNull
        public static final Parcelable.Creator<Success<?>> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f23817a;

        public Success(Parcelable data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f23817a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f23817a, ((Success) obj).f23817a);
        }

        public final int hashCode() {
            return this.f23817a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.f23817a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f23817a, i7);
        }
    }
}
