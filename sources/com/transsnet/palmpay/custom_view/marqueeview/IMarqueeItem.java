package com.transsnet.palmpay.custom_view.marqueeview;

/* JADX INFO: loaded from: classes4.dex */
public interface IMarqueeItem {
    default String getImgUrl() {
        return "";
    }

    default int getTextColor() {
        return -1;
    }

    CharSequence marqueeMessage();
}
