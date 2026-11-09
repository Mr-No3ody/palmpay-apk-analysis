package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.C0833k;
import androidx.appcompat.app.DialogInterfaceC0834l;
import com.luck.picture.lib.config.FileSizeUnit;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.util.ScreenUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends C0833k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31294a;

    public p(Context context) {
        super(context, com.transsnet.palmpay.custom_view.w.BaseDialogTheme_MatchWidth);
    }

    public static void c(Window window, int i7, int i10) {
        window.setGravity(87);
        window.setWindowAnimations(com.transsnet.palmpay.custom_view.w.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = i7;
        attributes.height = i10;
        attributes.horizontalMargin = 0.0f;
        attributes.verticalMargin = 0.0f;
        attributes.x = 0;
        window.setAttributes(attributes);
    }

    public final void a(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
        Context context = getContext();
        setSingleChoiceItems(new o(context, com.transsnet.palmpay.custom_view.t.cv_layout_dialog_single_choice_item, charSequenceArr, context, null, i7), i7, onClickListener);
    }

    public final void b(int i7) {
        this.f31294a = getContext().getString(i7);
    }

    @Override // androidx.appcompat.app.C0833k
    public final DialogInterfaceC0834l create() {
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = super.create();
        if (!TextUtils.isEmpty(this.f31294a)) {
            View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.transsnet.palmpay.custom_view.t.cv_layout_dialog_title_with_close_icon, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(com.transsnet.palmpay.custom_view.s.textViewText)).setText(this.f31294a);
            viewInflate.findViewById(com.transsnet.palmpay.custom_view.s.imageViewIcon).setOnClickListener(new ViewOnClickListenerC1533v(dialogInterfaceC0834lCreate, 21));
            dialogInterfaceC0834lCreate.f12306a.f12269G = viewInflate;
        }
        return dialogInterfaceC0834lCreate;
    }

    @Override // androidx.appcompat.app.C0833k
    public final /* bridge */ /* synthetic */ C0833k setSingleChoiceItems(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
        a(charSequenceArr, i7, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.C0833k
    public final DialogInterfaceC0834l show() {
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = create();
        dialogInterfaceC0834lCreate.show();
        Window window = dialogInterfaceC0834lCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_top_corner_white_12);
            AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0834lCreate.f12306a.f12286g;
            if (alertController$RecycleListView != null) {
                c(window, ScreenUtils.getScreenWidth(), alertController$RecycleListView.getAdapter().getCount() > 10 ? (int) (ScreenUtils.getScreenHeight() * 0.7f) : -2);
            } else {
                c(window, ScreenUtils.getScreenWidth(), -2);
            }
            window.getDecorView().setMinimumWidth(FileSizeUnit.ACCURATE_MB);
        }
        return dialogInterfaceC0834lCreate;
    }
}
