package p223od;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f40524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FixedSavingsLayout f40525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f40526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f40527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TransferDetailBottomModel f40528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f40529g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpTitleBar f40530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewStub f40531j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewStub f40532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewStub f40533p;
    public final ViewStub t;

    public w(LinearLayout linearLayout, ImageView imageView, FixedSavingsLayout fixedSavingsLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TransferDetailBottomModel transferDetailBottomModel, Button button, PpTitleBar ppTitleBar, ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3, ViewStub viewStub4) {
        this.f40523a = linearLayout;
        this.f40524b = imageView;
        this.f40525c = fixedSavingsLayout;
        this.f40526d = linearLayout2;
        this.f40527e = linearLayout3;
        this.f40528f = transferDetailBottomModel;
        this.f40529g = button;
        this.f40530i = ppTitleBar;
        this.f40531j = viewStub;
        this.f40532o = viewStub2;
        this.f40533p = viewStub3;
        this.t = viewStub4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40523a;
    }
}
