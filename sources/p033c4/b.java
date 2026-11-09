package p033c4;

import C9.ViewOnClickListenerC0146m;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelDayPick;
import com.flexibank.sdk.s;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p215o4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlexiBankModelDayPick f18855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewOnClickListenerC0146m f18857g;

    static {
        new a(null);
    }

    @Override // p215o4.b
    public final void a() {
        Context context = this.f40023a;
        Intrinsics.e(context);
        FlexiBankModelDayPick flexiBankModelDayPick = new FlexiBankModelDayPick(context, null, 0);
        this.f18855e = flexiBankModelDayPick;
        setContentView(flexiBankModelDayPick);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(s.fb_dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        FlexiBankModelDayPick flexiBankModelDayPick2 = this.f18855e;
        Intrinsics.e(flexiBankModelDayPick2);
        flexiBankModelDayPick2.getMConfirmBtn().setVisibility(this.f18856f ? 0 : 8);
        this.f18857g = new ViewOnClickListenerC0146m(this, 19);
        FlexiBankModelDayPick flexiBankModelDayPick3 = this.f18855e;
        Intrinsics.e(flexiBankModelDayPick3);
        flexiBankModelDayPick3.getMIvClose().setOnClickListener(this.f18857g);
        FlexiBankModelDayPick flexiBankModelDayPick4 = this.f18855e;
        Intrinsics.e(flexiBankModelDayPick4);
        flexiBankModelDayPick4.getMConfirmBtn().setOnClickListener(this.f18857g);
    }
}
