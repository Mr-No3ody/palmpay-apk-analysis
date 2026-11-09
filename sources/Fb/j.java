package Fb;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static void a(View view, BaseStyleConfig baseStyleConfig) {
        String bgColor;
        if (baseStyleConfig != null) {
            try {
                b(view instanceof ViewGroup ? (ViewGroup) view : null, baseStyleConfig.getHeight(), baseStyleConfig.getWidth());
                List<String> bgColors = baseStyleConfig.getBgColors();
                int color = 0;
                String str = "";
                if ((bgColors != null ? bgColors.size() : 0) > 0) {
                    List<String> bgColors2 = baseStyleConfig.getBgColors();
                    if (bgColors2 == null || view == null) {
                        return;
                    }
                    CornerRadius cornerRadius = baseStyleConfig.getCornerRadius();
                    if (cornerRadius == null) {
                        cornerRadius = new CornerRadius();
                    }
                    Integer strokeWidth = baseStyleConfig.getStrokeWidth();
                    int iIntValue = strokeWidth != null ? strokeWidth.intValue() : 0;
                    if (!TextUtils.isEmpty(baseStyleConfig.getStrokeColor())) {
                        String strokeColor = baseStyleConfig.getStrokeColor();
                        if (strokeColor == null) {
                            strokeColor = "";
                        }
                        if (new Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").b(strokeColor)) {
                            String strokeColor2 = baseStyleConfig.getStrokeColor();
                            if (strokeColor2 != null) {
                                str = strokeColor2;
                            }
                            color = Color.parseColor(str);
                        }
                    }
                    view.setBackground(Eb.a.i(bgColors2, cornerRadius, iIntValue, color));
                    return;
                }
                if (TextUtils.isEmpty(baseStyleConfig.getBgColor()) || (bgColor = baseStyleConfig.getBgColor()) == null || view == null) {
                    return;
                }
                CornerRadius cornerRadius2 = baseStyleConfig.getCornerRadius();
                if (cornerRadius2 == null) {
                    cornerRadius2 = new CornerRadius();
                }
                Integer strokeWidth2 = baseStyleConfig.getStrokeWidth();
                int iIntValue2 = strokeWidth2 != null ? strokeWidth2.intValue() : 0;
                if (!TextUtils.isEmpty(baseStyleConfig.getStrokeColor())) {
                    String strokeColor3 = baseStyleConfig.getStrokeColor();
                    if (strokeColor3 == null) {
                        strokeColor3 = "";
                    }
                    if (new Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").b(strokeColor3)) {
                        String strokeColor4 = baseStyleConfig.getStrokeColor();
                        if (strokeColor4 != null) {
                            str = strokeColor4;
                        }
                        color = Color.parseColor(str);
                    }
                }
                view.setBackground(Eb.a.h(bgColor, cornerRadius2, iIntValue2, color));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(ViewGroup viewGroup, Float f10, Float f11) {
        if ((f10 == null && f11 == null) || viewGroup == null || viewGroup.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            if (f10 != null) {
                ((FrameLayout.LayoutParams) layoutParams).height = ScreenUtils.dip2px(f10.floatValue());
            }
            if (f11 != null) {
                ((FrameLayout.LayoutParams) layoutParams).width = ScreenUtils.dip2px(f11.floatValue());
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (f10 != null) {
                ((RelativeLayout.LayoutParams) layoutParams).height = ScreenUtils.dip2px(f10.floatValue());
            }
            if (f11 != null) {
                ((RelativeLayout.LayoutParams) layoutParams).width = ScreenUtils.dip2px(f11.floatValue());
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            if (f10 != null) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = ScreenUtils.dip2px(f10.floatValue());
            }
            if (f11 != null) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).width = ScreenUtils.dip2px(f11.floatValue());
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            if (f10 != null) {
                ((LinearLayout.LayoutParams) layoutParams).height = ScreenUtils.dip2px(f10.floatValue());
            }
            if (f11 != null) {
                ((LinearLayout.LayoutParams) layoutParams).width = ScreenUtils.dip2px(f11.floatValue());
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (f10 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = ScreenUtils.dip2px(f10.floatValue());
            }
            if (f11 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = ScreenUtils.dip2px(f11.floatValue());
            }
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public static void c(TextView textView, TextStyleConfig textStyleConfig) {
        try {
            a(textView, textStyleConfig);
            if (textStyleConfig != null) {
                String textColor = textStyleConfig.getTextColor();
                if (textColor != null) {
                    if (TextUtils.isEmpty(textColor)) {
                        textColor = null;
                    }
                    if (textColor != null && new Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").b(textColor) && textView != null) {
                        textView.setTextColor(Color.parseColor(textColor));
                    }
                }
                Float textSize = textStyleConfig.getTextSize();
                if (textSize != null) {
                    float fFloatValue = textSize.floatValue();
                    if (textView != null) {
                        textView.setTextSize(2, fFloatValue);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
