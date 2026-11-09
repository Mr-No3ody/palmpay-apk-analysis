package com.transsnet.palmpay.core.bean;

import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class ShareAppInfo {
    public static final int TYPE_FIXED = 1;
    public static final int TYPE_MORE = 2;
    public static final int TYPE_SYSTEM = 3;
    public Drawable icon;
    public int index = 1000;
    public int itemType = 3;
    public CharSequence label;
    public String packageName;
    public ResolveInfo resolveInfo;
}
