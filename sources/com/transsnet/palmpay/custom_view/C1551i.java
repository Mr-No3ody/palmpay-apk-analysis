package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1551i extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelItemSelection f31349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f31350c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1551i(ModelItemSelection modelItemSelection, Context context, int i7) {
        this.f31348a = i7;
        switch (i7) {
            case 1:
                this.f31349b = modelItemSelection;
                this.f31350c = context;
                super(null);
                break;
            default:
                Boolean bool = Boolean.TRUE;
                this.f31349b = modelItemSelection;
                this.f31350c = context;
                super(bool);
                break;
        }
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f31348a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                int i7 = zBooleanValue ? L6.b.ppColorTextPrimary : L6.b.ppColorTextAssist;
                ModelItemSelection modelItemSelection = this.f31349b;
                Bc.f fVar = modelItemSelection.f31035b;
                Context context = this.f31350c;
                if (fVar != null) {
                    ((TextView) fVar.f702i).setTextColor(CommonViewExtKt.colorInt(i7, context));
                }
                int i10 = zBooleanValue ? 255 : 100;
                if (modelItemSelection.f31034a == 0) {
                    Bc.f fVar2 = modelItemSelection.f31035b;
                    if (fVar2 != null) {
                        ((ImageView) fVar2.f698d).setImageDrawable(p059e1.a.h(context, S6.a.pay_Arrowdown, null, CommonViewExtKt.colorInt(i7, context), 24.0f));
                    }
                } else {
                    Bc.f fVar3 = modelItemSelection.f31035b;
                    if (fVar3 != null) {
                        ((ImageView) fVar3.f698d).setImageAlpha(i10);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                String str = (String) obj2;
                ModelItemSelection modelItemSelection2 = this.f31349b;
                Bc.f fVar4 = modelItemSelection2.f31035b;
                if (fVar4 != null) {
                    ((TextView) fVar4.f701g).setText(str);
                }
                Bc.f fVar5 = modelItemSelection2.f31035b;
                if (fVar5 != null) {
                    ((TextView) fVar5.f701g).setVisibility((str == null || str.length() == 0) ? 8 : 0);
                }
                int i11 = (str == null || str.length() == 0) ? L6.b.ppColorDividerLine : L6.b.ppColorError;
                Bc.f fVar6 = modelItemSelection2.f31035b;
                if (fVar6 != null) {
                    fVar6.f696b.setBackgroundColor(CommonViewExtKt.colorInt(i11, this.f31350c));
                }
                break;
        }
    }
}
