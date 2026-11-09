package com.abedelazizshe.lightcompressorlibrary.config;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bJ+\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/abedelazizshe/lightcompressorlibrary/config/VideoResizer;", "", "", "width", "height", "Lkotlin/Pair;", "resize", "(DD)Lkotlin/Pair;", "a", "com/abedelazizshe/lightcompressorlibrary/config/b", "com/abedelazizshe/lightcompressorlibrary/config/c", "Sd/b", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface VideoResizer {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final a f19290h0 = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();

        @NotNull
        private static final VideoResizer auto = new Sd.b(null, 15);

        private a() {
        }

        @JvmStatic
        public static /* synthetic */ void getAuto$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Double, Double> keepAspect(double d2, double d10, double d11, double d12) {
            double d13 = d2 / d10;
            return d11 / d12 <= d13 ? new Pair<>(Double.valueOf(d11), Double.valueOf(d11 / d13)) : new Pair<>(Double.valueOf(d13 * d12), Double.valueOf(d12));
        }

        public static /* synthetic */ VideoResizer matchSize$default(a aVar, double d2, boolean z3, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                z3 = false;
            }
            return aVar.matchSize(d2, z3);
        }

        @NotNull
        public final VideoResizer getAuto() {
            return auto;
        }

        @JvmStatic
        @NotNull
        public final VideoResizer limitSize(double d2) {
            return new b(d2, d2);
        }

        @JvmStatic
        @NotNull
        public final VideoResizer matchSize(double d2, boolean z3) {
            return new c(d2, d2, z3);
        }

        @JvmStatic
        @NotNull
        public final VideoResizer scale(double d2) {
            return new Sd.b(Double.valueOf(d2), 15);
        }

        public static /* synthetic */ VideoResizer matchSize$default(a aVar, double d2, double d10, boolean z3, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                z3 = false;
            }
            return aVar.matchSize(d2, d10, z3);
        }

        @JvmStatic
        @NotNull
        public final VideoResizer limitSize(double d2, double d10) {
            return new b(d2, d10);
        }

        @JvmStatic
        @NotNull
        public final VideoResizer matchSize(double d2, double d10, boolean z3) {
            return new c(d2, d10, z3);
        }
    }

    @NotNull
    static VideoResizer getAuto() {
        return f19290h0.getAuto();
    }

    @JvmStatic
    @NotNull
    static VideoResizer limitSize(double d2) {
        return f19290h0.limitSize(d2);
    }

    @JvmStatic
    @NotNull
    static VideoResizer matchSize(double d2, double d10, boolean z3) {
        return f19290h0.matchSize(d2, d10, z3);
    }

    @JvmStatic
    @NotNull
    static VideoResizer scale(double d2) {
        return f19290h0.scale(d2);
    }

    @NotNull
    Pair<Double, Double> resize(double width, double height);

    @JvmStatic
    @NotNull
    static VideoResizer limitSize(double d2, double d10) {
        return f19290h0.limitSize(d2, d10);
    }

    @JvmStatic
    @NotNull
    static VideoResizer matchSize(double d2, boolean z3) {
        return f19290h0.matchSize(d2, z3);
    }
}
