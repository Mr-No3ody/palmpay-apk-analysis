package Hb;

import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0313o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IconicsImageView f3844b;

    public /* synthetic */ C0313o(IconicsImageView iconicsImageView, int i7) {
        this.f3843a = i7;
        this.f3844b = iconicsImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IconicsDrawable apply = (IconicsDrawable) obj;
        switch (this.f3843a) {
            case 0:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this.f3844b.getContext()));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this.f3844b.getContext()));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 12);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, this.f3844b.getContext()));
                break;
            default:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, this.f3844b.getContext()));
                break;
        }
        return Unit.f38893a;
    }
}
