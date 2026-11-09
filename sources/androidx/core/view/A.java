package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class A extends Af.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16159e;

    public A(int i7, Class cls, int i10, int i11, int i12) {
        this.f16159e = i12;
        this.f345a = i7;
        this.f348d = cls;
        this.f347c = i10;
        this.f346b = i11;
    }

    @Override // Af.h
    public final Object c(View view) {
        switch (this.f16159e) {
            case 0:
                return Boolean.valueOf(I.c(view));
            case 1:
                return I.a(view);
            case 2:
                return K.a(view);
            default:
                return Boolean.valueOf(I.b(view));
        }
    }

    @Override // Af.h
    public final void d(View view, Object obj) {
        switch (this.f16159e) {
            case 0:
                I.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                I.e(view, (CharSequence) obj);
                break;
            case 2:
                K.c(view, (CharSequence) obj);
                break;
            default:
                I.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // Af.h
    public final boolean g(Object obj, Object obj2) {
        switch (this.f16159e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
