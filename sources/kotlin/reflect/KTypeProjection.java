package kotlin.reflect;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KTypeProjection f38981d = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KType f38983b;

    /* JADX INFO: renamed from: kotlin.reflect.KTypeProjection$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @PublishedApi
        public static /* synthetic */ void getStar$annotations() {
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection contravariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(c.f38987b, type);
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection covariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(c.f38988c, type);
        }

        @NotNull
        public final KTypeProjection getSTAR() {
            return KTypeProjection.f38981d;
        }

        @JvmStatic
        @NotNull
        public final KTypeProjection invariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(c.f38986a, type);
        }

        private Companion() {
        }
    }

    public KTypeProjection(c cVar, KType kType) {
        String str;
        this.f38982a = cVar;
        this.f38983b = kType;
        if ((cVar == null) == (kType == null)) {
            return;
        }
        if (cVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + cVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f38982a == kTypeProjection.f38982a && Intrinsics.c(this.f38983b, kTypeProjection.f38983b);
    }

    public final int hashCode() {
        c cVar = this.f38982a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        KType kType = this.f38983b;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        c cVar = this.f38982a;
        int i7 = cVar == null ? -1 : b.f38985a[cVar.ordinal()];
        if (i7 == -1) {
            return "*";
        }
        KType kType = this.f38983b;
        if (i7 == 1) {
            return String.valueOf(kType);
        }
        if (i7 == 2) {
            return "in " + kType;
        }
        if (i7 != 3) {
            throw new l();
        }
        return "out " + kType;
    }
}
