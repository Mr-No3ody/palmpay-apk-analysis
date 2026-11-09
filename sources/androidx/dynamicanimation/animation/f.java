package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16846a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, FloatProperty floatProperty) {
        super(str);
        this.f16847b = floatProperty;
    }

    @Override // androidx.dynamicanimation.animation.h
    public final float getValue(Object obj) {
        switch (this.f16846a) {
            case 0:
                return ((i) this.f16847b).f16866a;
            default:
                return ((Float) ((FloatProperty) this.f16847b).get(obj)).floatValue();
        }
    }

    @Override // androidx.dynamicanimation.animation.h
    public final void setValue(Object obj, float f10) {
        switch (this.f16846a) {
            case 0:
                ((i) this.f16847b).f16866a = f10;
                break;
            default:
                ((FloatProperty) this.f16847b).setValue(obj, f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super("FloatValueHolder");
        this.f16847b = iVar;
    }
}
