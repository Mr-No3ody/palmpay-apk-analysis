package com.transsnet.palmpay.ui.view;

import Pa.r0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CustomReactTextView extends ReactTextView {
    public CustomReactTextView(Context context) {
        super(context);
    }

    @Override // com.facebook.react.views.text.ReactTextView
    public void setText(ReactTextUpdate reactTextUpdate) {
        Typeface typefaceDefaultFromStyle;
        int iIntValue;
        Spannable text = reactTextUpdate.getText();
        if (text != null) {
            for (Object obj : text.getSpans(0, text.length(), Object.class)) {
                int i7 = 1;
                if (obj instanceof AbsoluteSizeSpan) {
                    AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                    int size = absoluteSizeSpan.getSize();
                    if (Build.VERSION.SDK_INT < 26 || !absoluteSizeSpan.getDip()) {
                        setTextSize(0, size);
                    } else {
                        setTextSize(1, size);
                    }
                }
                if (obj != null) {
                    Class<?> cls = obj.getClass();
                    if ("CustomLineHeightSpan".equals(cls.getSimpleName()) && cls.getName().startsWith("com.facebook.react.views.text.")) {
                        try {
                            Class<?> cls2 = obj.getClass();
                            try {
                                Field declaredField = cls2.getDeclaredField(ViewProps.LINE_HEIGHT);
                                declaredField.setAccessible(true);
                                iIntValue = ((Integer) declaredField.get(obj)).intValue();
                            } catch (NoSuchFieldException unused) {
                                Field declaredField2 = cls2.getDeclaredField("mHeight");
                                declaredField2.setAccessible(true);
                                iIntValue = ((Integer) declaredField2.get(obj)).intValue();
                            }
                            if (iIntValue > 0) {
                                setLineHeight(iIntValue);
                                setGravity(16);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                if (obj != null) {
                    Class<?> cls3 = obj.getClass();
                    if ("CustomStyleSpan".equals(cls3.getSimpleName()) && cls3.getName().startsWith("com.facebook.react.views.text.")) {
                        try {
                            Method method = obj.getClass().getMethod("getStyle", new Class[0]);
                            Method method2 = obj.getClass().getMethod("getFontFamily", new Class[0]);
                            int iIntValue2 = ((Integer) method.invoke(obj, new Object[0])).intValue();
                            if (iIntValue2 != 1) {
                                i7 = 0;
                            }
                            if (iIntValue2 == 2) {
                                i7 |= 2;
                            }
                            String str = (String) method2.invoke(obj, new Object[0]);
                            if (!TextUtils.isEmpty(str)) {
                                if ("PalmPayNum-Bold".equals(str)) {
                                    r0.R1(this, "fonts/PalmPayNum-Bold.ttf");
                                } else if ("PalmPayNum-Regular".equals(str)) {
                                    r0.R1(this, "fonts/PalmPayNum-Regular.ttf");
                                } else {
                                    try {
                                        typefaceDefaultFromStyle = Typeface.create(str, i7);
                                    } catch (Exception unused3) {
                                        typefaceDefaultFromStyle = Typeface.defaultFromStyle(i7);
                                    }
                                    setTypeface(typefaceDefaultFromStyle);
                                }
                            }
                        } catch (Exception unused4) {
                        }
                    }
                }
                if (obj instanceof ForegroundColorSpan) {
                    setTextColor(((ForegroundColorSpan) obj).getForegroundColor());
                }
            }
        }
        super.setText(reactTextUpdate);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence.toString(), TextView.BufferType.NORMAL);
    }
}
