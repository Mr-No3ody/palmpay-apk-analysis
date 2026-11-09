package Oc;

import Pa.i0;
import Pa.n0;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0499b extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6756a;

    public /* synthetic */ C0499b(int i7) {
        this.f6756a = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f6756a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/h5/conditions/ng/scheduleTopup?showTitle=1");
                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Agreement");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        switch (this.f6756a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(ds);
                break;
        }
    }
}
