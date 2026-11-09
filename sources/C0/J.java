package C0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import androidx.datastore.core.StorageConnection;
import com.google.common.util.concurrent.ListenableFuture;
import com.mikepenz.iconics.IconicsDrawable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p135j0.C1768a0;

/* JADX INFO: loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, int i7) {
        super(1);
        this.f950a = i7;
        this.f951b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f951b;
        switch (this.f950a) {
            case 0:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                F f10 = (F) obj2;
                ArrayList arrayList = f10.f931d;
                Collection collectionValues = ((Map) f10.f935h.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    kotlin.collections.v.n(arrayList2, ((C) it.next()).f921b);
                }
                return Boolean.valueOf(!CollectionsKt.P(CollectionsKt.P(arrayList, arrayList2), (List) f10.f938k.getValue()).contains(key));
            case 1:
                C0119k entry = (C0119k) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                return new E0.k(0, (E0.f) obj2, entry);
            case 2:
                Intrinsics.checkNotNullParameter((IOException) obj, "it");
                byte[] bArr = Dg.c.f1879a;
                ((Eg.l) obj2).f2490p = true;
                return Unit.f38893a;
            case 3:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                J5.c cVar = (J5.c) obj2;
                String string = cVar.f4521c.getString(cVar.f4522d);
                if (string != null && string.length() != 0) {
                    D3.a.k(apply, string);
                }
                int i7 = cVar.f4524f;
                TypedArray typedArray = cVar.f4521c;
                ColorStateList colorStateList = typedArray.getColorStateList(i7);
                if (colorStateList != null) {
                    apply.g(colorStateList);
                }
                Integer numA = J5.c.a(cVar, typedArray, cVar.f4523e);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    Intrinsics.checkNotNullParameter(apply, "<this>");
                    apply.k(iIntValue);
                    apply.l(iIntValue);
                }
                Integer numA2 = J5.c.a(cVar, typedArray, cVar.f4525g);
                if (numA2 != null) {
                    apply.j(numA2.intValue());
                }
                int i10 = cVar.f4527i;
                int i11 = cVar.f4526h;
                if (typedArray.hasValue(i11) || typedArray.hasValue(i10)) {
                    Integer numA3 = J5.c.a(cVar, typedArray, i11);
                    if (numA3 != null) {
                        apply.f23602z = numA3.intValue();
                        apply.d();
                    }
                    Integer numA4 = J5.c.a(cVar, typedArray, i10);
                    if (numA4 != null) {
                        apply.f23569A = numA4.intValue();
                        apply.d();
                    }
                }
                ColorStateList colorStateList2 = typedArray.getColorStateList(cVar.f4528j);
                if (colorStateList2 != null) {
                    H5.c cVar2 = apply.f23583f;
                    cVar2.f3701c = colorStateList2;
                    if (cVar2.a(apply.getState())) {
                        apply.d();
                    }
                }
                Integer numA5 = J5.c.a(cVar, typedArray, cVar.f4529k);
                if (numA5 != null) {
                    int iIntValue2 = numA5.intValue();
                    apply.f23600x = iIntValue2;
                    apply.f23583f.f3699a.setStrokeWidth(iIntValue2);
                    if (true != apply.f23596s) {
                        apply.f23596s = true;
                        apply.j(apply.f23600x + apply.f23599w);
                        apply.d();
                    }
                    apply.d();
                }
                ColorStateList colorStateList3 = typedArray.getColorStateList(cVar.f4530l);
                if (colorStateList3 != null) {
                    apply.f(colorStateList3);
                }
                Integer numA6 = J5.c.a(cVar, typedArray, cVar.f4531m);
                if (numA6 != null) {
                    float fIntValue = numA6.intValue();
                    Intrinsics.checkNotNullParameter(apply, "<this>");
                    apply.f23597u = fIntValue;
                    apply.d();
                    apply.f23598v = fIntValue;
                    apply.d();
                }
                ColorStateList colorStateList4 = typedArray.getColorStateList(cVar.f4532n);
                if (colorStateList4 != null) {
                    H5.c cVar3 = apply.f23581d;
                    cVar3.f3701c = colorStateList4;
                    if (cVar3.a(apply.getState())) {
                        apply.d();
                    }
                }
                Integer numA7 = J5.c.a(cVar, typedArray, cVar.f4533o);
                if (numA7 != null) {
                    int iIntValue3 = numA7.intValue();
                    apply.f23601y = iIntValue3;
                    apply.f23581d.f3699a.setStrokeWidth(iIntValue3);
                    apply.h(true);
                    apply.d();
                }
                Integer numA8 = J5.c.a(cVar, typedArray, cVar.f4534p);
                Integer numA9 = J5.c.a(cVar, typedArray, cVar.f4535q);
                Integer numA10 = J5.c.a(cVar, typedArray, cVar.f4536r);
                int color = typedArray.getColor(cVar.f4537s, Integer.MIN_VALUE);
                if (numA8 != null && numA9 != null && numA10 != null && color != Integer.MIN_VALUE) {
                    J5.b block = new J5.b(numA8, numA9, numA10, color);
                    apply.getClass();
                    Intrinsics.checkNotNullParameter(block, "block");
                    apply.f23592o = false;
                    block.invoke(apply);
                    apply.f23592o = true;
                    apply.p();
                }
                boolean z3 = typedArray.getBoolean(cVar.f4538u, false);
                apply.f23590m = z3;
                apply.setAutoMirrored(z3);
                apply.d();
                return Unit.f38893a;
            case 4:
                return ((androidx.camera.core.c) obj2).f13726k;
            case 5:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.f38893a;
            case 6:
                Map.Entry entry2 = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry2, "entry");
                View view = (View) entry2.getValue();
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                return Boolean.valueOf(CollectionsKt.A((Collection) obj2, androidx.core.view.E.f(view)));
            case 7:
                Throwable th = (Throwable) obj;
                p135j0.O o10 = (p135j0.O) obj2;
                if (th != null) {
                    o10.f37968h.e(new C1768a0(th));
                }
                if (o10.f37970j.isInitialized()) {
                    ((StorageConnection) o10.f37970j.getValue()).close();
                }
                return Unit.f38893a;
            default:
                File it2 = (File) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return new p135j0.j0(((CoroutineScope) obj2).getF17355b(), it2);
        }
    }
}
