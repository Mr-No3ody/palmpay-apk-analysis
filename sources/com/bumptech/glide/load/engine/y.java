package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Key {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J1.k f20790j = new J1.k(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f20792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Key f20793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f20796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.load.h f20797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Transformation f20798i;

    public y(com.bumptech.glide.load.engine.bitmap_recycle.f fVar, Key key, Key key2, int i7, int i10, Transformation transformation, Class cls, com.bumptech.glide.load.h hVar) {
        this.f20791b = fVar;
        this.f20792c = key;
        this.f20793d = key2;
        this.f20794e = i7;
        this.f20795f = i10;
        this.f20798i = transformation;
        this.f20796g = cls;
        this.f20797h = hVar;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f20795f == yVar.f20795f && this.f20794e == yVar.f20794e && J1.o.b(this.f20798i, yVar.f20798i) && this.f20796g.equals(yVar.f20796g) && this.f20792c.equals(yVar.f20792c) && this.f20793d.equals(yVar.f20793d) && this.f20797h.equals(yVar.f20797h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        int iHashCode = ((((this.f20793d.hashCode() + (this.f20792c.hashCode() * 31)) * 31) + this.f20794e) * 31) + this.f20795f;
        Transformation transformation = this.f20798i;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return this.f20797h.f20807b.hashCode() + ((this.f20796g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f20792c + ", signature=" + this.f20793d + ", width=" + this.f20794e + ", height=" + this.f20795f + ", decodedResourceClass=" + this.f20796g + ", transformation='" + this.f20798i + "', options=" + this.f20797h + '}';
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20791b;
        byte[] bArr = (byte[]) fVar.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f20794e).putInt(this.f20795f).array();
        this.f20793d.updateDiskCacheKey(messageDigest);
        this.f20792c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation transformation = this.f20798i;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.f20797h.updateDiskCacheKey(messageDigest);
        J1.k kVar = f20790j;
        Class cls = this.f20796g;
        byte[] bytes = (byte[]) kVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(Key.f20507a);
            kVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        fVar.put(bArr);
    }
}
