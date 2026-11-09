package Ua;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.lifecycle.LifecycleOwner;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f9357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context viewContext, LifecycleOwner life) {
        super(p025ba.g.core_layout_flash_sale_data_bundle_item, null);
        Intrinsics.checkNotNullParameter(viewContext, "viewContext");
        Intrinsics.checkNotNullParameter(life, "life");
        this.f9356a = viewContext;
        this.f9357b = life;
        this.f9358c = viewContext.getColor(L6.b.ppColorPrimary);
        this.f9359d = viewContext.getColor(L6.b.ppColorTextPrimary);
        this.f9360e = viewContext.getColor(L6.b.ppColorTextNormal);
        this.f9361f = viewContext.getColor(L6.b.ppColorTextAssist);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        RecommendedItem item = (RecommendedItem) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) holder.getViewOrNull(p025ba.e.tv_name);
        TextView textView2 = (TextView) holder.getViewOrNull(p025ba.e.tv_content);
        TextView textView3 = (TextView) holder.getViewOrNull(p025ba.e.tv_status);
        View viewOrNull = holder.getViewOrNull(p025ba.e.divider);
        TextView textView4 = (TextView) holder.getViewOrNull(p025ba.e.tv_cashback);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) holder.getViewOrNull(p025ba.e.lpi_progress_bar);
        IconicsImageView iconicsImageView = (IconicsImageView) holder.getViewOrNull(p025ba.e.iv_info);
        int i7 = 0;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setEnabled(false);
        }
        Integer num = item.remainingStock;
        int iIntValue = num != null ? num.intValue() : 0;
        holder.itemView.setEnabled(false);
        SpanUtils spanUtils = new SpanUtils();
        String str = item.volume;
        if (str == null) {
            str = "";
        }
        SpanUtils bold = spanUtils.append(str).setFontSize(CommonViewExtKt.getDp(16)).setBold();
        int i10 = this.f9359d;
        SpanUtils foregroundColor = bold.setForegroundColor(i10);
        String str2 = item.validity;
        SpannableStringBuilder spannableStringBuilderCreate = foregroundColor.append("/".concat(str2 != null ? str2 : "")).setFontSize(CommonViewExtKt.getDp(12)).setForegroundColor(i10).create();
        if (textView != null) {
            textView.setText(spannableStringBuilderCreate);
        }
        SpanUtils spanUtils2 = new SpanUtils();
        Long l5 = item.discountPackageAmount;
        SpanUtils foregroundColor2 = spanUtils2.append(Pa.r0.F(l5 != null ? l5.longValue() : 0L) + " ").setForegroundColor(this.f9358c);
        Long l6 = item.price;
        SpannableStringBuilder spannableStringBuilderCreate2 = foregroundColor2.append(Pa.r0.F(l6 != null ? l6.longValue() : 0L)).setForegroundColor(this.f9361f).setStrikethrough().setForegroundColor(this.f9360e).create();
        if (textView2 != null) {
            textView2.setText(spannableStringBuilderCreate2);
        }
        Integer num2 = item.initialStock;
        if (num2 == null) {
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setMax(100);
            }
            if (appCompatSeekBar != null) {
                p220oa.h.s(appCompatSeekBar, false);
            }
        } else {
            int iIntValue2 = num2.intValue();
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setMax(100);
            }
            int i11 = (int) (((iIntValue2 - iIntValue) / iIntValue2) * 100);
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setProgress(i11);
            }
            if (appCompatSeekBar != null) {
                p220oa.h.s(appCompatSeekBar, true);
            }
        }
        if (TextUtils.isEmpty(item.discountInfo)) {
            if (textView4 != null) {
                p220oa.h.s(textView4, false);
            }
            if (viewOrNull != null) {
                p220oa.h.s(viewOrNull, false);
            }
        } else {
            if (textView4 != null) {
                p220oa.h.s(textView4, true);
            }
            if (viewOrNull != null) {
                p220oa.h.s(viewOrNull, true);
            }
            if (textView4 != null) {
                textView4.setText(item.discountInfo);
            }
        }
        int i12 = p025ba.e.iv_info;
        String str3 = item.description;
        holder.setGone(i12, str3 == null || str3.length() == 0);
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(new Oc.j(11, item, this));
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Integer num3 = item.remainingStock;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        Long l8 = item.endDownTime;
        long j6 = 1000;
        long jLongValue = ((l8 != null ? l8.longValue() : 0L) - SystemClock.elapsedRealtime()) / j6;
        Long l10 = item.startDownTime;
        long jLongValue2 = ((l10 != null ? l10.longValue() : 0L) - SystemClock.elapsedRealtime()) / j6;
        if (iIntValue3 <= 0 && item.initialStock != null) {
            i7 = 2;
        } else if (jLongValue <= 0 || jLongValue2 <= 0) {
            i7 = (jLongValue <= 0 || jLongValue2 > 0) ? 1 : 3;
        }
        item.status = Integer.valueOf(i7);
        Context context = this.f9356a;
        if (i7 == 2) {
            if (textView3 != null) {
                textView3.setText(context.getString(p025ba.k.core_sold_out));
            }
            if (textView3 != null) {
                textView3.setTextColor(CommonViewExtKt.colorInt(L6.b.lib_ui_button_white_text_color, getContext()));
            }
            if (textView3 != null) {
                textView3.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_color_disable);
            }
        } else if (i7 == 0 || i7 == 3) {
            if (textView3 != null) {
                Long l11 = item.startTime;
                C0.G.x("Start at ", TimeUtils.millis2String(l11 != null ? l11.longValue() : 0L, new SimpleDateFormat("HH:mm", Locale.ENGLISH)), textView3);
            }
            if (textView3 != null) {
                textView3.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext()));
            }
            if (textView3 != null) {
                textView3.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_color_disable);
            }
        } else {
            if (textView3 != null) {
                textView3.setText(context.getString(p025ba.k.core_databundle_grab));
            }
            if (textView3 != null) {
                textView3.setTextColor(CommonViewExtKt.colorInt(L6.b.lib_ui_button_white_text_color, getContext()));
            }
            if (textView3 != null) {
                textView3.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_16_bg_primary);
            }
        }
        Integer num4 = item.status;
        if (num4 != null && num4.intValue() == 2) {
            if (textView != null) {
                textView.setAlpha(0.5f);
            }
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
            }
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setAlpha(0.5f);
            }
            if (iconicsImageView != null) {
                iconicsImageView.setAlpha(0.5f);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        if (textView2 != null) {
            textView2.setAlpha(1.0f);
        }
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setAlpha(1.0f);
        }
        if (iconicsImageView != null) {
            iconicsImageView.setAlpha(1.0f);
        }
        itemView.setEnabled(true);
    }
}
