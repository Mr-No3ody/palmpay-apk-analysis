package p370ye;

import Ac.d;
import Ac.e;
import Ac.f;
import L6.b;
import M1.j;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.E;
import androidx.core.view.N;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends j {
    public c() {
        super(f.main_palm_zone_task_item_v2, null);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        b bVar;
        int iColorInt;
        PalmZoneTaskBean palmZoneTaskBean = (PalmZoneTaskBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (palmZoneTaskBean != null) {
            ((TextView) holder.getView(e.tvTitle)).setText(palmZoneTaskBean.taskName);
            ((TextView) holder.getView(e.tvDesc)).setText(palmZoneTaskBean.subtaskName);
            TextView textView = (TextView) holder.getView(e.tvTimes);
            if (textView != null) {
                textView.setText(palmZoneTaskBean.getFrequencyDisplayText());
            }
            r0.h1((ImageView) holder.getView(e.ivIcon), (!i0.T() || TextUtils.isEmpty(palmZoneTaskBean.darkModeTaskPicture)) ? palmZoneTaskBean.taskPicture : palmZoneTaskBean.darkModeTaskPicture, r.cv_palmpay_logo_5);
            TextView textView2 = (TextView) holder.getView(e.tvCorner);
            if (textView2 != null) {
                PalmZoneTaskBean.CornerMarkDTO cornerMarkDTO = palmZoneTaskBean.cornerMarkDTO;
                Intrinsics.checkNotNullParameter(textView2, "textView");
                String str = cornerMarkDTO != null ? cornerMarkDTO.displayText : null;
                if (str == null || str.length() == 0) {
                    textView2.setVisibility(8);
                    h.k(textView2, 0, null, null, null, 14);
                } else {
                    Integer numValueOf = cornerMarkDTO != null ? Integer.valueOf(cornerMarkDTO.itemType) : null;
                    if ((numValueOf != null && numValueOf.intValue() == 100) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 0))))) {
                        textView2.setVisibility(0);
                        h.k(textView2, Integer.valueOf(CommonViewExtKt.getDp(6.0f)), null, null, null, 14);
                        textView2.setText(str);
                        int i7 = cornerMarkDTO.itemType;
                        if (i7 == 100) {
                            bVar = new b(b.ppColorSecondary, b.ppColorPrimary, null);
                        } else if (i7 == 3) {
                            bVar = new b(b.ppColorAssisBackground, b.ppColorWarning, null);
                        } else {
                            bVar = i7 == 2 ? new b(b.ppColorSuccessBackground, b.ppColorSuccess, null) : new b(b.ppColorDividerLineDark, b.ppColorLink, "#121212");
                        }
                        Context context = textView2.getContext();
                        if (i0.V(textView2)) {
                            String str2 = bVar.f44316c;
                            if (TextUtils.isEmpty(str2)) {
                                iColorInt = CommonViewExtKt.colorInt(bVar.f44314a, context);
                            } else {
                                iColorInt = Color.parseColor(str2);
                            }
                        } else {
                            iColorInt = CommonViewExtKt.colorInt(bVar.f44314a, context);
                        }
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iColorInt);
                        WeakHashMap weakHashMap = N.f16168a;
                        E.j(textView2, colorStateListValueOf);
                        if (!i0.V(textView2) || TextUtils.isEmpty(null)) {
                            textView2.setTextColor(CommonViewExtKt.colorInt(bVar.f44315b, context));
                        } else {
                            textView2.setTextColor(Color.parseColor(null));
                        }
                    } else {
                        textView2.setVisibility(8);
                        h.k(textView2, 0, null, null, null, 14);
                    }
                }
            }
            View view = holder.getView(e.ivLock);
            PpButton ppButton = (PpButton) holder.getView(e.btnRight);
            String str3 = palmZoneTaskBean.buttonType;
            if (str3 != null) {
                int iHashCode = str3.hashCode();
                if (iHashCode != 2280) {
                    if (iHashCode != 2342187) {
                        if (iHashCode == 64204828 && str3.equals(PalmZoneTaskBean.BTN_TYPE_CLAIM)) {
                            ppButton.setBackgroundResource(d.main_home_palmzone_tasks_btn_bg);
                            ppButton.setTextColor(CommonViewExtKt.colorInt(p.md_white_1000, holder.itemView.getContext()));
                            ppButton.setText(holder.itemView.getContext().getString(k.core_claim));
                            ppButton.setEnabled(true);
                            h.C(ppButton);
                            ppButton.setBackgroundTintList(null);
                            h.c(view);
                            return;
                        }
                    } else if (str3.equals(PalmZoneTaskBean.BTN_TYPE_LOCK)) {
                        ppButton.setEnabled(false);
                        ppButton.setBackgroundTintList(null);
                        h.d(ppButton);
                        h.C(view);
                        return;
                    }
                } else if (str3.equals(PalmZoneTaskBean.BTN_TYPE_GO)) {
                    int iColorInt2 = CommonViewExtKt.colorInt(b.ppColorPrimary, holder.itemView.getContext());
                    ppButton.setBackgroundResource(r.cv_shape_rect_corner_16_bg_transparent_stroke_white);
                    ppButton.setTextColor(iColorInt2);
                    ppButton.setBackgroundTintList(ColorStateList.valueOf(iColorInt2));
                    ppButton.setText(holder.itemView.getContext().getString(k.core_go));
                    ppButton.setEnabled(true);
                    h.C(ppButton);
                    h.c(view);
                    return;
                }
            }
            ppButton.setText(holder.itemView.getContext().getString(k.core_done));
            int iColorInt3 = CommonViewExtKt.colorInt(b.ppColorDisabled, holder.itemView.getContext());
            ppButton.setBackgroundResource(r.cv_shape_rect_corner_16_bg_transparent_stroke_white);
            ppButton.setBackgroundTintList(ColorStateList.valueOf(iColorInt3));
            ppButton.setTextColor(iColorInt3);
            ppButton.setEnabled(false);
            h.C(ppButton);
            h.c(view);
        }
    }
}
