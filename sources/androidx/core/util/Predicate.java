package androidx.core.util;

import android.annotation.SuppressLint;
import com.palmpay.lib.bridgewrapper.photo.upload.a;
import com.transsnet.palmpay.core.ui.activity.Z;
import java.util.Objects;
import p058e0.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public interface Predicate<T> {
    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) Object obj) {
        return obj == null ? new a(27) : new Z(obj, 23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        return test(obj) && predicate.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        return test(obj) || predicate.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> and(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new c(this, predicate, 1);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> negate() {
        return new Z(this, 24);
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> or(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new c(this, predicate, 0);
    }

    boolean test(T t);
}
