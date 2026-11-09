package p055de;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p070ee.c;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f35912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f35912a = str;
        this.f35913b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f35912a, this.f35913b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        String str = c.f36289a;
        String text = this.f35912a;
        Intrinsics.checkNotNullParameter(text, "text");
        boolean zIsEmpty = TextUtils.isEmpty(text);
        ArrayList arrayList = this.f35913b;
        if (zIsEmpty) {
            return arrayList == null ? new ArrayList() : arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = text.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                HomePageMenuData homePageMenuData = (HomePageMenuData) obj2;
                if (c.i(homePageMenuData.menuName, lowerCase) || c.i(homePageMenuData.menuDesc, lowerCase) || c.i(homePageMenuData.billerNames, lowerCase)) {
                    arrayList2.add(homePageMenuData);
                }
            }
        }
        return arrayList2;
    }
}
