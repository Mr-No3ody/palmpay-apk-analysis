package com.flexibank.sdk.core.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;
import com.flexibank.sdk.m;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import k4.c;
import k4.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p334w4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001=B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000bR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010<\u001a\u0004\u0018\u00010\u000f2\b\u00107\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankModelDayPick;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getNowPickYear", "()I", "getNowPickMonth", "getNowPickDay", "Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;", "", "b", "Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;", "getMWheelViewYear", "()Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;", "setMWheelViewYear", "(Lcom/flexibank/sdk/customview/wheelview/widget/FlexiBankWheelView;)V", "mWheelViewYear", "c", "getMWheelViewDay", "setMWheelViewDay", "mWheelViewDay", "d", "getMWheelViewMonth", "setMWheelViewMonth", "mWheelViewMonth", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getMTitleTv", "()Landroid/widget/TextView;", "setMTitleTv", "(Landroid/widget/TextView;)V", "mTitleTv", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getMIvClose", "()Landroid/widget/ImageView;", "setMIvClose", "(Landroid/widget/ImageView;)V", "mIvClose", "Lcom/palmpay/lib/ui/button/PpButton;", "g", "Lcom/palmpay/lib/ui/button/PpButton;", "getMConfirmBtn", "()Lcom/palmpay/lib/ui/button/PpButton;", "setMConfirmBtn", "(Lcom/palmpay/lib/ui/button/PpButton;)V", "mConfirmBtn", "value", "p", "Ljava/lang/String;", "getNowPickDate", "()Ljava/lang/String;", "nowPickDate", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelDayPick extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public FlexiBankWheelView mWheelViewYear;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public FlexiBankWheelView mWheelViewDay;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public FlexiBankWheelView mWheelViewMonth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView mTitleTv;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ImageView mIvClose;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public PpButton mConfirmBtn;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f22115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f22116j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f22117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String nowPickDate;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f22119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f22120w;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankModelDayPick(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i7) {
        super(mContext, attributeSet, i7);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f22108a = mContext;
        View.inflate(mContext, q.fb_model_day_pick, this);
        this.f22116j = new ArrayList();
        this.f22115i = new ArrayList();
        this.f22117o = new ArrayList();
        Date nowDate = TimeUtils.getNowDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int i10 = calendar.get(1);
        int i11 = i10 + 1;
        for (int i12 = i10 - 120; i12 < i11; i12++) {
            ArrayList arrayList = this.f22116j;
            Intrinsics.e(arrayList);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            arrayList.add(sb2.toString());
        }
        for (int i13 = 1; i13 < 13; i13++) {
            if (i13 < 10) {
                ArrayList arrayList2 = this.f22115i;
                Intrinsics.e(arrayList2);
                arrayList2.add("0" + i13);
            } else {
                ArrayList arrayList3 = this.f22115i;
                Intrinsics.e(arrayList3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i13);
                arrayList3.add(sb3.toString());
            }
        }
        for (int i14 = 1; i14 < 31; i14++) {
            if (i14 < 10) {
                ArrayList arrayList4 = this.f22117o;
                Intrinsics.e(arrayList4);
                arrayList4.add("0" + i14);
            } else {
                ArrayList arrayList5 = this.f22117o;
                Intrinsics.e(arrayList5);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i14);
                arrayList5.add(sb4.toString());
            }
        }
        this.mWheelViewYear = (FlexiBankWheelView) findViewById(p.fb_mdp_wheel_right);
        this.mWheelViewMonth = (FlexiBankWheelView) findViewById(p.fb_mdp_wheel_middle);
        this.mWheelViewDay = (FlexiBankWheelView) findViewById(p.fb_mdp_wheel_left);
        setMTitleTv((TextView) findViewById(p.fb_mdp_title_tv));
        setMIvClose((ImageView) findViewById(p.fb_mdp_close_iv));
        setMConfirmBtn((PpButton) findViewById(p.fb_mdp_confirm_btn));
        b bVar = new b();
        bVar.f43259a = 0;
        bVar.f43261c = Color.parseColor("#95a1ab");
        Context context = this.f22108a;
        bVar.f43262d = context.getResources().getColor(m.fb_text_color_purple);
        bVar.f43263e = 18;
        bVar.f43264f = 23;
        bVar.f43260b = context.getResources().getColor(m.fb_text_color_purple);
        FlexiBankWheelView flexiBankWheelView = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView);
        flexiBankWheelView.setWheelAdapter(new m4.b(context));
        FlexiBankWheelView flexiBankWheelView2 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView2);
        flexiBankWheelView2.setWheelSize(3);
        FlexiBankWheelView flexiBankWheelView3 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView3);
        p334w4.a aVar = p334w4.a.f43256b;
        flexiBankWheelView3.setSkin(aVar);
        FlexiBankWheelView flexiBankWheelView4 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView4);
        flexiBankWheelView4.setWheelData(this.f22116j);
        FlexiBankWheelView flexiBankWheelView5 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView5);
        flexiBankWheelView5.setSelection(HomeDialogState.PRIORITY_HIGHEST);
        FlexiBankWheelView flexiBankWheelView6 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView6);
        flexiBankWheelView6.setStyle(bVar);
        FlexiBankWheelView flexiBankWheelView7 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView7);
        flexiBankWheelView7.setWheelAdapter(new m4.b(context));
        FlexiBankWheelView flexiBankWheelView8 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView8);
        flexiBankWheelView8.setWheelSize(3);
        FlexiBankWheelView flexiBankWheelView9 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView9);
        flexiBankWheelView9.setSkin(aVar);
        FlexiBankWheelView flexiBankWheelView10 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView10);
        flexiBankWheelView10.setWheelData(this.f22115i);
        FlexiBankWheelView flexiBankWheelView11 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView11);
        flexiBankWheelView11.setSelection(1);
        FlexiBankWheelView flexiBankWheelView12 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView12);
        flexiBankWheelView12.setStyle(bVar);
        FlexiBankWheelView flexiBankWheelView13 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView13);
        flexiBankWheelView13.setWheelAdapter(new m4.b(context));
        FlexiBankWheelView flexiBankWheelView14 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView14);
        flexiBankWheelView14.setWheelSize(3);
        FlexiBankWheelView flexiBankWheelView15 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView15);
        flexiBankWheelView15.setSkin(aVar);
        FlexiBankWheelView flexiBankWheelView16 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView16);
        flexiBankWheelView16.setWheelData(this.f22117o);
        FlexiBankWheelView flexiBankWheelView17 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView17);
        flexiBankWheelView17.setSelection(1);
        FlexiBankWheelView flexiBankWheelView18 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView18);
        flexiBankWheelView18.setStyle(bVar);
        FlexiBankWheelView flexiBankWheelView19 = this.mWheelViewMonth;
        Intrinsics.e(flexiBankWheelView19);
        flexiBankWheelView19.setOnWheelItemSelectedListener(new k4.b(this));
        FlexiBankWheelView flexiBankWheelView20 = this.mWheelViewYear;
        Intrinsics.e(flexiBankWheelView20);
        flexiBankWheelView20.setOnWheelItemSelectedListener(new c(this));
        FlexiBankWheelView flexiBankWheelView21 = this.mWheelViewDay;
        Intrinsics.e(flexiBankWheelView21);
        flexiBankWheelView21.setOnWheelItemSelectedListener(new d(this));
    }

    public static final void a(FlexiBankModelDayPick flexiBankModelDayPick) {
        if (TextUtils.isEmpty(flexiBankModelDayPick.t) || TextUtils.isEmpty(flexiBankModelDayPick.f22119v)) {
            return;
        }
        try {
            String str = flexiBankModelDayPick.t;
            Intrinsics.e(str);
            int i7 = Integer.parseInt(str);
            String str2 = flexiBankModelDayPick.f22119v;
            Intrinsics.e(str2);
            int i10 = Integer.parseInt(str2);
            Calendar calendar = Calendar.getInstance();
            int i11 = 1;
            calendar.set(1, i7);
            calendar.set(2, i10 - 1);
            int actualMaximum = calendar.getActualMaximum(5);
            ArrayList arrayList = new ArrayList();
            if (1 <= actualMaximum) {
                while (true) {
                    if (i11 < 10) {
                        arrayList.add("0" + i11);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        arrayList.add(sb2.toString());
                    }
                    if (i11 == actualMaximum) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            flexiBankModelDayPick.f22117o = arrayList;
            FlexiBankWheelView flexiBankWheelView = flexiBankModelDayPick.mWheelViewDay;
            Intrinsics.e(flexiBankWheelView);
            flexiBankWheelView.setWheelData(flexiBankModelDayPick.f22117o);
            FlexiBankWheelView flexiBankWheelView2 = flexiBankModelDayPick.mWheelViewDay;
            Intrinsics.e(flexiBankWheelView2);
            p278s4.a aVar = flexiBankWheelView2.f22291v;
            Intrinsics.e(aVar);
            aVar.notifyDataSetChanged();
        } catch (NumberFormatException e10) {
            String message = e10.getMessage();
            Intrinsics.e(message);
            Log.e("FlexiBankModelDayPick", message);
        }
    }

    public static final void b(FlexiBankModelDayPick flexiBankModelDayPick) {
        flexiBankModelDayPick.nowPickDate = u.n(flexiBankModelDayPick.f22120w, "-", flexiBankModelDayPick.f22119v, "-", flexiBankModelDayPick.t);
        TextView mTitleTv = flexiBankModelDayPick.getMTitleTv();
        Intrinsics.e(mTitleTv);
        mTitleTv.setText(flexiBankModelDayPick.nowPickDate);
    }

    @NotNull
    public final PpButton getMConfirmBtn() {
        PpButton ppButton = this.mConfirmBtn;
        if (ppButton != null) {
            return ppButton;
        }
        Intrinsics.n("mConfirmBtn");
        throw null;
    }

    @NotNull
    public final ImageView getMIvClose() {
        ImageView imageView = this.mIvClose;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.n("mIvClose");
        throw null;
    }

    @NotNull
    public final TextView getMTitleTv() {
        TextView textView = this.mTitleTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mTitleTv");
        throw null;
    }

    @Nullable
    public final FlexiBankWheelView<String> getMWheelViewDay() {
        return this.mWheelViewDay;
    }

    @Nullable
    public final FlexiBankWheelView<String> getMWheelViewMonth() {
        return this.mWheelViewMonth;
    }

    @Nullable
    public final FlexiBankWheelView<String> getMWheelViewYear() {
        return this.mWheelViewYear;
    }

    @Nullable
    public final String getNowPickDate() {
        return this.nowPickDate;
    }

    public final int getNowPickDay() {
        try {
            String str = this.f22120w;
            Intrinsics.e(str);
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String message = e10.getMessage();
            Intrinsics.e(message);
            Log.e("FlexiBankModelDayPick", message);
            return 0;
        }
    }

    public final int getNowPickMonth() {
        try {
            String str = this.f22119v;
            Intrinsics.e(str);
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String message = e10.getMessage();
            Intrinsics.e(message);
            Log.e("FlexiBankModelDayPick", message);
            return 0;
        }
    }

    public final int getNowPickYear() {
        try {
            String str = this.t;
            Intrinsics.e(str);
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            String message = e10.getMessage();
            Intrinsics.e(message);
            Log.e("FlexiBankModelDayPick", message);
            return 0;
        }
    }

    public final void setMConfirmBtn(@NotNull PpButton ppButton) {
        Intrinsics.checkNotNullParameter(ppButton, "<set-?>");
        this.mConfirmBtn = ppButton;
    }

    public final void setMIvClose(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mIvClose = imageView;
    }

    public final void setMTitleTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTitleTv = textView;
    }

    public final void setMWheelViewDay(@Nullable FlexiBankWheelView<String> flexiBankWheelView) {
        this.mWheelViewDay = flexiBankWheelView;
    }

    public final void setMWheelViewMonth(@Nullable FlexiBankWheelView<String> flexiBankWheelView) {
        this.mWheelViewMonth = flexiBankWheelView;
    }

    public final void setMWheelViewYear(@Nullable FlexiBankWheelView<String> flexiBankWheelView) {
        this.mWheelViewYear = flexiBankWheelView;
    }
}
