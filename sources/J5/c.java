package J5;

import C0.J;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.camera.core.impl.utils.executor.g;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import com.mikepenz.iconics.animation.SpinProcessor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f4519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f4520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypedArray f4521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4537s;
    public final int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f4538u;

    static {
        new a(null);
    }

    public c(Resources res, Resources.Theme theme, TypedArray typedArray, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        this.f4519a = res;
        this.f4520b = theme;
        this.f4521c = typedArray;
        this.f4522d = i7;
        this.f4523e = i10;
        this.f4524f = i11;
        this.f4525g = i12;
        this.f4526h = i13;
        this.f4527i = i14;
        this.f4528j = i15;
        this.f4529k = i16;
        this.f4530l = i17;
        this.f4531m = i18;
        this.f4532n = i19;
        this.f4533o = i20;
        this.f4534p = i21;
        this.f4535q = i22;
        this.f4536r = i23;
        this.f4537s = i24;
        this.t = i25;
        this.f4538u = i26;
    }

    public static final Integer a(c cVar, TypedArray typedArray, int i7) {
        cVar.getClass();
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i7, -1);
        Integer numValueOf = Integer.valueOf(dimensionPixelSize);
        if (dimensionPixelSize != -1) {
            return numValueOf;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.mikepenz.iconics.IconicsDrawable] */
    public final IconicsDrawable b(IconicsDrawable iconicsDrawable, boolean z3) {
        Iterable<String> iterableU;
        IconicsAnimationProcessor iconicsAnimationProcessor;
        Object objF;
        Object objNewInstance;
        IconicsDrawable iconicsDrawableB;
        IconicsDrawable iconicsDrawable2 = iconicsDrawable;
        if (z3) {
            if (iconicsDrawable != null) {
                iconicsDrawableB = IconicsDrawable.b(iconicsDrawable, null, -1);
            } else {
                iconicsDrawable2 = 0;
            }
        }
        if (iconicsDrawable2 == 0) {
            iconicsDrawable2 = iconicsDrawableB;
            iconicsDrawable2 = new IconicsDrawable(this.f4519a, this.f4520b);
        }
        iconicsDrawable2 = iconicsDrawableB;
        iconicsDrawable2.a(new J(this, 3));
        String string = this.f4521c.getString(this.t);
        if (string != null && !StringsKt.F(string)) {
            List listC = new Regex("\\|").c(string);
            if (listC.isEmpty()) {
                iterableU = z.f38935a;
                break;
            }
            ListIterator listIterator = listC.listIterator(listC.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iterableU = z.f38935a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    iterableU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String animationTag : iterableU) {
                String TAG = H5.b.f3696b;
                com.growingio.android.circler.a aVar = H5.b.f3697c;
                Intrinsics.checkNotNullParameter(animationTag, "animationTag");
                Class cls = (Class) H5.b.f3695a.get(animationTag);
                if (cls != null) {
                    try {
                        o oVar = q.f43977a;
                        objF = cls.getField("INSTANCE");
                    } catch (Throwable th) {
                        o oVar2 = q.f43977a;
                        objF = g.f(th);
                    }
                    try {
                        if (objF instanceof p) {
                            objF = null;
                        }
                        Field field = (Field) objF;
                        if (field != null && Modifier.isFinal(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                            objNewInstance = field.get(null);
                            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type T of com.mikepenz.iconics.context.ReflectionUtils.getInstanceOf");
                        } else {
                            objNewInstance = cls.newInstance();
                            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            // This is…s.newInstance()\n        }");
                        }
                        iconicsAnimationProcessor = (IconicsAnimationProcessor) objNewInstance;
                    } catch (IllegalAccessException e10) {
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        aVar.log(6, TAG, "Can't create processor for animation tag " + animationTag, e10);
                        iconicsAnimationProcessor = null;
                    } catch (InstantiationException e11) {
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        aVar.log(6, TAG, "Can't create processor for animation tag " + animationTag, e11);
                        iconicsAnimationProcessor = null;
                    }
                } else {
                    iconicsAnimationProcessor = null;
                }
                if (iconicsAnimationProcessor != null) {
                    arrayList.add(iconicsAnimationProcessor);
                }
            }
            iconicsDrawable2 = (I5.a) IconicsDrawable.b(iconicsDrawable2, new I5.a(iconicsDrawable2.c(), iconicsDrawable2.f23579b), -2);
            Object[] array = arrayList.toArray(new IconicsAnimationProcessor[0]);
            Intrinsics.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            IconicsAnimationProcessor[] iconicsAnimationProcessorArr = (IconicsAnimationProcessor[]) array;
            IconicsAnimationProcessor[] processors = (IconicsAnimationProcessor[]) Arrays.copyOf(iconicsAnimationProcessorArr, iconicsAnimationProcessorArr.length);
            Intrinsics.checkNotNullParameter(processors, "processors");
            if (processors.length != 0) {
                for (SpinProcessor processor : processors) {
                    Intrinsics.checkNotNullParameter(processor, "processor");
                    processor.setDrawable$iconics_core(iconicsDrawable2);
                    iconicsDrawable2.f4013J.add(processor);
                }
            }
        }
        return iconicsDrawable2;
    }

    public /* synthetic */ c(Resources resources, Resources.Theme theme, TypedArray typedArray, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this(resources, theme, typedArray, i7, i10, i11, i12, 0, 0, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24);
    }
}
