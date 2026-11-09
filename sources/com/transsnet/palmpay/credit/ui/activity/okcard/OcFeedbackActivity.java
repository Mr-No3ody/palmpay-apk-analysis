package com.transsnet.palmpay.credit.ui.activity.okcard;

import G9.i;
import L6.b;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.luck.picture.lib.R;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;
import com.luck.picture.lib.utils.DensityUtil;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.credit.bean.req.OcFeedbackReq;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.BarUtils;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.d;
import p025ba.k;
import p177m.l;
import p294tb.C2055q;
import p310ub.M;
import p310ub.N;
import p310ub.O;
import p310ub.P;
import p310ub.Q;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2157z;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit意见反馈页", path = "/credit_score/oc_feedback_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcFeedbackActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackActivity extends Za.b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f29425H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final StringBuilder f29426A = new StringBuilder();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f29427B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29428C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29432g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29434j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29436p;
    public androidx.activity.result.a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f29437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2157z f29438w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public OcFeedbackActivity() {
        final int i7 = 2;
        this.f29429d = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i7) {
                    case 0:
                        int i10 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i11 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i12 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i13 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i14 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i15 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i10 = 3;
        this.f29430e = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i10) {
                    case 0:
                        int i11 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i12 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i13 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i14 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i15 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i11 = 4;
        this.f29431f = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i11) {
                    case 0:
                        int i12 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i13 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i14 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i15 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i12 = 5;
        this.f29432g = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i12) {
                    case 0:
                        int i13 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i14 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i15 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i110 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i13 = 6;
        this.f29433i = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i13) {
                    case 0:
                        int i14 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i15 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i110 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i111 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i14 = 7;
        this.f29434j = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i14) {
                    case 0:
                        int i15 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i16 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i110 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i111 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i112 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i15 = 0;
        this.f29435o = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i15) {
                    case 0:
                        int i16 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i17 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i18 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i110 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i111 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i112 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i113 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
        final int i16 = 1;
        this.f29436p = C2131j.b(new Function0(this) { // from class: ub.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42765b;

            {
                this.f42765b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackActivity context = this.f42765b;
                switch (i16) {
                    case 0:
                        int i17 = OcFeedbackActivity.f29425H;
                        return (PpTitleBar) context.findViewById(e.oc_feedback_mtb);
                    case 1:
                        int i18 = OcFeedbackActivity.f29425H;
                        String doneStr = context.getString(k.core_add);
                        Intrinsics.checkNotNullExpressionValue(doneStr, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(doneStr, "doneStr");
                        PictureSelectorStyle pictureSelectorStyle = new PictureSelectorStyle();
                        SelectMainStyle selectMainStyle = new SelectMainStyle();
                        selectMainStyle.setSelectNumberStyle(true);
                        selectMainStyle.setPreviewSelectNumberStyle(false);
                        selectMainStyle.setPreviewDisplaySelectGallery(true);
                        selectMainStyle.setSelectBackground(R.drawable.ps_default_num_selector);
                        selectMainStyle.setPreviewSelectBackground(R.drawable.ps_preview_checkbox_selector);
                        selectMainStyle.setSelectNormalBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectNormalTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setSelectNormalText(doneStr);
                        selectMainStyle.setPreviewSelectText(k.core_select);
                        selectMainStyle.setPreviewSelectTextSize(14);
                        selectMainStyle.setPreviewSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setPreviewSelectMarginRight(DensityUtil.dip2px(context, 6.0f));
                        selectMainStyle.setSelectBackgroundResources(d.core_shape_rect_corner_4_purple_padding);
                        selectMainStyle.setSelectText(doneStr);
                        selectMainStyle.setSelectTextColor(context.getColor(p.md_white_1000));
                        selectMainStyle.setMainListBackgroundColor(context.getColor(b.ppColorTextPrimary));
                        selectMainStyle.setCompleteSelectRelativeTop(true);
                        selectMainStyle.setPreviewSelectRelativeBottom(true);
                        selectMainStyle.setAdapterItemIncludeEdge(false);
                        TitleBarStyle titleBarStyle = new TitleBarStyle();
                        titleBarStyle.setHideCancelButton(true);
                        titleBarStyle.setAlbumTitleRelativeLeft(true);
                        titleBarStyle.setTitleDrawableRightResource(r.cv_arrow_down_black);
                        BottomNavBarStyle bottomNavBarStyle = new BottomNavBarStyle();
                        bottomNavBarStyle.setBottomPreviewNarBarBackgroundColor(context.getColor(p.transparent_60));
                        bottomNavBarStyle.setBottomPreviewNormalTextSize(16);
                        bottomNavBarStyle.setCompleteCountTips(false);
                        bottomNavBarStyle.setBottomNarBarHeight(1);
                        bottomNavBarStyle.setBottomPreviewNormalText("  ");
                        bottomNavBarStyle.setBottomPreviewNormalTextColor(context.getColor(p.transparent));
                        bottomNavBarStyle.setBottomPreviewSelectText("  ");
                        bottomNavBarStyle.setBottomPreviewSelectTextColor(context.getColor(p.transparent));
                        pictureSelectorStyle.setTitleBarStyle(titleBarStyle);
                        pictureSelectorStyle.setBottomBarStyle(bottomNavBarStyle);
                        pictureSelectorStyle.setSelectMainStyle(selectMainStyle);
                        return pictureSelectorStyle;
                    case 2:
                        int i19 = OcFeedbackActivity.f29425H;
                        return (Button) context.findViewById(e.feedback_submit_bt);
                    case 3:
                        int i110 = OcFeedbackActivity.f29425H;
                        return (RecyclerView) context.findViewById(e.selected_img_rv);
                    case 4:
                        int i111 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_screen_tip_tv);
                    case 5:
                        int i112 = OcFeedbackActivity.f29425H;
                        return (TextView) context.findViewById(e.max_input_tip_tv);
                    case 6:
                        int i113 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_et);
                    default:
                        int i114 = OcFeedbackActivity.f29425H;
                        return (EditText) context.findViewById(e.feedback_phone_et);
                }
            }
        });
    }

    public static final void m(OcFeedbackActivity ocFeedbackActivity) {
        if (TextUtils.isEmpty(ocFeedbackActivity.o().getText())) {
            ocFeedbackActivity.p().setEnabled(false);
            return;
        }
        Object value = ocFeedbackActivity.f29434j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (TextUtils.isEmpty(((EditText) value).getText())) {
            ocFeedbackActivity.p().setEnabled(false);
        } else {
            ocFeedbackActivity.p().setEnabled(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_feedback_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Object value = this.f29435o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView rightTextView = ((PpTitleBar) value).getRightTextView();
        Intrinsics.checkNotNullExpressionValue(rightTextView, "getRightTextView(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42770b;

            {
                this.f42770b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcFeedbackActivity ocFeedbackActivity = this.f42770b;
                switch (i7) {
                    case 0:
                        int i10 = OcFeedbackActivity.f29425H;
                        ARouter.getInstance().build("/credit_score/oc_feedback_list_activity").navigation(ocFeedbackActivity);
                        return;
                    default:
                        int i11 = OcFeedbackActivity.f29425H;
                        if (TextUtils.isEmpty(StringsKt.V(ocFeedbackActivity.o().getText().toString()).toString())) {
                            return;
                        }
                        ArrayList arrayList = ocFeedbackActivity.f29437v;
                        if (arrayList == null) {
                            Intrinsics.n("mSelectedImgData");
                            throw null;
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        StringBuilder sb2 = ocFeedbackActivity.f29426A;
                        if (zIsEmpty) {
                            sb2.delete(0, sb2.length());
                            ocFeedbackActivity.n();
                            return;
                        }
                        ocFeedbackActivity.showLoadingDialog(true);
                        Intrinsics.checkNotNullParameter(sb2, "<this>");
                        sb2.setLength(0);
                        ArrayList arrayList2 = ocFeedbackActivity.f29437v;
                        if (arrayList2 == null) {
                            Intrinsics.n("mSelectedImgData");
                            throw null;
                        }
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        ocFeedbackActivity.q(0);
                        return;
                }
            }
        }, rightTextView);
        Object value2 = this.f29434j.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((EditText) value2).addTextChangedListener(new M(this, 0));
        o().addTextChangedListener(new M(this, 1));
        C2157z c2157z = this.f29438w;
        if (c2157z == null) {
            Intrinsics.n("mSelectedImgAdapter");
            throw null;
        }
        c2157z.registerAdapterDataObserver(new N(this));
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackActivity f42770b;

            {
                this.f42770b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcFeedbackActivity ocFeedbackActivity = this.f42770b;
                switch (i10) {
                    case 0:
                        int i11 = OcFeedbackActivity.f29425H;
                        ARouter.getInstance().build("/credit_score/oc_feedback_list_activity").navigation(ocFeedbackActivity);
                        return;
                    default:
                        int i12 = OcFeedbackActivity.f29425H;
                        if (TextUtils.isEmpty(StringsKt.V(ocFeedbackActivity.o().getText().toString()).toString())) {
                            return;
                        }
                        ArrayList arrayList = ocFeedbackActivity.f29437v;
                        if (arrayList == null) {
                            Intrinsics.n("mSelectedImgData");
                            throw null;
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        StringBuilder sb2 = ocFeedbackActivity.f29426A;
                        if (zIsEmpty) {
                            sb2.delete(0, sb2.length());
                            ocFeedbackActivity.n();
                            return;
                        }
                        ocFeedbackActivity.showLoadingDialog(true);
                        Intrinsics.checkNotNullParameter(sb2, "<this>");
                        sb2.setLength(0);
                        ArrayList arrayList2 = ocFeedbackActivity.f29437v;
                        if (arrayList2 == null) {
                            Intrinsics.n("mSelectedImgData");
                            throw null;
                        }
                        if (arrayList2.isEmpty()) {
                            return;
                        }
                        ocFeedbackActivity.q(0);
                        return;
                }
            }
        }, p());
    }

    public final void n() {
        String string = StringsKt.V(o().getText().toString()).toString();
        String string2 = this.f29426A.toString();
        String str = this.f29427B;
        String str2 = this.f29428C;
        String fullName = BaseApplication.getInstance().getUser(false).getFullName();
        Object value = this.f29434j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        OcFeedbackReq ocFeedbackReq = new OcFeedbackReq(string, string2, str, str2, fullName, ((EditText) value).getText().toString());
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().addFeedback(ocFeedbackReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 12));
    }

    public final EditText o() {
        Object value = this.f29433i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final Button p() {
        Object value = this.f29429d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void q(int i7) {
        ArrayList arrayList = this.f29437v;
        if (arrayList == null) {
            Intrinsics.n("mSelectedImgData");
            throw null;
        }
        if (i7 >= arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = this.f29437v;
        if (arrayList2 == null) {
            Intrinsics.n("mSelectedImgData");
            throw null;
        }
        Object obj = arrayList2.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        LocalMedia localMedia = (LocalMedia) obj;
        FileUploadManager.getInstance().uploadFile(localMedia.isCompressed() ? new File(localMedia.getCompressPath()) : new File(localMedia.getPath()), false, new Q(this, i7));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        getIntent().getStringExtra("feedback_default_tag");
        this.f29427B = getIntent().getStringExtra("feedback_first_type");
        this.f29428C = getIntent().getStringExtra("feedback_second_type");
        Object value = this.f29435o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).getRightTextView().setText(getString(Ya.g.cs_feedback_history));
        ArrayList arrayList = new ArrayList();
        this.f29437v = arrayList;
        this.f29438w = new C2157z(this, arrayList, new O(this));
        this.t = registerForActivityResult(new l(), new i(this, 11));
        t tVar = this.f29430e;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new GridLayoutManager(this, 4));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).addItemDecoration(new P());
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value4;
        C2157z c2157z = this.f29438w;
        if (c2157z == null) {
            Intrinsics.n("mSelectedImgAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2157z);
        Object value5 = this.f29432g.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setText(getString(Ya.g.cs_max_letters, 0));
        Object value6 = this.f29431f.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setText(getString(Ya.g.cs_max_screen, 0));
    }
}
