package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f12073a = new x(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
            servedViewField.setAccessible(true);
            Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
            nextServedViewField.setAccessible(true);
            Field hField = InputMethodManager.class.getDeclaredField("mH");
            hField.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(hField, "hField");
            Intrinsics.checkNotNullExpressionValue(servedViewField, "servedViewField");
            Intrinsics.checkNotNullExpressionValue(nextServedViewField, "nextServedViewField");
            Intrinsics.checkNotNullParameter(hField, "hField");
            Intrinsics.checkNotNullParameter(servedViewField, "servedViewField");
            Intrinsics.checkNotNullParameter(nextServedViewField, "nextServedViewField");
            return new y();
        } catch (NoSuchFieldException unused) {
            return y.f12074a;
        }
    }
}
