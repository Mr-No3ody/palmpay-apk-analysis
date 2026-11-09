package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A extends AbstractC1855e implements KProperty {
    private final boolean syntheticJavaProperty;

    public A() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC1855e
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            A a3 = (A) obj;
            return getOwner().equals(a3.getOwner()) && getName().equals(a3.getName()) && getSignature().equals(a3.getSignature()) && Intrinsics.c(getBoundReceiver(), a3.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC1855e
    @SinceKotlin(version = "1.1")
    public KProperty getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (KProperty) super.getReflected();
    }

    public A(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.syntheticJavaProperty = false;
    }
}
