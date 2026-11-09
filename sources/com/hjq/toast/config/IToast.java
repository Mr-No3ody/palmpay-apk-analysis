package com.hjq.toast.config;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public interface IToast {
    void cancel();

    default TextView findMessageView(View view) {
        if (!(view instanceof TextView)) {
            View viewFindViewById = view.findViewById(R.id.message);
            if (viewFindViewById instanceof TextView) {
                return (TextView) viewFindViewById;
            }
            throw new IllegalArgumentException("You must include a TextView with an ID value of message (xml code: android:id=\"@android:id/message\", java code: view.setId(android.R.id.message))");
        }
        if (view.getId() == -1) {
            view.setId(R.id.message);
        } else if (view.getId() != 16908299) {
            throw new IllegalArgumentException("You must set the ID value of TextView to android.R.id.message");
        }
        return (TextView) view;
    }

    int getDuration();

    int getGravity();

    float getHorizontalMargin();

    float getVerticalMargin();

    View getView();

    int getXOffset();

    int getYOffset();

    void setDuration(int i7);

    void setGravity(int i7, int i10, int i11);

    void setMargin(float f10, float f11);

    void setText(int i7);

    void setText(CharSequence charSequence);

    void setView(View view);

    void show();
}
