package com.transsnet.palmpay.custom_view.wheelview.widget;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface IWheelView<T> {
    public static final boolean CLICKABLE = false;
    public static final boolean LOOP = false;
    public static final int WHEEL_SIZE = 3;

    void join(WheelView wheelView);

    void joinDatas(HashMap<String, List<T>> map);

    void setLoop(boolean z3);

    void setWheelAdapter(Zb.a aVar);

    void setWheelClickable(boolean z3);

    void setWheelData(List<T> list);

    void setWheelSize(int i7);
}
