package Ja;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4693b;

    public /* synthetic */ z(Context context, int i7) {
        this.f4692a = i7;
        this.f4693b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intentA;
        switch (this.f4692a) {
            case 0:
                IconicsDrawable apply = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 20);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this.f4693b));
                break;
            case 1:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                p118hf.a.I(apply2, 20);
                D3.a.F(apply2, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this.f4693b));
                break;
            case 2:
                IconicsDrawable apply3 = (IconicsDrawable) obj;
                Intrinsics.checkNotNullParameter(apply3, "$this$apply");
                p118hf.a.I(apply3, 24);
                D3.a.F(apply3, CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this.f4693b));
                apply3.f23595r = false;
                apply3.d();
                break;
            default:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && (intentA = Pa.F.a(this.f4693b, str)) != null) {
                    ActivityUtils.startActivity(intentA);
                }
                break;
        }
        return Unit.f38893a;
    }
}
