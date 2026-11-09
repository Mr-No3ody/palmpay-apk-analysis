package com.rmondjone.camera;

import M.o;
import android.os.Parcel;
import android.os.Parcelable;
import p321v7.a;

/* JADX INFO: loaded from: classes3.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f24691c = new o(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new a(0);

    public AspectRatio(int i7, int i10) {
        this.f24692a = i7;
        this.f24693b = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static AspectRatio c(int i7, int i10) {
        int i11 = i7;
        int i12 = i10;
        while (i12 != 0) {
            int i13 = i11 % i12;
            i11 = i12;
            i12 = i13;
        }
        int i14 = i7 / i11;
        int i15 = i10 / i11;
        o oVar = f24691c;
        o oVar2 = (o) oVar.b(i14);
        if (oVar2 == null) {
            AspectRatio aspectRatio = new AspectRatio(i14, i15);
            o oVar3 = new o();
            oVar3.d(i15, aspectRatio);
            oVar.d(i14, oVar3);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = (AspectRatio) oVar2.b(i15);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i14, i15);
        oVar2.d(i15, aspectRatio3);
        return aspectRatio3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(AspectRatio aspectRatio) {
        AspectRatio aspectRatio2 = aspectRatio;
        if (equals(aspectRatio2)) {
            return 0;
        }
        return d() - aspectRatio2.d() > 0.0f ? 1 : -1;
    }

    public final float d() {
        return this.f24692a / this.f24693b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatio) {
            AspectRatio aspectRatio = (AspectRatio) obj;
            if (this.f24692a == aspectRatio.f24692a && this.f24693b == aspectRatio.f24693b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f24692a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f24693b;
    }

    public final String toString() {
        return this.f24692a + ":" + this.f24693b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f24692a);
        parcel.writeInt(this.f24693b);
    }
}
